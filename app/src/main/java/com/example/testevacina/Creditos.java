package com.example.testevacina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Creditos extends AppCompatActivity {

    ImageView btnVoltarCreditos;
    TextView txtInfoIntegrantes;
    LinearLayout layout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        txtInfoIntegrantes = findViewById(R.id.txtInfoIntegrantes);
        layout1 = findViewById(R.id.layout1);
        btnVoltarCreditos = findViewById(R.id.btnVoltarCreditos);

        //Botão para voltar para tela principal
        btnVoltarCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.mover_esquerda, R.anim.fade_out);
            }
        });

    }

    /*Classe para expandir o cardview junto com o conteúdo
    public void expand (View view){
        int v = (txtInfoIntegrantes.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout1, new AutoTransition());
        txtInfoIntegrantes.setVisibility(v);

    } */
}