object recursions extends App{

  def Total(n:Int) :Int = {
    if (n == 1) 1
    else (n+Total(n-1))
  }

  println(Total(10))
}