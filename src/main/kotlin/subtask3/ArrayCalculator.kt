package subtask3

import kotlin.math.absoluteValue

class ArrayCalculator {

    // TODO: Complete the following function
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        // throw NotImplementedError("Not implemented")
        var product = 1
        val integerList = itemsFromArray.filterIsInstance<Int>().toMutableList()
        val sizeOfIntegerList = integerList.size

        if (integerList.isEmpty()) return 0

        if (sizeOfIntegerList <= numberOfItems) {
            integerList.forEach { value ->
                product *= value
            }
            return product
        }
        val pValueList = mutableListOf<Int>()
        val nValueList = mutableListOf<Int>()
        for (value in integerList){
            if (value >= 0) pValueList.add(value)
            else nValueList.add(value)
        }
        //println (pValueList)
        //println(nValueList)
        pValueList.sortDescending()
        nValueList.sort()
        //println (pValueList)
        //println(nValueList)
        val nValueMult = nValueList[0] * nValueList[1]
        val pValueMult = pValueList[0] * pValueList[1]

        if (pValueMult > nValueMult){
            product = pValueList.first()
            for (i in 1 until numberOfItems){
                product*=pValueList[i]                //если сумма первых 2х отрицат элементов меньше суммы
            }                                         //первых двух положит элементов - считаем только положит
            return product
        }else{
            product = nValueMult
            for (i in 0 until (numberOfItems-2)){
                product*=pValueList[i]
            }
            return product
        }
    }
}
