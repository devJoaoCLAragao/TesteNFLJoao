package br.com.cotemig.testenfljoao.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.cotemig.testenfljoao.R
import br.com.cotemig.testenfljoao.model.Teams
import br.com.cotemig.testenfljoao.model.TeamsList
import br.com.cotemig.testenfljoao.service.RetrofitInitializer
import br.com.cotemig.testenfljoao.ui.adapter.TeamsAdapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getTeams()
    }

    fun getTeams(){
        var service = RetrofitInitializer().serviceTeams()
        var call = service.getTeamsList()

        call.enqueue(object : Callback<TeamsList>{
            override fun onFailure(call: Call<TeamsList>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Sem Internet", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<TeamsList>, response: Response<TeamsList>) {
                Toast.makeText(this@MainActivity, "Good 2 Go", Toast.LENGTH_LONG).show()
               response.body()?.let {
                   showList(it.lista)
               }
            }
        })

    }

    fun showList(lista : List<Teams>){
        teamList.adapter = TeamsAdapter(this, lista)
    }

}