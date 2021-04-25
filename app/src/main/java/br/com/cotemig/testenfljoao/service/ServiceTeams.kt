package br.com.cotemig.testenfljoao.service

import br.com.cotemig.testenfljoao.model.TeamsList
import retrofit2.Call
import retrofit2.http.GET

interface ServiceTeams {

    @GET("search_all_teams.php?l=NFL")
    fun getTeamsList() : Call<TeamsList>
}