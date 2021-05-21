/*
Scrivere un metodo Scala query(studenti:List[(String,Int)], esami:List[(String,String)], e:Int):String 
che, data una lista studenti di coppie (studente, età), una lista esami di coppie (studente, esame) e un’età e, 
restituisce il nome dell’esame svolto dal maggior numero di studenti di età non superiore a e.

Ad esempio, se:

studenti = List(("Paola", 19), ("Luca", 23), ("Lucia", 21), ("Matteo",22), ("Francesca",23))
esami = List(("Paola","PFP"), ("Luca","SC"), ("Paola","DB"), ("Lucia","SC"), ("Matteo","LTW"), ("Lucia","PFP"), ("Francesca","SC"))
e = 22
il risultato deve essere "PFP". 
Infatti Paola, Lucia e Matteo, che hanno non più di 22 anni, hanno svolto complessivamente: PFP 2 volte, DB 1 volta, LTW 1 volta, e SC 1 volta
*/

object Esercizio22 extends App{
    def query(studenti:List[(String,Int)], esami:List[(String,String)], e:Int) = {
        val validStud = studenti.filter( x => x._2 <= e).map(x => x._1)
        try{
            esami.filter(x => validStud contains x._1).groupBy(_._2).toList.map(x => (x._1 , x._2.size)).maxBy(x => x._2)._1
        }catch{
            case e: UnsupportedOperationException=> ""
        }
    }


    val studenti = List(("Paola", 19), ("Luca", 23), ("Lucia", 21), ("Matteo",22), ("Francesca",23))
    val esami = List(("Paola","PFP"), ("Luca","SC"), ("Paola","DB"), ("Lucia","SC"), ("Matteo","LTW"), ("Lucia","PFP"), ("Francesca","SC"))
    val e = 100
    println(query(studenti, esami, e))


}
