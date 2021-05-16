object price extends App{
  def discount(p:Double):Double=p*60*40/100;
  def cost(n:Int):Double=50*3*+(n-50)*0.75;
  def price1(p:Double,n:Int):Double=discount(p)+cost(n);

  println(price1(24.95,60));
}
