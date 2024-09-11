package com.lightcore.hhreplica.dataModels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u00a2\u0006\u0002\u0010\u0018J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\bH\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u000bH\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u000eH\u00c6\u0003J\t\u0010?\u001a\u00020\u0010H\u00c6\u0003J\u00b4\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u00c6\u0001\u00a2\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u000e2\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\u0005H\u00d6\u0001J\t\u0010E\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\'\u0010\u001cR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001f\u00a8\u0006F"}, d2 = {"Lcom/lightcore/hhreplica/dataModels/Vacancy;", "", "id", "", "lookingNumber", "", "title", "address", "Lcom/lightcore/hhreplica/dataModels/Address;", "company", "experience", "Lcom/lightcore/hhreplica/dataModels/Experience;", "publishedDate", "isFavorite", "", "salary", "Lcom/lightcore/hhreplica/dataModels/Salary;", "schedules", "", "type", "appliedNumber", "description", "responsibilities", "questions", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/lightcore/hhreplica/dataModels/Address;Ljava/lang/String;Lcom/lightcore/hhreplica/dataModels/Experience;Ljava/lang/String;ZLcom/lightcore/hhreplica/dataModels/Salary;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAddress", "()Lcom/lightcore/hhreplica/dataModels/Address;", "getAppliedNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCompany", "()Ljava/lang/String;", "getDescription", "getExperience", "()Lcom/lightcore/hhreplica/dataModels/Experience;", "getId", "()Z", "setFavorite", "(Z)V", "getLookingNumber", "getPublishedDate", "getQuestions", "()Ljava/util/List;", "getResponsibilities", "getSalary", "()Lcom/lightcore/hhreplica/dataModels/Salary;", "getSchedules", "getTitle", "getType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/lightcore/hhreplica/dataModels/Address;Ljava/lang/String;Lcom/lightcore/hhreplica/dataModels/Experience;Ljava/lang/String;ZLcom/lightcore/hhreplica/dataModels/Salary;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/lightcore/hhreplica/dataModels/Vacancy;", "equals", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity(tableName = "vacancy")
public final class Vacancy {
    @androidx.room.PrimaryKey
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id = null;
    @androidx.room.ColumnInfo(name = "lookingnumber")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer lookingNumber = null;
    @androidx.room.ColumnInfo(name = "title")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    @androidx.room.ColumnInfo(name = "address")
    @org.jetbrains.annotations.NotNull
    private final com.lightcore.hhreplica.dataModels.Address address = null;
    @androidx.room.ColumnInfo(name = "company")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String company = null;
    @androidx.room.ColumnInfo(name = "experience")
    @org.jetbrains.annotations.NotNull
    private final com.lightcore.hhreplica.dataModels.Experience experience = null;
    @androidx.room.ColumnInfo(name = "publisheddate")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String publishedDate = null;
    @androidx.room.ColumnInfo(name = "isfavorite")
    private boolean isFavorite;
    @androidx.room.ColumnInfo(name = "salary")
    @org.jetbrains.annotations.NotNull
    private final com.lightcore.hhreplica.dataModels.Salary salary = null;
    @androidx.room.ColumnInfo(name = "schedule")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> schedules = null;
    @androidx.room.ColumnInfo(name = "type")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String type = null;
    @androidx.room.ColumnInfo(name = "appliednumber")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer appliedNumber = null;
    @androidx.room.ColumnInfo(name = "description")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String description = null;
    @androidx.room.ColumnInfo(name = "responsibilities")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String responsibilities = null;
    @androidx.room.ColumnInfo(name = "questions")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> questions = null;
    
    public Vacancy(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.Integer lookingNumber, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    com.lightcore.hhreplica.dataModels.Address address, @org.jetbrains.annotations.NotNull
    java.lang.String company, @org.jetbrains.annotations.NotNull
    com.lightcore.hhreplica.dataModels.Experience experience, @org.jetbrains.annotations.NotNull
    java.lang.String publishedDate, boolean isFavorite, @org.jetbrains.annotations.NotNull
    com.lightcore.hhreplica.dataModels.Salary salary, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> schedules, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.Nullable
    java.lang.Integer appliedNumber, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String responsibilities, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> questions) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getLookingNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lightcore.hhreplica.dataModels.Address getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCompany() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lightcore.hhreplica.dataModels.Experience getExperience() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPublishedDate() {
        return null;
    }
    
    public final boolean isFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lightcore.hhreplica.dataModels.Salary getSalary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getSchedules() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getAppliedNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getResponsibilities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getQuestions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lightcore.hhreplica.dataModels.Address component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lightcore.hhreplica.dataModels.Experience component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lightcore.hhreplica.dataModels.Salary component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.lightcore.hhreplica.dataModels.Vacancy copy(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.Integer lookingNumber, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    com.lightcore.hhreplica.dataModels.Address address, @org.jetbrains.annotations.NotNull
    java.lang.String company, @org.jetbrains.annotations.NotNull
    com.lightcore.hhreplica.dataModels.Experience experience, @org.jetbrains.annotations.NotNull
    java.lang.String publishedDate, boolean isFavorite, @org.jetbrains.annotations.NotNull
    com.lightcore.hhreplica.dataModels.Salary salary, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> schedules, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.Nullable
    java.lang.Integer appliedNumber, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String responsibilities, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> questions) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}