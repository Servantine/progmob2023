package com.example.progmobile.network

import com.example.progmobile.model.ResponseUsersItem
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class NetworkConfig {
    // set interceptor
    fun getInterceptor(): OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder().addInterceptor(logging).build()
        return okHttpClient
    }

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("https://kpsi.fti.ukdw.ac.id")
            .client(getInterceptor()).addConverterFactory(GsonConverterFactory.create()).build()
    }

    fun getService() = getRetrofit().create(Mhs::class.java)
}

interface Mhs {
    @GET("users")
    fun getUsers(): Call<List<ResponseMhsItem>>
}