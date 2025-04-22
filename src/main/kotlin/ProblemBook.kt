import kotlin.random.Random

public class ProblemBook {
    public var correctlySolvedProblems = 0;
    public var incorrectlySolvedProblems = 0;
    public val percentageOfCorrectAnswers : Float
        get() = correctlySolvedProblems / ((correctlySolvedProblems + incorrectlySolvedProblems) / 100.0f)

    public fun generateFirstOperand() : Int{
        return Random.nextInt(10, 100)
    }

    public fun generateOperator() : Operators {
        val number = Random.nextInt(1, 5)
        return when(number){
            1 -> Operators.PLUS
            2 -> Operators.MINUS
            3 -> Operators.MULTIPLY
            4 -> Operators.DIVIDE
            else -> Operators.NONE
        }
    }

    public fun generateSecondOperand(firstOperand : Int, operator : Operators) : Int{
        var result = 0
        when(operator){
            Operators.PLUS, Operators.MINUS, Operators.MULTIPLY ->{
                result = Random.nextInt(10, 100)
            }
            Operators.DIVIDE ->{
                do{
                    result = Random.nextInt(10, 100)
                } while (!hasDecimalPart((firstOperand.toFloat() / result.toFloat())))
            }
            else -> {}
        }
        return result
    }

    public fun isCorrectAnswer(firstOperand : Int,
                             operator : Operators,
                             secondOperand : Int,
                             answer : Int) : Boolean{
        return operator.performCalculation(firstOperand, secondOperand) == answer
    }

    private fun hasDecimalPart(number: Float): Boolean {
        return number % 1 != 0.0f
    }
}