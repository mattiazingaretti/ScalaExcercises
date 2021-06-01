/*
Si scriva un metodo Scala def piùFrequente[T](l:Seq[T]):Option[(T,Int)] 
che, data una sequenza di elementi generici, restituisce un Option che contiene una coppia (x,n),
 dove x è l’elemento più frequente ed n il suo numero di occorrenze nella sequenza,
  e None se la sequenza di input è vuota.
*/

object E31 {

    def piùFrequente[T](l:Seq[T]):Option[(T,Int)] = {
        if (l.isEmpty) None
        else {
            val (a , b) = l.groupBy(identity).toList.maxBy(x => x._2.size) 
            Option((a, b.size))
        }
    }
}