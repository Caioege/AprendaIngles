package br.com.aprendainglesfanap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String nome_crianca, email_resp;
    EditText crianca, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);getSupportActionBar().hide();//FULLSCREEN
        setContentView(R.layout.activity_main);

        //TRAS OS DADOS DA TELA DE LOGIN
        crianca = (EditText) findViewById(R.id.txt_nome);
        //nome_crianca = crianca.toString();
        email = (EditText) findViewById(R.id.email_resp);
        //email_resp = email.toString();

        //BOTOES DEFINIDOS NO XML
        Button confirma = (Button) findViewById(R.id.confirma);
        confirma.setOnClickListener(this);

        Button sair = (Button) findViewById(R.id.sair);
        sair.setOnClickListener(this);
    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.confirma:

                //VERIFICA OS VALORES DA TELA DE LOGIN - NAO TA FUNCIONANDO AINDA
                if(crianca.length() == 0) {
                    Toast.makeText(this, "Por favor insira seu nome.", Toast.LENGTH_LONG).show();
                    break;
                } else if(email.length() == 0) {
                    Toast.makeText(this, "Por favor insira o e-mail de um dos seus responsáveis.", Toast.LENGTH_LONG).show();
                    break;
                }else {
                    String nome = crianca.toString();
                    Toast.makeText(this, nome, Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(this, LicoesActivity.class);
                    startActivity(intent);
                    break;
                }

            case R.id.sair:
                this.finish();
                break;
        }
    }
}
