fun main() {
    val distance = 321.8
    val time = 4.15

    fun speed(distance: Double = 42.195, time: Double) = distance / time

    val walkingSpeed = speed(time = 8.27)
    val bikingSpeed = speed(time = 2.85)
    val drivingSpeed = speed(time = 0.37)
    val flyingSpeed = speed(0.12, 0.01)

    println(walkingSpeed)
    println(bikingSpeed)
    println(drivingSpeed)
    println(flyingSpeed)
}