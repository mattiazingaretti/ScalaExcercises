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


    
object Esercizio25{
    object MathRational {
        //algo Euclide
        def getMCD(x:Int , y:Int):Int = {
            if (y == 0) x
            else {
                val q = x/y 
                val r = x % y 
                getMCD(y, r)
            } 
        }

        def getMCM(x:Int , y:Int) = (x*y) / MathRational.getMCD(x,y) 
    }


case class Rational(x:Int, y:Int){

        val n = x/MathRational.getMCD(x, y) 
        val d = y/MathRational.getMCD(x, y)


        def +(r:Rational) = Rational(n*r.d+r.n*d, d*r.d)
        def -(r:Rational) = Rational(n*r.d-r.n*d, d*r.d)
        def *(r:Rational) = Rational(n*r.n, d*r.d)
        def /(r:Rational) = Rational(n*r.d, d*r.n)

        def <(r:Rational) = n*r.d < d*r.n

        override def toString = this.x +"/" + this.y

        override def equals(that:Any) = that match {
            case r:Rational => n == r.n && d == r.d
            case _ => false
        }
}

}

