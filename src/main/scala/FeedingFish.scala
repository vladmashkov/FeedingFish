trait Animal

class Fish extends Animal
case object Salmon extends Fish
case object Crucian extends Fish
case object Shark extends Fish

class Cat extends Animal
case object Tiger extends Cat
case object Lion extends Cat
case object MaineCoon extends Cat

class Snake extends Animal
case object Cobra extends Snake
case object Python extends Snake

object Main extends App() {
def feedFish[A <: Fish](f: A): Unit = println(s"Fish $f is feeded")
}



