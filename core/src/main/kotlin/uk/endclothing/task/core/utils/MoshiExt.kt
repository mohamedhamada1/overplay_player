package uk.endclothing.task.core.utils

import uk.endclothing.task.core.remote.parser.DateJasonAdapter
import com.squareup.moshi.JsonDataException
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.util.*

inline fun <reified T> String.parseAs(): T? =
    try {
        Moshi.Builder().add(Date::class.java, DateJasonAdapter().nullSafe())
            .build().adapter(T::class.java).fromJson(this)
    } catch (t: JsonDataException) {
        null
    }

inline fun <reified T> List<T>.parseAs(): String? =
    try {
        Moshi.Builder().add(Date::class.java, DateJasonAdapter().nullSafe())
            .build()
            .adapter<List<T>>(Types.newParameterizedType(List::class.java, T::class.java))
            .toJson(this).toString()
    } catch (t: JsonDataException) {
        null
    }

 inline fun  <reified T> String.parseToList(): List<T>? =
    try {
        val moshi= Moshi.Builder().add(Date::class.java, DateJasonAdapter().nullSafe())
            .build()
        val listMyData = Types.newParameterizedType(List::class.java, T::class.java)
        val jsonAdapter = moshi.adapter<List<T>>(listMyData)
        jsonAdapter.fromJson(this)
    } catch (t: JsonDataException) {
        null
    }
