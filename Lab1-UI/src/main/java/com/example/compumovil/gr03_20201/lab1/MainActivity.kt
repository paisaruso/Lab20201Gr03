package com.example.compumovil.gr03_20201.lab1

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_personal_data.*
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPersonalData.setOnClickListener {
            val intent: Intent = Intent(this, PersonalData::class.java)
            startActivity(intent)
        }

        btnContacData.setOnClickListener {
            val intent: Intent = Intent(this, ContactData::class.java)
            startActivity(intent)
        }
    }
}
