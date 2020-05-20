package br.com.aprendainglesfanap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class LicaoFrutasActivity extends AppCompatActivity implements View.OnClickListener {

    Button questionario1;
    MediaPlayer mediaPlayer;
    ImageButton imgBtn_maca, imgBtn_uva, imgBtn_melancia, imgBtn_coco, imgBtn_abacaxi, imgBtn_laranja;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_licao_frutas);

        questionario1 = (Button) findViewById(R.id.btn_questionario1);
        questionario1.setOnClickListener(this);

        imgBtn_maca = (ImageButton) findViewById(R.id.imgBtn_maca);
        imgBtn_maca.setOnClickListener(this);

        imgBtn_uva = (ImageButton) findViewById(R.id.imgBtn_uva);
        imgBtn_uva.setOnClickListener(this);

        imgBtn_melancia = (ImageButton) findViewById(R.id.imgBtn_melancia);
        imgBtn_melancia.setOnClickListener(this);

        imgBtn_coco = (ImageButton) findViewById(R.id.imgBtn_coco);
        imgBtn_coco.setOnClickListener(this);

        imgBtn_abacaxi = (ImageButton) findViewById(R.id.imgBtn_abacaxi);
        imgBtn_abacaxi.setOnClickListener(this);

        imgBtn_laranja = (ImageButton) findViewById(R.id.imgBtn_laranja);
        imgBtn_laranja.setOnClickListener(this);


    }
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.imgBtn_maca:
                mediaPlayer = MediaPlayer.create(LicaoFrutasActivity.this, R.raw.apple);
                mediaPlayer.start();
                break;

            case R.id.imgBtn_uva:
                mediaPlayer = MediaPlayer.create(LicaoFrutasActivity.this, R.raw.uva);
                mediaPlayer.start();
                break;

            case R.id.imgBtn_melancia:
                mediaPlayer = MediaPlayer.create(LicaoFrutasActivity.this, R.raw.melancia);
                mediaPlayer.start();
                break;

            case R.id.imgBtn_coco:
                mediaPlayer = MediaPlayer.create(LicaoFrutasActivity.this, R.raw.coco);
                mediaPlayer.start();
                break;

            case R.id.imgBtn_abacaxi:
                mediaPlayer = MediaPlayer.create(LicaoFrutasActivity.this, R.raw.abacaxi);
                mediaPlayer.start();
                break;

            case R.id.imgBtn_laranja:
                mediaPlayer = MediaPlayer.create(LicaoFrutasActivity.this, R.raw.orange);
                mediaPlayer.start();
                break;

            case R.id.btn_questionario1:
                Intent questionario1 = new Intent(this, LicoesActivity.class);
                startActivity(questionario1);
                Toast.makeText(this, "Estamos trabalhando nisso ainda!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}