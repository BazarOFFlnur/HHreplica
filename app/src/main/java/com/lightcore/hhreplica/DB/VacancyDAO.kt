package com.lightcore.hhreplica.DB

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.lightcore.hhreplica.dataModels.Vacancy

@Dao
interface VacancyDAO {
    @Query("SELECT * FROM vacancy")
    fun getAll(): List<Vacancy>

    @Query("SELECT * FROM vacancy WHERE id IN (:vacancyIds)")
    fun loadAllByIds(vacancyIds: IntArray): List<Vacancy>

    @Query("SELECT * FROM vacancy WHERE title LIKE :name LIMIT 1")
    fun findByName(name: String): Vacancy

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg vacancies: Vacancy)

    @Delete
    fun delete(vacancy: Vacancy)

    @Query("DELETE FROM vacancy")
    fun deleteAll()


}