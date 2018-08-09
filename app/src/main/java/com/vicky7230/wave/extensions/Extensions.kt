package com.vicky7230.wave.extensions

import android.support.v7.app.AppCompatActivity
import android.widget.Toast


fun AppCompatActivity.showMessage(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun AppCompatActivity.showError(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}