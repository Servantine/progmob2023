package com.example.progmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edinputname : EditText
    lateinit var tv_main : TextView
    lateinit var btninputname : Button
    lateinit var btnhelp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_main = findViewById(R.id.tv_main_activity)
        tv_main.text = getString(R.string.halo_progmob_main)

        btninputname = findViewById(R.id.btninputname)
        btnhelp = findViewById(R.id.btnhelp)
        edinputname = findViewById(R.id.edinputname)
        btninputname.setOnClickListener(
            View.OnClickListener { View ->
                var strTmp = edinputname.text.toString()
                tv_main.text = strTmp
            })
        btnhelp.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = edinputname.text.toString()
            bundle.putString("tesText",strTmp)

            var intent = Intent(
                this@MainActivity,
                HelpActivity::class.java
            )
            intent.putExtras(bundle)
            startActivity(intent)
        })

    }
}