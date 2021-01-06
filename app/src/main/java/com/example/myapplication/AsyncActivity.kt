package com.example.myapplication

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import androidx.loader.content.AsyncTaskLoader
import org.w3c.dom.Text

class AsyncActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async)
    }

}

//class BackgroundAsyncTask(
//    val progressBar: ProgressBar,
//    val progressText: TextView
//) : AsyncTask<Int, Int, Int>() {
//    //params -> doInBackGround 에서 사용할 타입
//    //progress -> onProgressUpdate 에서 사용할 타입
//    //result -> onPostExecute 에서 사용할 타입
//
//

//    override fun onPreExecute() {
//        super.onPreExecute()
//    }
//
//    override fun doInBackground(vararg params: Int?): Int {
//    }
//
//    override fun onProgressUpdate(vararg values: Int?) {
//        super.onProgressUpdate(*values)
//    }
//
//    override fun onPostExecute(result: Int?) {
//        super.onPostExecute(result)
//    }
//}