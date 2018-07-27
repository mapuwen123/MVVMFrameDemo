package com.example.mapuwen.framedemo.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger

/**
 *  作者：MaPuWen
 *  时间：2018/7/27 14:45
 *  邮箱：mapuwen@outlook.com
 */
abstract class BaseActivity<VM> : AppCompatActivity(), AnkoLogger {
    var viewModel: VM? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        viewModel = initViewModel()
        actionbarInit()
        dataInit()
        eventInit()
        observerInit()
    }

    /**
     * 布局初始化
     */
    protected abstract fun getLayoutId(): Int

    /**
     * ViewModel初始化
     */
    protected abstract fun initViewModel(): VM

    /**
     * actionbar初始化
     */
    protected abstract fun actionbarInit()

    /**
     * 数据初始化
     */
    protected abstract fun dataInit()

    /**
     * 事件初始化
     */
    protected abstract fun eventInit()

    /**
     * 观察者初始化
     */
    protected abstract fun observerInit()
}