package com.example.compumovil.gr03_20201.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_contact_data.*
import kotlinx.android.synthetic.main.activity_main.*




class ContactData : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_data)
        val pais = resources.getStringArray(R.array.paises)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pais)
        autoCompleteTextViewPais.setAdapter(arrayAdapter)
        val ciudad = resources.getStringArray(R.array.ciudades)
        val arrayAdapter2 = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ciudad)
        autoCompleteTextViewCiudad.setAdapter(arrayAdapter2)

        btnSigu.setOnClickListener {
            var Telefono:String = editTextTextTelefono.text.toString()
            var correo:String = editTextTextCorreo.text.toString()
            var pais:String = autoCompleteTextViewPais.text.toString()
            var ciudad:String = autoCompleteTextViewCiudad.text.toString()
            var direcc:String = editTextTextDireccion.text.toString()
            val intent: Intent = Intent(this, DatosPersonales::class.java)
            intent.putExtra("Celefono", Telefono)
            intent.putExtra("Correo", correo)
            intent.putExtra("Pais",pais)
            intent.putExtra("Ciudad",ciudad)
            intent.putExtra("Direccion",direcc)
            startActivity(intent)
        }

    }

    fun validateData(view: View) {
        if (editTextTextTelefono.text.toString() != "" && autoCompleteTextViewPais.text.toString() != "" && editTextTextCorreo.text.toString() != "") {
            Log.d("Telefono", editTextTextTelefono.text.toString())
            Log.d("Correo", editTextTextCorreo.text.toString())
            Log.d("País", autoCompleteTextViewCiudad.text.toString())
            Log.d("Ciudad", autoCompleteTextViewPais.text.toString())
            Log.d("Dirección", editTextTextDireccion.text.toString())
        } else {
            Log.d("ERROR", "Faltan datos por ingresar")
        }
    }
}