package Builders

import Components.Floor
import Components.Roof
import Components.Wall
import Houses.House

interface Builder {

    fun setWalls(wall: Wall)

    fun setRoof(roof: Roof)

    fun setFloor(floor: Floor)
}

interface ManualBuilder {

    fun setWalls(wall: Wall): House.ManualBuilderImpl

    fun setRoof(roof: Roof): House.ManualBuilderImpl

    fun setFloor(floor: Floor): House.ManualBuilderImpl

    fun build(): House
}