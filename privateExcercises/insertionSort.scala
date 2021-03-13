object insertionSort extends App{

    def insert(l:List[Int] , x:Int  ):List[Int] = {
        if (l.size == 0) Nil
        else x::insert(l.tail, x)
    }

    //test
    println(insert(List(1,2,3), 4))

 //   def insertionSort()


}