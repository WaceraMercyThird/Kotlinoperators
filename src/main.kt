fun main () {
    helloworld()
    modulus(50,20)
    sum(34,67,45,67)
    fact()

}
fun helloworld() :String {
    var name = "Mercy"
    println("Hello ${name}")
    return name

}
fun modulus(a:Int, b:Int):Int{
    var modulus = a%b
    println(modulus)
    return modulus
}
fun sum(a:Int, b:Int, c:Int, d:Int):Int {
    var sum = a+b+c+d
    println(sum)
    return sum
}
fun fact():String {
    var fact = "I speak English"
    println(fact)
    return fact
}