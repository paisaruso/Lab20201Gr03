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
import kotlinx.android.synthetic.main.activity_personal_data.*
import java.util.*

class PersonalData : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private var spinner: Spinner? = null
    private var arrayAdapter: ArrayAdapter<String>? = null
    private var itemList = arrayOf(

        "Primaria",
        "Secundaria",
        "Universidad",
        "Otro"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_data)
        spinner = findViewById(R.id.spinner)
        arrayAdapter = ArrayAdapter(applicationContext, android.R.layout.simple_spinner_item, itemList)
        spinner?.adapter = arrayAdapter
        spinner?.onItemSelectedListener = this

        btnSiguiente.setOnClickListener {

            val intent: Intent = Intent(this, ContactData::class.java)

            startActivity(intent)
        }
    }


    @SuppressLint("SetTextI18n")
    fun funDate (view: View){
        val c = Calendar.getInstance()
        val day = c.get(Calendar.DAY_OF_MONTH)
        val month = c.get(Calendar.MONTH)
        val year = c.get(Calendar.YEAR)

        val dpd = DatePickerDialog(this, android.R.style.Theme_Holo_Dialog, DatePickerDialog.OnDateSetListener { datePicker, year, monthOfYear, dayOfMonth ->
            txtCalendar.text ="$dayOfMonth, $monthOfYear $year"
        }, year, month, day)

        //show datepicker
        dpd.show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        Toast.makeText(applicationContext, "Nada Seleccionado", Toast.LENGTH_LONG).show()
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

    }
}