package subtask5

import kotlin.reflect.KClass

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        //throw NotImplementedError("Not implemented")
        val result =  mutableListOf<String>()
        val numberStr:String=number             //"номер телефона"
        var stringOfDigits:String = ""          //"вариант номера телефона с замещением одной его цифры на одного из соседей"
        if (number.toInt() < 0){                //если номер - отрицательное число
            return null
        }
        for (digit in number){
            when(digit){

                '1'-> {
                    stringOfDigits=numberStr.replace(digit,'2')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'4')
                    result.add(stringOfDigits)
                }
                '2'-> {
                    stringOfDigits=numberStr.replace(digit,'1')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'5')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'3')
                    result.add(stringOfDigits)
                }
                '3'-> {
                    stringOfDigits=numberStr.replace(digit,'2')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'6')
                    result.add(stringOfDigits)
                }
                '4'-> {
                    stringOfDigits=numberStr.replace(digit,'1')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'5')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'7')
                    result.add(stringOfDigits)
                }
                '5'-> {
                    stringOfDigits=numberStr.replace(digit,'2')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'4')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'8')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'6')
                    result.add(stringOfDigits)
                }
                '6'-> {
                    stringOfDigits=numberStr.replace(digit,'9')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'5')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'3')
                    result.add(stringOfDigits)
                }
                '7'-> {
                    stringOfDigits=numberStr.replace(digit,'4')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'8')
                    result.add(stringOfDigits)
                }
                '8'-> {
                    stringOfDigits=numberStr.replace(digit,'5')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'7')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'0')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'9')
                    result.add(stringOfDigits)
                }
                '9'-> {
                    stringOfDigits=numberStr.replace(digit,'6')
                    result.add(stringOfDigits)
                    stringOfDigits=numberStr.replace(digit,'8')
                    result.add(stringOfDigits)
                }
                '0'-> {
                    stringOfDigits = numberStr.replace(digit, '8')
                    result.add(stringOfDigits)
                }
            }
        }
        return result.toTypedArray()
    }
}
