package subtask1

import kotlin.math.absoluteValue

class PolynomialConverter {

    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>): String? {
        //throw NotImplementedError("Not implemented"
        if (numbers.isEmpty()) return null

        val pn_power = numbers.size - 1              //степень полинома
        val str_b: StringBuilder = StringBuilder()
        for (i in numbers.indices) {
            if (numbers[i]!=0){
                if (numbers[i]>0){                        //при положительном коэффициенте
                    if (pn_power-i == pn_power) {         //при i=0, первый член полинома в степени (pn_power-i)
                        str_b.append("" + numbers[i])

                    }else if(numbers[i]==1){              //замена коэфф-та 1 на " + "
                        str_b.append(" + ")
                    } else
                        str_b.append(" + "+numbers[i])
                }else{
                    if (pn_power-i == pn_power)                  //для первого члена полинома с отрицательным коэф-том
                    str_b.append("-"+numbers[i].absoluteValue)
                    else if(numbers[i].absoluteValue==1){       // замена коэфф-та -1 на " - "
                        str_b.append(" - ")
                    }else
                    str_b.append(" - "+numbers[i].absoluteValue)
                }
                when (pn_power-i ){
                    0 -> str_b.append("")
                    1 -> str_b.append("x")
                    else -> str_b.append("x^"+(pn_power-i))
                }
            }
        }
        return str_b.toString()
    }
}
