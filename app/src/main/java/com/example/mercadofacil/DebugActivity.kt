package com.example.mercadofacil

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class DebugActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private val TAG = "MercadoFacil"
    private val className: String get(){
        val s = javaClass.name
        return s.substring(s.lastIndexOf("."))

    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, ".onStart() chamado")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, ".onRestart() chamado")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, ".onResume() chamado")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, ".onPause() chamado")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, ".onStop() chamado")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, ".onDestroy() chamado")
    }
}
