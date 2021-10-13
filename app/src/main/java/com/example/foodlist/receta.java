package com.example.foodlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class receta extends AppCompatActivity {
    ImageView img;
    String comida ;
    TextView txt;
    TextView txtR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta);

        img = findViewById(R.id.img);
        txt = findViewById(R.id.txt);
        txtR = findViewById(R.id.txtR);


        comida =getIntent().getStringExtra("name");

        txt.setText(comida);
        switch (comida){
            case "CORN FLAKE":
                img.setImageResource(R.drawable.cereal);
                txtR.setText("Tomamos una taza \n Luego vertimos la cantidad que deseamos \n 2\n Tomamos un carton de leche Vertimos en la taza \n A disfrutar" );
                break;
            case "AVENA":
                img.setImageResource(R.drawable.avena);
                txtR.setText(" ½ taza avena [58 gr]\n" +
                        "4 tazas agua\n" +
                        "4 tazas leche entera (ver notas)\n" +
                        "¼ cucharadita sal [2 gr] (opcional)\n" +
                        "2 palitos canela\n" +
                        "6 clavos dulces\n" +
                        "¼ cucharadita nuez moscada rallada\n" +
                        "4 cucharadas azúcar morena (o más, al gusto) ");
                break;
            case "CHOCOLATE CON PAN":
                img.setImageResource(R.drawable.chocolate);
                txtR.setText("3 tazas de leche evaporada\n" +
                        "6 clavos dulces\n" +
                        "2 cucharadas de fécula de maíz (maicena)\n" +
                        "½ taza de azúcar\n" +
                        "2 palitos de canela\n" +
                        "4 rebanaditas de jengibre fresco\n" +
                        "½ taza de chocolate en barra picado (sin azúcar) o cocoa en polvo\n" +
                        "1½ tazas de agua ");
                break;
            case "PLATANO CON QUESO":
                img.setImageResource(R.drawable.platano);
                txtR.setText("4 plátanos verdes\n" +
                        "1½ cucharadita de sal\n" +
                        "4 cucharadas de mantequilla o aceite de oliva (ver notas)\n" +
                        "½ taza de agua a temperatura ambiente ");
                break;
            case "LA BANDERA DOMINICANA":
                img.setImageResource(R.drawable.bandera);
                txtR.setText("Arroz Blanco\n" +
                        "5 cucharadas de aceite vegetal (soya, maní o maíz)\n" +
                        "1¼ cucharadita de sal\n" +
                        "6 tazas del agua\n" +
                        "4 tazas arroz\n" +
                        "Habichuelas Guisadas\n" +
                        "2 tazas de habichuelas rojas , pintas o giras secas\n" +
                        "1 cucharada de aceite de oliva\n" +
                        "1 pizca de orégano\n" +
                        "1 ají cubanela o pimiento morrón picado\n" +
                        "1 cebolla roja pequeña cortada en cuartos\n" +
                        "2 dientes de ajo majados\n" +
                        "1 taza de auyama cortada en cubos\n" +
                        "½ taza de salsa de tomate\n" +
                        "4 ramitas de tomillo (opcional)\n" +
                        "Hojas de un tallo de apio , picadas (opcional)\n" +
                        "½ cucharadita de cilantro fresco picadito\n" +
                        "1 cucharadita de sal (o más, al gusto)\n" +
                        "Pollo Guisado\n" +
                        "2 libras [0.9 kg] del pollo\n" +
                        "2 limones (limas fuera de la RD) cortados en mitades\n" +
                        "1 pizca de orégano\n" +
                        "1 cebolla roja pequeña cortada en rodajas u octavos\n" +
                        "½ taza de apio picado (opcional)\n" +
                        "1 cucharadita de sal (podrías necesitar más)\n" +
                        "½ cucharadita de ajo triturado\n" +
                        "2 cucharadas de aceite (maíz, maní o soya)\n" +
                        "1 cucharadita de azúcar blanca regular\n" +
                        "2 tazas de agua\n" +
                        "4 tomates cortados en 4 cuartos\n" +
                        "2 ajíes cubanela o 1 pimiento morrón\n" +
                        "¼ taza de aceitunas cortadas en mitades (opcional)\n" +
                        "1 taza de salsa de tomate\n" +
                        "Unas hojas de cilantro\n" +
                        "¼ cucharadita de pimienta ");
                break;
            case "MORO DE GANDULES":
                img.setImageResource(R.drawable.gandules);
                txtR.setText("2 cda aceite de oliva , divididas\n" +
                        "½ cdta ajo\n" +
                        "1 cdta cilantro finalmente picado\n" +
                        "¼ taza ají cubanela (aprox. 1 ají) cortados en cubos\n" +
                        "¼ taza apio picado\n" +
                        "⅛ taza alcaparras (opcional)\n" +
                        "12 aceitunas sin semilla cortadas en mitades (opcional)\n" +
                        "1 pizca orégano\n" +
                        "1 ½ cdta salt\n" +
                        "4 taza arroz (enlace afiliado a Amazon)\n" +
                        "2 taza guandules hervidos (enlace afiliado a Amazon)\n" +
                        "2 taza agua\n" +
                        "½ taza salsa de tomate\n" +
                        "2 taza leche de coco ");
                break;
            case "PICA POLLO":
                img.setImageResource(R.drawable.picapollo);
                txtR.setText(" 1 cebolla roja pequeña cortada en cuartos\n" +
                        "Jugo de 2 limones\n" +
                        "1 manojo perejil\n" +
                        "2 cucharadas sal divididas\n" +
                        "2 cucharaditas orégano divididas\n" +
                        "3 dientes ajo grandes, ligeramente machacados\n" +
                        "12 piezas pollo muslos o muslitos, o lo que se desee\n" +
                        "1 taza harina todo uso\n" +
                        "1 cucharadita pimienta\n" +
                        "1 cucharada ajo en polvo\n" +
                        "1 cucharada cebolla en polvo\n" +
                        "2½ tazas aceite para freír");
                break;
            case "ENSALADA":
                img.setImageResource(R.drawable.ensalada);
                txtR.setText("1 remolacha hervida cortada en rebanadas (opcional)\n" +
                        "Una pizca de azúcar\n" +
                        "2 tomates rojos o verdes rebanados o cortados en cubos\n" +
                        "¼ cabeza de repollo [col] rebanada finamente y enjuagada (o ½ lechuga picada y enjuagada)\n" +
                        "1 pepino grande (o 2 pequeños) cortado en rebanadas o cubos\n" +
                        "1 cebolla roja pequeña cortada en tiritas (opcional)\n" +
                        "Vinagreta estilo dominicano\n" +
                        "3 cucharadas de vinagre de frutas\n" +
                        "6 cucharadas de aceite de oliva\n" +
                        "1 cucharadita de sal (o más, al gusto) ");
                break;
            case "YUCA CON QUESO":
                img.setImageResource(R.drawable.yuca);
                txtR.setText("2½ libra yuca [1.13 kilo], pelada, lavada y picada (ver notas)\n" +
                        "1 cucharada sal\n" +
                        "2½ tazas aceite para freír\n" +
                        "1 cucharada ajo machacado\n" +
                        "1 taza chicharrón picado\n" +
                        "Para la salsa de queso Cheddar\n" +
                        "2 cucharadas mantequilla con sal\n" +
                        "½ cucharada harina todo uso\n" +
                        "1 taza leche [237 mililitros]\n" +
                        "½ taza queso cheddar rallado [55 gramos]. ");
                break;
            case "BATATA AZADA":
                img.setImageResource(R.drawable.batata);
                txtR.setText(" ");
                break;
            case "ESPAGUETIS":
                img.setImageResource(R.drawable.espagetis);
                txtR.setText("1 lb [0.43 kg] de spaghetti\n" +
                        "2 cucharaditas de sal\n" +
                        "2 cucharadas de aceite de olivas\n" +
                        "1 lb [0.43 kg] de \"salami\" dominicano cortado en cubitos (opcional)\n" +
                        "1 cebolla , cortada en cubos\n" +
                        "2 dientes de ajo , majados\n" +
                        "1 ají verde grande cortado en cubitos\n" +
                        "¼ taza de aceitunas verdes sin semillas\n" +
                        "1 cucharada de alcaparras (opcional)\n" +
                        "4 tomates maduros picados\n" +
                        "1 pizca de orégano\n" +
                        "2 tazas de salsa de tomate\n" +
                        "¼ cucharadita de vinagre de frutas (opcional)\n" +
                        "½ taza de leche evaporada (opcional, ver notas)\n" +
                        "¼ cucharadita de pimienta , o al gusto\n" +
                        "¼ taza de parmesano rallado (opcional) ");
                break;
            case "HOT DOG":
                img.setImageResource(R.drawable.hotdog);
                txtR.setText("Hot dog de repollo dominicano\n" +
                        "8 salchichas para perros calientes\n" +
                        "1½ tazas repollo rebanado finamente\n" +
                        "2 tazas de agua hirviendo\n" +
                        "2 cucharaditas de sal\n" +
                        "4 cucharadas de ketchup\n" +
                        "4 cucharadas de mayonesa\n" +
                        "½ taza de pepinillos picados dulce (sweet relish)\n" +
                        "8 panes para perros calientes\n" +
                        "¼ taza de hojuelitas de papa aplastadas\n" +
                        "4 cucharadas de mostaza (opcional) ");
                break;
            case "HAMBURGUEZAS":
                img.setImageResource(R.drawable.hamburgesas);
                txtR.setText(" Para la salsa\n" +
                        "1 cucharada de salsa inglesa (Worcestershire)\n" +
                        "½ taza de mayonesa\n" +
                        "¼ taza de jugo de naranja\n" +
                        "½ taza de ketchup\n" +
                        "Para los chimis\n" +
                        "1 cebolla pequeña cortada en cubitos pequeños\n" +
                        "1 ají cubanela cortado en cubitos pequeños\n" +
                        "1 cucharadita de ajo majado\n" +
                        "½ cucharadita de orégano molido\n" +
                        "2 libras de res molida [0.9 kg]\n" +
                        "1 cucharada de salsa inglesa (Worcestershire)\n" +
                        "2 cucharaditas de sal\n" +
                        "2 cucharadas de aceite vegetal (maíz, maní o soya)\n" +
                        "2 tomates grandes cortados en ruedas\n" +
                        "1 cebolla grande cortada en aros\n" +
                        "2 tazas tazas de repollo picado finamente\n" +
                        "6 panes de agua o panes para hamburguesas\n");
                break;
            case "PIZZA":
                img.setImageResource(R.drawable.pizza);
                txtR.setText("1 kilogramo de harina de fuerza (también conocida como harina 00)\n" +
                        " 1 cucharadita de sal fina\n" +
                        " 2½ tazas de agua tibia\n" +
                        " 2 cucharadas soperas de aceite de oliva\n" +
                        " 30 gramos de levadura fresca ");
                break;
            case "GARBANSOS CON ESPINACAS":
                img.setImageResource(R.drawable.garbansos);
                txtR.setText("Garbanzos cocidos\n" +
                        "500 g\n" +
                        "Espinaca congelada\n" +
                        "400 g\n" +
                        "Dientes de ajo\n" +
                        "2\n" +
                        "Pan de hogaza rebanada\n" +
                        "1\n" +
                        "Comino molido\n" +
                        "5 g\n" +
                        "Cilantro molido\n" +
                        "5 g\n" +
                        "Pimentón dulce\n" +
                        "5 g\n" +
                        "Pimienta blanca molida pizca\n" +
                        "Salsa de tomate\n" +
                        "60 g\n" +
                        "Vinagre de manzana\n" +
                        "30 g\n" +
                        "Agua\n" +
                        "100 ml\n" +
                        "Aceite de oliva virgen extra\n" +
                        "100 g\n" +
                        "Sal");
                break;
            case "AROS DE CEBOLLA":
                img.setImageResource(R.drawable.cebolla);
                txtR.setText("1 Cebolla\n" +
                        "1/2 taza de harina\n" +
                        "1 cucharada de levadura en polvo\n" +
                        "Sal al gusto\n" +
                        "1 cucharadita de paprika o en su defecto chile rojo en polvo\n" +
                        "1 huevo\n" +
                        "¾ taza de leche\n" +
                        "1 cucharadita de pimienta molida\n" +
                        "Pan molido el necesario\n" +
                        "Aceite para freír ");
                break;
            case "BERENJENAS CON PAPA":
                img.setImageResource(R.drawable.berenjenas);
                txtR.setText("3 berenjenas asiáticas, cortadas a la mitad y luego en trozos de ½ pulgada\n" +
                        "6 papas pequeñas, hervidas y cortadas en cuartos, sin piel\n" +
                        "1 tomate manzano pequeño (alrededor de 6 onzas), cortado en cubos\n" +
                        "2 dientes de ajo, pelados y rebanados\n" +
                        "1 pimiento poblano o 2 Jalapeños, sin semilla y cortados en cubos (Ver Consejos de Ann)\n" +
                        "1 cucharada de aceite de oliva\n" +
                        "1 cucharadita de semillas de comino\n" +
                        "¼ cucharadita de cúrcuma\n" +
                        "¼ cucharadita de jengibre en polvo\n" +
                        "¼ limón\n" +
                        "2 cucharaditas de menta cortada (opcional)\n" +
                        "Sal marina y pimienta negra ");
                break;

        }
    }

    public void share(View view) {

        Integer [] imageIDs = {R.drawable.avena};

        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        Uri screenshotUri = Uri.parse(MediaStore.Images.Media.EXTERNAL_CONTENT_URI + "/" + imageIDs);

        sharingIntent.setType("image/jpeg");
        sharingIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
        startActivity(Intent.createChooser(sharingIntent, "Share image using"));




    }
}