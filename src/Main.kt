fun main() {
    val distance = 321.8
    val time = 4.15

    fun speed(distance: Double, time: Double = 2.0) = distance / time

    val averageSpeed = speed(time = 4.15, distance = 321.8)
    val averageSpeed1 = speed(321.8, 4.15)
    val averageSpeed2 = speed(distance = 321.8, 4.15)
    val averageSpeed3 = speed(321.8, time = 4.15)
    val averageSpeed4 = speed(distance = 321.8, time = 4.15)
    val averageSpeed5 = speed(time = 4.15, distance = 321.8)

    val walkingSpeed = speed(10.2)
    val bikingSpeed = speed(29.6)
    val drivingSpeed = speed(225.3)
    val flyingSpeed = speed(1368.747, 1.5)


}