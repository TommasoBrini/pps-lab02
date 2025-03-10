package task4

import org.junit.*
import org.junit.Assert.*
import task4.Exercise9.*
import task4.Exercise9.Expr.*


class testTask4:

  @Test def testEvaluateLiteral(): Unit = {
    val literal = Expr.Literal(4)
    assertEquals(evaluate(literal), 4)
  }

  @Test def testEvaluateAdd(): Unit = {
    val add = Expr.Add(3,4)
    assertEquals(evaluate(add), 7)

  }