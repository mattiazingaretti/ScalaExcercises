/*
Scrivere un metodo Scala def isRot(m:Seq[T]):Option[Int] applicabile su un oggetto l di tipo Seq
 che restituisce Some(n), se m è ottenibile ruotando l di n posizioni in avanti,
  e None altrimenti. Se vi sono più valori possibili di n, restituire il più piccolo.
*/

object IsRot {
    implicit def seqToMySeq[T](s:Seq[T]) = new MySeq(s)
}

class MySeq[T](val s:Seq[T]){
    
    def isRot(m:Seq[T]):Option[Int] = {
        val s = this.s 
        
        if (m.size != s.size ) None
        else {
            val size = m.size
            if (size <= 1 ) if (s != m) None else Option(0)
            if (s.intersect(m).size != size ) None 
            else {
                val tmp = m.take(m.indexOf(s.head))
                    if ( m.drop(m.indexOf(s.head)) :++ tmp  == s )  Some(tmp.size)
                    else None
            }
        }  
    }

}

