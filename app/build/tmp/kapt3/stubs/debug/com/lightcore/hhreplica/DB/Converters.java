package com.lightcore.hhreplica.DB;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0011H\u0007J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/lightcore/hhreplica/DB/Converters;", "", "()V", "gson", "Lcom/google/gson/Gson;", "fromAddress", "", "address", "Lcom/lightcore/hhreplica/dataModels/Address;", "fromExperience", "experience", "Lcom/lightcore/hhreplica/dataModels/Experience;", "fromSalary", "salary", "Lcom/lightcore/hhreplica/dataModels/Salary;", "fromStringList", "list", "", "toAddress", "data", "toExperience", "toSalary", "toStringList", "app_debug"})
public final class Converters {
    @org.jetbrains.annotations.NotNull
    private final com.google.gson.Gson gson = null;
    
    public Converters() {
        super();
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final java.lang.String fromSalary(@org.jetbrains.annotations.Nullable
    com.lightcore.hhreplica.dataModels.Salary salary) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final com.lightcore.hhreplica.dataModels.Salary toSalary(@org.jetbrains.annotations.Nullable
    java.lang.String data) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final java.lang.String fromAddress(@org.jetbrains.annotations.Nullable
    com.lightcore.hhreplica.dataModels.Address address) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final com.lightcore.hhreplica.dataModels.Address toAddress(@org.jetbrains.annotations.Nullable
    java.lang.String data) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final java.lang.String fromExperience(@org.jetbrains.annotations.Nullable
    com.lightcore.hhreplica.dataModels.Experience experience) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final com.lightcore.hhreplica.dataModels.Experience toExperience(@org.jetbrains.annotations.Nullable
    java.lang.String data) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final java.lang.String fromStringList(@org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> list) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> toStringList(@org.jetbrains.annotations.Nullable
    java.lang.String data) {
        return null;
    }
}