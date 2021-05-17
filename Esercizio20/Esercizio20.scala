/*

Scrivere un metodo Scala longestSublist[T](p:T=>Boolean)(l:List[T]) che, dato un predicato p e una lista l,
 restituisce la più lunga sottolista di elementi consecutivi di l che soddisfano il predicato p. Se la soluzione non è unica, restituirne una qualsiasi.
  Ad esempio, longestSublist((_:Int)>0)(List(-4,5,3,6,0,3,4,-1)) deve restituire List(5,3,6), 
  che è la sottolista di elementi consecutivi positivi più lunga.

Suggerimento: usare il metodo foldLeft, consultando la documentazione della classe List.
*/

object Esercizio19 extends App {

    def longestSublist[T](p:T=>Boolean):List[T] => List[T] = {
        def response( l:List[T]):List[T] = {
            val counter = 0  
            val res = l.foldLeft(0)(x:T, y:Int => x  ) 
            println(res)    
            l
        }
        response _
    }


    println(longestSublist((_:Int)>0)(List(-4,5,3,6,0,3,4,-1))) 

}


