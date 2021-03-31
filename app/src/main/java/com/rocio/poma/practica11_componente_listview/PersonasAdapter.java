package com.rocio.poma.practica11_componente_listview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.List;

public class PersonasAdapter extends ArrayAdapter<Personas> {

    public PersonasAdapter(@NonNull Context context, List<Personas> personasModel) {
        super(context, 0,personasModel);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        if (convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.item_list,parent,false);
        }

        Personas p=getItem(position);

        TextView txtNombre= convertView.findViewById(R.id.textNombre);
        txtNombre.setText(p.getNombre());

        TextView txtApellido= convertView.findViewById(R.id.textApellido);
        txtApellido.setText(p.getApellido());

        TextView txtTelefono= convertView.findViewById(R.id.textTelefono);
        txtTelefono.setText(p.getTelefono());
        ImageView imgView=convertView.findViewById(R.id.imgViewPerfil);

        Glide
                .with(getContext())
                .load(p.getImagenUrl())
                .centerCrop()
                //.placeholder(R.drawable.loading_spinner)
                .into(imgView);

        return convertView;
    }
}
