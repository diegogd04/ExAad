package com.example.exaad.login.domain

interface UserRepository {
    fun set(user: User)
    fun get(): User?
    fun delete()
}