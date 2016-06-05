

object PO3 extends App{
  
 
  def printCombination(sequence :List[Char], k:Int) : List[List[Char]] = {
      
    var yy =  List[List[Char]]()
    var index=0
    yy ::=  sequence 
    while (index < sequence.length)
    {
      
      val origLst:List[Char] = sequence(index) :: sequence.take(index) ++ sequence.drop(index+1)
      
     
       origLst match {
          case xx :: remain if remain.length > 0  => {
              yy ++= printCombination(remain,k) 
          }

          case _  => { }
        }
       index += 1
    }
    yy
  }
  
  
  val seq = List('w','x','y','z')
  println(printCombination(seq,2))
  
}