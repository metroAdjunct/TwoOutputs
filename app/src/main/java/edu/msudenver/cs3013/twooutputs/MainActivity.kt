package edu.msudenver.cs3013.twooutputs

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "==== Here i am ====", Toast.LENGTH_LONG).show()
        Log.e("TWO_OUT", "=== Up n At Em ERROR ====")
        Log.wtf("TWO_OUT", "=== Up n At Em WTF ====")
        Log.println(7, "TWO_OUT", "<<<<<<<<<<  HERE I AM >>>>>>>>>>")  // ASSERT level
        //println("====  Here I am !!  PRINTLN       =====")
    }
}