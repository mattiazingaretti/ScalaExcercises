/*
Il metodo fornito def countChange(amount:Int, coins:List[Int]):Int calcola ricorsivamente il numero di modi
 in cui è possibile dare il resto per un ammontare amount usando il portafogli di monete coins.
  Si richiede di scrivere una versione parallela def countChangePar(amount:Int, coins:List[Int], maxThreads:Int):Int 
   che prende come parametro aggiuntivo il numero massimo di thread che possono essere utilizzati per risolvere il problema.

Si noti che Runtime.getRuntime().availableProcessors() fornisce il numero di core (logici) disponibili ed è usato come valore di default per il numero massimo di thread creati per risolvere il problema.

Suggerimento: usare il costrutto fornito Par.par per valutare in parallelo due espressioni.

Usare il seguente programma di prova e i relativi moduli richiesti:


*/


object PCoin {
    // versione sequenziale (inefficiente, nel caso peggiore richiede 2^n chiamate ricorsive, con n=coins.size) 
    def countChange(amount:Int, coins:List[Int]):Int =
        if (amount == 0) 1
        else if (coins.isEmpty || amount < 0) 0
        else countChange(amount - coins.head, coins.tail) + countChange(amount, coins.tail)

    // versione parallela, da completare
    def countChangePar(amount:Int, coins:List[Int], maxThreads:Int = Runtime.getRuntime().availableProcessors()):Int = {
        if (amount == 0 ) 1
        else if (coins.isEmpty || amount < 0 ) 0 
        else if (maxThreads < 2) countChange(amount, coins)
        else {
            val (a, b)  = Par.par(countChangePar(amount - coins.head, coins.tail, maxThreads/2 ))(countChangePar(amount, coins.tail ,maxThreads/2) )
            a + b
        }
    }

}