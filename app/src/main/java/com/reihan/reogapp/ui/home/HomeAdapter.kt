package com.reihan.reogapp.ui.home

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.reihan.reogapp.statis.Berita
import com.reihan.reogapp.R

class HomeAdapter(private val beritaList: List<Berita>) :
    RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_berita, parent, false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val berita = beritaList[position]
        holder.bind(berita)
    }

    override fun getItemCount(): Int {
        return beritaList.size
    }

    inner class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvBeritaTitle: TextView = itemView.findViewById(R.id.tv_berita_title)
        private val tvBeritaDescription: TextView =
            itemView.findViewById(R.id.tv_berita_description)

        fun bind(berita: Berita) {
            tvBeritaTitle.text = berita.judul
            tvBeritaDescription.text = berita.deskripsi
            Glide.with(itemView.context)
                .load(berita.gambar)
                .into(itemView.findViewById(R.id.iv_berita_image_preview))

            itemView.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(berita.link))
                itemView.context.startActivity(intent)
            }
        }
    }
}
