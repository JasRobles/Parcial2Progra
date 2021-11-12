package com.example.parcial2progra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var tv_Mostrar: TextView
    private lateinit var lv_listv: TextView

    private val especie = arrayOf("Perro","Ave","Gato","Hamster")
    private val color = arrayOf("Negro","Blanco", "Marron","Parchado", "verde", "Azul")
    private val sexo = arrayOf("Varon","Hembra")
    private val peso = arrayOf("20 lbs","30 lbs","40 lbs","10 lbs","5 lbs","1 lbs")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_Mostrar=findViewById(R.id.tv_Mostrar)
        lv_listv=findViewById(R.id.lv_listv)

        val adaptador = ArrayAdapter(this,android.R.layout.simple_list_item_1,especie)
        lv_listv.adapter=adaptador

        lv_listv.setOnItemListener { adapterView,view,i,l,->
            tv_Mostrar.setText("El color de "+lv_listv.getItemAtPosition(i)+"es: "+color[i]
                    +"El sexo de "+lv_listv.getItemAtPosition(i)+"es: "+sexo[i]+"El peso de "+lv_listv.getItemAtPosition(i)+"es: "+peso[i])

        }

    }
//Desarrolle una aplicación que le permita seleccionar una mascota que aparezca en una lista y al seleccionar
// un elemento de la lista me muestre los datos por elemento tales como
// la especie del animal, color, sexo, peso.

}