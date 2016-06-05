

object PO6 extends App{
  
  def comb(cur:Char, tailLst:List[Char]): List[List[Char]] =
  {

    tailLst match {
      
      case xx  if xx.length == 1 => { List(xx) }
      case xx  if xx.length > 1 =>  { 
        val p = comb(xx.head, xx.tail)
        val q = for
        {
          i <- p  
        }
        yield
        {
          xx.head :: i
        }
        List(List(xx.head)) ::: p ::: q 
      }
    }
  }
  
  val seq = List('w','x','y','z')
  println(comb(seq.head, seq.tail))  
  
  
}