/*
Scrivere un metodo Scala che verifica se un numero è primo.
*/
def isPrime(x:Int) = {
    
    def aux(x:Int,d:Int):Boolean = {
        if(d <= 1  ) true
        else if( x%d == 0 ) false
        else aux(x , d-1)
    }
    aux(x , x/2 )
}

  
