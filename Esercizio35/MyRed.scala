/*
Scrivere un metodo Scala myReduce applicabile a liste generiche 
che replica il funzionamento del metodo reduce, restituendo però un Option che vale 
None se la lista e vuota, e Some(x) altrimenti, dove x è il risultato della riduzione.
 L’implementazione deve essere ricorsiva e non deve usare il metodo predefinito reduce 
 o similari (fold ecc.), né costrutti della programmazione imperativa (var, while, ecc.).
*/
import scala.language.implicitConversions



object MyRed{
    implicit def listToMyList[T](l:List[T]) = new MyList(l)
}

class MyList[T](val l:List[T]){        
    
    def myReduce(f:(T,T)=> T) = {
        val l = this.l 
        
        def aux(i:Int , curr:T):T = {
            //println(curr, l.size , i ) 
            if (i == l.size-1  ) f(curr , l(i)) 
            else aux(i+1 , f(curr , l(i)) ) 
        }

        if (l.isEmpty ) None
        else if (l.size < 2 ) Option(l.head)
        else {
            val first = f(l(0) , l(1) ) 
            Some(aux(2 , first ))
        }
         

    }

}


