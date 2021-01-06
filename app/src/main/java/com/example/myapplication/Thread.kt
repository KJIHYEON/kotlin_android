package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock.sleep
import android.util.Log
import kotlinx.android.synthetic.main.activity_thread.*
import java.lang.Thread.sleep

class Thread : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)

        val runnable: Runnable = object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread is made")
            }
        }
        val thread: java.lang.Thread = Thread(runnable)
        bt1.setOnClickListener{
            thread.start()
            }

        Thread(object : Runnable{
            override fun run(){
                Log.d("thread-1","Thread2 is made")

            }
        }).start()

        Thread(Runnable{
           // Thread.sleep(2000)
            Log.d("thread-1","Thread3 is made")
            runOnUiThread{
                bt1.setBackgroundColor(getColor(R.color.textview_color))
            }
        })



    }
}