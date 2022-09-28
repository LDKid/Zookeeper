fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(
        if (a > c) {
            Math.max(a, b)
        } else {
            Math.max(c, b)
        }
    )
}