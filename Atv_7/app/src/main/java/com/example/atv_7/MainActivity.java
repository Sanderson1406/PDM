package com.example.atv_7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private RadioGroup pergunta1;
    private RadioGroup pergunta2;
    private Button enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        start();
    }

    private void start() {
        pergunta1 = findViewById(R.id.id_pergunta1);
        pergunta2 = findViewById(R.id.id_pergunta2);

        enviar = findViewById(R.id.id_button);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salvarProva();
            }
        });

    }

    private void salvarProva() {
        String resposta1 = capturarResposta(pergunta1);
        String resposta2 = capturarResposta(pergunta2);

        Intent MainActivity2_tela = new Intent(this, com.example.atv_7.MainActivity2.class);
        MainActivity2_tela.putExtra("chaveResposta1", resposta1);
        MainActivity2_tela.putExtra("chaveResposta2", resposta2);

        startActivity(MainActivity2_tela);

    }

    private String capturarResposta(RadioGroup pergunta) {
        int opcao = pergunta.getCheckedRadioButtonId();
        RadioButton radioButtonSelecionado = findViewById(opcao);
        String resposta = radioButtonSelecionado.getText().toString();
        return resposta;
    }
}
