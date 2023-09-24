package com.example.progmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SampleList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        var btnshowlist : Button = findViewById(R.id.btnShowList)
        btnshowlist.setOnClickListener(View.OnClickListener { View ->
            var intent = Intent(this@SampleList,SampleListView::class.java)
            startActivity(intent)
        })
    }
}