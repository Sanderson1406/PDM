package com.example.atv_6;

import static java.lang.Float.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        inicializacao();
    }

    protected void inicializacao() {
        EditText nome = findViewById(R.id.id_name);
        EditText matricula = findViewById(R.id.id_matricula);
        EditText nota1 = findViewById(R.id.id_nota1);
        EditText nota2 = findViewById(R.id.id_nota2);

        Button calcular = findViewById(R.id.id_calcular);


        String nota12 = nota1.getText().toString();
        String nota22 = nota2.getText().toString();



        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome1 = nome.getText().toString();
                String matricula1 = matricula.getText().toString();
                double rpst = calcularM(nota12, nota22);
                mandar(nome1, matricula1, rpst);
            }
        });
    };
    protected double calcularM(String nota1, String nota2) {
        float nt1 = Float.parseFloat(nota1);
        float nt2 = Float.parseFloat(nota2);

        double resposta = (nt1 * 0.4) + (nt2 * 0.6);
        return resposta;
    };

    protected void mandar(String nome1, String matricula1, double rpst) {
        Intent meuIntent = new Intent(this, Activity2.class);
        meuIntent.putExtra("nome_us", String.valueOf(nome1));
        meuIntent.putExtra("matricula_us", String.valueOf(matricula1));
        meuIntent.putExtra("nota_us", rpst);

        startActivity(meuIntent);
    };


}