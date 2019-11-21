package br.com.aprendainglesfanap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class LicaoFrutasActivity extends AppCompatActivity implements View.OnClickListener {

    Button questionario1;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_licao_frutas);

        questionario1 = (Button) findViewById(R.id.btn_questionario1);
        questionario1.setOnClickListener(this);

    }
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_questionario1:
                Intent questionario1 = new Intent(this, QuestionarioFrutasActivity.class);
                startActivity(questionario1);
                break;
        }
    }
}
