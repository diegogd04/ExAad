package com.example.exaad.tapas.data.remote

import com.google.firebase.Firebase
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.database
import kotlinx.coroutines.tasks.await

class TapaFirebaseDataSource {
    private var database: DatabaseReference = Firebase.database.reference
    var firebase = Firebase.database

    suspend fun get() {
        var snapshot = firebase
            .getReference("Tapas")
            .get()
            .await()
            .children
            .map {
                it.getValue()
            }
    }

    /*fun get(){
        val tapaListener = object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val tapa = snapshot.getValue<Tapa>()
            }

            override fun onCancelled(error: DatabaseError) {
                Log.d("@DEV", "loadTapa:onCancelled", error.toException())
            }
        }

    }*/
}