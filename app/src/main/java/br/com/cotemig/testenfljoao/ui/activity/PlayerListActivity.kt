package br.com.cotemig.testenfljoao.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.cotemig.testenfljoao.R
import br.com.cotemig.testenfljoao.model.Player
import br.com.cotemig.testenfljoao.model.PlayerList
import br.com.cotemig.testenfljoao.model.Teams
import br.com.cotemig.testenfljoao.service.RetrofitInitializer
import br.com.cotemig.testenfljoao.ui.adapter.PlayerAdapter
import kotlinx.android.synthetic.main.activity_player_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PlayerListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_list)

//        var selectedTeam = intent.getSerializableExtra("team") as Teams
//        if (selectedTeam.strTeam == "ARI"){
//            getPlayer(selectedTeam)
//        }

    }

//    fun getPlayer(time : Teams){
//        var s = RetrofitInitializer().servicePlayer()
//        var call = s.getPlayer()
//
//        call.enqueue(object : Callback<Player>{
//            override fun onFailure(call: Call<Player>, t: Throwable) {
//                Toast.makeText(this@PlayerListActivity, "Player Fudeu", Toast.LENGTH_LONG).show()
//            }
//
//            override fun onResponse(call: Call<Player>, response: Response<Player>) {
//               // Toast.makeText(this@PlayerListActivity, "Player Deu Bom", Toast.LENGTH_LONG).show()
//                response.body()?.let {
//                showPlayer()
//                }
//
//
//            }
//        })
//    }
//
//    fun showPlayer(lista : List<Player>){
//        playerList.adapter = PlayerAdapter(this, lista)
//    }

}