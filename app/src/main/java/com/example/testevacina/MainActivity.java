package com.example.testevacina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView btnAdulto, btnGestante, btnIndigena, btnCreditos, imgUsc;
    TextView txtSobreVacina1, txtSobreVacina2,txtSobreVacina3;
    LinearLayout layout1, layout2, layout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdulto = findViewById(R.id.btnAdulto);
        btnGestante = findViewById(R.id.btnGestante);
        btnIndigena = findViewById(R.id.btnIndigena);
        btnCreditos = findViewById(R.id.btnCreditos);
        imgUsc = findViewById(R.id.imgUsc);

        txtSobreVacina1 = findViewById(R.id.txtSobreVacina1);
        layout1 = findViewById(R.id.layout1);
        txtSobreVacina2 = findViewById(R.id.txtSobreVacina2);
        layout2 = findViewById(R.id.layout2);
        txtSobreVacina3 = findViewById(R.id.txtSobreVacina3);
        layout3 = findViewById(R.id.layout3);


        //Responsável para direcionar ao site da unisagrado ao clicar na logo da universidade.
        imgUsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent usc = new Intent(Intent.ACTION_VIEW, Uri.parse("https://unisagrado.edu.br"));
                startActivity(usc);
            }
        });

        //Responsável para abrir a tela onde contém conteúdo sobre vacinas para adultos junto com uma transição entre essas telas.
        btnAdulto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adulto = new Intent(getApplicationContext(), Adulto.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),R.anim.fade_in, R.anim.mover_direita);
                ActivityCompat.startActivity(MainActivity.this, adulto, activityOptionsCompat.toBundle());
                //startActivity(adulto);


            }
        });

        //Responsável para abrir a tela onde contém conteúdo sobre vacinas para indígenas junto com uma transição entre essas telas.
        btnIndigena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent indigena = new Intent(getApplicationContext(), Indigena.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),R.anim.fade_in, R.anim.mover_direita);
                ActivityCompat.startActivity(MainActivity.this, indigena, activityOptionsCompat.toBundle());
                //startActivity(indigena);
            }
        });

        //Responsável para abrir a tela onde contém conteúdo sobre vacinas para gestantes junto com uma transição entre essas telas.
        btnGestante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gestante = new Intent(getApplicationContext(), Gestante.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),R.anim.fade_in, R.anim.mover_direita);
                ActivityCompat.startActivity(MainActivity.this, gestante, activityOptionsCompat.toBundle());
                //startActivity(gestante);
            }
        });

        //Responsável para abrir a tela de créditos onde contém as informações do curso, dos integrantes, etc.
        btnCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent creditos = new Intent(getApplicationContext(), Creditos.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),R.anim.fade_in, R.anim.mover_direita);
                ActivityCompat.startActivity(MainActivity.this, creditos, activityOptionsCompat.toBundle());
                //startActivity(creditos)
            }
        });
    }

    //Classe do primeiro cardview, onde ao clicar neste card o conteúdo que está "invisível" irá aparecer e expandir
    public void expand1 (View view){
        int v = (txtSobreVacina1.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout1, new AutoTransition());
        txtSobreVacina1.setVisibility(v);

    }

    //Classe do segundo cardview
    public void expand2 (View view){
        int v = (txtSobreVacina2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout2, new AutoTransition());
        txtSobreVacina2.setVisibility(v);

    }

    //Classe do terceiro cardview
    public void expand3 (View view){
        int v = (txtSobreVacina3.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout3, new AutoTransition());
        txtSobreVacina3.setVisibility(v);

    }
}