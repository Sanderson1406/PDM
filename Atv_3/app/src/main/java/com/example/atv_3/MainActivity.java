package com.example.atv_3;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

/* AULA 3
public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style);
        TextView text1 = findViewById(R.id.nome);
        TextView text2 = findViewById(email);
        Button ok = findViewById(R.id.button);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, String.format("%s - %s",
                        text1.getText().toString(),
                        text2.getText()), Toast.LENGTH_LONG).show();
            }
        });

    }
}*/


//ATIVIDADE 3
public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style);
        TextView text1 = findViewById(R.id.nome);
        TextView text2 = findViewById(R.id.senha);
        Button ok = findViewById(R.id.button);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text1.getText().toString().equals("admin") && text2.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "Login efetuado com sucesso", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Usuário ou senha incorretos", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
