package com.osmancandincer.getirarayuz.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osmancandincer.getirarayuz.data.entity.Kategoriler
import com.osmancandincer.getirarayuz.databinding.CardKategoriBinding

class KategorilerAdapter (var mContext: Context, var kategoriListesi:List<Kategoriler>)
    :RecyclerView.Adapter<KategorilerAdapter.CardKategoriTutucu>(){

    inner class CardKategoriTutucu(var kategoriTasarim:CardKategoriBinding) : RecyclerView.ViewHolder(kategoriTasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardKategoriTutucu {
        val binding = CardKategoriBinding.inflate(LayoutInflater.from(mContext),parent, false)
        return CardKategoriTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardKategoriTutucu, position: Int) {
        val kategori = kategoriListesi.get(position)
        val kt = holder.kategoriTasarim

        kt.imageViewKategori.setImageResource(
            mContext.resources.getIdentifier(kategori.kategori_resim,"drawable",mContext.packageName))

        kt.textViewKategoriAd.text = "${kategori.kategori_ad}"

    }

    override fun getItemCount(): Int {
        return kategoriListesi.size
    }
}