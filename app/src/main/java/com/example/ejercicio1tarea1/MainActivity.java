package com.example.ejercicio1tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etDiavlo;
    private Button btnProceso;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        ContarVocales();
        /*
        cuando ustedes pasan parametros a una funcion o metodo tienen que tener en cuenta
        - tipos de datos primitivos : string, int , float, boolean,.....
        - Tipos de datos -> claes u objetos: Persona, Doctor,......
        - Como parametros -> otras funciones,.... como funciones anonimas
        - el metodo recibe la funcion o metodo y lo ejecuta en su procedimiento
        
         */
        //e Onlick solo funciona para esta funcion-------de boton
        //estan pasando como parametro la iumplementacion de una interfaz anonima
        //pasand a una funcionm otra funcion que se dene ejecutar..........
        /*
        btnProceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MostrarMensaje();

            }
        });
        +/
         */
        //Funciones Lambda, funcion de flecha, arrow functions------------
        btnProceso.setOnClickListener(view -> {
            MostrarMensaje();
            ContarVocales();
        });

    }
    private void inicializarVistas()
    {
        etDiavlo = findViewById(R.id.etDiavlo);
        btnProceso = findViewById(R.id.btnProceso);
    }
    private void MostrarMensaje()
    {
        /*
        ventana emergente en pantalla, pequeña y casual
        se muestra durante unos instantes, y es para mostrar algo
        en particular al usuario.......
        el componente se llama toast para configurarlo necesitas
        un metodo llamado.make text() que tiene una seria de parametros:
        - ambito o contexto de la pantalla donde se va a dibujar.
        - cadena de texto que deseas que se muestre al usuario.
        - Duracion de la ventana, esta configurada sobre 2 constantes ya establecidas
        finalmente para mostrar esa ventana tienen que usar un metodo llamado .show()
         */
        String mensaje = "";
        //Metodos y atibutos estaticos
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG ).show();
    }
    private  void ContarVocales()
    {
        for (int i = this.etDiavlo.length()-1; i >=0 ; i--) {
            etDiavlo=etDiavlo+this.etDiavlo.charAt(i);
        }
        switch (ContarVocales())
    {
        case 0 :
            char letraA = 'a';

            break;
        case 1 :
            char letraE = 'e';
            ++;
            break;
        case 2 :
            char letraI = 'i';
            i++;
            break;
        case 3 :
            char letraO = 'o';
            i++;
            break;
        case 4 :
            char letraU = 'u';
            ++;
            break;

    }

    }
}