package com.example.exaad.animals.data.local.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class EstablishmentEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String
)