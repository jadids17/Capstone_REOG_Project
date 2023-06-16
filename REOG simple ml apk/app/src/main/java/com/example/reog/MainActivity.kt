package com.example.reog

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.reog.ml.Kmeans
import com.example.reog.ml.LiteModel
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.common.TensorProcessor
import org.tensorflow.lite.support.common.ops.DequantizeOp
import org.tensorflow.lite.support.common.ops.NormalizeOp
import org.tensorflow.lite.support.image.ImageProcessor
import org.tensorflow.lite.support.image.TensorImage
import org.tensorflow.lite.support.image.ops.ResizeOp
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer
import java.nio.ByteBuffer
import java.nio.ByteOrder

class MainActivity : AppCompatActivity() {

    lateinit var selectBtn:Button
    lateinit var predBtn:Button
    lateinit var resView:TextView
    lateinit var imageView:ImageView
    lateinit var bitmap:Bitmap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        selectBtn = findViewById(R.id.selectBtn)
        predBtn = findViewById(R.id.predictBtn)
        resView = findViewById(R.id.resView)
        imageView = findViewById(R.id.imageView)
        val inputEditText = findViewById<EditText>( R.id.input_edittext )

        var imageProcessor = ImageProcessor.Builder()
            .add(ResizeOp(100, 100, ResizeOp.ResizeMethod.BILINEAR))
            .add(NormalizeOp(0f, 255f))
            .build()

        selectBtn.setOnClickListener{
            var intent = Intent()
            intent.setAction(Intent.ACTION_GET_CONTENT)
            intent.setType("image/*")
            startActivityForResult(intent, 100)
        }

        predBtn.setOnClickListener {
            var tensorImage = TensorImage(DataType.FLOAT32)
            tensorImage.load(bitmap)
            tensorImage = imageProcessor.process(tensorImage)

            val model = LiteModel.newInstance(this)

            val inputFeature0 =
                TensorBuffer.createFixedSize(intArrayOf(1, 100, 100, 3), DataType.FLOAT32)
            inputFeature0.loadBuffer(tensorImage.buffer)

            val outputs = model.process(inputFeature0)
            val outputFeature0 = outputs.outputFeature0AsTensorBuffer.floatArray

            var result = if (outputFeature0[0] > 0.3) {
                1
            } else {
                0
            }

            model.close()

            // Parse input from inputEditText
            val inputs = inputEditText.text.toString().toIntOrNull()
            if (inputs != null) {
                // Normalize the input
                val normalizedInput = (inputs - 1039387) / (9978272 - 1039387).toFloat()
                val model = Kmeans.newInstance(this)

                val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 1), DataType.FLOAT32)
                inputFeature0.loadBuffer(getByteBufferForInput(normalizedInput))

                val outputs = model.process(inputFeature0)
                val outputFeature0 = outputs.outputFeature0AsTensorBuffer.floatArray

                val maxIndex = outputFeature0.withIndex().maxByOrNull { it.value }?.index

                model.close()

                var output = if (result == 1 && maxIndex == 2) {
                    1
                }
                else {
                    0
                }

                if (output != null) {
                    if (output == 1){
                        resView.text = "Layak menerima bantuan"
                    }
                    else if (output == 0){
                        resView.text = "Tidak layak menerima bantuan"
                    }
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==100){
            var uri = data?.data
            bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, uri)
            imageView.setImageBitmap(bitmap)
        }
    }
    private fun getByteBufferForInput(input: Float): ByteBuffer {
        val bufferSize = 4
        val byteBuffer = ByteBuffer.allocateDirect(bufferSize)
        byteBuffer.order(ByteOrder.nativeOrder())
        byteBuffer.putFloat(input)
        byteBuffer.rewind()
        return byteBuffer
    }
}