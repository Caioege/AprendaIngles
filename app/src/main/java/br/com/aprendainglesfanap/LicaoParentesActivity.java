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

public class LicaoParentesActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton img_familia,img_avo,img_avoo,img_irmaos,img_paiEfilho,img_maeEfilha;
    Button questionario3;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_licao_parentes);

        questionario3 = (Button) findViewById(R.id.btn_questionario3);
        questionario3.setOnClickListener(this);

        img_familia = (ImageButton) findViewById(R.id.img_familia);
        img_familia.setOnClickListener(this);

        img_avo = (ImageButton) findViewById(R.id. img_avo);
        img_avo.setOnClickListener(this);

        img_avoo = (ImageButton) findViewById(R.id.  img_avoo);
        img_avoo.setOnClickListener(this);

        img_irmaos = (ImageButton) findViewById(R.id.  img_irmaos);
        img_irmaos.setOnClickListener(this);

        img_maeEfilha = (ImageButton) findViewById(R.id.  img_maeEfilha);
        img_maeEfilha.setOnClickListener(this);

        img_paiEfilho = (ImageButton) findViewById(R.id.  img_paiEfilho);
        img_paiEfilho.setOnClickListener(this);

    }
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_questionario3:
                Intent questionario3 = new Intent(this, LicoesActivity.class);
                startActivity(questionario3);
                Toast.makeText(this, "Estamos trabalhando nisso ainda!", Toast.LENGTH_LONG).show();
                break;

            case R.id.img_familia:
                mediaPlayer = MediaPlayer.create(LicaoParentesActivity.this, R.raw.familia);
                mediaPlayer.start();
                break;
            case R.id.img_avo:
                mediaPlayer = MediaPlayer.create(LicaoParentesActivity.this, R.raw.avo);
                mediaPlayer.start();
                break;

            case R.id.img_avoo:
                mediaPlayer = MediaPlayer.create(LicaoParentesActivity.this, R.raw.avo);
                mediaPlayer.start();
                break;

            case R.id.img_paiEfilho:
                mediaPlayer = MediaPlayer.create(LicaoParentesActivity.this, R.raw.paeefilho);
                mediaPlayer.start();
                break;

            case R.id.img_maeEfilha:
                mediaPlayer = MediaPlayer.create(LicaoParentesActivity.this, R.raw.maeefilha);
                mediaPlayer.start();
                break;

            case R.id.img_irmaos:
                mediaPlayer = MediaPlayer.create(LicaoParentesActivity.this, R.raw.irmaos);
                mediaPlayer.start();
                break;

            case R.id.btn_questionario4:
                Intent questionario4 = new Intent(this, LicoesActivity.class);
                startActivity(questionario4);
                Toast.makeText(this, "Estamos trabalhando nisso ainda!", Toast.LENGTH_LONG).show();
                break;
        }

    }
}