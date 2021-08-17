object q2 extends App {
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)

  println("x = "+x)
  println("y = "+y)
  println("z = "+z)
  println("x-y-z = "+x.sub(y).sub(z))
}

class Rational(n:Int, d:Int) {
  def numer = n
  def denom = d

  def +(r:Rational) = new Rational(this.numer*r.denom+r.numer*this.denom, denom*r.denom)
  def neg = new Rational(-this.numer,this.denom)
  def sub(r:Rational) = this+r.neg
  override def toString = numer+"/"+denom
}