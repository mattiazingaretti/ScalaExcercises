/*
Scrivere un metodo Scala search che, dato un Vector[T] ordinato, dove sul dominio T è definito un ordinamento totale
 mediante la relazione <=, e un elemento e di tipo T, restituisce true se e appartiene al vettore, e false altrimenti.
  Il tempo di esecuzione deve essere O(log n), dove n è la lunghezza del vettore.

Suggerimento: usare l’algoritmo di ricerca binaria.

*/


object E34 {
    
    def search[T <%Ordered[T] ](vec:Vector[T], e:T ) = {
        
        def binSearch(l:Int, u:Int):Boolean = {
            if (l > u) false
            else if ( e < vec(l) || e > vec(u) ) false
            else { 
                val m = (l+u)/2 
                if (vec(m) == e ) true
                else if (vec(m) > e ) binSearch(l , m-1)
                else binSearch(m+1 , u)
            }
        }

        binSearch(0, vec.size -1)
    }

}