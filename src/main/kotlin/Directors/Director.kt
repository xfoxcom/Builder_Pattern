package Directors

import Builders.HouseBuilder
import Components.Floor
import Components.Material
import Components.Roof
import Components.Wall

interface Director {

    fun buildWoodenHouse(houseBuilder: HouseBuilder)

    fun buildMetalHouse(houseBuilder: HouseBuilder)

    fun buildPlasticHouse(houseBuilder: HouseBuilder)

    fun buildBrickHouse(houseBuilder: HouseBuilder)

    class DirectorImpl : Director {

        override fun buildWoodenHouse(houseBuilder: HouseBuilder) {
            houseBuilder.run {
                setFloor(Floor(Material.WOOD))
                setRoof(Roof(Material.WOOD))
                setWalls(Wall(Material.WOOD))
            }
        }

        override fun buildMetalHouse(houseBuilder: HouseBuilder) {
            houseBuilder.run {
                setFloor(Floor(Material.METAL))
                setRoof(Roof(Material.METAL))
                setWalls(Wall(Material.METAL))
            }
        }

        override fun buildPlasticHouse(houseBuilder: HouseBuilder) {
            houseBuilder.run {
                setFloor(Floor(Material.PLASTIC))
                setRoof(Roof(Material.PLASTIC))
                setWalls(Wall(Material.PLASTIC))
            }
        }

        override fun buildBrickHouse(houseBuilder: HouseBuilder) {
            houseBuilder.run {
                setFloor(Floor(Material.BRICK))
                setRoof(Roof(Material.BRICK))
                setWalls(Wall(Material.BRICK))
            }
        }

    }

}