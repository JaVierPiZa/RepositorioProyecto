package com.example.r.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.r.Models.Persona;
import com.example.r.R;

import java.util.ArrayList;

public class ListViewPersonasAdapter extends BaseAdapter {
    Context context;
    ArrayList<Persona> personaData;
    LayoutInflater layoutinflater;
    Persona personaModel;
    public ListViewPersonasAdapter(Context context, ArrayList<Persona> personaDate){
        this.context = context;
        this.personaData = personaDate;
        layoutinflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }



    @Override
    public int getCount() {
        return personaData.size();
    }

    @Override
    public Object getItem(int position) {
        return personaData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        if(rowView==null){
            rowView = layoutinflater.inflate(R.layout.listapersonas,null,true);
        }
        TextView nombres = rowView.findViewById(R.id.Nombres);
        TextView telefono = rowView.findViewById(R.id.Telefono);
        TextView fecha = rowView.findViewById(R.id.Fecha);

        personaModel = personaData.get(position);
        nombres.setText(personaModel.getNombres());
        telefono.setText(personaModel.getTelefono());
        fecha.setText(personaModel.getFechaRegistro());
        return rowView;
    }
}
