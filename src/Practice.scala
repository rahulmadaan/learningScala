object Practice extends App {

  class Greeter() {
    def greet(fName: String) {
      println("Hello " + fName)
    }
  }

  val greeter = new Greeter()
  greeter.greet("Rahul")

  case class Name(fName: String)

  var rahul = Name("Rahul")
  var prince = Name("Prince")

  println(rahul.equals(prince))
  println(rahul.equals(rahul))
  
}
