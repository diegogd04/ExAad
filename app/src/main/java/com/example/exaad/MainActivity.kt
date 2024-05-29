package com.example.exaad

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.exaad.animals.data.local.room.AppDataBase
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button?>(R.id.action_delete_user).setOnClickListener {
            deleteLogin()
        }
        findViewById<Button?>(R.id.action_delete_animals).setOnClickListener {
            deleteAnimals()
        }
        initLogin()
        initAnimals()
        initAnimalBreed()
        initTapas()
    }

    private fun initLogin() {
        val email = "example@email.es"
        val password = "example_password"

        //Llamar al repositorio
        //LoginRepository loginRepository = ...
    }

    private fun deleteLogin() {
        //Eliminar datos del login.
    }

    private fun initAnimals() {
        thread {
            //Ejecutar código para obtener animales
            val db = Room.databaseBuilder(
                applicationContext,
                AppDataBase::class.java, "animals-database"
            ).build()

            val animalDao = db.animalDao()

        }
    }

    private fun initAnimalBreed() {
        thread {
            //Ejecutar código para obtener todas razas almacenadas en la base de datos (sin repetir)
        }
    }

    private fun deleteAnimals() {
        thread {
            //Elimino los animales de local..
        }
    }

    private fun initTapas() {
        thread {
            //Hacer la llamada al repositorio desde aquí.
        }
    }
}