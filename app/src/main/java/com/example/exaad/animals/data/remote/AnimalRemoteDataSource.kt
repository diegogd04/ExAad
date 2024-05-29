package com.example.exaad.animals.data.remote

import com.example.exaad.animals.domain.Animal
import com.example.exaad.animals.domain.AnimalBreed
import com.example.exaad.animals.domain.AnimalType

class AnimalRemoteDataSource {

    private val mockAnimals = listOf(
        Animal(1, "Tux", AnimalType(1, "Gato"), AnimalBreed(2, "Caniche", "Méjico")),
        Animal(2, "Dino", AnimalType(2, "Perro"), AnimalBreed(2, "Caniche", "Méjico")),
        Animal(3, "Bambam", AnimalType(2, "Perro"), AnimalBreed(3, "Dogo", "Alemania")),
        Animal(4, "Tango", AnimalType(2, "Perro"), AnimalBreed(4, "Podenco", "Francés")),
        Animal(4, "Git", AnimalType(1, "Gato"), AnimalBreed(1, "Mixto", "Europeo"))
    )

    fun getAnimals(): List<Animal> = mockAnimals

    fun getAnimal(animalId: Int) = mockAnimals.firstOrNull { it.id == animalId }

}