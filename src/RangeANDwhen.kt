fun main(){

    val number = 18

    val result  = when(number){
        14 -> "fourteen"
        15 -> "fifteen"
        16 -> "sixteen"
        17 -> "seventeen"
        18 -> "eighteen"

        else -> "other"

    }

    println(result)

    println(number in 11.. 18)

    println(number in 21 until 18)
}