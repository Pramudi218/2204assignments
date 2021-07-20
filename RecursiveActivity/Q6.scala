object recursions extends App{

  def Fibonacci(n:Int) : Int = n match{
    case 0 => 0
    case 1 => 1
    case n => Fibonacci(n-1)+Fibonacci(n-2)
  }

  def FibonacciSequence(n:Int) : Unit = {
    if(n>0)
      FibonacciSequence(n-1)
      println(Fibonacci(n))
  }

  FibonacciSequence(12)
}