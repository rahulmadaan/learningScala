object mathFunctions extends App {

  def add(number1: Int, number2: Int) = number1 + number2
  println("Addition is " + add(2, 4))

  def square(number: Int) = number * number
  println("square is " + square(2))

  def factorial(number: Int): Int = if (number == 1) number else number * factorial(number - 1)
  println("factorial of 5 is " + factorial(5))

  def addAndMultiply(number1: Int, number2: Int)(multiplier: Int): Int = (number1 + number2) * multiplier
  println(addAndMultiply(2, 2)(5))

}
