fun main() {
    var x = greetJane("jane")
    var y = number(21)
    hasVisitedCapital("Nigeria")
    hasVisitedCapital("Uganda")
    hasVisitedCapital2("Burudi")
    hasVisitedCapital2("Uganda")
    println(private(password = ("prudence")))
    println(private(password = ("tijhjjkkoikik,kmk,kksk")))
    println(private(password = ("tygth")))
    println(private(password = ("password")))
    numbers()
    multiples()


}
fun greetJane(name:String){
    if (name=="Jane"){
        println("Hello Jane")
    }
    else{
        println("Who are you")
    }
}
fun number(num:Int){
    if (num%2==0){
        println("even")

    }
    else{
        println("odd")
    }
}
fun hasVisitedCapital(nationality:String){
    if (nationality.equals("Kenyan")){
        println("Have you ever been to Nairobi?")
    }
    else if (nationality.equals("Tanzania")){
        println("Have you ever been to Dodoma?")
    }
    else if (nationality.equals("Uganda")){
        println("Have you ever been to Kampala?")
    }
    else{
        println("Have you ever been to Africa?")
    }
}
fun hasVisitedCapital2(nationality: String){
    when(nationality){
        "Kenyan","Tanzania","Uganda"-> println("Have you ever been in Nairobi?")
        "Nigeria","Ghananian"-> println("Have you ever been to Lagos?")
    }

}
fun private(password:String):Boolean{
    if (password.length >= 8 && password.length<=16 && password!="password"){
        return true
    }
    else{
        return false
    }

}
fun numbers(){
    for (num in 1..20){
        if (num%2!=0){
            println(num*num)
        }
    }
}
fun multiples(){
    for (num in 1..1000){
        if (num%6==0 && num%8==0)
        println("Bingo")
        else if (num%6==0 || num%8==0)
            println(num)

        }
    }





