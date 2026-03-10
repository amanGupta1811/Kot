import kotlin.math.pow

fun main(){


//   println(add(23.8736 , 998.877))
   println(add( 12,87))

    var fu = ::add

    println(fu(128,98))

    println(power(b=2.0,a=5.0)) //Named Arg

}

fun add(a: Int, b: Int): Int = a+b

//fun add (a: Double, b: Double) = a+b

fun power(a: Double, b: Double) : Double{
    return a.pow(b)
}