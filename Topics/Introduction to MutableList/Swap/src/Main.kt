fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    val firstNum = numbers[0]
    val lastIndex = numbers.size - 1
    numbers[0] = numbers[lastIndex]
    numbers[lastIndex] = firstNum

    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}