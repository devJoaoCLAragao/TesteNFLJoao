package br.com.cotemig.testenfljoao.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import br.com.cotemig.testenfljoao.R
import br.com.cotemig.testenfljoao.model.Teams
import com.bumptech.glide.Glide

class TeamsAdapter(var context: Context, var lista: List<Teams>) : BaseAdapter() {
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var view = LayoutInflater.from(context).inflate(R.layout.item_team_list, null)

        var strTeam = view.findViewById<TextView>(R.id.strTeam)
        strTeam.text = lista[p0].strTeam

        var strTeamBadge = view.findViewById<ImageView>(R.id.strTeamBadge)
        Glide.with(context).load(lista[p0].strTeamBadge).into(strTeamBadge)

//        view.itemTeamClickable.setOnClickListener {
//            var intent = Intent(context, PlayerListActivity::class.java)
//            intent.putExtra("team", lista[p0])
//            context.startActivity(intent)
//
//        }

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