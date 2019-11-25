package br.com.aprendainglesfanap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class LicoesActivity extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);getSupportActionBar().hide();//FULLSCREEN
        setContentView(R.layout.activity_licoes);

        Button fruta = (Button) findViewById(R.id.btn_fruta);
        fruta.setOnClickListener(this);
        fruta.setEnabled(false);

        Button animal = (Button) findViewById(R.id.btn_animal);
        animal.setOnClickListener(this);
        animal.setEnabled(false);

        Button parente = (Button) findViewById(R.id.btn_parente);
        parente.setOnClickListener(this);
        parente.setEnabled(false);

        Button numero = (Button) findViewById(R.id.btn_numero);
        numero.setOnClickListener(this);
    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btn_fruta:
                mediaPlayer = MediaPlayer.create(this, R.raw.lesson2);
                mediaPlayer.start();
                Intent intentFruta = new Intent(this, LicaoFrutasActivity.class);
                startActivity(intentFruta);
                break;

            case R.id.btn_animal:
                mediaPlayer = MediaPlayer.create(this, R.raw.lesson3);
                mediaPlayer.start();
                Intent intentAnimal = new Intent(this, LicaoAnimaisActivity.class);
                startActivity(intentAnimal);
                break;

            case R.id.btn_parente:
                Intent intentParente = new Intent(this, LicaoParentesActivity.class);
                startActivity(intentParente);
                break;

            case R.id.btn_numero:
                mediaPlayer = MediaPlayer.create(this, R.raw.lesson01);
                mediaPlayer.start();
                Intent intentNumero = new Intent(this, LicaoNumerosActivity.class);
                startActivity(intentNumero);
                break;
        }
    }
}
