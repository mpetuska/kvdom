package kotlinx.css.properties

import kotlinx.css.*

class Time(override val value: String) : CssValue(value)

val Number.s get() = Time("${this}s")
val Number.ms get() = Time("${this}ms")

class Timing(override val value: String) : CssValue(value) {
  companion object {
    val ease = Timing("ease")
    val linear = Timing("linear")
    val easeIn = Timing("ease-in")
    val easeOut = Timing("ease-out")
    val easeInOut = Timing("ease-in-out")
    val stepStart = Timing("step-start")
    val stepEnd = Timing("step-end")

    // https://material.io/guidelines/motion/duration-easing.html#duration-easing-natural-easing-curves
    val materialStandard = cubicBezier(0.4, 0.0, 0.2, 1.0)
    val materialDeceleration = cubicBezier(0.0, 0.0, 0.2, 1.0)
    val materialAcceleration = cubicBezier(0.4, 0.0, 1.0, 1.0)
    val materialSharp = cubicBezier(0.4, 0.0, 0.6, 1.0)
  }
}

fun cubicBezier(
  x1: Double,
  y1: Double,
  x2: Double,
  y2: Double
): Timing = Timing("cubic-bezier($x1, $y1, $x2, $y2)")

@Suppress("EnumEntryName")
enum class TransitionDirection {
  initial, inherit, unset,

  start, end;

  override fun toString() = name
}

fun steps(count: Int, direction: TransitionDirection = TransitionDirection.end): Timing =
  Timing("steps($count, $direction)")
