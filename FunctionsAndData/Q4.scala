object q4 extends App {
  var acc1 = new Account("991452748v","000101",55000)
  var acc2 = new Account("984512007v","000121",3500)
  var acc3 = new Account("932205416v","000012",-250)
  var acc4 = new Account("990052147v","000135",21000)
  var acc5 = new Account("970021543v","000188",-100)
  var acc6 = new Account("991452748v","000101",40000)

  var bank:List[Account] = List(acc1, acc2, acc3, acc4, acc5, acc6)
  println("Bank account details....")
  bank.foreach(println)

  def overDraft(a:List[Account]):List[Account] = a.filter(_.balance<0)
  var negValueAccounts:List[Account] = overDraft(bank)
  println("\nDetails of the bank accounts with negative balances....")
  negValueAccounts.foreach(println)

  def sumBalance(a:List[Account]):Double = a.map(_.balance).sum
  var total = sumBalance(bank)
  println("\nSum of all bank account balances...")
  println(total)

  println("\nDetails of bank accounts after applying the interest....")
  bank.foreach(x=> if (x.balance>0) x.interest(0.5) else x.interest(0.1))
  bank.foreach(println)
}

class Account (n:String, a:String, b:Double) {
  var nic = n
  var accNo = a
  var balance = b

  def interest(i:Double) = this.balance = this.balance+this.balance*i
  override def toString = "[NIC: "+nic+"  Account Number: "+accNo+"  Account Balance: "+balance+"]"
}