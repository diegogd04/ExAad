package com.example.exaad.animals.data.local.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PhotoTapasEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String
)