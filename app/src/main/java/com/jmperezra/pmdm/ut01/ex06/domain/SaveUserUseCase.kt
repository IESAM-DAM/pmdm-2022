package com.jmperezra.pmdm.ut01.ex06.domain

class SaveUserUseCase(val repository: UserRepository) {

    fun execute(user: User){
        //repository.saveUser(user)
    }
}