package task2

object Exercise6 extends App:

    // Esercizio precedente
    def composeGenerics[X, Y, Z](f: Y => Z, g: X => Y): X => Z = x => f(g(x))

    def composeThree[A, B, C, D](f: C => D, g: B => C, h: A => B): A => D = x => f(composeGenerics(g,h)(x))

    println(composeThree[Int, Int, String, String](_ + "!", _.toString, _ * 2)(3))
