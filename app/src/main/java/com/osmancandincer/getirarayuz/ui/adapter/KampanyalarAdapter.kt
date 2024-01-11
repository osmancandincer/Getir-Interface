package com.osmancandincer.getirarayuz.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osmancandincer.getirarayuz.data.entity.Kampanyalar
import com.osmancandincer.getirarayuz.databinding.CardKampanyaBinding

class KampanyalarAdapter(var mContext: Context, var kampanyaListesi: List<Kampanyalar>) :
    RecyclerView.Adapter<KampanyalarAdapter.CardKampanyaTutucu>() {

    inner class CardKampanyaTutucu(var kampanyaTasarim: CardKampanyaBinding) :
        RecyclerView.ViewHolder(kampanyaTasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardKampanyaTutucu {
        val binding = CardKampanyaBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardKampanyaTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardKampanyaTutucu, position: Int) {
        val kampanya = kampanyaListesi.get(position)
        val kampt = holder.kampanyaTasarim

        kampt.imageViewKampanya.setImageResource(
            mContext.resources.getIdentifier(kampanya.kampanya_resim, "drawable", mContext.packageName))
    }

    override fun getItemCount(): Int {
        return kampanyaListesi.size
    }
}