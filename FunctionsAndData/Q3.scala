object q3 extends App {
  var acc1 = new Account("991452748v","000101",55000)
  var acc2 = new Account("991452748v","000121",21000)

  println("Account details before transfer")
  println(acc1)
  println(acc2)

  val trans = acc1.transfer(acc2, 60000)

  println("\nAccount details after transfer")
  println(acc1)
  println(acc2)
}

class Account (n:String, a:String, b:Double) {
  var nic = n
  var accNo = a
  var balance = b

  def transfer(a:Account, amount:Double) = {
    if (amount>this.balance) {
      println("\nYour balance is not sufficient")
    } else {
      a.balance=a.balance+amount
      this.balance=this.balance-amount
    }
  }
  override def toString = "[NIC: "+nic+"  Account Number: "+accNo+"  Account Balance: "+balance+"]"
}