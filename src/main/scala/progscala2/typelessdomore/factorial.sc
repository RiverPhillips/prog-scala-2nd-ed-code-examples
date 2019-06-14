import scala.annotation.tailrec
// src/main/scala/progscala2/typelessdomore/factorial.sc

def factorial(i: Int): Long = {
  @tailrec
  def fact(i: Int, accumulator: Long): Long = {
    if (i <= 1) accumulator
    else fact(i - 1, i * accumulator)
  }
    
  fact(i, 1L)
}

(0 to 5) foreach ( i => println(factorial(i)) )
