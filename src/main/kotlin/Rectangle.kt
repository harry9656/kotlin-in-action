package com.harry9656

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main() {
    val rectangle = Rectangle(12, 42)
    println("Rectangel with height ${rectangle.height} and ${rectangle.width} ${if (rectangle.isSquare) "is" else "isn't"} a square.")
    val squareRectangle = Rectangle(5, 5)
    println("Rectangel with height ${squareRectangle.height} and ${squareRectangle.width} ${if (squareRectangle.isSquare) "is" else "isn't"} a square.")
}