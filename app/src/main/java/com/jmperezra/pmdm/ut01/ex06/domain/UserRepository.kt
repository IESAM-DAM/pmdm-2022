package com.jmperezra.pmdm.ut01.ex06.domain

interface UserRepository {

    fun saveUser(user: User)
    fun getUser()
}