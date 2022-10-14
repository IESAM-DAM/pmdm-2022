package com.jmperezra.pmdm.ut01.ex06.presentation

import com.jmperezra.pmdm.ut01.ex06.domain.SaveUserUseCase
import com.jmperezra.pmdm.ut01.ex06.domain.User

class Ut01Ex06ViewModel(private val saveUserUseCase: SaveUserUseCase) {

    fun saveUser(user: User) {
        saveUserUseCase.execute(user)
    }
}