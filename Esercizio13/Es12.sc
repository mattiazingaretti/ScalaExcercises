/*Scrivere un metodo Scala ricorsivo equal che verifica se 
due liste di interi sono uguali (uguaglianza profonda). */

def equal(l:List[Int], s:List[Int]):Boolean = {
    if (l.size != s.size ) false
    else if (l == Nil || s == Nil ) true
    else if(l.head != s.head )  false
    else equal(l.tail, s.tail)
}