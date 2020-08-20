package com.nandaadisaputra.groupierecyclerview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import com.nandaadisaputra.groupierecyclerview.R
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val nameMobil = intent.getStringExtra("name")
        val imageMobil = intent.getIntExtra("image", 0)
        DetailActivityUI().setContentView(this)

        verticalLayout {
            imageView(imageMobil).lparams(width = wrapContent, height = 500) {
                padding = dip(16)
                margin = dip(15)
                gravity= Gravity.CENTER
            }
            textView(nameMobil).lparams(width = wrapContent) {
                gravity = Gravity.CENTER
            }
        }
    }

    class DetailActivityUI : AnkoComponent<DetailActivity> {
        override fun createView(ui: AnkoContext<DetailActivity>) = with(ui) {
            verticalLayout {

            }
        }
    }

}