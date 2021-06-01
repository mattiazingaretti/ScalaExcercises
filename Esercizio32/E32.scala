/*
Scrivere un metodo Scala def inter[T](a:List[T], b:List[T]):List[T] che calcola l’intersezione delle liste a e b 
in tempo O(na+nb), dove na e nb sono le lunghezze delle rispettive liste.

Suggerimento: usare il metodo toSet per convertire liste in Set.
 I set forniscono il test di appartenenza alla collezione (contains) in tempo O(1) 
 (in media) usando di default un HashSet.

Si riporta un main di prova e una versione inefficiente che usa tempo O(na*nb).
 Compilare il codice insieme al modulo Prof.scala che fornisce il costrutto profila per la misurazione dei tempi.


*/

object E32 {

    //NON sono sicuro che questa implementazione soddisfi i requisiti richiesti
    def inter[T](a:List[T], b:List[T]):List[T] = {
        val aSet = a.toSet
        val bSet = b.toSet
        
        def aux[T](b:List[T], a:Set[T] ):List[T] = {
            b match {
                case Nil => Nil 
                case (h:: t ) if (a contains h) => h:: aux(b.tail, a ) 
                case default => aux(b.tail , a) 
            }
        }

        if (aSet.size > bSet.size ) aux(b , aSet)
        else aux(a , bSet)
    }

}