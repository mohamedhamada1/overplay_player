// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package uk.endclothing.task.core.remote.response

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class ErrorResponseJsonAdapter(
  moshi: Moshi
) : JsonAdapter<ErrorResponse>() {
  private val options: JsonReader.Options = JsonReader.Options.of("statusCode", "description")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(), "code")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "description")

  public override fun toString(): String = buildString(35) {
      append("GeneratedJsonAdapter(").append("ErrorResponse").append(')') }

  public override fun fromJson(reader: JsonReader): ErrorResponse {
    var code: Int? = null
    var description: String? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> code = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("code", "statusCode",
            reader)
        1 -> description = nullableStringAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return ErrorResponse(
        code = code ?: throw Util.missingProperty("code", "statusCode", reader),
        description = description
    )
  }

  public override fun toJson(writer: JsonWriter, value_: ErrorResponse?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("statusCode")
    intAdapter.toJson(writer, value_.code)
    writer.name("description")
    nullableStringAdapter.toJson(writer, value_.description)
    writer.endObject()
  }
}
