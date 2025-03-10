package task4

import org.junit.*
import org.junit.Assert.*
import task4.Exercise9.{Expr, *}
import task4.Exercise9.Expr.*


class testTask4:

  @Test def testEvaluateLiteral(): Unit = {
    val literal = Literal(4)
    assertEquals(evaluate(literal), 4)
  }

  @Test def testEvaluateAdd(): Unit = {
    val add = Add(Add(Literal(4), Literal(3)),Literal(3))
    assertEquals(evaluate(add), 10)
  }

  @Test def testEvaluateMultiply(): Unit = {
    val multiply = Multiply(Multiply(Literal(2), Literal(5)), Literal(4))
    assertEquals(evaluate(multiply), 40)
  }