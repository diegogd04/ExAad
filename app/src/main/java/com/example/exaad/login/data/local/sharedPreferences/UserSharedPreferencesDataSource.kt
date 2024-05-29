package com.example.exaad.login.data.local.sharedPreferences

import android.content.Context
import com.example.exaad.login.data.local.UserLocalDataSource
import com.example.exaad.login.domain.User

class UserSharedPreferencesDataSource(private val context: Context) : UserLocalDataSource {
    private val sharedPreferences = context.getSharedPreferences("Users", Context.MODE_PRIVATE)
    override fun set(user: User) {
        with(sharedPreferences.edit()) {
            putString("1", user.email)
            putString("2", user.password)
            apply()
        }
    }

    override fun get(): User {
        val email = sharedPreferences.getString("1", null)
        val password = sharedPreferences.getString("2", null)
        val user = User(email, password)
        return user
    }

    override fun delete() {
        with(sharedPreferences.edit()) {
            clear()
            apply()
        }
    }
}