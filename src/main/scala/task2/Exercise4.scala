package task2

object Exercise4 extends App:

    // A
    val p1: Int => Int => Int => Boolean = x => y => z => x <= y && y == z
    println(p1(1)(3)(3))

    // B
    val p2: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z
    println(p2(1,3,3))

    // C
    def p3(x: Int)(y: Int)(z: Int): Boolean = x <= y && y == z
    println(p3(1)(3)(3))

    // D
    def p4(x: Int, y: Int, z: Int): Boolean = x <= y && y == z
    println(p4(1,3,3))