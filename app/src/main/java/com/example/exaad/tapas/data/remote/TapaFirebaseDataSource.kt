package com.example.exaad.tapas.data.remote

import com.example.exaad.tapas.domain.Tapa
import com.google.firebase.Firebase
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.database
import kotlinx.coroutines.tasks.await

class TapaFirebaseDataSource {
    private var database: DatabaseReference = Firebase.database.reference
    private var firebase = Firebase.database

    suspend fun get(): List<Tapa?> {
        val snapshot = firebase
            .getReference("Tapas")
            .get()
            .await()
            .children
            .map {
                it.getValue(DownloadFirebaseModel::class.java)
            }.map {
                it?.toModel()
            }
        return snapshot
    }
}