package de.danielweidle.codewars.bouncingballs

fun assertInput(h: Double, bounce: Double, window: Double) {
    require(h > 0)
    require(bounce > 0 && bounce < 1)
    require(window < h)
}

/**
 * https://www.codewars.com/kata/5544c7a5cb454edb3c000047
 */
fun bouncingBall(h: Double, bounce: Double, window: Double): Int {
    print("height=${h}, bounce=${bounce}, window=${window}")
    try {
        assertInput(h, bounce, window)
    } catch (e: IllegalArgumentException) {
        return -1
    }
    var height: Double = h
    var dropsHigherThanWindow: Int = 0
    while (height > window) {
        dropsHigherThanWindow++
        height = height.times(bounce)
        if (height > window) {
            dropsHigherThanWindow++
        }
    }
    return dropsHigherThanWindow
}