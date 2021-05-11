/*

Scrivere un metodo Scala filterByIndex (ricorsivo o meno) che, data una lista generica e un predicato su indici,
 restituisce la sottolista ottenuta prendendo solo gli elementi il cui indice soddisfa il predicato dato.

Esempio di uso:
filterByIndex(List("zero", "uno", "due", "tre"), i=>i%2==0) // prende solo gli elementi di indice pari

*/


object Es17 extends App{

    def filterByIndex[T]( l:List[T] , p:Int => Boolean):List[T] = {
        val ix = l.indices.toList 

        def rec(ind:List[Int]):List[T] = {
            if (ind == Nil) Nil
            else if (p(ind.head)) l(ind.head) :: rec(ind.tail)
            else rec(ind.tail)
        }
        rec(ix)
    }

    println(filterByIndex(List("zero", "uno", "due", "tre"), i=>i%2==0)) // prende solo gli elementi di indice pari
    println(filterByIndex(List(1,2,3,4,5,6,7,8), i=>i%2==0))
    println(filterByIndex(List(1,2,-3,-4,-5,6,-7,8), i=>i>0))
    println(filterByIndex(List(), i=> i < 2))

}