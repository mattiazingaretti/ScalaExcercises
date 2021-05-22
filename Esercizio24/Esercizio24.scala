/*
Completare il seguente frammento di programma Scala:

case class Studente(nome:String, età:Int, esami:List[String])
val q = List(
                 Studente("Marco",   23, List("PFP","SC")), 
                 Studente("Laura",   19, List("SC", "FI1", "PFP")), 
                 Studente("Stefano", 23, List("SC", "FI1")), 
                 Studente("Marco",   25, List("SC", "FI1", "FI2")), 
                 Studente("Paola",   22, List("SC", "PFP"))
            )

val query1 = // estrarre tutti gli studenti con età compresa tra 20 e 24 anni (inclusi) che hanno sostenuto l'esame di "PFP"

// stampare i dati degli studenti in query1

val query2 = // estrarre tutti gli studenti con età strettamente inferiore a 24 anni che hanno sostenuto almeno due esami
// stampare i dati degli studenti in query2
Provare diverse soluzioni usando:

for comprehension (for ... yield)
metodi delle liste
*/

object Esercizio24 extends App{
    
    case class Studente(nome:String, età:Int, esami:List[String])
    val q = List(
                 Studente("Marco",   23, List("PFP","SC")), 
                 Studente("Laura",   19, List("SC", "FI1", "PFP")), 
                 Studente("Stefano", 23, List("SC", "FI1")), 
                 Studente("Marco",   25, List("SC", "FI1", "FI2")), 
                 Studente("Paola",   22, List("SC", "PFP"))
            )

    println("List methods !")
    val query1 = q.filter(x => (x.età <= 24 && x.età >= 20 && x.esami.contains("PFP")  ) )
    println(query1)

    val query2 = q.filter(x => x.età < 24 && x.esami.size >1) 
    println(query2)

    println("_________________________")
    val query3 = for{ i <- q if (i.età <= 24 && i.età >= 20 && i.esami.contains("PFP")) }   yield i 
    println(query3)

    val query4 = for{i <- q if (i.età < 24 && i.esami.size >1)} yield i 
    println(query4)



}

