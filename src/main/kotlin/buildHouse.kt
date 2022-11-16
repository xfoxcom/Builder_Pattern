import Builders.HouseBuilder
import Directors.Director


fun main() {


    val directorImpl = Director.DirectorImpl()

    val houseBuilder = HouseBuilder()

    directorImpl.buildBrickHouse(houseBuilder)

    println(houseBuilder.getResult().toString())

}
