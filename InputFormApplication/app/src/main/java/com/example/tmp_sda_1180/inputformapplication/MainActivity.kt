package com.example.tmp_sda_1180.inputformapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnfavouriteColor.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, ColorPickerDialog::class.java)
            startActivity(intent)
        })

    }

    public override fun onResume() {
        super.onResume()
        // put your code here...
        val bundlefromColorPickerDialog = getIntent()
        var color = bundlefromColorPickerDialog.getIntExtra("keyColor",0)
        //val color = bundlefromColorPickerDialog.getIntExtra("keyColor",0)
        btnfavouriteColor.setBackgroundColor(color)


    }



}
