import uvicorn
from fastapi import FastAPI, UploadFile, File
import tensorflow as tf
import numpy as np
import os
from tensorflow.keras.preprocessing import image
import shutil
import pandas as pd
from flask import Flask, request, jsonify

os.environ['TF_CPP_MIN_LOG_LEVEL'] = '3'

app = Flask(__name__)  # create a new FastAPI app instance

port=8081
#port = int(os.getenv("PORT"))

model1 = tf.keras.models.load_model('lite_model.h5')
model2 = tf.keras.models.load_model('Kmeans.h5')

def houseDetection(file):
    img = image.load_img(file, target_size=(100,100,3))

    x = image.img_to_array(img)
    x /= 255
    x = np.expand_dims(x, axis=0)
    images = np.vstack([x])

    classes = model1.predict(images, batch_size=10)
    print(classes[0])

    if classes[0] > 0.3:
        output1 = 1
        print("User layak menerima bantuan")
    else:
        output1 = 0
        print("User tidak layak menerima bantuan")
    return output1

def salaryPrediction(pendapatan):
    data = pd.read_csv('combined_data.csv')

    nama = data['Nama'].values
    penghasilan = data['Penghasilan'].values
    cluster = data['Cluster'].values

    new_data = np.array([pendapatan])
    data_normalized = (new_data - penghasilan.min()) / (penghasilan.max() - penghasilan.min())
    data_normalized = data_normalized.reshape(-1, 1)
    cluster_probs = model2.predict(data_normalized)
    clusters = np.argmax(cluster_probs, axis=1)

    if clusters == 2:
        output2 = 1
        print("Kategori penghasilan user: rendah")
    elif clusters == 1:
        output2 = 0
        print("kategori penghasilan user: menengah")
    else:
        output2 = 0
        print("kategori penghasilan user: tinggi")
    return output2


@app.get("/")
def hello_world():
    return ("sukses")

@app.route("/classifyhouse", methods=["POST"])
def classifyhouse():
    if request.method == "POST":
        if "file" not in request.files:
            return jsonify({"error": "No file uploaded"})

        file = request.files["file"]
        if file.filename == "":
            return jsonify({"error": "No file selected"})

        if file:
            filename = secure_filename(file.filename)
            file_path = os.path.join("uploads", filename)
            file.save(file_path)
            result = houseDetection(file_path)
            os.remove(file_path)
            return jsonify({"result": result})
    else:
        return jsonify({"message": "This route only supports POST method."})

@app.route("/predictsalary", methods=["POST"])
def predictsalary():
    if "pendapatan" not in request.json:
        return jsonify({"error": "No 'pendapatan' value provided"})

    pendapatan = request.json["pendapatan"]
    output = salaryPrediction(pendapatan)
    return jsonify({"output": output})

@app.route("/kelayakan", methods=["POST"])
def kelayakan():
    if "file" not in request.files or "pendapatan" not in request.form:
        return jsonify({"error": "No file or 'pendapatan' value provided"})

    file = request.files["file"]
    pendapatan = int(request.form["pendapatan"])

    if file and pendapatan:
        filename = secure_filename(file.filename)
        file_path = os.path.join("uploads", filename)
        file.save(file_path)
        result = houseDetection(file_path)
        output = salaryPrediction(pendapatan)
        os.remove(file_path)
        hasil_akhir = 1 if (result == 1 and output == 1) else 0
        label = ["tidak layak menerima bantuan", "layak menerima bantuan"]
        return jsonify({"kelayakan": label[hasil_akhir]})

if __name__ == '__main__':
    app.run(debug=True)
