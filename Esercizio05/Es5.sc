/*
Scrivere un metodo Scala equalInRange che, 
date due funzioni Int=>Int e due interi a e b, 
verifica se le due funzioni sono uguali nell’intervallo [a,b].
*/

//Implicit assumption f, g takes integer values
def equalInRange(f:Int=>Int , g:Int=>Int , a:Int , b:Int):Boolean = {
    if (a == b ) true
    else if (f(a) == g(a)) equalInRange(f, g , a+1 , b)
    else false
} 