package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_intent.*


class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        change_activity.setOnClickListener {
            //   val intent = Intent(this@Intent1, Intent2::class.java)
            //Key, value 방식 - > 쌍으로 만들어 저장 -> 딕셔너리
            //  intent.putExtra("number1",1)
            //  intent.putExtra("number2",2)
            //  startActivity(intent)

            // val intent2 = Intent(this@Intent1, Intent2::class.java)
            // Apply ->
            // intent2.apply {
            //    this.putExtra("number1", 1)
            //    this.putExtra("number2", 2)
            // }

            //암시적 인텐트->할수 있는 대상에게 요청
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 200) {
            Log.d("number", "" + requestCode)
            Log.d("number", "" + resultCode)
            val result = data?.getIntExtra("result", 0)
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}