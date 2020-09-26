package com.example.compumovil.gr03_20201.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_contact_data.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_personal_data.*


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

            if (editTextTextTelefono.text.toString() != "" && autoCompleteTextViewPais.text.toString() != "" && editTextTextCorreo.text.toString() != "") {
                val intent: Intent = Intent(this, DatosPersonales::class.java)
                var Telefono:Int = editTextTextTelefono.text.toString().toInt()
                var correo:String = editTextTextCorreo.text.toString()
                var pais:String = autoCompleteTextViewPais.text.toString()
                var ciudad:String = autoCompleteTextViewCiudad.text.toString()
                var direcc:String = editTextTextDireccion.text.toString()
                intent.putExtra("Celefono", Telefono)
                intent.putExtra("Correo", correo)
                intent.putExtra("Pais",pais)
                intent.putExtra("Ciudad",ciudad)
                intent.putExtra("Direccion",direcc)
                startActivity(intent)
            } else {
                Toast.makeText(this, "ingrese campos obligatorios", Toast.LENGTH_LONG).show()
            }

        }

    }

}