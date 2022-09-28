fun main() {
    val class1 = readln().toUInt()
    val class2 = readln().toUInt()
    val class3 = readln().toUInt()

    print(class1 / 2u + class1 % 2u + class2 / 2u + class2 % 2u + class3 / 2u + class3 % 2u)
}