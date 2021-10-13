package com.example.foodlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String comida [] = {"Selecciona","Desayuno","Almuerzo", "Cena","Vegetariana", "Chatarra"};

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);


        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,comida);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(), comida[i] , Toast.LENGTH_LONG).show();


        Intent a = new Intent(this, comidas.class);
     switch (i)
     {
         case 0:

             break;
         case 1:
             a.putExtra("list",comida[1]);
             startActivity(a);
             break;

         case 2:
             a.putExtra("list",comida[2]);
             startActivity(a);
             break;
         case 3:
             a.putExtra("list",comida[3]);
             startActivity(a);
             break;
         case 4:
             a.putExtra("list",comida[4]);
             startActivity(a);
             break;
         case 5:
             a.putExtra("list",comida[5]);
             startActivity(a);
             break;
     }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}