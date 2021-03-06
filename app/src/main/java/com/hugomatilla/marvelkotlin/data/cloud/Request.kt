package com.hugomatilla.marvelkotlin.data.cloud

/**
 * Created by hugomatilla on 08/02/16.
 */

import com.google.gson.Gson
import com.hugomatilla.marvelkotlin.data.utils.APIUtils
import java.net.URL

class Request(val gson: Gson = Gson()) {

    fun execute(): HeroesListResult {
        val jsonStr = URL(APIUtils.getUrl()).readText()
        return gson.fromJson(jsonStr, HeroesListResult::class.java)
    }
}
