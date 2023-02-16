fun main() {
    var name ="akirachix"
    println("${name[0]}${name[2]}${name[3]}")
    var wewe = list("Gloria","22")
    println(wewe)
     var X = length("Glolria")
    println(X.length)
    lolo("Gloria")




}
fun list(name:String,age:String):String {
    var name = "Gloria"
    var age = "22"
    return "Hello my name is ${name} and i am ${age} year old"



}
fun length(name:String):String{
    var name = "Gloria"
    return name
}
fun lolo(name:String){
    val names = "Gloria"
    if (name.equals(names) ){
        println("Thats me.")
    }
    else{
        println("i dont know who that is")
    }


}