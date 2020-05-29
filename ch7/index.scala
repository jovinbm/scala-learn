object Main extends App {
  val filesHere = (new java.io.File(".")).listFiles()

  for (file <- filesHere if file.getName.endsWith(".scala")) {
    println(file)
  }

  for (file <- filesHere
       if file.isFile
       if file.getName.endsWith(".scala")) {
    println(file)
  }

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList

  def grep(pattern: String) =
    for (file <- filesHere
         if file.getName().endsWith(".scala");
         line <- fileLines(file)
         if line.trim().matches(pattern)) println(file + ": " + line.trim)

  grep(".*index.*")

  def grep2(pattern: String) =
    for (file <- filesHere
         if file.getName().endsWith(".scala");
         line <- fileLines(file);
         trimmed = line.trim
         if trimmed.matches(pattern)) println(file + ": " + trimmed)

  grep2(".*index.*")

  def grep3(pattern: String) =
    for {
      file <- filesHere
      if file.getName().endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } println(file + ": " + trimmed)

  grep3(".*index.*")

  def scalaFiles =
    for {
      file <- filesHere
      if file.getName().endsWith(".scala")
    } yield file
}
