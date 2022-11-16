package Components

enum class Material {
    WOOD,
    METAL,
    PLASTIC,
    BRICK
}

data class Roof(val material: Material)

data class Wall(val material: Material)

data class Floor(val material: Material)