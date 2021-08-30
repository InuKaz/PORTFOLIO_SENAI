package com.example.horasappreborn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static Button Botao;
    public static EditText horas1;
    public static EditText horas2;
    public static EditText minutos1;
    public static EditText minutos2;
    public static TextView result;
    public static int hora;
    public static int hora2;
    public static int minuto;
    public static int minuto2;
    public static int horasoma;
    public static int minutosoma;
    public static boolean test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horas1 = (EditText) findViewById(R.id.horas1);
        horas2 = (EditText) findViewById(R.id.horas2);
        minutos1 = (EditText) findViewById(R.id.minutos1);
        minutos2 = (EditText) findViewById(R.id.minutos2);
        result = (TextView) findViewById(R.id.result);
        Botao = (Button) findViewById(R.id.Botao);

        Botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
            }
        });


    }
    public static void calc(){
        test = true;
        hora = Integer.valueOf(horas1.getText().toString());
        hora2 = Integer.valueOf(horas2.getText().toString());
        minuto = Integer.valueOf(minutos1.getText().toString());
        minuto2 = Integer.valueOf(minutos2.getText().toString());

        horasoma = hora + hora2;
        minutosoma = minuto + minuto2;

        while (test){
            if(minutosoma > 59){
                minutosoma -= 60;
                horasoma++;
            } else{
                test = false;
            }

            String minutos, horas;

            if (minutosoma < 10) {
                minutos = "0" + minutosoma;
            } else {
                minutos = ""+minutosoma;
            }

            if (horasoma < 10) {
                horas = "0" + horasoma;
            } else {
                horas = "" + horasoma;
            }

            result.setText(horas + ":" + minutos);
        }
    }
}