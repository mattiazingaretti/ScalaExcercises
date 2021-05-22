/*
Il nome Scala è un acronimo di SCAlable LAnguage, che riflette il design del linguaggio orientato all’estensibilità. 
In Scala è possibile introdurre nuovi costrutti sfruttando il meccanismo del passaggio dei parametri per nome e la flessibilità
 nell’invocazione dei metodi senza dover mettere argomenti tra parentesi.

Questo esercizio richiede di definire un costrutto funzionale Scala profila { E } che valuta l’espressione E
 e restituisce una coppia (v,t) dove v è il valore ottenuto dalla valutazione di E e t è il tempo in nanosecondi 
 richiesto dalla valutazione di E. Usare il seguente programma di prova:

Suggerimento: per misurare il tempo, usare System.nanoTime.
*/

object Esercizio23 extends App {
    def profila[T](exp: => T):(T,Long) ={
        val ii = System.nanoTime
        val v = exp
        (v , System.nanoTime - ii)
    }
}