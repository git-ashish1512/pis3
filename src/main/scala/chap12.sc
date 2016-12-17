class Rational(val n: Int, val d: Int) extends Ordered[Rational] {
  def compare(that: Rational): Int = (this.n * that.d) - (that.n * this.d)

  override def toString: String = n + "/" + d
}
object Rational{
  def apply(n: Int, d: Int): Rational = new Rational(n,d)
  def apply( d: Int) :Rational= new Rational(1,d)
}

val half = Rational(1,2)
val oneThird = Rational(3)

half < oneThird
half > oneThird
half <= oneThird
half >= oneThird

class Rational2( val n: Int, val d: Int)  {
  def compare(that: Rational2): Int = (this.n * that.d) - (that.n * this.d)

  override def toString: String = n + "/" + d
}
val half2 = new Rational2(1,2)  with Ordered[Rational2]
val oneThird2 = new Rational2(1,3)

half2 < oneThird2

