package com.example.ass5



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var data  :Bundle?  = intent.extras
        var newEmployee : Employee? = data?.getParcelable<Employee>("stdData")
        name1.text = "Employee Name : ${newEmployee?.name}"
        radio1.text = "Gender : ${newEmployee?.gender}"
        email1.text = "E-Mail : ${newEmployee?.email}"
        salary1.text = "Salary : ${newEmployee?.salary} Baht"
    }
    fun onClickClose(view: View){
        finish()
    }
}