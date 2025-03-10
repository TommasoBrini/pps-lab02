package task2

object Exercise3 extends App:

    // PART A

    val positiveVal: Int => String = _ match
      case n if n >= 0 => "positive"
      case _ => "negative"

    println(positiveVal(-5))

    def positiveDef(x: Int): String = x match
      case n if n >= 0 => "positive"
      case _ => "negative"

    println(positiveDef(-5))

    // PART B

    def neg(predicate: String => Boolean): String => Boolean = s => !predicate(s)

    val empty: String => Boolean = _ == ""

    val notEmpty = neg(empty) // which type of notEmpty?
    println(notEmpty("foo")) // true
    println(notEmpty("")) // false
    println(notEmpty("foo") && !notEmpty("")) // true.. a comprehensive test


    // PART C
    def negGeneric[X](predicate: X => Boolean): X => Boolean = x => !predicate(x)

    val isZero: Int => Boolean = _ == 0

    val notZero = negGeneric(isZero)
    println(notZero(5))
    println(notZero(0))
    println(notZero(5) && !notZero(0))
