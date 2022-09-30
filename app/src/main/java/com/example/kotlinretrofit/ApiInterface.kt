package com.example.kotlinretrofit

import retrofit2.Call

interface ApiInterface {

    fun getData(): Call<List<MyDataItem>>

}