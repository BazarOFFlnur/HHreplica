package com.lightcore.hhreplica.ui.home.fullVacancyes

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lightcore.hhreplica.Main
import com.lightcore.hhreplica.dataModels.Vacancy

class FullVacancyVM : ViewModel() {
    private val _vacancy = MutableLiveData<List<Vacancy>>()
    val vacancy: LiveData<List<Vacancy>> get() = _vacancy

    fun loadVacancies(context: Context) {
        val main = Main()
        val vacancyList = main.getVacancyList(context)

        _vacancy.value = vacancyList
    }
}
