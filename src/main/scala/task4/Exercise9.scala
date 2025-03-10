package task4

object Exercise9 extends App:

  enum Expr:
    case Literal(i: Int)
    case Add
    case Multiply

  object Expr:

    def evaluate(expr: Expr): Int = expr match
      case Literal(i) => i
