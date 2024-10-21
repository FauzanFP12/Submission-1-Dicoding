package com.example.myapplication.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myapplication.R
import com.example.myapplication.activity.DetailActivity
import com.example.myapplication.model.Char


class ListCharAdapter(private val listChar: ArrayList<Char>) : RecyclerView.Adapter<ListCharAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_char, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val context = holder.itemView.context
        val Char = listChar[position]
        Glide.with(holder.itemView.context)
                .load(Char.pic)
                .apply(RequestOptions())
                .into(holder.picture)
        holder.name.text = Char.name
        holder.alias.text = Char.alias
        holder.special.text = Char.special
        holder.itemView.setOnClickListener {
            val passItem = Intent(context, DetailActivity::class.java)
            passItem.putExtra(DetailActivity.EXTRA_NAME, Char.name)
            passItem.putExtra(DetailActivity.EXTRA_ALIAS, Char.alias)
            passItem.putExtra(DetailActivity.EXTRA_SPECIAL, Char.special)
            passItem.putExtra(DetailActivity.EXTRA_DES, Char.des)
            passItem.putExtra(DetailActivity.EXTRA_PIC, Char.pic)
            passItem.putExtra(DetailActivity.EXTRA_PICBG, Char.background)
            context.startActivity(passItem)
        }
    }

    override fun getItemCount(): Int {
        return listChar.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.char_name)
        var alias: TextView = itemView.findViewById(R.id.char_alias)
        var special: TextView = itemView.findViewById(R.id.char_special)
        var picture: ImageView = itemView.findViewById(R.id.char_pic)
    }
}