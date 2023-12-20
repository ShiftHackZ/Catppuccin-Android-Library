package com.shifthackz.catppuccin.app.utils

import android.content.Context
import android.content.pm.PackageManager

fun Context.getVersionString(): String {
    return try {
        val info = packageManager.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES)
        info.versionName
    } catch (e: Exception) {
        ""
    }
}
