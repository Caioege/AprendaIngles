package br.com.aprendainglesfanap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuestionarioNumeroActivity extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mediaPlayer;
    int escutou1, escutou2;
    int valida = 0;
    boolean marcou1 = false, marcou2 = false;
    int qtdAcertos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionario_numero);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);getSupportActionBar().hide();//FULLSCREEN

        ImageButton playButton = findViewById(R.id.playbutton);
        playButton.setOnClickListener(this);

        ImageButton playButton2 = findViewById(R.id.playbutton2);
        playButton2.setOnClickListener(this);

        Button finaliza = findViewById(R.id.finaliza);
        finaliza.setOnClickListener(this);

    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.playbutton:
                mediaPlayer = MediaPlayer.create(this, R.raw.one);
                mediaPlayer.start();
                escutou1++;
                break;

            case R.id.playbutton2:
                mediaPlayer = MediaPlayer.create(this, R.raw.four);
                mediaPlayer.start();
                escutou2++;
                break;

            case R.id.finaliza:

                Button bt_one = findViewById(R.id.bt_one);
                bt_one.setOnClickListener(this);

                Button bt_four = findViewById(R.id.bt_four);
                bt_four.setOnClickListener(this);

                if(escutou1 > 0 && escutou2 > 0) {

                    Intent finaliza = new Intent(this, LicoesActivity.class);
                    startActivity(finaliza);

                    try{
                        JavaMail envio = new JavaMail();
                        envio.enviaEmail("caiohenrick231@gmail.com");
                        Toast.makeText(this, "E-mail enviado!", Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        e.printStackTrace();
                       Toast.makeText(this, "Erro ao enviar e-mail!", Toast.LENGTH_LONG).show();
                    }
                    break;
                } else {
                    Toast.makeText(this, "Talvez você não tenha escutado os sons, ou se esqueceu de marcar a resposta.", Toast.LENGTH_LONG).show();
                    break;
                }

        }
    }
}
