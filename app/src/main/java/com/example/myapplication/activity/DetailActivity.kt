package com.example.myapplication.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myapplication.R


class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_ALIAS = "extra_alias"
        const val EXTRA_SPECIAL = "extra_special"
        const val EXTRA_DES = "extra_des"
        const val EXTRA_PIC = "extra_pic"
        const val EXTRA_PICBG = "extra_picbg"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvCharName: TextView = findViewById(R.id.char_name)
        val tvCharAlias: TextView = findViewById(R.id.char_alias)
        val tvCharSpecial: TextView = findViewById(R.id.char_special)
        val tvCharDes: TextView = findViewById(R.id.char_des)
        val imgCharPic: ImageView = findViewById(R.id.char_pic)
        val imgCharPicbg: ImageView = findViewById(R.id.char_bg)
        var fav = false

        val charName = intent.getStringExtra(EXTRA_NAME)
        val charAlias = intent.getStringExtra(EXTRA_ALIAS)
        val charSpecial = intent.getStringExtra(EXTRA_SPECIAL)
        val charDes = intent.getStringExtra(EXTRA_DES)
        val charPic = intent.getIntExtra(EXTRA_PIC, 0)
        val charPicbg = intent.getIntExtra(EXTRA_PICBG, 0)

        tvCharName.text = charName
        tvCharAlias.text = charAlias
        tvCharSpecial.text = charSpecial
        tvCharDes.text = charDes

        Glide.with(this)
                .load(charPic)
                .apply(RequestOptions())
                .into(imgCharPic)
        Glide.with(this)
                .load(charPicbg)
                .apply(RequestOptions())
                .into(imgCharPicbg)

    }
}