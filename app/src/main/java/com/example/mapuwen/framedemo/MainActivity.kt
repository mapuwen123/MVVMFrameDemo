package com.example.mapuwen.framedemo

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.view.View
import com.example.mapuwen.framedemo.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : BaseActivity<MainViewModel>(), View.OnClickListener {
    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.btn -> viewModel?.login()
        }
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initViewModel(): MainViewModel {
        return ViewModelProviders.of(this@MainActivity).get(MainViewModel::class.java)
    }

    override fun actionbarInit() {
    }

    override fun dataInit() {
    }

    override fun eventInit() {
        btn.setOnClickListener(this@MainActivity)
    }

    override fun observerInit() {
        viewModel?.message?.observe(this@MainActivity, Observer {
            text.text = it
            toast(it.toString())
        })
    }
}
