
object PO5 extends App{


println(listAllCombinations(List('x', 'y', 'z')))    

def listAllCombinations(ls: List[Char]) : List[List[Char]] ={
      
          def mainLoop(l : List[Char], n: Char, res: List[List[Char]]): List[List[Char]]= 
            
            listCombinationEachChar(l,n,res) match {
            case t if l.isEmpty => t
            case t => mainLoop(l.tail,l.head,t)
            }
                        
            def listCombinationEachChar(ls1 : List[Char], current : Char, result: List[List[Char]]) : List[List[Char]] = 
              
            (ls1,current,result) match{
            case (l,z,r) if l.isEmpty => List(z) :: r
            case (l,z,r) => listCombinationEachChar(l.tail,z, List(l.head,z) :: r)

            }

          ls :: mainLoop(ls.tail,ls.head,List[List[Char]]())

      
    }


}