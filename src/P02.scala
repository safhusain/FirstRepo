// Find List of prime numbers in the list.
import scala.math._

object P02 extends App {
  
  def testPrime(num:Int):Boolean = {
    
    val sqrtNum:Int = sqrt(num.toDouble).toInt
    var isPrime:Boolean = true
    
    for{
      x <- 2 to sqrtNum
      if num%x == 0 
    }
    {
      isPrime = false
    }
    
    isPrime
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