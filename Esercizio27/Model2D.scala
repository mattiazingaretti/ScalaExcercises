

object Model2D {

  def getToroidalMandala(numPetals:Int) = {

    def aux(alfa:Double , x:Int):List[Circle] = {
        if ( x == numPetals) Nil 
        else {
            println(alfa,Math.cos(alfa), Math.sin(alfa) )
            Circle(Math.cos(alfa)*0.25+0.5,Math.sin(alfa)*0.25+0.5 , 0.25) :: aux(alfa+(2*Math.PI)/numPetals , x+1 )
        }
    }
    aux(0.0, 0)
  }

  def main(args:Array[String]) {
    println("Displaying Toroidal Mandala...")
    Frame2D.display(Model2D.getToroidalMandala(24), 500, 500)
  }
}