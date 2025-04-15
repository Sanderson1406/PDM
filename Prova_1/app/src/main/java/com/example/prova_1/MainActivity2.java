package com.example.prova_1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        mostrarResultado();
    }

    private void mostrarResultado() {
        result = findViewById(R.id.resultado_id);

        int nota = calcularNota();

        result.setText("A sua nota foi: " + nota);
    }

    private int calcularNota() {
        int nota = 0;
        String qts1 = getIntent().getStringExtra("resposta_1");
        String qts2 = getIntent().getStringExtra("resposta_2");
        String qts3 = getIntent().getStringExtra("resposta_3");

        if (qts1.equals("Verdadeiro") && qts2.equals("Verdadeiro") && qts3.equals("Falso")) {
            nota = 10;
        } else if (qts1.equals("Falso") && qts2.equals("Verdadeiro") && qts3.equals("Falso")) {
            nota = 6;
        } else if (qts1.equals("Verdadeiro") && qts2.equals("Falso") && qts3.equals("Falso")) {
            nota = 6;
        } else if (qts1.equals("Verdadeiro") && qts2.equals("Verdadeiro") && qts3.equals("Verdadeiro")) {
            nota = 6;
        } else if (qts1.equals("Falso") && qts2.equals("Falso") && qts3.equals("Verdadeiro")) {
            nota = 0;
        } else {
            nota = 3;
        }
        return nota;
    }
}