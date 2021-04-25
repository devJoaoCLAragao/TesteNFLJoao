package br.com.cotemig.testenfljoao.ui.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import br.com.cotemig.testenfljoao.R
import br.com.cotemig.testenfljoao.model.Player
import com.bumptech.glide.Glide

class PlayerAdapter (var context: Context, var lista : List<Player>) : BaseAdapter() {
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.item_player_list, null)

        var team = lista[p0].Team

        var name = view.findViewById<TextView>(R.id.Name)
        name.text = lista[p0].Name

        var photoUrl = view.findViewById<ImageView>(R.id.PhotoUrl)
        Glide.with(context).load(lista[p0].PhotoUrl).into(photoUrl)

        return view
    }

    override fun getItem(p0: Int): Any {
        return 0
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return lista.size
    }
}