object MyClass extends App {
  val p1 = Point(1,2)
  val p2 = Point(4,6)
  val p3 = p1+p2
  val p4 = p1.move(6,3)
  val p5 = p2.Invert
  val d = p1.distance(p2)

  println("p1 = "+p1)
  println("p2 = "+p2)
  println("p1 + p2 = "+p3)
  println("p1's position after moving = "+p4)
  println("Inverse of p2 = "+p5)
  println("Distance between p1 and p2 ="+d)
}

case class Point(x:Int, y:Int) {
  def +(that:Point) = Point(this.x+that.x, this.y+that.y)
  def move(dx:Int, dy:Int) = Point(this.x+dx, this.y+dy)
  def distance(that:Point) = math.sqrt((that.x-this.x)*(that.x-this.x)+(that.y-this.y)*(that.y-this.y))
  def Invert = Point(this.y, this.x)
}