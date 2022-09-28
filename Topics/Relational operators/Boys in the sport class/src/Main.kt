fun main() {
    val h1 = readln().toInt()
    val h2 = readln().toInt()
    val h3 = readln().toInt()

    print(h2 in h1..h3 || h2 in h3..h1)
}