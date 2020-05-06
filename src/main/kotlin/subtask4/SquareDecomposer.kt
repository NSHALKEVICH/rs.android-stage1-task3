package subtask4


import java.util.*
import kotlin.math.pow

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        //throw NotImplementedError("Not implemented")
        val power=2
        var squareOfNumber  = 0L
        val decomposeList = Stack<Int>()
        decomposeList.add(number)

        while (decomposeList.isNotEmpty()){
            val decomposedNumber = decomposeList.pop()

            squareOfNumber += decomposedNumber.toDouble().pow(power.toDouble()).toLong()
            for(element in decomposedNumber -1 downTo 0){
                val squareOfElement = element.toDouble().pow(power.toDouble()).toLong()
                if(squareOfNumber > squareOfElement){
                    decomposeList.push(element)
                    squareOfNumber -= squareOfElement
                }
                else if(squareOfNumber==squareOfElement){
                    decomposeList.push(element)
                    return decomposeList.reversed().toTypedArray()
                }
            }

        }
        return null


    }
}


