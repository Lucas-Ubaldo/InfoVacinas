package com.example.testevacina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Adulto extends AppCompatActivity {

    ImageView btnVoltarAdulto;
    TextView txtInfoAdulto1;
    LinearLayout layout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adulto);
        btnVoltarAdulto = findViewById(R.id.btnVoltarAdulto);

        txtInfoAdulto1 = findViewById(R.id.txtInfoAdulto1);
        layout1 = findViewById(R.id.layout1);

        //Ao clicar no botão de voltar no canto superior esquerdo, irá retornar para tela principal
        btnVoltarAdulto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                overridePendingTransition(R.anim.mover_esquerda, R.anim.fade_out);
            }
        });


    }

    //Classe para expandir o cardview junto com o conteúdo
    public void expand1 (View view){
        int v = (txtInfoAdulto1.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout1, new AutoTransition());
        txtInfoAdulto1.setVisibility(v);

    }

}