object Cipher extends App{

  val alphabet = "abcdefghijklmnopqrstuvwxyz"

  val shift = (scala.io.StdIn.readLine("Shift : ").toInt+alphabet.size)%alphabet.size

  val text = scala.io.StdIn.readLine("Enter the message you want to decrypt: ")

  val plainText = text.map((x:Char) => {
    val y = alphabet.indexOf(x.toLower)
    if (y == -1) x
    else alphabet((y+26-shift)%alphabet.size)
  })

  println(plainText);

}