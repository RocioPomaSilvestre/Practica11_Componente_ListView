package com.rocio.poma.practica11_componente_listview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentUno#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentUno extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentUno() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentUno.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentUno newInstance(String param1, String param2) {
        FragmentUno fragment = new FragmentUno();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_uno, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        //super.onViewCreated(view, savedInstanceState);
        ListView listView=view.findViewById(R.id.listView1);

        List<Personas> personasList=new ArrayList<Personas>();
        personasList.add( new Personas("Rocio","Poma","https://i.ibb.co/LtW8YXQ/image.png","7544619"));
        personasList.add( new Personas("Carlos","Sanchez","https://i.ibb.co/fSrw6B4/image.png","7844619"));
        personasList.add( new Personas("Estefanny","Peralta","https://i.ibb.co/R3cWWDL/image.png","6544610") );
        personasList.add( new Personas("Roberto","Sustach","https://i.ibb.co/xz1ghtS/image.png","68906542"));
        personasList.add( new Personas("Flor","Rivera","https://i.ibb.co/LtW8YXQ/image.png","6289901"));

        ArrayAdapter<Personas> adapter=new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_multiple_choice,personasList);
        listView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);
        listView.setAdapter(adapter);

        Button btnPersonalizado= view.findViewById(R.id.btnPersonalizado);
        btnPersonalizado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.siguiente_ventana);
            }
        });
    }
}