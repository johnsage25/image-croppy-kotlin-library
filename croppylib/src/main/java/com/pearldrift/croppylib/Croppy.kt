package com.pearldrift.croppylib

import android.app.Activity
import com.pearldrift.croppylib.main.CropRequest
import com.pearldrift.croppylib.main.CroppyActivity

object Croppy {

    fun start(activity: Activity, cropRequest: CropRequest) {
        CroppyActivity.newIntent(context = activity, cropRequest = cropRequest)
            .also { activity.startActivityForResult(it, cropRequest.requestCode) }
    }
}