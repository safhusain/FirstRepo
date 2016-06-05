import com.saf.P10

object PO8 extends App
{
  val k = new P10
  
  val charSeq = List('x','y','z')
  println(k.comb(charSeq))  
  
  val seq = List(45,20,40,60,80,15,65,35,100)
  val q = k.comb(seq)
  
  val t = for{ n <- q if n.sum == 100 } yield{n}
  println(t)
 

}