package com.demo.xiechunlei.dagger.model

import android.util.Log

class Seat {
    init {
        Log.e(this.javaClass.simpleName, "Seat init.")
    }

    fun seat() {
        Log.e(this.javaClass.simpleName, "seat seat")
    }
}