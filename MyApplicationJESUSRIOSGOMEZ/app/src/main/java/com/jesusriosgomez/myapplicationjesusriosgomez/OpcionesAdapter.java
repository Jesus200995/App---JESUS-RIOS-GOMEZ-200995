package com.jesusriosgomez.myapplicationjesusriosgomez;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class OpcionesAdapter {
    ArrayList<Producto> ListaOpciones;

    public OpcionesAdapter(@NonNull Context context, int resource, @NonNull List<Producto> objects) {
        super(context, resource, objects);

        ListaOpciones= (ArrayList<Producto>) objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= convertView;

        Producto opcionesactuales= ListaOpciones.get(position);
        if (view== null){
            view= LayoutInflater.from(getContext()).inflate(R.layout.lista, parent, false);
        }

        ImageView Icono= view.findViewById(R.id.IconoOpcion);
        Icono.setImageResource(opcionesactuales.getIcono());

        TextView NombreOpcion= view.findViewById((R.id.TxtNombre));
        NombreOpcion.setText(opcionesactuales.getNombre());

        TextView Descripcion= view.findViewById((R.id.TxtDescripcion));
        Descripcion.setText(opcionesactuales.getDescripcion());



        return view;

    }
}

}
