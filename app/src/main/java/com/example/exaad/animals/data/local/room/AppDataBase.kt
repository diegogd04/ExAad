package com.example.exaad.animals.data.local.room

import androidx.room.Database

@Database(
    entities = [AnimalEntity::class, EstablishmentEntity::class, PhotoTapasEntity::class],
    version = 1
)
abstract class AppDataBase {
    abstract fun animalDao(): AnimalDao
}