import java.io.{File, PrintWriter}

def twice(op: Double => Double, x: Double) = op(op(x))

def withPrintWriter(file: File, op: PrintWriter => Unit) = {
  var writer = new PrintWriter(file)
  try {
    op(writer)
  }
  finally {
    writer.close()
  }
}

withPrintWriter(new File("date.txt"), writer => writer.println(new java.util.Date()))

def withPrintWriter2(file: File)(op: PrintWriter => Unit) = {
  var writer = new PrintWriter(file)
  try {
    op(writer)
  }
  finally {
    writer.close()
  }
}

val file = new File("date.txt")

withPrintWriter2(file) { writer => {
  writer.println(new java.util.Date)
}}