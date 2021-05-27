object E29 {

    sealed abstract class BinTree {
        
        def sum():Int = this match{
            case E() => 0 
            case T(l, e , r)=> e + l.sum + r.sum 
        }

    }

    // albero non vuoto
    case class T(l:BinTree, e:Int, r:BinTree) extends BinTree 

    // albero vuoto
    case class E() extends BinTree

}

