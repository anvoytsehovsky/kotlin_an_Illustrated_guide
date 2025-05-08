fun main() {
    val pi = 3.14
    var radius = 5.2

    fun circumference(radius: Double) = 2 * pi * radius

    val circumferenceOfSmallCircle = circumference(5.2)
    val circumferenceOfMediumCircle = circumference(6.7)
    val circumferenceOfLargeCircle = circumference(10.0)
}