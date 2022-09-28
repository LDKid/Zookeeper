fun main() {
    val c = readln().first()
    print(c.isUpperCase() || c.isDigit() && c > '0')
}