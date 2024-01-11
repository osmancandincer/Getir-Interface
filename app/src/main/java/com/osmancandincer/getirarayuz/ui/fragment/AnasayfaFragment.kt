package com.osmancandincer.getirarayuz.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.osmancandincer.getirarayuz.data.entity.Kampanyalar
import com.osmancandincer.getirarayuz.data.entity.Kategoriler
import com.osmancandincer.getirarayuz.databinding.FragmentAnasayfaBinding
import com.osmancandincer.getirarayuz.ui.adapter.KampanyalarAdapter
import com.osmancandincer.getirarayuz.ui.adapter.KategorilerAdapter

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)

       // binding.toolbarAnasayfa.title = "GETİR"

        binding.kampanyaRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        binding.kategoriRv.layoutManager = StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)

        val kampanyaListesi = ArrayList<Kampanyalar>()
        val km1 = Kampanyalar(1,"kampanya_bir")
        val km2 = Kampanyalar(2,"kampanya_iki")
        val km3 = Kampanyalar(3,"kampanya_uc")
        val km4 = Kampanyalar(4,"kampanya_dort")
        val km5 = Kampanyalar(5,"kampanya_bes")
        val km6 = Kampanyalar(6,"kampanya_alti")
        val km7 = Kampanyalar(7,"kampanya_yedi")
        kampanyaListesi.add(km1)
        kampanyaListesi.add(km2)
        kampanyaListesi.add(km3)
        kampanyaListesi.add(km4)
        kampanyaListesi.add(km5)
        kampanyaListesi.add(km6)
        kampanyaListesi.add(km7)

        val kampanyalarAdapter = KampanyalarAdapter(requireContext(),kampanyaListesi)
        binding.kampanyaRv.adapter = kampanyalarAdapter

        val kategoriListesi = ArrayList<Kategoriler>()
        val k1 = Kategoriler(1, "Süper İkili", "super_ikili")
        val k2 = Kategoriler(2, "Kazandıranlar", "kazandiranlar")
        val k3 = Kategoriler(3, "İndirimler", "indirimler")
        val k4 = Kategoriler(4, "Yeni Ürünler", "yeni_urunler")
        val k5 = Kategoriler(5, "Su & İçecek", "su_icecek")
        val k6 = Kategoriler(6, "Meyve & Sebze", "meyve_sebze")
        val k7 = Kategoriler(7, "Fırından", "firindan")
        val k8 = Kategoriler(8, "Süt Ürünleri", "sut_urunleri")
        val k9 = Kategoriler(9, "Atıştırmalık", "atistirmalik")
        val k10 = Kategoriler(10, "Dondurma", "dondurma")
        val k11 = Kategoriler(11, "Temel Gıda", "temel_gida")
        val k12 = Kategoriler(12, "Kahvaltılık", "kahvaltilik")
        val k13 = Kategoriler(13, "Yiyecek", "yiyecek")
        val k14 = Kategoriler(14, "Fit & Form", "fit_form")
        val k15 = Kategoriler(15, "Kişisel Bakım", "kisisel_bakim")
        val k16 = Kategoriler(16, "Ev Bakım", "ev_bakim")
        val k17 = Kategoriler(17, "Ev Yaşam", "ev_yasam")
        val k18 = Kategoriler(18, "Teknoloji", "teknoloji")
        val k19 = Kategoriler(19, "Evcil Hayvan", "evcil_hayvan")
        val k20 = Kategoriler(20, "Bebek", "bebek")
        val k21 = Kategoriler(21, "Cinsel Sağlık", "cinsel_saglik")
        kategoriListesi.add(k1)
        kategoriListesi.add(k2)
        kategoriListesi.add(k3)
        kategoriListesi.add(k4)
        kategoriListesi.add(k5)
        kategoriListesi.add(k6)
        kategoriListesi.add(k7)
        kategoriListesi.add(k8)
        kategoriListesi.add(k9)
        kategoriListesi.add(k10)
        kategoriListesi.add(k11)
        kategoriListesi.add(k12)
        kategoriListesi.add(k13)
        kategoriListesi.add(k14)
        kategoriListesi.add(k15)
        kategoriListesi.add(k16)
        kategoriListesi.add(k17)
        kategoriListesi.add(k18)
        kategoriListesi.add(k19)
        kategoriListesi.add(k20)
        kategoriListesi.add(k21)

        val kategorilerAdapter = KategorilerAdapter(requireContext(),kategoriListesi)
        binding.kategoriRv.adapter = kategorilerAdapter

        val adresler = ArrayList<String>()
        adresler.add("Ev, İnönü, 4138 Sk., 24A, Menemen")
        adresler.add("Ofis, Sasalı, 221/1 Sk., 17D, Bayraklı")
        adresler.add("Ev2, İmbatlı, 4151 Sk., 4, Karşıyaka")

        val arrayAdapter = ArrayAdapter(requireContext(),android.R.layout.simple_list_item_1,adresler)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)

        return binding.root

    }
}