package com.lightcore.hhreplica.DB;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'J!\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\'\u00a8\u0006\u0013"}, d2 = {"Lcom/lightcore/hhreplica/DB/VacancyDAO;", "", "delete", "", "vacancy", "Lcom/lightcore/hhreplica/dataModels/Vacancy;", "deleteAll", "findByName", "name", "", "getAll", "", "insertAll", "vacancies", "", "([Lcom/lightcore/hhreplica/dataModels/Vacancy;)V", "loadAllByIds", "vacancyIds", "", "app_debug"})
@androidx.room.Dao
public abstract interface VacancyDAO {
    
    @androidx.room.Query(value = "SELECT * FROM vacancy")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.lightcore.hhreplica.dataModels.Vacancy> getAll();
    
    @androidx.room.Query(value = "SELECT * FROM vacancy WHERE id IN (:vacancyIds)")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.lightcore.hhreplica.dataModels.Vacancy> loadAllByIds(@org.jetbrains.annotations.NotNull
    int[] vacancyIds);
    
    @androidx.room.Query(value = "SELECT * FROM vacancy WHERE title LIKE :name LIMIT 1")
    @org.jetbrains.annotations.NotNull
    public abstract com.lightcore.hhreplica.dataModels.Vacancy findByName(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    com.lightcore.hhreplica.dataModels.Vacancy... vacancies);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.lightcore.hhreplica.dataModels.Vacancy vacancy);
    
    @androidx.room.Query(value = "DELETE FROM vacancy")
    public abstract void deleteAll();
}