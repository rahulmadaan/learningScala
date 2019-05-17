object counter extends App {

  object counterGenerator {
    private var count = 0

    def increment(): Int = {
      count = count + 1
      count
    }

    def decrement(): Int = {
      count = count - 1
      count
    }
  }

  def counter = counterGenerator

  println(counter.increment())
  println(counter.increment())
  println(counter.increment())

  println(counter.decrement())

}
