package br.com.aprendainglesfanap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class LicaoNumerosActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);getSupportActionBar().hide();
        setContentView(R.layout.activity_licao_numeros);

        Button questionario4 = (Button) findViewById(R.id.btn_questionario4);
        questionario4.setOnClickListener(this);
    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btn_questionario4:
                Intent intentQuestionario4 = new Intent(this, QuestionarioNumerosActivity.class);
                startActivity(intentQuestionario4);
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
