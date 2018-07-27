package com.example.mapuwen.framedemo

import android.arch.lifecycle.MutableLiveData
import com.example.mapuwen.framedemo.base.BaseRepository
import javax.inject.Inject

class MainRepository @Inject constructor() : BaseRepository() {
    fun login(): MutableLiveData<String> {
        val message = MutableLiveData<String>()
        message.value = "登陆成功"
        return message
    }
}