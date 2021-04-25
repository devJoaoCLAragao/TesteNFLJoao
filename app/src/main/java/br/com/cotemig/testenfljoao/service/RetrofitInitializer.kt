package br.com.cotemig.testenfljoao.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {

    private val retrofitTeams = Retrofit.Builder().baseUrl("https://www.thesportsdb.com/api/v1/json/1/").addConverterFactory(
        GsonConverterFactory.create()).build()

//    private val retrofitPlayer = Retrofit.Builder().baseUrl("https://fly.sportsdata.io/v3/nfl/scores/json/Players/").addConverterFactory(
//        GsonConverterFactory.create()).build()

    fun serviceTeams() : ServiceTeams{
        return retrofitTeams.create(ServiceTeams::class.java)
    }

//    fun servicePlayer() : ServicePlayer{
//        return retrofitTeams.create(ServicePlayer::class.java)
//    }
}