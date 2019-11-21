package br.com.aprendainglesfanap;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class LicaoNumerosActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_one, btn_two, btn_three, btn_four, btn_five, btn_six, questionario4;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);getSupportActionBar().hide();
        setContentView(R.layout.activity_licao_numeros);

        questionario4 = (Button) findViewById(R.id.btn_questionario4);
        questionario4.setOnClickListener(this);

        btn_one = (Button) findViewById(R.id.btn_one);
        btn_one.setOnClickListener(this);

        btn_two = (Button) findViewById(R.id.btn_two);
        btn_two.setOnClickListener(this);

        btn_three = (Button) findViewById(R.id.btn_three);
        btn_three.setOnClickListener(this);

        btn_four = (Button) findViewById(R.id.btn_four);
        btn_four.setOnClickListener(this);

        btn_five = (Button) findViewById(R.id.btn_five);
        btn_five.setOnClickListener(this);

        btn_six = (Button) findViewById(R.id.btn_six);
        btn_six.setOnClickListener(this);
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_one:
                mediaPlayer = MediaPlayer.create(LicaoNumerosActivity.this, R.raw.one);
                mediaPlayer.start();
                break;

            case R.id.btn_two:
                mediaPlayer = MediaPlayer.create(LicaoNumerosActivity.this, R.raw.two);
                mediaPlayer.start();
                break;

            case R.id.btn_three:
                mediaPlayer = MediaPlayer.create(LicaoNumerosActivity.this, R.raw.three);
                mediaPlayer.start();
                break;

            case R.id.btn_four:
                mediaPlayer = MediaPlayer.create(LicaoNumerosActivity.this, R.raw.four);
                mediaPlayer.start();
                break;

            case R.id.btn_five:
                mediaPlayer = MediaPlayer.create(LicaoNumerosActivity.this, R.raw.five);
                mediaPlayer.start();
                break;

            case R.id.btn_six:
                mediaPlayer = MediaPlayer.create(LicaoNumerosActivity.this, R.raw.six);
                mediaPlayer.start();
                break;

            case R.id.btn_questionario4:
                Intent questionario4 = new Intent(this, QuestionarioNumerosActivity.class);
                startActivity(questionario4);
                break;

        }
    }

}
