package com.lightcore.hhreplica.DB

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.lightcore.hhreplica.dataModels.Address
import com.lightcore.hhreplica.dataModels.Experience
import com.lightcore.hhreplica.dataModels.Salary

class Converters {

    private val gson = Gson()

    @TypeConverter
    fun fromSalary(salary: Salary?): String? {
        return salary?.let { gson.toJson(it) }
    }

    @TypeConverter
    fun toSalary(data: String?): Salary? {
        return data?.let {
            val type = object : TypeToken<Salary>() {}.type
            gson.fromJson(it, type)
        }
    }

    @TypeConverter
    fun fromAddress(address: Address?): String? {
        return address?.let { gson.toJson(it) }
    }

    @TypeConverter
    fun toAddress(data: String?): Address? {
        return data?.let {
            val type = object : TypeToken<Address>() {}.type
            gson.fromJson(it, type)
        }
    }

    @TypeConverter
    fun fromExperience(experience: Experience?): String? {
        return experience?.let { gson.toJson(it) }
    }

    @TypeConverter
    fun toExperience(data: String?): Experience? {
        return data?.let {
            val type = object : TypeToken<Experience>() {}.type
            gson.fromJson(it, type)
        }
    }

    @TypeConverter
    fun fromStringList(list: List<String>?): String? {
        return list?.let { gson.toJson(it) }
    }

    @TypeConverter
    fun toStringList(data: String?): List<String>? {
        return data?.let {
            val type = object : TypeToken<List<String>>() {}.type
            gson.fromJson(it, type)
        }
    }
}
