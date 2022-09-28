fun main() {
    var counter = 0
    do {
        val n = readln().toInt()
        counter++
    } while (n > 0)
    print(--counter)
}