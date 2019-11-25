package br.com.aprendainglesfanap;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;
import br.com.aprendainglesfanap.JavaMail;

import androidx.appcompat.app.AppCompatActivity;


public class QuestionarioNumerosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);getSupportActionBar().hide();
        setContentView(R.layout.activity_questionario_numeros);
    }

}