package com.lightcore.hhreplica.dataModels

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "vacancy")
data class Vacancy(
    @PrimaryKey
    val id: String,
    @ColumnInfo(name = "lookingnumber") val lookingNumber: Int? = null,
    @ColumnInfo(name = "title")val title: String,
    @ColumnInfo(name = "address")val address: Address,
    @ColumnInfo(name = "company")val company: String,
    @ColumnInfo(name = "experience")val experience: Experience,
    @ColumnInfo(name = "publisheddate")val publishedDate: String,
    @ColumnInfo(name = "isfavorite") var isFavorite: Boolean,
    @ColumnInfo(name = "salary")val salary: Salary,
    @ColumnInfo(name = "schedule")val schedules: List<String>,
    @ColumnInfo(name = "type")val type: String,
    @ColumnInfo(name = "appliednumber")val appliedNumber: Int? = null,
    @ColumnInfo(name = "description")val description: String,
    @ColumnInfo(name = "responsibilities")val responsibilities: String,
    @ColumnInfo(name = "questions")val questions: List<String>
)

data class Address(
    val town: String,
    val street: String,
    val house: String
)

data class Experience(
    val previewText: String,
    val text: String
)

data class Salary(
    val short: String? = null,
    val full: String? = null
)
