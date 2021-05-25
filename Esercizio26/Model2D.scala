import java.awt.Color

/*
Completare il metodo Scala getGrid dell’object Model2D seguente in modo che costruisca 
un modello 2D che raffigura una griglia n x n. La figura è creata utilizzando esclusivamente segmenti di linea. 
La figura deve essere confinata nello spazio quadrato bidimensionale di lato unitario delimitato dall’origine degli assi fino
al punto di coordinate (1,1).
 La figura viene poi scalata automaticamente dal modulo di visualizzazione per occupare la dimensione della finestra.
Si ricordi che da Scala è possibile accedere a tutte le funzioni delle librerie Java (es. quelle della classe Math, se dovessero servire).

Per compilare da riga di comando usare: scalac Frame2D.scala Shape.scala Model2D.scala.
*/




object Model2D {

  def getGrid(n:Int) = {

    val RED = new Color(0xFF0000) // in formato RGB (Red-Blue-Green) o anche Color.RED
    
    val scaleFactor = 1.0/n

    def aux(scale:Int, increment:Double):List[Line] = {
      if (x == n ) Nil
      else Line(0.0, increment*scale  , 1.0 , increment*scale , RED ) :: Line(increment*scale, 1.0, increment*scale  , 0.0 , RED ) ::aux(scale+1, increment)
    }
    aux(0, scaleFactor)
  }

  def main(args:Array[String]) {
    println("Displaying 20x20 grid...")
    Frame2D.display(Model2D.getGrid(20), 500, 500)
  }
}
