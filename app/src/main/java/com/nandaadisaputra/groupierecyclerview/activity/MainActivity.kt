package com.nandaadisaputra.groupierecyclerview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nandaadisaputra.groupierecyclerview.R
import com.nandaadisaputra.groupierecyclerview.adapter.MobileAdapter
import com.nandaadisaputra.groupierecyclerview.model.MobilModel
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // deklarasi adapter dari group adapter
    private var groupAdapter = GroupAdapter<ViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //masukkan list image dan nama mobile
        val listMobil = listOf(
            MobilModel(
                name = "Mobil Alphard",
                image = R.drawable.alphard
            ),
            MobilModel(
                name = "Mobil Fortuner",
                image = R.drawable.fortuner
            ),
            MobilModel(
                name = "Mobil luxio",
                image = R.drawable.luxio
            ),
            MobilModel(
                name = "Mobil Pajero",
                image = R.drawable.pajero
            ),
            MobilModel(
                name = "Mobil Sport",
                image = R.drawable.sport
            ),
            MobilModel(
                name = "Mobil Suzuki",
                image = R.drawable.suzuki
            ),
            MobilModel(
                name = "Mobil Tesla",
                image = R.drawable.tesla
            ),
            MobilModel(
                name = "Mobil Toyota",
                image = R.drawable.toyota
            ),
            MobilModel(
                name = "Mobil Xpander",
                image = R.drawable.xpander
            ),
        )
        // inisiasi recyclerview layout manager dan adapter
        rv_mobile.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = groupAdapter
        }
        // looping hero
        listMobil.map {
            // masukkan hero ke groupadapter
            groupAdapter.add(MobileAdapter(it))
        }
    }
}