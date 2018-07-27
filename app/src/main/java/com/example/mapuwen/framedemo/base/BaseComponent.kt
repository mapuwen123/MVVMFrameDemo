package com.example.mapuwen.framedemo.base

/**
 *  作者：MaPuWen
 *  时间：2018/7/27 15:56
 *  邮箱：mapuwen@outlook.com
 */
interface BaseComponent<VM> {
    fun inJect(viewModel: VM)
}