fun main(){
    var count = 9
    var number = 1

//    while (number <= 10) {
//
//        println(count * number)
//
//        number++
//    }

//    do {
//        println("$number is the number" ) //string templating
//    }
//        while (number >10)



    for (i in 1..10){
        println("$count x $i = ${count*i}")
    }

    for (i in 1 until  10){
        println("$count x $i = ${count*i}")
    }

    for (i in 1..10 step 2){
        println("$count x $i = ${count*i}")
    }


    for (i in 10 downTo  1 step 2){
        println("$count x $i = ${count*i}")
    }









}