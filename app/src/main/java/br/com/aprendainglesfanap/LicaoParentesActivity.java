package br.com.aprendainglesfanap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class LicaoParentesActivity extends AppCompatActivity implements View.OnClickListener {

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

    }
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_questionario3:
                Intent questionario3 = new Intent(this, QuestionarioParentesActivity.class);
                startActivity(questionario3);
                break;
        }
    }
}
