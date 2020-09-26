package com.example.compumovil.gr03_20201.lab1

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.DatePickerDialog
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_contact_data.*
import kotlinx.android.synthetic.main.activity_contact_data.view.*
import kotlinx.android.synthetic.main.activity_datos_personales.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_personal_data.*
import kotlinx.android.synthetic.main.activity_personal_data.view.*
import java.util.*

class DatosPersonales : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_personales)

        val objetoIntent: Intent=intent
        var Nombre = objetoIntent.getStringExtra("Nombre")
        var Apellido = objetoIntent.getStringExtra("Apellido")
        txtNombre.text = "Nombre Completo $Nombre $Apellido"
        var Sexo = objetoIntent.getStringExtra("Sexo")
        txtSexo.text = "Sexo $Sexo"
        var Fecha = objetoIntent.getStringExtra("Fecha")
        txtFecha.text = "Fecha $Fecha"
        var escolaridad = objetoIntent.getStringExtra("Escolaridad")
        txtEscolaridad.text = "Escolaridad $escolaridad"


        var Telefono = objetoIntent.getStringExtra("Telefono")
        txtTelefono.text = "Telefono $Telefono"
        var correo = objetoIntent.getStringExtra("Correo")
        txtCorreo.text = "Correo $correo"
        var pais = objetoIntent.getStringExtra("Pais")
        txtPais.text = "Pais $pais"
        var ciudad = objetoIntent.getStringExtra("Ciudad")
        txtCiudad.text = "Ciudad $ciudad"
        var direccion = objetoIntent.getStringExtra("Direccion")
        txtDireccion.text = "Direccion $direccion"

        btnRegresar.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}