package com.lightcore.hhreplica

import android.content.Context
import com.lightcore.hhreplica.dataModels.Offers
import com.lightcore.hhreplica.dataModels.Vacancy

class Main {
    fun getOffers(context: Context): List<Offers> {
        val data = Data()
        return data.parseJsonOffers(context = context)
    }
    fun getVacancyList(context: Context): List<Vacancy>{
        val data = Data()
        return data.parseJsonVacancies(context)
    }
}