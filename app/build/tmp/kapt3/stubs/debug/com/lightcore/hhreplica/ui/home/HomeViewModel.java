package com.lightcore.hhreplica.ui.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/lightcore/hhreplica/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_offers", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/lightcore/hhreplica/dataModels/Offers;", "_vacancyes", "Lcom/lightcore/hhreplica/dataModels/Vacancy;", "offers", "Landroidx/lifecycle/LiveData;", "getOffers", "()Landroidx/lifecycle/LiveData;", "vacancy", "getVacancy", "()Landroidx/lifecycle/MutableLiveData;", "", "context", "Landroid/content/Context;", "toggleFavorite", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.lightcore.hhreplica.dataModels.Offers>> _offers = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.lightcore.hhreplica.dataModels.Vacancy>> _vacancyes = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.lightcore.hhreplica.dataModels.Offers>> offers = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.lightcore.hhreplica.dataModels.Vacancy>> vacancy = null;
    
    public HomeViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.lightcore.hhreplica.dataModels.Offers>> getOffers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.lightcore.hhreplica.dataModels.Vacancy>> getVacancy() {
        return null;
    }
    
    public final void getOffers(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void getVacancy(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void toggleFavorite(@org.jetbrains.annotations.NotNull
    com.lightcore.hhreplica.dataModels.Vacancy vacancy, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}