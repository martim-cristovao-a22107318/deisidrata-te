package com.example.deisidrata_te

enum class DrinkType{
    WATER,
    BEER,
    COFFEE;

    override fun toString(): String {
        return this.name
    }


}