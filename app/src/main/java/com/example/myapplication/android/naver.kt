package com.example.myapplication.android

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_naver.*

class naver : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naver)

        address
        open.setOnClickListener {
            val address = address.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }

      //  address.addTextChangedListener(object : TextWatcher {
        //    override fun afterTextChanged(s: Editable?) {
        //        Log.d("edit,""afterTextChanged : " + s)
        //    }

         //   override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
         //       Log.d("edit,""beforeTextChanged: " + s)
         //   }

         //   override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
         //       Log.d("edit,""onTextChanged: " + s)
         //   }
       // })
    }


}