package com.example.foodlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class comidas extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String comida []=new String[4];
    ListView listView;

    String clasificacion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comidas);
        listView = findViewById(R.id.listView);


        listView.setOnItemSelectedListener(this);
        clasificacion = getIntent().getStringExtra("list");

        switch (clasificacion){
            case "Desayuno":
                comida[0]="CORN FLAKE";
                comida[1]="AVENA";
                comida[2]="CHOCOLATE CON PAN";
                comida[3]="PLATANO CON QUESO";
                break;
            case "Almuerzo":
                comida[0]="LA BANDERA DOMINICANA";
                comida[1]="MORO DE GANDULES";
                comida[2]="PICA POLLO";
                comida[3]="ENSALADA";
                break;
            case "Cena":
                comida[0]="YUCA CON QUESO";
                comida[1]="BATATA AZADA";
                comida[2]="PICA POLLO";
                comida[3]="ESPAGUETIS";
                break;
            case "Chatarra":
                comida[0]="HOT DOG";
                comida[1]="HAMBURGUEZAS";
                comida[2]="PIZZA";
                comida[3]="PICA POLLO";
                break;
            case "Vegetariana":
                comida[0]="ENSALADA";
                comida[1]="GARBANSOS CON ESPINACAS";
                comida[2]="AROS DE CEBOLLA";
                comida[3]="BERENJENAS CON PAPA";

                break;
        }
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_list_item_1,comida);

        listView.setAdapter(aa);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                enviar(comida[i]);
            }
        });
    }
    public void enviar ( String seleccion){
        Intent a = new Intent(this,receta.class);
        a.putExtra("name", seleccion );
        startActivity(a);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(), comida[i] , Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}