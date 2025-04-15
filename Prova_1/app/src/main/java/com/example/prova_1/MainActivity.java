package com.example.prova_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private RadioGroup questao1;
    private RadioGroup questao2;
    private RadioGroup questao3;
    public Button enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        startScreen();
    }

    private void startScreen() {
        questao1 = findViewById(R.id.questao1_id);
        questao2 = findViewById(R.id.questao2_id);
        questao3 = findViewById(R.id.questão3_id);
        enviar = findViewById(R.id.calcular_id);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salvarProva();
            }
        });

    }

    private void salvarProva() {
        String resposta1 = capturarResposta(questao1);
        String resposta2 = capturarResposta(questao2);
        String resposta3 = capturarResposta(questao3);

        Intent MainActivity2_tela = new Intent(this, com.example.prova_1.MainActivity2.class);
        MainActivity2_tela.putExtra("resposta_1", resposta1);
        MainActivity2_tela.putExtra("resposta_2", resposta2);
        MainActivity2_tela.putExtra("resposta_3", resposta3);
        startActivity(MainActivity2_tela);
    }


    private String capturarResposta(RadioGroup pergunta) {
        int opcao = pergunta.getCheckedRadioButtonId();
        if (opcao == -1) {
            Toast.makeText(getApplicationContext(), "Selecione uma opção", Toast.LENGTH_LONG).show();
        }
        RadioButton radioButtonSelecionado = findViewById(opcao);
        String resposta = radioButtonSelecionado.getText().toString();
        return resposta;
    }
}