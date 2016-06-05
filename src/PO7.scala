

object PO7 extends App{
  
  
  def crunchifyPermutation(crunchStr: String) : List[String] = {

    crunchStr match {
      case xx if (crunchStr.length == 1) => List(xx)
          
      case xx if (crunchStr.length > 1) => {
            val topChar = xx.head
            val vLst = crunchifyPermutation(xx.tail)
            for{
              pStr <- vLst
              indx <- 0 to pStr.length
            }
            yield{
              crunchifyCharAdd(pStr,indx,topChar)
            }
      }
    }
 }

  
  def crunchifyCharAdd(tempStr:String, ind:Int, charVal:Char) : String = {
    val x = tempStr.splitAt(ind)
    x._1+charVal+x._2
  }
  
  
  val x = crunchifyPermutation("abcd")
  println("Here "+ x)
  
  

}