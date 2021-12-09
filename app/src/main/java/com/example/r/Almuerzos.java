package com.example.r;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Almuerzos extends AppCompatActivity {
    private ImageButton btnA1;
    private ImageButton btnA2;
    private ImageButton btnA3;
    private ImageButton btnA4;
    private ImageButton btnA5;
    private ImageButton btnA6;
    private Button volver;
    private String ingredientes;
    private String preparacion;
    private String es;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almuerzos);
        btnA1 = (ImageButton) findViewById(R.id.A1);
        btnA2 = (ImageButton) findViewById(R.id.a2);
        btnA3 = (ImageButton) findViewById(R.id.A4);
        btnA4 = (ImageButton) findViewById(R.id.A5);
        btnA5 = (ImageButton) findViewById(R.id.A6);
        btnA6 = (ImageButton) findViewById(R.id.A3);
        volver = (Button) findViewById(R.id.back);
    }
    public void Almuerzo1(View view){
        Intent A1 = new Intent(Almuerzos.this, Receta.class);
        A1.putExtra("ingredientes",ingredientes="1 cucharada de aceite de oliva\n" +
                "1 cebolla chica cortada en cubos\n" +
                "1/3 taza de zanahoria, cortada en cubos pequeños\n" +
                "2/3 taza de cubos de tomates en tarro (200 gr)\n" +
                "3 tazas de agua hirviendo\n" +
                "1 1/2 sobres de Caldo en Polvo de Verduras Gourmet o Caldo en Polvo Más Natural de Verduras Gourmet\n" +
                "1 taza de porotos blancos cocidos (400 gr)\n" +
                "1 cucharadita de Pimentón Ahumado Gourmet\n" +
                "1 cucharadita de Albahaca Deshidratada Gourmet\n" +
                "1/2 cucharadita de Ajo en Polvo Gourmet\n" +
                "1/2 cucharadita de Pimienta Cayena Gourmet (opcional)\n" +
                "100 gr de hojas de espinacas, picadas fino\n" +
                "2 cucharadas de queso parmesano\n" +
                "Sal de Mar Gourmet a gusto");
        A1.putExtra("preparacion",preparacion="Calentar el aceite en una olla a fuego medio. " +
                "Agregar la cebolla junto a la zanahoria y cocinar hasta que las verduras estén blandas.\n" +
                "Añadir los tomates en cubos y cocinar por 8 minutos.\n" +
                "Incorporar el agua hirviendo y el Caldo de Verduras, revolver.\n" +
                "Agregar los porotos y llevar la preparación a ebullición.\n" +
                "Añadir los condimentos y probar por si necesitara más sal.\n" +
                "Incorporar la espinaca y el parmesano, cocinar la sopa por 5 minutos más.\n" +
                "Servir caliente, acompañar con más parmesano y pan.");
        A1.putExtra("es",es="Almuerzo");
        startActivity(A1);
    }
    public void Almuerzo2(View view){
        Intent A2 = new Intent(Almuerzos.this,Receta.class);
        A2.putExtra("ingredientes",ingredientes="4 tomates grandes, picados\n" +
                "2 cucharadas de concentrado de tomates\n" +
                "1 ají verde (sacar las pepas para una versión menos picante)\n" +
                "½ cebolla, picada\n" +
                "1 sobre de Caldo de Verduras en Polvo Gourmet\n" +
                "1 taza de agua\n" +
                "1 cucharadita de vinagre de manzanas\n" +
                "1/3 cucharadita de Comino Molido Gourmet\n" +
                "1/3 cucharadita de Pimienta Negra Molida Gourmet\n" +
                "½ cucharadita de Ajo en Polvo Gourmet\n" +
                "1 cucharadita de Orégano Entero Gourmet\n" +
                "Sal de mar Gourmet a gusto\n" +
                " \n" +
                "\n" +
                "Ingredientes para el relleno:\n" +
                "\n" +
                "1 cucharada de aceite de oliva\n" +
                "3 cebollines parte blanca y verde\n" +
                "½ cucharadita de Comino Molido Gourmet\n" +
                "1 cucharadita de Orégano Molido Gourmet\n" +
                "1 taza de pollo cocido y desmenuzado\n" +
                "½ taza de crema ácida\n" +
                "1 taza de queso cheddar, rallado\n" +
                " \n" +
                "\n" +
                "Ingredientes para la masa:\n" +
                "\n" +
                "500gr de harina pre cocida de maíz amarillo\n" +
                "1 cucharadita de Polvos de Hornear Gourmet\n" +
                "250gr de mantequilla, blanda\n" +
                "1 a 1 ½ taza de caldo de pollo caliente, hecho con 1 sobre de Caldo en Polvo de Pollo Gourmet");
        A2.putExtra("preparacion",preparacion="Para la salsa roja, licuar todos los ingredientes hasta tener una mezcla homogénea. Reservar.\n" +
                "Para el relleno, calentar el aceite de oliva en una sartén. Agregar los cebollines y cocinar hasta que estén blandos. Añadir el comino y orégano, cocinar por 1 minuto. Incorporar el pollo y la salsa roja hecha en el paso anterior y cocinar hasta que todo esté integrado. Pasar la mezcla a un bol, añadir la crema ácida y el queso e integrar.\n" +
                "Para la masa, poner la harina junto a los polvos de hornear en un bol. Agregar la mantequilla y con la manos unir con la harina hasta que no se vea la mantequilla. Agregar de a poco el caldo de pollo hasta tener una masa unida que se pueda manejar.\n" +
                "Para armar los tamales poner aprox. ½ taza de masa en la palma de la mano. Aplastar con la otra mano y rellenar al medio de la masa con 1 ½ cucharada de la mezcla de pollo. Luego envolver el relleno con la masa de los costados. Envolver en las hojas de choclo para formar una especie de dulce o caramelo, amarrando los costados con tiras de hojas o con rafia.\n" +
                "Cocinar los tamales al vapor por 30 minutos. Para esto, pueden usar una vaporera de bambú o un colador sobre una olla de agua hirviendo. Servir inmediatamente.");
        A2.putExtra("es",es="Almuerzo");
        startActivity(A2);
    }
    public void Almuerzo3(View view){
        Intent A3 = new Intent(Almuerzos.this,Receta.class);
        A3.putExtra("ingredientes",ingredientes="1 cucharada de aceite de oliva\n" +
                "1 cebolla chica cortada en cubos\n" +
                "1/3 taza de zanahoria, cortada en cubos pequeños\n" +
                "2/3 taza de cubos de tomates en tarro (200 gr)\n" +
                "3 tazas de agua hirviendo\n" +
                "1 ½ sobres de Caldo en Polvo de Verduras Gourmet o Caldo en Polvo Más Natural de Verduras Gourmet\n" +
                "1 taza de porotos blancos cocidos (400 gr)\n" +
                "1 cucharadita de Pimentón Ahumado Gourmet\n" +
                "1 cucharadita de Albahaca Deshidratada Gourmet\n" +
                "½ cucharadita de Ajo en Polvo Gourmet\n" +
                "½ cucharadita de Pimienta Cayena Gourmet (opcional)\n" +
                "100 gr de hojas de espinacas, picadas fino\n" +
                "2 cucharadas de queso parmesano\n" +
                "Sal de Mar Gourmet a gusto\n" +
                "*Este plato puede ser vegano si se utiliza el Caldo en Polvo Más Natural de Verduras y se reemplaza el queso por opción vegana.");
        A3.putExtra("preparacion",preparacion="Calentar el aceite en una olla a fuego medio. Agregar la cebolla junto a la zanahoria y cocinar hasta que las verduras estén blandas.\n" +
                "Añadir los tomates en cubos y cocinar por 8 minutos.\n" +
                "Incorporar el agua hirviendo y el Caldo de Verduras, revolver.\n" +
                "Agregar los porotos y llevar la preparación a ebullición.\n" +
                "Añadir los condimentos y probar por si necesitara más sal.\n" +
                "Incorporar la espinaca y el parmesano, cocinar la sopa por 5 minutos más.\n" +
                "Servir caliente, acompañar con más parmesano y pan.");
        A3.putExtra("es",es="Almuerzo");
        startActivity(A3);
    }
    public void Almuerzo4(View view){
        Intent A4 = new Intent(Almuerzos.this,Receta.class);
        A4.putExtra("ingredientes",ingredientes="4 bistec de carne (lomo liso, pollo ganso o el que les guste)\n" +
                "2 cucharaditas de Pimienta Ajo Gourmet\n" +
                "2 cucharaditas de Sal de Mar Gourmet\n" +
                "1 cucharada de aceite\n" +
                "1 cucharadita de mantequilla\n" +
                " \n" +
                "\n" +
                "Para las espinacas a la crema:\n" +
                "\n" +
                "500 gr de hojas de espinacas, lavadas\n" +
                "1 cucharada de aceite\n" +
                "½ cebolla pequeña, picada\n" +
                "¾ taza de crema espesa\n" +
                "¼ cucharadita de Nuez Moscada Molida Gourmet\n" +
                "2 a 3 cucharadas de queso parmesano, opcional\n" +
                "Sal de Mar Gourmet a gusto\n" +
                " \n" +
                "\n" +
                "Para los champiñones:\n" +
                "\n" +
                "400 gr de champiñones cortados en mitades\n" +
                "1 cucharada de aceite\n" +
                "Sal de Mar Gourmet a gusto");
        A4.putExtra("preparacion",preparacion="Aliñar la carne con Sal de Mar y Pimienta Ajo, al menos 30 minutos antes de cocinarla.\n" +
                "Picar la espinacas lo más pequeña posible.\n" +
                "Calentar el aceite en una olla. Agregar la cebolla y cocinar hasta que esté blanda y transparente.\n" +
                "Incorporar las hojas de espinacas y cocinar por 30 segundos. Añadir la crema, Nuez Moscada, queso y Sal de Mar a gusto. Cocinar hasta que la mezcla esté cremosa.\n" +
                "Para los champiñones, calentar una cucharada de aceite en una sartén. Agregar los champiñones y cocinar hasta que estén dorados. Aliñar con Sal de Mar.\n" +
                "Finalmente, calentar la cucharada de aceite restante junto a la mantequilla en una plancha o sartén. Una vez que esté bien caliente, poner la carne por un lado. Cuando esté dorada por ese lado y empiecen a salir jugos por arriba, dar vuelta. Cocinar hasta que esté dorada por ambos lados.\n" +
                "Servir la carne con las espinacas a la crema y los champiñones saltados.");
        A4.putExtra("es",es="Almuerzo");
        startActivity(A4);
    }
    public void Almuerzo5(View view){
        Intent A5 = new Intent(Almuerzos.this,Receta.class);
        A5.putExtra("ingredientes",ingredientes="1 cda aceite de oliva\n" +
                "½ cebolla morada\n" +
                "1 cda Pimentón Ahumado Gourmet\n" +
                "½ cdta Pimienta Ajo Gourmet\n" +
                "Pizca Sal de Mar Ahumada Gourmet\n" +
                "Sal de Mar Gourmet a gusto\n" +
                "Pimienta Negra Molida Gourmet a gusto\n" +
                "2 dientes de ajo\n" +
                "300g passata o pulpa de tomate\n" +
                "250g carne molida\n" +
                "200g porotos negros\n" +
                "200g choclo desgranado\n" +
                " \n" +
                "\n" +
                "Para servir:\n" +
                "\n" +
                "Arroz cocido\n" +
                "Chips de tortilla");
        A5.putExtra("preparacion",preparacion="Precalentar una olla a fuego medio, agregar el aceite de oliva, la cebolla morada, Pimentón Ahumado, Pimienta Ajo, Sal Ahumada, Sal de Mar y Pimienta Molida. Cocinar la cebolla por 10-15 minutos o hasta que se dore.\n" +
                "Agregar los dos dientes de ajo picados finamente o rallados. Mezclar por 1 minuto para cocinarlo.\n" +
                "Agregar la carne y desmenuzarla con una cuchara en la olla. Mezclar.\n" +
                "Agregar la passata o pulpa de tomate y mezclar. Agregar también los porotos y choclo. Ajustar nivel de sal.\n" +
                "Dejar que hierva a fuego medio-bajo hasta que haya espesado.\n" +
                "Servir caliente con tortillas y arroz.");
        A5.putExtra("es",es="Almuerzo");
        startActivity(A5);
    }
    public void Almuerzo6(View view){
        Intent A6 = new Intent(Almuerzos.this,Receta.class);
        A6.putExtra("ingredientes",ingredientes="1 cda aceite de oliva\n" +
                "3 trutros de pollo\n" +
                "1 diente de ajo rallado finamente o Ajo Granulado Gourmet\n" +
                "Jugo 1/2 limón\n" +
                "Jugo 1 naranja\n" +
                "Ralladura 1/2 naranja\n" +
                "3 cdas miel\n" +
                "1 cdta Pimienta Limón Gourmet\n" +
                "1 cdta Sal Rosada del Himalaya Gourmet\n" +
                "1 cda mostaza");
        A6.putExtra("preparacion",preparacion="Precalentar un sartén a fuego medio. Agregar el aceite de oliva y sellar las piezas de pollo por ambos lados hasta que esté bien dorado.\n" +
                "Mientras sellamos el pollo, mezcla el resto de los ingredientes en un bowl.\n" +
                "Cuando el pollo esté listo, transferirlo a una fuente apta para horno. Agregar la mezcla que hicimos aparte encima del pollo y los restos de la sartén para recuperar el sabor dorado.\n" +
                "Hornear por 30 minutos a 180°C o hasta que el interior del pollo haya llegado a 73°C.\n" +
                "Servir inmediatamente con ensalada, arroz o papas.");
        A6.putExtra("es",es="Almuerzo");
        startActivity(A6);
    }
    public void Regresar(View view){
        Intent v = new Intent(Almuerzos.this,MainActivity.class);
        startActivity(v);
    }
}