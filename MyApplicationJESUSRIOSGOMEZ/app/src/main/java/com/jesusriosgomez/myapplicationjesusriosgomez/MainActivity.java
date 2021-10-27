package com.jesusriosgomez.myapplicationjesusriosgomez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Producto> ListaOpciones;
    private OpcionesAdapter opcionesAdapter;
    private Object OpcionesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaOpciones=new ArrayList<>();
        ListaOpciones.add(new Producto("Conexiones,",R.drawable.wifi,"Wifi,Bluetooth,Perfil fuera de linea, Uso de datos"));
        ListaOpciones.add(new Producto("Sonido y Vibracion,",R.drawable.ic_baseline_volume_up_24,"Modod de sonido, Tono de llamadas"));
        ListaOpciones.add(new Producto("Notificaciones,",R.drawable.hielo,"Notificaciones de Aplicaciones, Barra de estados"));
        ListaOpciones.add(new Producto("Pantalla,",R.drawable.str,"Brillo, Filtro de luz, Pantalla de inicio"));
        ListaOpciones.add(new Producto("Fondo de Pantalla,",R.drawable.ic_baseline_brightness_medium_24,"Brillo, Filtro de luz, Pantalla de inicio"));
        ListaOpciones.add(new Producto("Temas,",R.drawable.pincel,"Temas, Fondos de Pantalla,Fondos de Pantalla de bloqueo"));
        ListaOpciones.add(new Producto("Datos Biometricos y Seguridad,",R.drawable.seguridad,"Reconocimiento facila, Huellas digitales, Localizacion movil"));
        ListaOpciones.add(new Producto("Ubicacion,",R.drawable.ubicacion,"Ajustes de ubicacion,Solicitud de ubicacion"));
        ListaOpciones.add(new Producto("Actualizacion de Software,",R.drawable.refresh_icon_icons_com_50052,"Descargar actualizaciones, Ultimas actualizaciones"));


        OpcionesAdapter=new OpcionesAdapter(getApplicationContext(),0,ListaOpciones);
        ListView listView=findViewById(R.id.ListViewOpciones);
        ListView.setAdapter(OpcionesAdapter);

    }
}
