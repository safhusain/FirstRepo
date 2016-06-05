

object P12 extends App{
  
  val lst = Array(8,6,5,6,7,2,10,5,4)
  
  val x = for {
        i <- 0 to lst.length-1 
          j <- i+1 to lst.length-1 
          if (lst(i)+lst(j) == 12) 
    }
    yield ( (lst(i),lst(j)))
  
  
    println(x)
  
}