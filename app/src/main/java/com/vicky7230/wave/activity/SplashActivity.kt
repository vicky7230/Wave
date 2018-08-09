package com.vicky7230.wave.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.vicky7230.wave.R
import com.vicky7230.wave.extensions.showMessage
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber
import java.util.concurrent.TimeUnit

class SplashActivity : AppCompatActivity() {

    private val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        init()
    }

    private fun init() {
        Observable.timer(2000, TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ it: Long? ->
                    startActivity(HomeActivity.getStartIntent(this))
                    finish()
                }, { it: Throwable? ->
                    Timber.e(it)
                    showMessage(it?.message ?: "")
                })
    }

    override fun onDestroy() {
        compositeDisposable.dispose()
        super.onDestroy()
    }
}
