/*
Scrivere un metodo Scala primes che genera uno stream infinito con la successione dei numeri primi: 2, 3, 5, 7, 11, ecc..

Suggerimento: scomporre il problema in sottoproblemi usando metodi ausiliari.
*/

object E33 {
    def primes() = {
        
        def isPrime(n:Int) = {
            
            def aux(x:Int, upper:Int):Boolean = {
                if (upper == 2) true
                else if (x % upper == 0 ) false
                else aux(x , upper -1) 
            }
            
            if (n <=3 ) n > 1
            else if ( (n%2) == 0 || (n%3)  == 0) false
            else aux(n , Math.sqrt(n).toInt)
        }

        def nPrimes(n:Int):Stream[Int] = {
            if (isPrime(n) == true) n #:: nPrimes(n+1)
            else nPrimes(n+1) 
        }

        nPrimes(2)
    }

}