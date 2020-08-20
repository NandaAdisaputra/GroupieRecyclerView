package com.nandaadisaputra.groupierecyclerview.adapter

import com.nandaadisaputra.groupierecyclerview.R
import com.nandaadisaputra.groupierecyclerview.activity.DetailActivity
import com.nandaadisaputra.groupierecyclerview.model.MobilModel
import com.squareup.picasso.Picasso
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_mobil.view.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.startActivity

class MobileAdapter(private val mobil: MobilModel) : Item() {

    // untuk meng-set value ke tiap-tiap itemnya
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tv_nama.text = mobil.name
        Picasso.get().load(mobil.image).into(viewHolder.itemView.iv_mobil)
        viewHolder.itemView.onClick {
            viewHolder.itemView.context.startActivity<DetailActivity>(
                "image" to mobil.image,
                "name" to mobil.name
            )
        }
    }


    //layout yang digunakan untuk setiap item nya
    override fun getLayout(): Int {
        return R.layout.item_mobil
    }
}
