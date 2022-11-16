package Houses

import Builders.ManualBuilder
import Components.Floor
import Components.Roof
import Components.Wall

data class House(val roof: Roof, val floor: Floor, val wall: Wall) {

    override fun toString(): String {
        return "HOUSE WITH ${roof.material} ROOF, ${floor.material} FLOOR, ${wall.material} WALL."
    }

    class ManualBuilderImpl: ManualBuilder {

        private lateinit var wall: Wall

        private lateinit var roof: Roof

        private lateinit var floor: Floor

        override fun setWalls(wall: Wall): ManualBuilderImpl {
            this.wall = wall
            return this
        }

        override fun setRoof(roof: Roof): ManualBuilderImpl {
            this.roof = roof
            return this
        }

        override fun setFloor(floor: Floor): ManualBuilderImpl {
            this.floor = floor
            return  this
        }

        override fun build(): House {
            return House(this.roof, this.floor, this.wall)
        }

    }

}