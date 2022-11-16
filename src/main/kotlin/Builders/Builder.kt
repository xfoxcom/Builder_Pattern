package Builders

import Components.Floor
import Components.Roof
import Components.Wall

interface Builder {

    fun setWalls(wall: Wall)

    fun setRoof(roof: Roof)

    fun setFloor(floor: Floor)
}