package br.com.cotemig.testenfljoao.service

import br.com.cotemig.testenfljoao.model.Player
import retrofit2.Call
import retrofit2.http.GET

interface ServicePlayer {

    @GET("ari?key=0d7369d8f1374febaa309f7e2b8f6532")
    fun getPlayer() : Call<Player>
}