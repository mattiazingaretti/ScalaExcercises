/*
Scrivere un metodo Scala isSorted che, data una lista di interi, 
verifica se è ordinata in modo non decrescente.
Suggerimento: usare il metodo sliding.
Elaborare sia una versione ricorsiva che non ricorsiva basata sui metodi funzionali sulle liste.
*/


//Versione Metodi funzionali su liste
def isSorted(l:List[Int]):Boolean = {
    if (l.sliding(2,1).filter(lista => if(lista(0) > lista(1) ) true else false ).size  > 0 ) false else true
}

//TODO Versione ricorsiva
def isSorted2(l:List[Int]):Boolean = {
    true
}