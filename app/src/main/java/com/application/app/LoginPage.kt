package com.application.app

import android.app.Instrumentation
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import com.huawei.hms.common.ApiException
import com.huawei.hms.support.account.AccountAuthManager
import com.huawei.hms.support.account.request.AccountAuthParams
import com.huawei.hms.support.account.request.AccountAuthParamsHelper
import com.huawei.hms.support.account.result.AuthAccount
import com.huawei.hms.support.account.service.AccountAuthService
import com.huawei.hms.support.feature.result.CommonConstant

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page2)

          val signin:ImageView=findViewById(R.id.imageRectangle12)
          signin.setOnClickListener { sigin() }


    }
   var mAuthAcc:AccountAuthService?=null
    var mAuthParams:AccountAuthParams?=null
    val REQUEST_SIGNIN_CODE=1000
    val TAG="ACCOUNT"
    fun sigin(){
     mAuthParams=AccountAuthParamsHelper(AccountAuthParams.DEFAULT_AUTH_REQUEST_PARAM).setEmail().createParams()
     mAuthAcc=AccountAuthManager.getService(this,mAuthParams)
     val task =mAuthAcc!!.silentSignIn()
     task.addOnSuccessListener { authAccount->Resultofsignin(authAccount)}
     task.addOnFailureListener { e->
         if(e is ApiException){
             val apiException=e
             val signInIntent=mAuthAcc!!.signInIntent
             signInIntent.putExtra(com.huawei.hms.support.api.entity.common.CommonConstant.RequestParams.KEY_SIGN_IN_PARAMS,true)
            startActivityForResult(signInIntent,REQUEST_SIGNIN_CODE)
         }
     }
    }

    private fun Resultofsignin(authAccount: AuthAccount?) {
        Log.i(TAG,authAccount.toString())
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val authAccountTask=AccountAuthManager.parseAuthResultFromIntent(data)
        if(authAccountTask.isSuccessful){
            val authAccount=authAccountTask.result
            Resultofsignin(authAccount)
            intent=Intent(this,HomeScreen::class.java)
            startActivity(intent)
        }

    }

}



