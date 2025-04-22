fun main() {
    val problemBook = ProblemBook()
    while (true){
        var first = problemBook.generateFirstOperand()
        var operator = problemBook.generateOperator()
        var second = problemBook.generateSecondOperand(first, operator)

        print("$first $operator $second = ")
        var result = readln().toInt()
        when (problemBook.isCorrectAnswer(first, operator, second, result)){
            true -> {
                println("Правильно")
                problemBook.correctlySolvedProblems++
            }
            false ->{
                println("Не правильно")
                problemBook.incorrectlySolvedProblems++
            }
        }
        printStat(problemBook)
        println()
    }
}

fun printStat(problemBook: ProblemBook){
    println("Итого решено примеров: ${problemBook.correctlySolvedProblems + problemBook.incorrectlySolvedProblems}")
    println("Решено правильно примеров: ${problemBook.correctlySolvedProblems}")
    println("Решено не правильно примеров: ${problemBook.incorrectlySolvedProblems}")
    println("Решено правильно примеров в процентах: ${"%.2f".format(problemBook.percentageOfCorrectAnswers)}")
}