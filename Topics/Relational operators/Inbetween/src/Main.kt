fun main() {
    val v1 = readln().toInt()
    val v2 = readln().toInt()
    val v3 = readln().toInt()

    print(v1 in v2..v3 || v1 in v3..v2)
}