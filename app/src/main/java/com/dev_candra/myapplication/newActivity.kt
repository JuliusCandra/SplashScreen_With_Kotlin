package com.dev_candra.myapplication

import android.annotation.SuppressLint
import android.app.ActionBar
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import kotlin.coroutines.coroutineContext

@SuppressLint("Registered")
class newActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_activity_layout)
        actionBar()

    }

    private fun actionBar(){
        actionBar?.title = "Candra Julius Sinaga"
        actionBar?.subtitle = "Home"
    }

}