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

    //public fun generateSecondOperand(firstOperand : Int, operator : Operators) : Int{
    //
    //}
}