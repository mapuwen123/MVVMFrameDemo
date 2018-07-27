package com.example.mapuwen.framedemo

import android.arch.lifecycle.DefaultLifecycleObserver
import android.arch.lifecycle.LifecycleOwner
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class MainPresenter : DefaultLifecycleObserver, AnkoLogger {
    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        info("onCreate")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        info("onDestroy")
    }
}