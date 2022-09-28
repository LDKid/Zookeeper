fun main() {
    val n = readln().toInt()
    var currentMax = 0
    repeat(n) {
        var num = readln().toInt()
        if (num > currentMax && num % 4 == 0) currentMax = num
    }
    print(currentMax)
}