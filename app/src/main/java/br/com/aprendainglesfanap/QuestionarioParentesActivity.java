package br.com.aprendainglesfanap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionarioParentesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);getSupportActionBar().hide();
        //setContentView(R.layout.activity_licoes);

    }

    public void onClick() {
        Intent it = new Intent(this, LicoesActivity.class);
        Toast.makeText(this, "Estamos trabalhando nisso ainda!", Toast.LENGTH_LONG).show();
    }
}
