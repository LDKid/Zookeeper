fun main() {
    val value1 = readln().toInt() > 0
    val value2 = readln().toInt() > 0
    val value3 = readln().toInt() > 0
    print(value1 xor value2 xor value3 && !(value1 && value2 && value3))
}