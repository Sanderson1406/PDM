package com.example.atv_7;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        startTela();
    }

    private void startTela() {
        resultado = findViewById(R.id.id_resultado);
        int notaFinal = validar();

        if (notaFinal == 10) {
            resultado.setText("Parabéns, você tirou nota 10!");
        } else if (notaFinal == 5) {
            resultado.setText("Você tirou nota 5");
        } else {
            resultado.setText("Você errou as duas questões, sua nota é 0");
        }
    }

    private int validar() {
        String resposta1 = getIntent().getStringExtra("chaveResposta1");
        String resposta2 = getIntent().getStringExtra("chaveResposta2");

        if (resposta1.equals("D) Aegon") && resposta2.equals("A) Pedro - Apostolo")) {
            return 10;
        } else if (resposta1.equals("D) Aegon") || resposta2.equals("A) Pedro - Apostolo")) {
            return 5;
        }

        return 0;
    }
}