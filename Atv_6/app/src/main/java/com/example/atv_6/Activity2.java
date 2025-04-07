package com.example.atv_6;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);

        TextView response = findViewById(R.id.id_resultado);

        String nome_recebido = getIntent().getStringExtra("nome_us");
        String matricula_recebido = getIntent().getStringExtra("matricula_us");
        double nota_recebdia = getIntent().getDoubleExtra("nota_us", 0.0);

        response.setText("Bem-vindo aluno " + nome_recebido + " Matrícula " + matricula_recebido + " Sua nota final é: " + nota_recebdia);
    }
}
