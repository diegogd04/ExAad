package com.example.exaad.animals.data.local.room

import androidx.room.Delete
import androidx.room.Query

interface AnimalDao {
    @Query("SELECT * FROM animalentity")
    fun getAll(): List<AnimalEntity>

    @Delete
    fun delete(animals: List<AnimalEntity>)
}