fun main(){
    var myhippo = Hippo()
    myhippo.eat()
    myhippo.roam()
    myhippo.makeNoise()
    myhippo.sleep()

    var mycat = cat()
    mycat.eat()
    mycat.roam()
    mycat.makeNoise()
    mycat.sleep()


}
open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    val hunger = 10

    open fun makeNoise () {
        println("The Animal is making a noise")
    }

    open fun eat() {
        println("The Animal is eating")
    }
    open fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }

}

class Hippo : Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }


}
class cat : Animal() {
    override val image = "cat.jpg"
    override val food = "rat"
    override val habitat = "House"

    override fun makeNoise() {
        println("meow! meow!")
    }

    override fun eat() {
        println("The cat is eating $food")
    }
}


