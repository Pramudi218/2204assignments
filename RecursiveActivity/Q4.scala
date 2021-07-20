object recursions extends App{

  def IsEven(n : Int) : Boolean = n match{
    case 0 => true
    case _ => IsOdd(n-1)
  }
  def IsOdd(n : Int) : Boolean = !(IsEven(n))

  println(IsEven(10))
  println(IsEven(9))
  println(IsOdd(7))
  println(IsOdd(4))
}