/*
Scrivere un metodo Scala query(studenti:List[(String,Int)], esami:List[(String,String)]):Int 
che, data una lista studenti di coppie (studente, età) e una lista esami di coppie (studente, esame),
 restituisce l’età degli studenti che hanno svolto il maggior numero di esami.

Ad esempio, se:

studenti = List(("Paola", 21), ("Luca", 22), ("Lucia", 21), ("Matteo",22))
esami = List(("Paola","PFP"), ("Luca","SC"), ("Paola","DB"), ("Lucia","LTW"), ("Matteo","SO"), ("Lucia","PFP"))
il risultato deve essere 21, infatti Paola e Lucia, che hanno 21 anni, hanno svolto complessivamente 4 esami, mentre Luca e Matteo, che hanno 22 anni,
 ne hanno svolti 2.

Suggerimento: usare metodi sulle liste (map, distinct, etc.)


*/

object Esercizio18 extends App {
    
    def query(studenti:List[(String,Int)], esami:List[(String,String)]):Int = { 
        studenti.map( stud => (esami.count( esame => stud._1 == esame._1    ) , stud._2) ).maxBy(elem => elem._1)._2
    }
    
    val studenti = List(("Paola", 21), ("Luca", 22), ("Lucia", 29), ("Matteo",22))
    val esami = List(("Paola","PFP"), ("Luca","SC"), ("Paola","DB"),  ("Matteo","SO"), ("Lucia","PFP"))

    println(query(studenti, esami))

}