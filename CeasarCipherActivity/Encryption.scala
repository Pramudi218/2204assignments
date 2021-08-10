object Cipher extends App{

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val shift = (scala.io.StdIn.readLine("Shift : ").toInt+alphabet.size)%alphabet.size

  val plainText = scala.io.StdIn.readLine("Enter the message you want to encrypt: ")

  val output = plainText.map((x:Char) => {
    val y = alphabet.indexOf(x.toUpper)
    if (y == -1) x
    else alphabet((y+shift)%alphabet.size)
  })

  println(output)

}