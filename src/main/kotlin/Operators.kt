enum class Operators {
    PLUS,
    MINUS,
    DIVIDE,
    MULTIPLY,
    NONE;

    fun performCalculation(firstOperand : Int, secondOperand : Int) : Int{
        return when(this){
            PLUS -> firstOperand + secondOperand
            MINUS -> firstOperand - secondOperand
            DIVIDE -> firstOperand / secondOperand
            MULTIPLY -> firstOperand * secondOperand
            else -> 0
        }
    }
}