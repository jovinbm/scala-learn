object Main extends App {
  class Rational(n: Int, d: Int) {
    require(d != 0)
    val numer: Int = n
    val denom: Int = d

    def this(n: Int) = this(n, 1)

    override def toString = n + "/" + d

    def add(that: Rational): Rational =
      new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

    def lessThan(that: Rational): Boolean =
      this.numer * that.denom < that.numer * this.denom

    def max(that: Rational): Rational = if (this.lessThan(that)) that else this
  }

  println(new Rational(1, 2))

  val oneHalf = new Rational(1, 2)
  val twoThirds = new Rational(2, 3)
  println(oneHalf add twoThirds)
}
