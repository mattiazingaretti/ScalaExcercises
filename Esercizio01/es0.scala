/*
Scrivere un metodo Scala applicaDueVolte che, dati come parametri 
una funzione f:Int=>Int e un intero x, calcola f(f(x))
*/
object es0 extends App {
    def applicaDueVolte(f: Int => Int , x:Int) = {
    f(f(x))
    }

//Test
println(applicaDueVolte(x => x+1 , 10)) 

}
