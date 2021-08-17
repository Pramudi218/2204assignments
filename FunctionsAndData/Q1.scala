object q1 extends App {
  var x = new Rational(2,3)

  println("Rational number = "+x)
  println("Negative value of the rational number = "+x.neg)
}

class Rational(n:Int, d:Int) {
  def numer = n
  def denom = d

  def neg = new Rational(-this.numer,this.denom)
  override def toString = numer+"/"+denom
}
