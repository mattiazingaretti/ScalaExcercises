object E28 {
    
class StringCeaser(val x:String)  {
    
    def rot(k:Int):String = {
        this.x.map( x => {
            x match{
                case x if(x.isLetter)  => { x match{
                                                    case x if(x.isLower) =>  ('a' + (x - 'a' + k) % 26 ).toChar 
                                                    case default =>    ('A' + (x - 'A' + k) % 26).toChar
                                            }
                    }
                case default => x
            }
        })

    }


}

}