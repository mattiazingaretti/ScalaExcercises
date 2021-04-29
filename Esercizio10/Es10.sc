/*Scrivere un metodo Scala generico union[T](a:List[T], b:List[T]):List[T] 
che genera la lista ottenuta come unione delle liste a e b. 
La lista prodotta non deve contenere duplicati.
*/


def union[T](a:List[T], b:List[T]):List[T] = {
    (a ::: b ).distinct
}
