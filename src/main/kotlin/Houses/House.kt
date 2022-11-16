package Houses

import Components.Floor
import Components.Roof
import Components.Wall

data class House(val roof: Roof, val floor: Floor, val wall: Wall) {

    override fun toString(): String {
        return "HOUSE WITH ${roof.material} ROOF, ${floor.material} FLOOR, ${wall.material} WALL."
    }

}