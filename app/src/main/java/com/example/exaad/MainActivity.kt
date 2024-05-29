package com.example.exaad

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.exaad.login.data.UserDataRepository
import com.example.exaad.login.data.local.sharedPreferences.UserSharedPreferencesDataSource
import com.example.exaad.login.domain.User
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
        val user = User(email, password)

        //Llamar al repositorio
        //LoginRepository loginRepository = ...

        val local = UserSharedPreferencesDataSource(this)
        val userDataRepository = UserDataRepository(local)

        userDataRepository.get()
        userDataRepository.set(user)
    }

    private fun deleteLogin() {
        //Eliminar datos del login.

        val local = UserSharedPreferencesDataSource(this)
        val userDataRepository = UserDataRepository(local)

        userDataRepository.delete()
    }

    private fun initAnimals() {
        thread {
            //Ejecutar código para obtener animales
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