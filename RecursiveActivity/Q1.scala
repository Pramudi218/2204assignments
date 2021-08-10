object recursions extends App{

  def GCD(num1:Int, num2:Int) : Int=num2 match{
    case 0 => num1
    case num2 if (num2>num1) => GCD(num2,num1)
    case num2 => GCD(num2, num1%num2)
  }

  def IsPrime(n:Int, d:Int=2) : Boolean=n match{
    case n if(d==n)=>true
    case n if GCD(n,d)>1 => false
    case n => IsPrime(n, d+1)
  }

  println(IsPrime(4))
  println(IsPrime(7))
}