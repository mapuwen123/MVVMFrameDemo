package com.example.mapuwen.framedemo

import android.arch.lifecycle.MutableLiveData
import com.example.mapuwen.framedemo.base.BaseComponent
import com.example.mapuwen.framedemo.base.BaseViewModel
import dagger.Component
import javax.inject.Inject

@Suppress("VAL_REASSIGNMENT_VIA_BACKING_FIELD")
class MainViewModel : BaseViewModel() {
    @Component
    interface MainComponent : BaseComponent<MainViewModel>

    init {
        DaggerMainViewModel_MainComponent.create().inJect(this)
    }

    @Inject
    lateinit var mainRepository: MainRepository
    val message = MutableLiveData<String>()
    val number = MutableLiveData<Int>()
        get() {
            if (field.value == null) {
                field.value = 1
            }
            return field
        }

    fun login() {
        val msg = mainRepository.login()
        message.value = msg.value
    }
}