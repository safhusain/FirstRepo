
object PO4 extends App{

  /*
  def isPrime(num:Int) : Boolean = {

            def isNumPrime(current :Int) : Boolean = current match{
            case cur if (cur >= num) => true
            case _ => if(num % (current) == 0) false else isNumPrime(current+1)
            }


            isNumPrime(2)
    }
  
  println(isPrime(18))
  */
  
  def primeStream(s: Stream[Int]): Stream[Int] = {
    print(s)
    println(s.head)
        val p = Stream.cons(s.head, primeStream(s.tail filter { _ % s.head != 0 }))
        p
  }
  val primes = primeStream(Stream.from(2))
  
	primes take 5 print

	primes take 5 print
  
  
  /*
  def safTest(s: Stream[Int]): Stream[Int] = {
    print(s)
    println(s.head)
    val p = Stream.cons(s.head, safTest(s.tail filter { _ % 2 != 0 }    ) )
    p
  }
  val oddNum = safTest(Stream.from(2))
  oddNum take 10 print
  */
  

/*
  
 def saffu(s: Stream[BigInt]): Stream[BigInt] = {
    println(s)
     lazy val x = s.zip(s.tail)
     println(x)
     x.map { n => n._1 + n._2 }
  }
  
  

	val fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: saffu(fibs)
	//println("-----"+fibs)
	fibs take 6 print
	
	println(fibs.tail)
	
  */
  /*
  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i => ps.takeWhile{j => j * j <= i}.forall{ k => i % k > 0});
  
  ps take 10 print
  
  
  
  
	def from(n: Int): Stream[Int] = {
    println("Requesting n = " + n)
   5 #:: n #:: from(n + 2)
  }

  val nats = from(10)
  //println(nats)
  //nats take 10 print
  nats take 10 print
  
  nats take 10 print
*/
}
	
	
	
  
  
  
