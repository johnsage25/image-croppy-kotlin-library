package com.pearldrift.croppylib.ui

import android.app.Application
import android.graphics.RectF
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.pearldrift.aspectratiorecyclerviewlib.aspectratio.model.AspectRatio
import com.pearldrift.croppylib.main.CropRequest
import com.pearldrift.croppylib.state.CropFragmentViewState
import com.pearldrift.croppylib.util.bitmap.BitmapUtils
import com.pearldrift.croppylib.util.bitmap.ResizedBitmap
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers

class ImageCropViewModel(val app: Application) : AndroidViewModel(app) {

    private val compositeDisposable = CompositeDisposable()

    private var cropRequest: CropRequest? = null

    private val cropViewStateLiveData = MutableLiveData<CropFragmentViewState>()
        .apply {
            value = CropFragmentViewState(aspectRatio = AspectRatio.ASPECT_FREE)
        }

    private val resizedBitmapLiveData = MutableLiveData<ResizedBitmap>()

    fun setCropRequest(cropRequest: CropRequest) {
        this.cropRequest = cropRequest

        BitmapUtils
            .resize(cropRequest.sourceUri, app.applicationContext)
            .subscribeOn(Schedulers.computation())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(Consumer { resizedBitmapLiveData.value = it })
            .also { compositeDisposable.add(it) }


        cropViewStateLiveData.value =
            cropViewStateLiveData.value?.onThemeChanged(croppyTheme = cropRequest.croppyTheme)
    }

    fun getCropRequest(): CropRequest? = cropRequest

    fun getCropViewStateLiveData(): LiveData<CropFragmentViewState> = cropViewStateLiveData

    fun getResizedBitmapLiveData(): LiveData<ResizedBitmap> = resizedBitmapLiveData

    fun updateCropSize(cropRect: RectF) {
        cropViewStateLiveData.value =
            cropViewStateLiveData.value?.onCropSizeChanged(cropRect = cropRect)
    }

    fun onAspectRatioChanged(aspectRatio: AspectRatio) {
        cropViewStateLiveData.value =
            cropViewStateLiveData.value?.onAspectRatioChanged(aspectRatio = aspectRatio)
    }

    override fun onCleared() {
        super.onCleared()
        if (compositeDisposable.isDisposed.not()) {
            compositeDisposable.dispose()
        }
    }
}