/*
Un sensore misura il numero di veicoli che passano in un tratto stradale in ogni minuto,
 producendo una lista di interi.
Occasionalmente, il sensore smette di funzionare e richiede manutenzione.
 Quando il sensore smette di funzionare, produce un intero negativo e da quel momento in 
 poi i numeri prodotti sono inattendibili.

Scrivere un metodo Scala mediaVeicoli(l:List[Int]):Double che calcola il numero medio di veicoli al minuto,
 ignorando tutti i valori a partire dal primo negativo.
  Il metodo deve essere realizzato in uno stile funzionale utilizzando i metodi di ordine 
  superiore delle liste
   (e non iterazione o ricorsione).

Suggerimento: usare il metodo span delle liste come documentato in 
http://www.scala-lang.org/api/current/#scala.collection.immutable.List. 
Per il cast a double, usare il metodo toDouble.
*/

def mediaVeicoli(l:List[Int]):Double = {
    val gvalues = l.span(x => x > 0 )._1
    (gvalues.sum /gvalues.size).toDouble
}
