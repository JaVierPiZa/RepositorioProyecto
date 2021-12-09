package com.example.r;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Ensaladas extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btn1;
    private ImageButton btn2;
    private ImageButton bnt3;
    private ImageButton btn4;
    private ImageButton btn5;
    private ImageButton btn6;
    private Button back;
    private String ingredientes;
    private String preparacion;
    private String es;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ensaladas);
        btn1 = (ImageButton) findViewById(R.id.ensalada1);
        btn2 =(ImageButton) findViewById(R.id.ensalada2);
        bnt3 =(ImageButton) findViewById(R.id.ensalada3);
        btn4 = (ImageButton) findViewById(R.id.ensalada4);
        btn5 = (ImageButton) findViewById(R.id.ensalada5);
        btn5 = (ImageButton) findViewById(R.id.ensalada6);
        back =(Button)findViewById(R.id.btnback);

        btn1.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent innt2 = new Intent(Ensaladas.this , Receta.class);
        innt2.putExtra("ingredientes",ingredientes=
                "                \"* 4 tazas de corazones de lechuga fileteados\" +\n" +
                "                \"* 4 pechugas de pollo\" +\n" +
                "                \"* 2 cucharadas de aceite de oliva\" +\n" +
                "                \"* 1 taza de granos de elote dorados\" +\n" +
                "                \"* 1 Palta en cubos\" +\n" +
                "                \"* 1 taza de queso panela en cubos\" +\n" +
                "                \"* 3 cucharadas de cebolla morada picada\" +\n" +
                "                \"* 1 taza de tiras de tortilla fritas\" +\n" +
                "                \"* 4 huavos de codorniz\" +\n" +
                "                \"1 taza de frijoles cocidos\" +\n" +
                "                \"1 taza de tomates cherry partidos a la mitad\" +\n" +
                "                \"8 cucharadas de aceite de oliva\" +\n" +
                "                \"3 cucharadas de vinagre de manzana\" +\n" +
                "                \"2 cucharadas de jugo de limón\" +\n" +
                "                \"1 cucharada de miel\" +\n" +
                "                \"1/2 cucharadita de orégano seco\" +\n" +
                "                \"1 cucharada de echalote finamente picado\"");
        innt2.putExtra("preparacion",preparacion= " \"1- Salpimienta el pollo, barniza con la mostaza y sella en una plancha" +
                        "de rayas con aceite hasta que estén cocidas, deja reposar y rebana.\" +\n"+
                        " \"2- Mezcla los ingredientes de la vinagreta y salpimienta. Integra con la lechuga.\" +\n"+"3- Acomoda el resto de los ingredientes sobre la lechuga y sirve."
                                 );
        innt2.putExtra("es",es="Ensalada");
        startActivity(innt2);
    }

    public void Ensalada2(View view){
        Intent e2 = new Intent(Ensaladas.this , Receta.class);
        e2.putExtra("ingredientes", ingredientes="* 1/2 pepino" +
                //Ensalada de Atun

                "* 1 manzana verde\n" +
                "1 tallo de apio\n" +
                "1 palta\n" +
                "2 latas de atún al agua\n" +
                "1 puñado de berros\n" +
                "2 hojas de lechuga picadas\n" +
                "Para el aliño:\n" +
                "* 1 cucharada de jugo de limón\n" +
                "* 1 potecito de yogurt griego sin endulzar\n" +
                "* 2 cucharadas de aceite de oliva\n" +
                "* 1/2 cucharadita de mostaza\n" +
                "* Sal Rosada del Himalaya Gourmet a gusto\n" +
                "Pimienta Limón Gourmet a gusto");

        e2.putExtra("es",es="Ensalada");
        startActivity(e2);
    }
    public void Ensalada3(View view){
        Intent e3 = new Intent(Ensaladas.this, Receta.class);
        e3.putExtra("ingredientes", ingredientes="45g de tocino en láminas\n"  +
                //Ensalada de porotos negros

                "1/2 pepino\n" +
                "380g de porotos negros cocidos\n" +
                "1 taza de choclo cocido\n" +
                "1 tomate picado y sin pepas\n" +
                "1/2 cebolla morada chica, picada pequeña\n" +
                " \n" +
                "\n" +
                "Para el aliño\n" +
                "\n" +
                "1 cda de jugo de limón\n" +
                "1/2 cdta de mostaza\n" +
                "10 hojas de albahaca\n" +
                "6 cdas de aceite de oliva\n" +
                "Sal de Mar Gourmet\n" +
                "Mix de Pimientas Gourmet");

        e3.putExtra("es",es="Ensalada");
        startActivity(e3);

    }
    public void Ensalda4(View view){
        Intent e4 = new Intent(Ensaladas.this, Receta.class);
        e4.putExtra("ingredientes", ingredientes="" +
                "Para la ensalada\n" +
                "\n" +
                "1 puñado de lechuga\n" +
                "1 puñado de espinaca baby\n" +
                "5 frutillas grandes en láminas\n" +
                "7 cdas de ricotta\n" +
                "50g de almendras tostadas\n" +
                " \n" +
                "\n" +
                "Para el aliño\n" +
                "\n" +
                "1 cda de jugo de limón\n" +
                "1 cdta de mostaza Dijon\n" +
                "4 cdas de aceite de oliva\n" +
                "Sal y pimienta");

        e4.putExtra("es",es="Ensalada");
        startActivity(e4);
    }
    public void Ensalada5(View view){
        Intent e5 = new Intent(Ensaladas.this, Receta.class);
        e5.putExtra("ingredientes",ingredientes="" +
                //Ensalada de lentejas
                "2 taza de lentejas de 4 mm o 5 mm\n" +
                "1 litro de agua\n" +
                "2 sobres de Caldo de Verduras en Polvo Gourmet\n" +
                "200 gr de tomatitos, partido por la mitad (o usar 2 tomates en cubos)\n" +
                "1 pepino pelado y cortado en cubos pequeños\n" +
                "1 1/2 taza de hojas espinacas baby o espinaca picada fina\n" +
                "1/2 cebolla morada, picada en pluma fina (o cebolla blanca)\n" +
                "100 gr de queso feta o cabra en cubos o desmigajado\n" +
                " \n" +
                "\n" +
                "Aliño:\n" +
                "\n" +
                "Jugo de un limón,\n" +
                "1 cucharadita de mostaza\n" +
                "2 cucharadas de vinagre de manzanas o de vino blanco\n" +
                "1/2 cucharadita de miel\n" +
                "1/3 taza de aceite de oliva\n" +
                "1/2 cucharadita de Pimienta Blanca Molida Gourmet\n" +
                "1 cucharadita de Sal de Mar Gourmet");

        e5.putExtra("es",es="Ensalada");
        startActivity(e5);
    }
    public void Ensalada6(View view){
        Intent e6 = new Intent(Ensaladas.this, Receta.class);
        e6.putExtra("ingredientes",ingredientes="" +
                //ensalada Ruso
                "4 papas grandes cocidas con piel\n" +
                "3 zanahorias peladas y cocidas\n" +
                "1 taza de arvejas cocidas\n" +
                "1/2 taza de apio picado pequeño\n" +
                "2 cebollines picados finos\n" +
                "1/2 taza de porotos verdes cocidos y picados (opcional)\n" +
                "cilantro para decorar\n" +
                " \n" +
                "\n" +
                "Aliño:\n" +
                "\n" +
                "1/2 taza de mayonesa\n" +
                "1/2 taza de yogurt natural sin azúcar\n" +
                "jugo de 1 limón grande\n" +
                "1 cucharadita de vinagre\n" +
                "1/4 taza de aceite\n" +
                "1 cucharadita de Sal de Mar Gourmet\n" +
                "1/2 cucharadita de Pimienta Negra Molida Gourmet");

        e6.putExtra("es",es="Ensalada");
        startActivity(e6);
    }
public void Regresar(View view){
        Intent v = new Intent(Ensaladas.this,MainActivity.class);
        startActivity(v);
}
}