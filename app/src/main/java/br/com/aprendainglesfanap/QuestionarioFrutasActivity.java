package br.com.aprendainglesfanap;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class QuestionarioFrutasActivity extends AppCompatActivity implements View.OnClickListener {


    // Button questionario1;
    private static RadioGroup rgroup;
    RadioButton radio_watermelon,radio_apple,radio_grape,radio_pineapple;
    ImageButton imgBtn_melancia;
    MediaPlayer mediaPlayer;
    Button btn_confirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_questionario_frutas);
        onClickListenerButton();


        imgBtn_melancia = findViewById(R.id.imgBtn_melancia);
        imgBtn_melancia.setOnClickListener((View.OnClickListener) this);


    }

    public void onClick(View view) {



        switch (view.getId()) {
            case R.id.imgBtn_melancia:
                mediaPlayer = MediaPlayer.create(QuestionarioFrutasActivity.this, R.raw.melancia);
                mediaPlayer.start();
                break;

            case R.id.btn_questionario1:
                Intent questionario1 = new Intent(this, LicoesActivity.class);
                startActivity(questionario1);
                Toast.makeText(this, "Estamos trabalhando nisso ainda!", Toast.LENGTH_LONG).show();
                break;
        }

    }
    public void onClickListenerButton(){

        btn_confirmar .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected_id =  rgroup.getCheckedRadioButtonId();
                btn_confirmar = (RadioButton)findViewById(selected_id);
                Toast.makeText(QuestionarioFrutasActivity.this,radio_watermelon.getText().toString(),Toast.LENGTH_SHORT);;
            }
        });
    }

}