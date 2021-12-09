package com.example.r;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.r.Adaptadores.ListViewPersonasAdapter;
import com.example.r.Models.Persona;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.UUID;

public class Firebase extends AppCompatActivity {

    private ArrayList<Persona> listPersona = new ArrayList<Persona>();
    ArrayAdapter<Persona> arrayAdapterPersona;
    ListViewPersonasAdapter listViewPersonasAdapter;
    LinearLayout linearLayoutEditar;
    ListView listViewPersonas;
    EditText inputNombre , inputTelefono;
    Button btnCancelar;

    Persona personaSeleccionada;
    FirebaseDatabase firebasedatabase;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);

        inputNombre = findViewById(R.id.inputNombre);
        inputTelefono = findViewById(R.id.inputTelefono);
        btnCancelar = findViewById(R.id.btnCancelar);


        listViewPersonas =findViewById(R.id.ListViewPersona);
        linearLayoutEditar = findViewById(R.id.linearLayoutEditar);

        listViewPersonas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                personaSeleccionada = (Persona) parent.getItemAtPosition(position);
                inputNombre.setText(personaSeleccionada.getNombres());
                inputTelefono.setText(personaSeleccionada.getTelefono());

                linearLayoutEditar.setVisibility(View.VISIBLE);
            }
        });
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayoutEditar.setVisibility(View.GONE);
                personaSeleccionada=null;
            }
        });


        inicializarFireBase();
        listarPersonas();
    }
    private void inicializarFireBase(){
        FirebaseApp.initializeApp(this);
        firebasedatabase = FirebaseDatabase.getInstance();
        databaseReference = firebasedatabase.getReference();
    }
    private void listarPersonas(){
        databaseReference.child("Personas").orderByChild("timestamp").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                listPersona.clear();
                for(DataSnapshot objSnapshot :dataSnapshot.getChildren() ){
                    Persona p = objSnapshot.getValue(Persona.class);
                    listPersona.add(p);

                }
                listViewPersonasAdapter = new ListViewPersonasAdapter(Firebase.this,listPersona);



                //arrayAdapterPersona = new ArrayAdapter<Persona>( Firebase.this,android.R.layout.simple_list_item_1,listPersona
               // );
                listViewPersonas.setAdapter(listViewPersonasAdapter);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.crud_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String nombres = inputNombre.getText().toString();
        String telefono = inputTelefono.getText().toString();

        switch (item.getItemId()){
            case R.id.agregar:
                insertar();
                break;
            case R.id.Guardar:
                if(personaSeleccionada != null){
                    if(validarInputs()==false){
                        Persona p = new Persona();
                        p.setId(personaSeleccionada.getId());
                        p.setNombres(nombres);
                        p.setTelefono(telefono);
                        p.setFechaRegistro(personaSeleccionada.getFechaRegistro());
                        p.setTimestamp(personaSeleccionada.getTimestamp());
                        databaseReference.child("Personas").child(p.getId()).setValue(p);
                        Toast.makeText(this,"Actualizado Correctamente",Toast.LENGTH_LONG).show();
                        linearLayoutEditar.setVisibility(View.GONE);
                        personaSeleccionada = null;

                    }
                }else{
                    Toast.makeText(this,"Seleccione una Persona",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.Eliminar:
                if(personaSeleccionada!= null){
                    Persona p2 = new Persona();
                    p2.setId(personaSeleccionada.getId());
                    databaseReference.child("Personas").child(p2.getId()).removeValue();
                    linearLayoutEditar.setVisibility(View.GONE);
                    personaSeleccionada=null;
                    Toast.makeText(this,"Eliminado Correctamente",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"Seleccione persona para eliminar",Toast.LENGTH_LONG).show();
                }
                break;

        }

        return super.onOptionsItemSelected(item);
    }
    public void insertar(){
        AlertDialog.Builder mBuielder = new AlertDialog.Builder(Firebase.this);
        View mView = getLayoutInflater().inflate(R.layout.insertar,null);
        Button btnInsertar = (Button)mView.findViewById(R.id.btnInsertar);
        final EditText mInputNombres =(EditText) mView.findViewById(R.id.inputNombre);
        final EditText mInputTelefono = (EditText) mView.findViewById(R.id.inputTelefono);

        mBuielder.setView(mView);
        final AlertDialog dialog = mBuielder.create();
        dialog.show();

        btnInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nombres = mInputNombres.getText().toString();
                String Telefono = mInputTelefono.getText().toString();
                if(Nombres.isEmpty()|| Nombres.length()<3){
                    showError(mInputNombres, "Nombre Invalido (Min. 4 letras");
                }else if(Telefono.isEmpty()|| Telefono.length()<9){
                    showError(mInputTelefono, "Numero Invalido (Min. 9 numeros");
                }else{
                    Persona p = new Persona();
                    p.setId(UUID.randomUUID().toString());
                    p.setNombres(Nombres);
                    p.setTelefono(Telefono);
                    p.setFechaRegistro(getFechaNormal(getFechaMilisegundo()));
                    p.setTimestamp(getFechaMilisegundo()*-1);
                    databaseReference.child("Personas").child(p.getId()).setValue(p);
                    Toast.makeText(Firebase.this , "Registrado Correctamente",Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                }
            }
        });
    }
    public void showError(EditText input , String s){
        input.requestFocus();
        input.setError(s);
    }
    public long getFechaMilisegundo(){
        Calendar calendar = Calendar.getInstance();
        long tiempoUnix = calendar.getTimeInMillis();
        return tiempoUnix;
    }
    public String getFechaNormal(long fms){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT-4"));
        String fecha = sdf.format(fms);
        return fecha;
    }
    public boolean validarInputs(){
        String nombre = inputNombre.getText().toString();
        String telefono = inputTelefono.getText().toString();
        if(nombre.isEmpty()|| nombre.length()<3){
            showError(inputNombre,"Nombre Invalido.(Min. 4 letras");
            return true;
        }else if(telefono.isEmpty()|| telefono.length()<9){
            showError(inputTelefono, "Telefono Invalido (Min. 9 numeros");
            return true;
        }else{
            return false;
        }
    }
}