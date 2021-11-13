package com.prince.caquestion2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button

    lateinit var chbx1 : CheckBox
    lateinit var chbx2 : CheckBox
    lateinit var chbx3 : CheckBox
    lateinit var chbx4 : CheckBox

    lateinit var radio1 : RadioButton
    lateinit var radio2 : RadioButton
    lateinit var radio3 : RadioButton
    lateinit var radio4 : RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById( R.id.btnSubmit )

        chbx1 = findViewById( R.id.cbx1 )
        chbx2 = findViewById( R.id.cbx2 )
        chbx3 = findViewById( R.id.cbx3 )
        chbx4 = findViewById( R.id.cbx4 )

        radio1 = findViewById( R.id.radio1 )
        radio2 = findViewById( R.id.radio2 )
        radio3 = findViewById( R.id.radio3 )
        radio4 = findViewById( R.id.radio4 )



        btn.setOnClickListener(){
        Toast.makeText(this@MainActivity , "DATA SUBMITTED" , Toast.LENGTH_SHORT ).show()
        }

        chbx1.setOnClickListener(){
            Toast.makeText(this@MainActivity , "You have selected C" , Toast.LENGTH_SHORT ).show()
        }
        chbx2.setOnClickListener(){
            Toast.makeText(this@MainActivity , "You have selected C++" , Toast.LENGTH_SHORT ).show()
        }
        chbx3.setOnClickListener(){
            Toast.makeText(this@MainActivity , "You have selected JAVA" , Toast.LENGTH_SHORT ).show()
        }
        chbx4.setOnClickListener(){
            Toast.makeText(this@MainActivity , "You have selected PYTHON" , Toast.LENGTH_SHORT ).show()
        }

        radio1.setOnClickListener(){
            Toast.makeText(this@MainActivity , "You have selected NOKIA " , Toast.LENGTH_SHORT ).show()
        }
        radio2.setOnClickListener(){
            Toast.makeText(this@MainActivity , "You have selected SAMSUMG " , Toast.LENGTH_SHORT ).show()
        }
        radio3.setOnClickListener(){
            Toast.makeText(this@MainActivity , "You have selected APPLE " , Toast.LENGTH_SHORT ).show()
        }
        radio4.setOnClickListener(){
            Toast.makeText(this@MainActivity , "You have selected OTHER " , Toast.LENGTH_SHORT ).show()
        }


    }
}