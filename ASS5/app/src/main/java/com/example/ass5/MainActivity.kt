package com.example.ass5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun onClickShowDetail(v: View) {
        val selectID :Int = radio.checkedRadioButtonId
        var gender = ""
        try {
            var radioButtonChecked : RadioButton = findViewById(selectID)
            gender = radioButtonChecked.text as String
        }catch (t: Throwable){
            gender = ""
        }

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(
            "stdData",
            Employee(name.text.toString(),gender.toString(),email.text.toString(),salary.text.toString().toInt()))
        startActivity(intent)
            }







    fun reset(v: View){

        name.text.clear()
        email.text.clear()
        radio.clearCheck()
        salary.text.clear()

    }
}