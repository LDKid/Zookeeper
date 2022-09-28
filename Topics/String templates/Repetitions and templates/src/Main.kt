fun main() {
    val word = readln()
    val count = word.length
    print("$count repetitions of the word $word: ${word.repeat(count)}")
}