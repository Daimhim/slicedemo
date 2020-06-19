package org.daimhim.slicedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import twoguards.annotation.BuriedPointEvent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    @BuriedPointEvent("MainActivity","textViewClick")
    fun textViewClick(view: View){
        Toast.makeText(this,(view as TextView).text,Toast.LENGTH_SHORT).show()
    }
}
