package com.jitendra.countriesmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jitendra.countriesmvvm.model.Country

class ListViewModel : ViewModel() {
    val countries = MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        fetchCountries()
    }

    private fun fetchCountries() {
        val mockData = listOf(Country("CountryA"),
                Country("CountryB"),
                Country("CountryC"),
                Country("CountryD"),
                Country("CountryE"),
                Country("CountryF"),
                Country("CountryG"),
                Country("CountryH"),
                Country("CountryI"),
                Country("CountryJ")
        )

        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }
}