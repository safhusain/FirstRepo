package com.saf

class P10  {
  
  def comb[T](seq:List[T]): List[List[T]] =
  {
    val cur = seq.head
    val tailLst = seq.tail
    
    val h = tailLst match {
      case tt  if tt.length == 1 => { List(tt) }
      case tt  if tt.length > 1 =>  { comb(tt) }
    }
    
    val r = h.map(cur :: _) 
    List(List(cur)) ::: r ::: h
  }
}

object P10
{ 
  def apply = {
       new P10
   }
  
}


