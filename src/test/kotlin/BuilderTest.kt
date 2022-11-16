import Builders.HouseBuilder
import Components.Floor
import Components.Material
import Components.Roof
import Components.Wall
import Directors.Director
import Houses.House
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BuilderTest {

    @Test
    fun build_house_test() {

        val houseBuilder = HouseBuilder()

        val dir = Director.DirectorImpl()

        dir.buildBrickHouse(houseBuilder)

        val actual = houseBuilder.getResult()

        val expected = House(Roof(Material.BRICK), Floor(Material.BRICK), Wall(Material.BRICK))

        assertEquals(expected, actual)
    }
}