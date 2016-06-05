// Find List of prime numbers in the list.
import scala.math._

object P09 extends App {
  
  def testPrime(num:Int):Boolean = {
    
    val sqrtNum:Int = sqrt(num.toDouble).toInt

    val q = for{ x <- 2 to sqrtNum if num%x == 0 } yield { num }
    q.isEmpty
  }
  
  def getPrimeList(numList: List[Int]): List[AnyVal] ={
    numList.map(x => if (testPrime(x)) x ) 
  }
  
  
  def getAnotherPrimeList(numList: List[Int]): List[AnyVal] ={
    numList.collect{case x:Int if (testPrime(x)) =>x } 
  }  
  
  
  val numList = List(12,17,19,21,35,61)
  println(getPrimeList(numList))
  println(getAnotherPrimeList(numList))
}