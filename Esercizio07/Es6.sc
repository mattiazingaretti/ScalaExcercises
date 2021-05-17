/*
Scrivere un metodo Scala findIndices che, data una lista generica l e un elemento x
restituisce una lista che contiene gli indici i tali che l(i)==x. 
Se la lista non contiene x, il metodo restituisce una lista vuota.
*/


//Ricorsivamente solo per flexare
def findIndices[T](l:List[T], x:T) = {
    if (l contains x == false) Nil
    def aux[T](l:List[T], x:T, i:Int):List[Int] = {
        if (l.isEmpty || i == l.size ) Nil
        else if (l(i) == x ) i::aux(l , x , i+1)
        else aux(l, x , i+1)
    } 
    aux(l, x , 0)
}

//ancora più flex
def findIndices2[T](l:List[T], x:T):List[Int] = {
    if (l contains x == false ) Nil
    else l.zipWithIndex.filter(tupla =>{ if(tupla._1 == x) true else false }).map(tupla => tupla._2)
}

