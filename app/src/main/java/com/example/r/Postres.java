package com.example.r;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Postres extends AppCompatActivity {
    private Button btnVolver;
    private ImageButton P1;
    private ImageButton P2;
    private ImageButton P3;
    private ImageButton P4;
    private ImageButton P5;
    private ImageButton P6;
    private String ingredientes;
    private String preparacion;
    private String es;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postres);
        P1 = (ImageButton) findViewById(R.id.P1);
        P2 = (ImageButton) findViewById(R.id.P2);
        P3 = (ImageButton) findViewById(R.id.P3);
        P4 = (ImageButton) findViewById(R.id.P4);
        P5 = (ImageButton) findViewById(R.id.P5);
        P6 = (ImageButton) findViewById(R.id.P6);
    }
    public void Postre1(View view){
        Intent p1 = new Intent(Postres.this,Receta.class);
        p1.putExtra("ingredientes", ingredientes ="1 paquete de Mezcla Lista para Panqueques Gourmet\n" +
                "275 ml de agua\n" +
                "2 huevos\n" +
                "20 gr de mantequilla derretida\n" +
                "½ taza de Chips De Chocolate Gourmet\n" +
                "Frutillas y plátano para servir\n" +
                "Salsa Fudge\n" +
                "\n" +
                "200 gr de Cobertura de Chocolate Semi Amargo Gourmet\n" +
                "1 taza de Salsa De Caramelo Gourmet");
        p1.putExtra("preparacion", preparacion ="Agregar el contenido de la Mezcla Lista para Panqueques Gourmet en un bol. Incorporar el resto de los ingredientes del waffle (menos la fruta) y con un batidor de mano mezclar hasta tener una mezcla homogénea.\n" +
                "Calentar la wafflera. Pincelar levemente con aceite y poner 2 a 3 cucharadas por waffle. Tapar y cocinar por 4 a 5 minutos o hasta que estén dorados.\n" +
                "Para la salsa fudge, poner la Cobertura de Chocolate Semi Amargo Gourmet junto a la Salsa De Caramelo Gourmet en un bol. Derretir a baño maría o en el microondas a potencia baja por intervalos de 30 segundos, hasta que la mezcla esté homogénea.\n" +
                "Servir los waffles con la salsa fudge caliente y las frutas.");
        p1.putExtra("es",es="Postre");
        startActivity(p1);
    }
    public void Postre2(View view){
        Intent p2 = new Intent(Postres.this,Receta.class);
        p2.putExtra("ingredientes", ingredientes ="½ taza de azúcar\n" +
                "3 tazas de leche de almendras o de coco\n" +
                "6 cucharadas de maple o agave\n" +
                "½ taza de maicena\n" +
                "3 cucharadas de agua\n" +
                "1 cucharadita de Esencia de Vainilla Gourmet");
        p2.putExtra("preparacion", preparacion ="Poner el azúcar en una olla y cocinar a fuego medio alto hasta tener un caramelo. Vaciar el caramelo en 4 fuentecitas o potes individuales (resistentes al calor). Reservar.\n" +
                "En una olla, calentar la leche vegetal junto al maple o agave. Por otro lado, disolver la maicena en agua y luego agregar a la olla con la leche. Cocinar revolviendo hasta que la mezcla haya espesado. Apagar el fuego, agregar la esencia de vainilla, revolver bien y dividir en la potes con el caramelo.\n" +
                "Refrigerar al menos 3 horas. Para servir, pasar un cuchillo por los bordes y luego dar vuelta sobre un plato.");
        p2.putExtra("es",es="Postre");
        startActivity(p2);
    }
    public void Postre3(View view){
        Intent p3 = new Intent(Postres.this,Receta.class);
        p3.putExtra("ingredientes", ingredientes ="3 tazas de harina todo uso\n" +
                "2 cucharaditas de Polvos de Hornear Gourmet\n" +
                "2 cucharaditas de Canela en Polvo Gourmet\n" +
                "¼ cucharadita de Sal de Mar Gourmet\n" +
                "3 huevos\n" +
                "1 taza de azúcar blanca\n" +
                "½ taza de azúcar rubia\n" +
                "1 ½ taza de aceite de maravilla o canola\n" +
                "1 cucharadita de Esencia de Vainilla Gourmet\n" +
                "3 tazas de manzanas en cubos pequeños (roja o verde)\n" +
                "2/3 taza de nueces picadas (opcional)");
        p3.putExtra("preparacion", preparacion ="Calentar el horno a 180°C. Enmantequillar y enharinar un molde de queque con hoyo al medio.\n" +
                "Cernir juntos la harina, polvos de hornear, canela y la sal. Reservar. Batir los huevos con ambas azúcares hasta tener una mezcla cremosa y pálida. Agregar el aceite y la vainilla, batir hasta integrar. Agregar la mezcla de harina e integrar usando una espátula. Incorporar los cubos de manzanas y nueces en forma envolvente.\n" +
                "Vaciar la mezcla en el molde preparado. Dar pequeños golpes al molde sobre el mesón, para disolver burbujas en el batido. Hornear por 60 a 70 minutos o hasta que al meter un palito al medio, éste salga seco. Dejar enfriar por 10 minutos y luego dar vuelta en un plato. Dejar enfriar por completo y espolvorear azúcar flor al servir.");
        p3.putExtra("es",es="Postre");
        startActivity(p3);
    }
    public void Postre4(View view){
        Intent p4 = new Intent(Postres.this,Receta.class);
        p4.putExtra("ingredientes", ingredientes ="3 tazas de harina\n" +
                "1 cdta de Polvos de Hornear Gourmet\n" +
                "1 cdta de Bicarbonato Gourmet\n" +
                "¼ cdta de Sal de Mar Gourmet\n" +
                "225 gr de mantequilla, blanda\n" +
                "1 ¼ taza de azúcar\n" +
                "3 huevos\n" +
                "¾ taza de Cacao Amargo en Polvo Gourmet\n" +
                "2/3 taza de agua hirviendo\n" +
                "150 ml de crema ácida o yogurt natural\n" +
                "2/3 taza de Chips de Chocolate Gourmet\n" +
                "Ingredientes para ganache de chocolate (opcional):\n" +
                "2/3 taza de Cobertura de Chocolate Semi Amargo Gourmet\n" +
                "2/3 taza de crema");
        p4.putExtra("preparacion", preparacion ="Calentar el horno a 180°C. Enantequillar y harinar un molde rectangular de unos 20 x 15 cm o un molde redondo regular, reservar.  Opcionalmente, se puede enharinar el molde con un poco de cacao amargo en polvo para darle un mejor sabor y look a la preparación final.\n" +
                "Cernir juntos la harina con los polvos, bicarbonato y sal.\n" +
                "Batir la mantequilla con el azúcar hasta tener una mezcla cremosa. Agregar los huevos de a uno, batiendo muy bien antes de agregar el siguiente.\n" +
                "Disolver el cacao en polvo en el agua hirviendo, formando una pasta. Incorporar la pasta de a poco en la mezcla de mantequilla/huevos, sin dejar de batir hasta integrar. Añadir la mezcla de harina y con una espátula integrar, por último, agregar la crema ácida y los chips de chocolate.\n" +
                "Poner la mezcla en el molde preparado. Hornear por 50 a 60 minutos o hasta que la meter un palito al medio, éste salga seco. Dejar reposar por 10 minutos y luego desmoldar en un plato de servir.\n" +
                " \n" +
                "\n" +
                "¿Cómo hacer ganache de chocolate?\n" +
                "Para el ganache, calentar la crema a punto de ebullición. Vaciar sobre el la cobertura de chocolate, esperar 30 segundo y luego revolver hasta tener una mezcla homogénea. Una vez que el queque esté frío, glasear con el ganache de chocolate.");
        p4.putExtra("es",es="Postre");
        startActivity(p4);
    }
    public void Postre5(View view){
        Intent p5 = new Intent(Postres.this,Receta.class);
        p5.putExtra("ingredientes", ingredientes ="¾ taza de azúcar\n" +
                "¼ taza de agua\n" +
                " \n" +
                "\n" +
                "Ingredientes para Budín\n" +
                "1 litro de leche para la infusión (guardar un poco para remojar el pan)\n" +
                "1 marraqueta (unos 70 gr aprox)\n" +
                "5 huevos\n" +
                "1 taza de azúcar\n" +
                "1 1/2 cucharadita de Esencia de Vainilla Gourmet\n" +
                "2 palos de Canela Entera Gourmet");
        p5.putExtra("preparacion", preparacion ="Para caramelizar el molde, poner el azúcar y el agua en una olla de fondo grueso. Cocinar, sin revolver hasta tener un caramelo rubio oscuro. Sacar del fuego y vaciar sobre un molde rectangular grande (15 x 35 cm). Mover el molde, para distribuir el caramelo por toda la superficie (tomar el molde con un paño para no quemarse). Reservar.\n" +
                "\n" +
                " \n" +
                "\n" +
                "¿Cómo hacer el Budín?\n" +
                "Calentar el horno a 180°C.\n" +
                "Para el budín, remojar la marraqueta en un poco de leche (sacar del litro que se va a usar). En un bowl poner los huevos con el azúcar y mezclar con un batidor de mano.  Aparte, calentar la leche y agregar la Esencia de Vainilla Gourmet y los palos de Canela Entera Gourmet, dejar infusionar por 15 minutos, colar y luego agregar a la mezcla de huevo con azúcar hasta que todo quede bien integrado. Por último, agregar la marraqueta remojada y desarmada. Vaciar la mezcla en el molde caramelizado.\n" +
                "Poner el molde dentro de una budinera grande con agua (el budín se debe cocinar a baño maría) y hornear por 1 ½ horas o hasta que esté cuajado. Dejar enfriar y refrigerar por al menos 8 horas antes de servir.");
        p5.putExtra("es",es="Postre");
        startActivity(p5);
    }
    public void Postre6(View view){
        Intent p6 = new Intent(Postres.this,Receta.class);
        p6.putExtra("ingredientes", ingredientes ="1 ½ tazas de harina sin polvos de hornear\n" +
                "½ taza de almidón de maíz\n" +
                "½ cdta de Polvos de Hornear Gourmet\n" +
                "200 gr de mantequilla sin sal, blanda\n" +
                "1 cdta de Esencia de Vainilla Gourmet\n" +
                "3/4 taza de azúcar flor");
        p6.putExtra("preparacion", preparacion ="\n" +
                "Precalentar el horno 180°C. Mezclar la harina con el almidón de maíz y Polvos de Hornear Gourmet. Batir la mantequilla, agregar la mezcla anterior de harina, almidón y polvos, y añadir también el resto de los ingredientes. Incorporar hasta tener una masa. Refrigerar tapada en alusa plast o una bolsa por al menos 2 horas.\n" +
                "Extender la masa con un uslero sobre el mesón levemente enharinado.\n" +
                "Cortar círculos de unos 4 cm o del diámetro deseado, o también con cortadores de figuras y colocarlos en una lata enmantequillada o forrada con papel mantequilla o silpat.\n" +
                "Hornear las galletas por 10 a 12 minutos o hasta que estén levemente doradas. Dejar que enfríen antes de desmoldar. Decorar con azúcar flor.");
        p6.putExtra("es",es="Postre");
        startActivity(p6);
    }
    public void Volver(View view){
        Intent volver = new Intent(Postres.this,MainActivity.class);
        startActivity(volver);
    }
}