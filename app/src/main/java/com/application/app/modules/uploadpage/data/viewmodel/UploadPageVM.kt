package com.application.app.modules.uploadpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.uploadpage.`data`.model.UploadPageModel
import org.koin.core.KoinComponent

public class UploadPageVM : ViewModel(), KoinComponent {
  public val uploadPageModel: MutableLiveData<UploadPageModel> = MutableLiveData(UploadPageModel())

  public var navArguments: Bundle? = null
}
