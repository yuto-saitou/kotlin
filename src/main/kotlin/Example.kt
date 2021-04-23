fun main(){
    val text =
    """改行もインデントもこのとおり
ああああ"""
    println(text)
    ifExample(100)
}

fun ifExample(num: Int){
    if(num < 100){
        println("Less than 100")
    }else if (num == 100){
        println("Equal to 100")
    }else{
        println("Greater then 100")
    }
}

