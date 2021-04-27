/*Scrivere un metodo Scala generico
 removeDuplicates[T](l:List[T]):List[T] che crea una nuova lista ottenuta da l rimuovendo gli elementi duplicati.
 */


def removeDuplicates[T](l:List[T]):List[T] = {
    if (l == Nil ) Nil
    else if ( l.count(x => x == l.head) > 1  ) l.head :: removeDuplicates(l.tail.filter(x => x != l.head) )
    else l.head :: removeDuplicates(l.tail)
}
