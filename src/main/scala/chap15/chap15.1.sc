abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String,left: Expr, right: Expr) extends Expr

val v = Var("x")
v.name

val op = BinOp("+",Number(1),v)
op.left
op.right == Var("x")
val op1 = op.copy(operator = "-")

def simplifyTop(expr: Expr): Expr = expr match {
  case UnOp("-", UnOp("-", e))  => e   // Double negation
  case BinOp("+", e, Number(0)) => e   // Adding zero
  case BinOp("*", e, Number(1)) => e   // Multiplying by one
  case _ => expr
}
simplifyTop(UnOp("-", UnOp("-", Var("x"))))
simplifyTop(v)

val ex = op1 match {
  case BinOp(_, a, b) => println(op1 + " is a binary 111 operation"  + " " + " " + a + " " + b )
//  case BinOp(_, _, _) => println(op1 + " is a binary operation" )
  case _ => println("It's something else")
}