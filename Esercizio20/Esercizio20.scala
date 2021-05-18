/*

Scrivere un metodo Scala longestSublist[T](p:T=>Boolean)(l:List[T]) che, dato un predicato p e una lista l,
 restituisce la più lunga sottolista di elementi consecutivi di l che soddisfano il predicato p. Se la soluzione non è unica, restituirne una qualsiasi.
  Ad esempio, longestSublist((_:Int)>0)(List(-4,5,3,6,0,3,4,-1)) deve restituire List(5,3,6), 
  che è la sottolista di elementi consecutivi positivi più lunga.

Suggerimento: usare il metodo foldLeft, consultando la documentazione della classe List.
*/

object Esercizio20 extends App {

    def longestSublist[T](p:T=>Boolean):List[T] => List[T] = {
        def response( l:List[T]):List[T] = {
            val verified = l.map(x => if(p(x)) 1 else 0).zipWithIndex

            def aux(it:List[(Int,Int)]):List[(Int,List[Int])] ={
                if (it == Nil) Nil
                else {
                    val buoni = it.takeWhile(x => x._1==1)
                    val buoniInd = buoni.map(x => x._2)
                    if (buoni.size > 0 ) (buoni.size, List.range(buoniInd.min , buoniInd.max +1)) :: aux(it.drop(buoni.size).dropWhile( x => x._1==0 ) ) 
                    else aux(it.dropWhile(x => x._1== 0))
                }
            }
            aux(verified).maxBy(x => x._1)._2.map(x => l(x) )
        }
        response _
    }


    println(longestSublist((_:Int)>0)(List(-4,5,3,6,0,3,4,-1))) 
    println(longestSublist((_:Int) == 0)(List(-4,5,3,6,0,3,4,-1))) 
    println(longestSublist((_:Int)%2 == 0)(List(-4,5,3,6,0,3,2,22,4,-1))) 

    

}


