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
        def getX() = this.x
        def getY() = this.y
        val num = x/MathRational.getMCD(x, y) 
        val den = y/MathRational.getMCD(x, y)
        println(num, den)

        def +(x:Rational) = (this.num + x.num )/ (this.den*x.den)

        def -(r:Rational) = Rational(num*r.den-r.num*den, den*r.den)
        def *(r:Rational) = Rational(num*r.num, den*r.den)
        def /(r:Rational) = Rational(num*r.den, den*r.num)
            def <(r:Rational) = num*r.den < den*r.num


}

}

