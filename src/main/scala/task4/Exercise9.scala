package task4

object Exercise9 extends App:

  enum Expr:
    case Literal(i: Int)
    case Add(a: Expr, b: Expr)
    case Multiply(a: Expr, b: Expr)

  object Expr:

    def evaluate(expr: Expr): Int = expr match
      case Literal(i) => i
      case Add(a, b) => evaluate(a) + evaluate(b)
      case Multiply(a, b) => evaluate(a) * evaluate(b)

    def show(expr: Expr): String = expr match
      case Literal(i) => "" + i
