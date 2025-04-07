package com.example.aula_5;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style);

        EditText none = findViewById(R.id.editTextText);
        EditText cpf = findViewById(R.id.editTextText2);
        EditText email = findViewById(R.id.editTextTextEmailAddress);
        EditText fone = findViewById(R.id.editTextPhone);

        Button salvar = findViewById(R.id.salvar);
        Button cancelar = findViewById(R.id.button2);

        TextView resultado = findViewById(R.id.resultado);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeRecebido = none.getText().toString();
                String cpfRecebido = cpf.getText().toString();
                String emailRecebido = email.getText().toString();
                String telefoneRecebido = fone.getText().toString();

                resultado.setText("Os dados informados foram: " + nomeRecebido + cpfRecebido + emailRecebido + telefoneRecebido);
            }
        });

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}


