/*
Scrivere una classe Scala Rational che rappresenta numeri razionali della forma num/den, dove num e den sono interi.
 Scrivere la classe in modo che sia possibile eseguire il seguente codice Scala:

object E25Main extends App {
    val r1 = Rational(2, 7)
    val r2 = Rational(8, 6)
    val r3 = Rational(4, 14)
    println(r1+r2)  // stampa 34/21
    println(r1-r2)  // stampa -22/21
    println(r1*r2)  // stampa 8/21
    println(r1/r2)  // stampa 3/14
    println(r1==r3) // stampa true
    println(r1!=r3) // stampa false
    println(r1!=r2) // stampa true
    println(r1<r2)  // stampa true
    println(r2<r1)  // stampa false
}
Suggerimento: calcolare il massimo comun divisore di numeratore e denominatore per riportare la frazione ai minimi termini 
(o irriducibile). Ad esempio, 4/14 dovrebbe essere memorizzato in un oggetto Rational come 2/7.

*/
object Esercizio25 {

    object MathRational {
        def getMCD(x:Int , y:Int) = {
            def aux(min:Int , max:Int):Int ={
                if (max == 0 ) 0
                else if( y%max == 0 || m&&  r%t == 0 ) r 
                else aux(t , r-1)
            }
            if (x == y) x max y 
            else aux( if(x< y ) x else y , if (x > y ) x else y )
        }
    }



    class Rational(x:Int, y:Int){
        def getX() = this.x
        def getY() = this.y
    }
}
