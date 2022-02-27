package uk.endclothing.task.core.utils

fun <T> Map<String, Any?>.get(key: String): T? = this[key] as? T

fun <T> Map<String, List<Any>?>.getSingle(key: String): T? = this[key]?.firstOrNull() as? T

fun <T> Map<String, List<Any>?>.getAs(key: String): List<T>? = this[key] as? List<T>
