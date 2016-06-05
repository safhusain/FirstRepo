// Find Last element in the list.

object P01 extends App {
  
  def last[T](lst:List[T]): T = {
    
    lst match {
      
      case xx :: remain if remain.length == 0  => {
        xx
      }
      
      case xx :: remain if remain.length > 0  => {
        last(remain)
      }
        
    }
    
  }
  
  println(last(List(5,8,10,1,7,10)))
  
}