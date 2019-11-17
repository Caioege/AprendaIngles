package br.com.aprendainglesfanap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class LicoesActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);getSupportActionBar().hide();//FULLSCREEN
        setContentView(R.layout.activity_licoes);

        Button fruta = (Button) findViewById(R.id.btn_fruta);
        fruta.setOnClickListener(this);

        Button animal = (Button) findViewById(R.id.btn_animal);
        animal.setOnClickListener(this);

        Button parente = (Button) findViewById(R.id.btn_parente);
        parente.setOnClickListener(this);
    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btn_fruta:
                Intent intent = new Intent(this, LicaoFrutasActivity.class);
                startActivity(intent);
                break;
        }
    }
}
