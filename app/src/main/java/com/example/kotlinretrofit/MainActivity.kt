package com.example.kotlinretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Retrofit

const val BASE_URL = "https://jsonplaceholder.typicode.com/"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getMyData();
    }

    private fun getMyData() {
        val retrofitBuilder= Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create)
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)

        val retrofitData = retrofitBuilder.getData()
    }
}