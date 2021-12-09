package com.example.r;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public class Pelota extends View implements SensorEventListener {
    Paint pincel = new Paint();
    int alto , ancho;
    int tamanio =40;
    int borde = 12;
    float ejex=0 , ejey=0, ejez=0;
    String X, Z, Y;


    public Pelota(Context interfaz) {
        super(interfaz);
        SensorManager smAdministrador = (SensorManager) getContext().getSystemService(Context.SENSOR_SERVICE);
        Sensor snsRotacion = smAdministrador.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        smAdministrador.registerListener(this,snsRotacion,SensorManager.SENSOR_DELAY_FASTEST);
        Display pantalla =((WindowManager)getContext().getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        ancho = pantalla.getWidth();
        alto = pantalla.getHeight();
    }

    @Override
    public void onSensorChanged(SensorEvent cambio) {
        ejex-= cambio.values[0];
        X = Float.toString(ejex);
        if(ejex<(tamanio+borde)){
            ejex = (tamanio+borde);
        }else if(ejex > (ancho-(tamanio+borde))){
            ejex = ancho-(tamanio+borde);
        }
        ejey+= cambio.values[1];
        Y=Float.toString(ejey);
        if(ejey<(tamanio+borde)){
            ejey = (tamanio+borde);
        }else if(ejey > (alto-tamanio-170)){
            ejey = alto-tamanio-170;
        }
        ejez += cambio.values[2];
        Z = String.format("%.2f",ejez);
        invalidate();


    }//{}

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
    @Override
    public void onDraw(Canvas lienzo) {
        pincel.setColor(Color.RED);
        lienzo.drawCircle(ejex,ejey,ejez+tamanio,pincel);
        pincel.setColor(Color.WHITE);
        pincel.setTextSize(25);
        lienzo.drawText("Agarrame!!",ejex-35,ejey+3,pincel);

    }
}
