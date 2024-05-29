package com.example.exaad.animals.data.local.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.exaad.tapas.domain.Establishment
import com.example.exaad.tapas.domain.PhotoTapas

@Entity
data class AnimalEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "establishment") val establishment: Establishment,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "photoTapas") val photoTapas: PhotoTapas
)