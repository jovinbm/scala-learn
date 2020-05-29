import ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[String]) = {
    for (args <- args) {
      println(args + ": " + calculate(args))
    }
  }
}
