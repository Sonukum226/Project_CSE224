package com.example.cse224

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // for edit text

        val editText:EditText=findViewById(R.id.editText)

        editText.setOnClickListener {

            Toast.makeText(applicationContext, "Edit text is Clicked", Toast.LENGTH_SHORT)
                    .show()
        }


        //for check box

        val checkBox:CheckBox=findViewById(R.id.checkBox);

        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                Toast.makeText(applicationContext,"Remember Me on",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"Remember Me off",Toast.LENGTH_SHORT).show()
            }
        }

        //for Radio Button

        val rg:RadioGroup=findViewById(R.id.radiogrp)

        rg.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId==R.id.maleRadiobtn){
                Toast.makeText(applicationContext," Male",Toast.LENGTH_SHORT).show()
            }

            if(checkedId==R.id.femaleradiobtn){
                Toast.makeText(applicationContext,"Female",Toast.LENGTH_SHORT).show()
            }
        }

//            For Button

        val button:Button=findViewById(R.id.button)
        button.setOnClickListener {
            Toast.makeText(applicationContext,"Submitted",Toast.LENGTH_SHORT).show()
        }


    }
}