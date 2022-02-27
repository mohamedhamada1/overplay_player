package uk.endclothing.task.core.utils

import java.time.LocalDate
import java.time.Period
import java.util.Calendar
import java.util.Date
import kotlin.math.max
import kotlin.math.min

infix fun Date.duration(other: Date?): Duration {

    if (other == null) return Duration()

    val fromCalendar = Calendar.getInstance().also { it.timeInMillis = min(this.time, other.time) }
    val toCalendar = Calendar.getInstance().also { it.timeInMillis = max(this.time, other.time) }

    val period = Period.between(
        LocalDate.ofYearDay(fromCalendar.get(Calendar.YEAR), fromCalendar.get(Calendar.DAY_OF_YEAR)),
        LocalDate.ofYearDay(toCalendar.get(Calendar.YEAR), toCalendar.get(Calendar.DAY_OF_YEAR)),
    )

    return Duration(period.years, period.months, period.days)
}

data class Duration(
    val year: Int = 0,
    val months: Int = 0,
    val days: Int = 0
)
