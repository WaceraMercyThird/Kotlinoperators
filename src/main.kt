fun main () {
    helloworld()
    modulus(50,20)
    sum(34,67,45,67)
    fact()

}
fun helloworld() {
    var name = "Mercy"
    println("Hello ${name}")


}
fun modulus(a:Int, b:Int){
    var modulus = a%b
    println(modulus)

}
fun sum(a:Int, b:Int, c:Int, d:Int){
    var sum = a+b+c+d
    println(sum)

}
fun fact():String {
    var fact = "I speak English"
    println(fact)
    return fact
}