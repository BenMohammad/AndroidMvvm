package com.benmohammad.androidmvvm

import android.os.Handler


fun postDelayed(delayMillis: Long, task: () -> Unit) {
    Handler().postDelayed(task, delayMillis)
}