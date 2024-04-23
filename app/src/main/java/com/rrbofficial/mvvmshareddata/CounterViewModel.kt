package com.rrbofficial.mvvmshareddata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel(){

    private val counter = MutableLiveData<Int>()

    init {
        counter.value = 0
    }

    fun increment()
    {
        counter.value = counter.value!! + 1
    }

    fun decrement()
    {
        counter.value =counter.value!! - 1
    }

    fun getCounter(): LiveData<Int> = counter

}