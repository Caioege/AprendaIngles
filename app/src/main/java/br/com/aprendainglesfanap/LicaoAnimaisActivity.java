package br.com.aprendainglesfanap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class LicaoAnimaisActivity extends AppCompatActivity implements View.OnClickListener {

    Button questionario2;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_licao_animais);

        questionario2 = (Button) findViewById(R.id.btn_questionario2);
        questionario2.setOnClickListener(this);

    }
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_questionario2:
                Intent questionario2 = new Intent(this, QuestionarioAnimaisActivity.class);
                startActivity(questionario2);
                break;
        }
    }
}
