//package com.lightcore.hhreplica.dataModels
//
//import androidx.room.ColumnInfo
//import androidx.room.Entity
//import androidx.room.PrimaryKey
//
//@Entity(tableName = "vacancy")
//data class VacancyDB(@PrimaryKey val id: String,
//                      @ColumnInfo(name = "lookingnumber") val lookingNumber: Int? = null,
//                      @ColumnInfo(name = "title")val title: String,
//                      @ColumnInfo(name = "address")val address: Address,
//                      @ColumnInfo(name = "company")val company: String,
//                      @ColumnInfo(name = "experience")val experience: Experience,
//                      @ColumnInfo(name = "publisheddate")val publishedDate: String,
//                      @ColumnInfo(name = "isfavorite")val isFavorite: Boolean,
//                      @ColumnInfo(name = "salary")val salary: Salary,
//                      @ColumnInfo(name = "schedules")val schedules: List<String>,
//                      @ColumnInfo(name = "appliednumber")val appliedNumber: Int? = null,
//                      @ColumnInfo(name = "description")val description: String,
//                      @ColumnInfo(name = "responsibilities")val responsibilities: String,
//                      @ColumnInfo(name = "requirements")val requirements: String,val questions: List<String>
//)
