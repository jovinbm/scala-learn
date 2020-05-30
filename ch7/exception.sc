import java.io.{FileNotFoundException, FileReader, IOException}
import java.net.{MalformedURLException, URL}

try {
  val f = new FileReader("input.txt")
} catch {
  case ex: FileNotFoundException => println("file not found")
  case ex: IOException           => println("io exception")
}

def urlFor(path: String) =
  try {
    new URL(path)
  } catch {
    case e: MalformedURLException => new URL("http://www.scala-lang.org")
  }

println(urlFor("http"))

val args = List("1", "2", "3")
val firstArg = if (args.nonEmpty) args.head else ""

firstArg match {
  case "salt" => println("pepper")
  case "chips" => println("salsa")
  case "eggs" => println("bacon")
  case _ => println("huh?")
}