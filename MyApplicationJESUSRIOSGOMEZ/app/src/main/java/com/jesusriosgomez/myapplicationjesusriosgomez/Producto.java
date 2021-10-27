package com.jesusriosgomez.myapplicationjesusriosgomez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Producto {

    // propiedades
    private int Icono;
    private String Nombre;
    private String Descripcion;

    // constructor
    public Opciones (String Nombre,int Icono, String Descripcion){
        this.Nombre= Nombre;
        this.Icono= Icono;
        this.Descripcion= Descripcion;
    }

    //setters
    public void setNombre(String nombre) {
        this.Nombre = Nombre;
    }

    public void setIcono(int icono) {
        this.Icono = Icono;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = Descripcion;
    }

    // getters
    public String getNombre() {
        return Nombre;
    }

    public int getIcono() {
        return Icono;
    }

    public String getDescripcion() {
        return Descripcion;
    }
}




    }
}