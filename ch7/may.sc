

for (i <- 1 to 4) {
  println("Iteration " + i)
}

def filelines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

val filesHere = (new java.io.File(".")).listFiles()

def grep(pattern: String) =
  for (file <- filesHere
       if file.getName.endsWith(".scala");
       line <- filelines(file)
       if line.trim.matches(pattern)) println(file + ": " + line.trim)

grep(".*grep2.*")

def grep2(pattern: String) =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- filelines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } println(file + ": " + trimmed)

grep2(".*grep2.*")

def scalaFiles =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file

val forLineLengths =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- filelines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length