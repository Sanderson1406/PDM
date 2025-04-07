package com.example.atv_5;

import static com.example.atv_5.R.id.nota1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
        setTitle("Calcular Nota");
        setContentView(R.layout.activity_main);

        EditText nome = findViewById(R.id.nomeAluno);
        EditText matricula = findViewById(R.id.MatriculaAluno);
        EditText nota1 = findViewById(R.id.nota1);
        EditText nota2 = findViewById(R.id.nota2);

        Button calcular = findViewById(R.id.calcular);
        TextView resultado = findViewById(R.id.resultado);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeRecebido = nome.getText().toString();
                String matriculaRecebida = matricula.getText().toString();
                String nota_1 = nota1.getText().toString();
                String nota_2 = nota2.getText().toString();

                float peso1 = 0.4F;
                float peso2 = 0.6F;

                float nota1recebida = Float.parseFloat(nota_1);
                float nota2recebida = Float.parseFloat(nota_2);

                float resultador = (nota1recebida * peso1) + (nota2recebida * peso2);

                resultado.setText("A nota final do aluno " + nomeRecebido + ", com matrícula " + matriculaRecebida + ", foi de: " + resultador);
            }
        });
    }
}