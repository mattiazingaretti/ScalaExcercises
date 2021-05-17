/*
Scrivere un metodo Scala ricorsivo minMax che, data una lista non vuota di interi, restituisce
 una coppia (min,max), dove min e max sono il minimo e il massimo elemento della lista, rispettivamente.
 Nota: data una coppia t=(a,b), t._1 è il primo elemento, t._2 è il secondo elemento.

Scrivere inoltre una variante non ricorsiva basata sui metodi standard della classe List visti a lezione.
*/

//Implementazione ricorsiva
def minMax(l:List[Int]):(Int, Int) = {
    
    def insert(x:Int , l:List[Int]):List[Int] = {
        if (l == Nil) List(x)
        else if (x <= l.head) x::l else l.head :: insert(x , l.tail)
    }

    def insertionSort(l:List[Int]):List[Int] = {
        if (l == Nil) l
        else insert(l.head , insertionSort(l.tail) )
    }
    
    val res = insertionSort(l)
    (res.head, res.last)
}

//Implementazione con i metodi sulle liste
def minMaxF(l:List[Int]):(Int,Int) = {
    (l.min, l.max)
}


