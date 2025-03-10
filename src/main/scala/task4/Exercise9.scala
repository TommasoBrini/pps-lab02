package task4

object Exercise9 extends App:

  enum Expr:
    case Literal(i: Int)
    case Add(a: Int, b: Int)
    case Multiply

  object Expr:

    def evaluate(expr: Expr): Int = expr match
      case Literal(i) => i
      case Add(a, b) => a + b
