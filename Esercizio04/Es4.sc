/*
Scrivere un metodo Scala concatena che, date tre funzioni 
f1:Double=>Double, f2:Double=>Double e f3:Double=>Double 
e due valori Double a e b con a<=b 
restituisce una funzione che coincide con f1 
per tutti gli argomenti prima di a, con f2 nell’intervallo [a,b], 
e con f3 dopo b.
*/


def concatena(f1:Double=>Double, f2:Double=>Double , f3:Double=>Double, a:Double, b:Double):Double=>Double= {
    x:Double => x match{
        case x if(x < a ) => f1(x)
        case x if (x<= b && x>=a ) => f2(x)
        case x if (x > b ) => f3(x)
    } 
}