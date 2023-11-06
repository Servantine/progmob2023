package com.example.progmobile

import com.example.progmobile.model.petani
import retrofit2.Call
import retrofit2.http.GET

interface getApi {
    @GET("get")
    fun getMhs(): Call<ArrayList<petani>>
}