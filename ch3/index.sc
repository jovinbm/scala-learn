import scala.collection.mutable

val big = new java.math.BigInteger("12345")
val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

for(str <- greetStrings){
  print(str)
}

val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo:::threeFour
println(oneTwoThreeFour)
val oneTwoThree = 3::oneTwo
println(oneTwoThree)

val mytuple = ("Jovin", "Mwilanga")
println(mytuple._1)
println(mytuple._2)

var jetSet = Set("Boeing", "Airbus")
jetSet += "Linear"
println(jetSet.contains("Cessna"))

val movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)

val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island")
treasureMap += (2 -> "Find big X on ground")
treasureMap += (3 -> "Dig")
println(treasureMap(2))
println((1 -> "Go to island"))