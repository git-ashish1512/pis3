package chap15

/**
  * Created by adwivedi on 16/12/16.
  */
abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String,left: Expr, right: Expr) extends Expr

object ExprObj extends App {
  val v = Var("x")
  println(v.name)

}