fun main() {
    // var pode mudar em tempo de execução
    var name = "Lucas"
    val lastName = "Silva"
    
    // aspas simples é char, aspas duplas string
    var letter: Char = 'L'
    var lastCharInName = name[name.length -1]
    
    var result = 6
    result /= 2 // result = result / 2
    result -= 2 // result = result - 2

    var num = 2 
    result = num-- // result = 2 
    result = --num // reuslt = 0 pq decrementa antes
    
    var age = 17
    // when = switch 
    when(age){
     	// ! = não está entre 0 e 20
        !in 0..20  -> println("now you may drink in the US")
        in 18..20  -> println("now you may vote")
        16,17 -> println("you now may drive")
        else -> println("you're too young")
    }
 
    var x : Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        // não é tipo Double
        !is Double -> println("$x is not Double") 
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }
    
    // 1 2 3 4 5 6 7 8 9 10 
    for(num in 1..10) {
        print("$num ")
    }
 	println("")
    // 1 2 3 4 5 6 7 8 9 
    for(i in 1 until 10) { // = for(i in 1.until(10))
        print("$i ")
    }
 	println("")
 	// 10 9 8 7 6 5 4 3 2 1 
    for(i in 10 downTo 1) { // = for(i in 10.downTo(1))
        print("$i ")
    }
 	println("")
 	// 1 3 5 7 9 
    for(i in 1 until 10 step 2) { // = for(i in 1.until(10).step(2))
        print("$i ")
    }
    
    var nullableName: String? = "Vadjo"
    val realName = nullableName ?: "Guest" // ?: = ??
    nullableName!!.toLowerCase() // !!. = !.
    println(realName)
    
    var res = avg(2.5,5.6)

}
 
// método é uma function dentro de uma classe 
fun avg(a: Double, b: Double): Double {
    return  (a + b)/2
}