package Builders

import Components.Floor
import Components.Roof
import Components.Wall
import Houses.House

class HouseBuilder : Builder {

    private lateinit var wall: Wall

    private lateinit var roof: Roof

    private lateinit var floor: Floor


    override fun setWalls(wall: Wall) {
        this.wall = wall
    }

    override fun setRoof(roof: Roof) {
        this.roof = roof
    }

    override fun setFloor(floor: Floor) {
        this.floor = floor
    }

    fun getResult(): House = House(roof, floor, wall)

}

