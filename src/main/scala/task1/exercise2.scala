package task1

object exercise2 extends App:

  def divide(x: Double, y: Double): Double = x / y

  println(divide(6, 3))
  println(divide(6, 0))

  private def divideCurried(y: Double)(x: Double): Double = x / y

  val divideBy3 = divideCurried(3)
  println(divideCurried(3)(6))
  println(divideBy3(6))

