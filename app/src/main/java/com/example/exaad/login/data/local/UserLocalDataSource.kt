package com.example.exaad.login.data.local

import com.example.exaad.login.domain.User

interface UserLocalDataSource {
    fun set(user: User)
    fun get(): User?
    fun delete()
}