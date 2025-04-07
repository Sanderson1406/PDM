package com.example.atividade_2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style);
        TextView textView1 = findViewById(R.id.text11);
        TextView textView2 = findViewById(R.id.text2);
        TextView textView3 = findViewById(R.id.text3);

        textView1.setText("PROGRAMAÇÃO PARA DISPOSITIVOS MOVEIS");
        textView2.setText("Linear Layout");
        textView3.setText("Sanderson Machado - 22301449");
    }
}
