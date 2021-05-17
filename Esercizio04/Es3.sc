/*
Scrivere un metodo Scala che calcola l’n-esimo numero di Fibonacci F(n),
 dove F(1)=1, F(2)=1, F(3)=2, F(4)=3, F(5)=5, ecc.
*/

def fibo(n:Int):Int = {
    if (n < 3) 1 
    else fibo(n-1) + fibo(n-2)
}


//With Tailrec 
def fibo_tail_rec(n:Int) = { 

    @scala.annotation.tailrec
    def aux(x:Int ,a:Int, b:Int):Int = {    
        if (x < 3 ) b
        else aux(x-1 , b, a+b )
    }

    aux(n , 1 , 1 )
}