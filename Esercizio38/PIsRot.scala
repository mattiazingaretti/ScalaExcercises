

object PIsRot{
    implicit def seqToMySeqPar[T](s:Seq[T]) = new MySeqP(s)
}


class MySeqP[T](val s:Seq[T]) {

    def isRotPar(m:Seq[T]) = {
        val s = this.s 
        
        if (m.size != s.size ) None
        else {
            val size = m.size
            if (size <= 1 ) if (s != m) None else Option(0)
            if (s.intersect(m).size != size ) None 
            else {
                val (start, end) = Par.par{ m.take(m.indexOf(s.head)) }{m.drop(m.indexOf(s.head) )}  
                    if ( end :++ start  == s )  Some(start.size)
                    else None
            }
        }  
    }
}


object Par {
    def par[A,B](a: =>A)(b: =>B):(A,B) = {
        var resA:Option[A] = None
        val r = new Runnable {
            def run() = resA = Some(a)
        }
        val t = new Thread(r)
        t.start()
        val resB = b
        t.join()
        (resA.get, resB)
    }
}
