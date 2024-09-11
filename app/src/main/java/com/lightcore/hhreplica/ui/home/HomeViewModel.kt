package com.lightcore.hhreplica.ui.home

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lightcore.hhreplica.DB.AppDB
import com.lightcore.hhreplica.Main
import com.lightcore.hhreplica.dataModels.Offers
import com.lightcore.hhreplica.dataModels.Vacancy
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    // Используем MutableLiveData для обновления данных
    private val _offers = MutableLiveData<List<Offers>>()
    private val _vacancyes = MutableLiveData<List<Vacancy>?>()

    // Публичное свойство для получения данных через LiveData
    val offers: LiveData<List<Offers>> = _offers
    val vacancy: MutableLiveData<List<Vacancy>?> = _vacancyes

    // Метод для загрузки офферов
    fun getOffers(context: Context) {
        val main = Main()
        val offersList = main.getOffers(context)

        // Устанавливаем данные в MutableLiveData
        _offers.value = offersList
    }
    fun getVacancy(context: Context) {
        val main = Main()
        val vacancyList = main.getVacancyList(context)
        val appDB = AppDB.getDatabase(context)

        // Получаем сохранённые вакансии
        CoroutineScope(Dispatchers.IO).launch {
            val savedVacancies = appDB.vacancyDao().getAll()
            vacancyList.forEach { vacancy ->
                // Сравниваем по ID и обновляем статус избранного
                if (savedVacancies.any { it.id == vacancy.id }) {
                    vacancy.isFavorite = true
                }
            }
            _vacancyes.postValue(vacancyList) // Обновляем список вакансий
        }
    }
    fun toggleFavorite(vacancy: Vacancy, context: Context) {
        val db = AppDB.getDatabase(context)
        CoroutineScope(Dispatchers.IO).launch {
            if (vacancy.isFavorite) {
                db.vacancyDao().delete(vacancy)
            } else {
                db.vacancyDao().insertAll(vacancy)
            }

            // Обновляем состояние вакансии
            val updatedVacancies = _vacancyes.value?.map {
                if (it.id == vacancy.id) {
                    it.copy(isFavorite = !vacancy.isFavorite)
                } else it
            }

            _vacancyes.postValue(updatedVacancies)  // Обновляем данные через LiveData
        }
    }

}