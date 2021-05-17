/*
Scrivere un metodo Scala generateSeq che, dato un intero non-negativo n, un seme iniziale intero x e una funzione f:Int=>Int,
 restituisce la lista l di n interi tale che l(0)=x e l(i+1)=f(l(i)). 
Ad esempio, generateSeq(5, 1, _*2) restituisce List(1,2,4,8,16).


*/

object Esercizio21 extends App {

    def generateSeq(n:Int , x:Int , f:Int => Int ) = {
        val l = List(x)
        
    }

    println(generateSeq(5, 1, _*2))
    println(generateSeq(10, 4, _-2))
}