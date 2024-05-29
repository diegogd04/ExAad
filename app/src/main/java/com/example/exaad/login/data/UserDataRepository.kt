package com.example.exaad.login.data

import android.util.Log
import com.example.exaad.login.data.local.sharedPreferences.UserSharedPreferencesDataSource
import com.example.exaad.login.domain.User
import com.example.exaad.login.domain.UserRepository

class UserDataRepository(private val local: UserSharedPreferencesDataSource) : UserRepository {
    override fun set(user: User) {
        val userSave = local.get()
        if (userSave.email.isNullOrEmpty() && userSave.password.isNullOrEmpty()) {
            local.set(user)
        }
        Log.d("@DEV", "Email= ${user.email} Password= ${user.password}")
    }

    override fun get(): User {
        return local.get()
    }

    override fun delete() {
        local.delete()
    }
}