/*Scrivere un metodo Scala max che, data una lista di stringhe,
 restituisce la lunghezza della stringa più lunga.
Suggerimento: usare map e reduce
*/

def max(l:List[String]):Int = {
    l.map(x => x.size).reduce((a,b) => if(a> b) a else b )
}
