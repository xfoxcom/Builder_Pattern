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

    @Test
    fun manual_build_test() {

        val house = House.ManualBuilderImpl()
            .setFloor(Floor(Material.PLASTIC))
            .setRoof(Roof(Material.PLASTIC))
            .setWalls(Wall(Material.PLASTIC))
            .build()

        val expected = House(Roof(Material.PLASTIC), Floor(Material.PLASTIC), Wall(Material.PLASTIC))

        assertEquals(expected, house)

    }
}