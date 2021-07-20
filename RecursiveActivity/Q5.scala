object recursions extends App{

  def CreateLess(n : Int) : Int = {
    if(n%2 == 0)
      AddEvenNum(n-2)
    else AddEvenNum(n-1)
  }

  def AddEvenNum(n : Int) : Int=n match{
    case 0 => 0
    case 1 => 0
    case n if(n<0) => 0
    case n => (n+AddEvenNum(n-2))
  }

  println(CreateLess(8))
  println(CreateLess(5))
}