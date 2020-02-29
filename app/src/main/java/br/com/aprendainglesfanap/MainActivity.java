package br.com.aprendainglesfanap;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.SharedPreferences;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nome_crianca, email_resp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);getSupportActionBar().hide();//FULLSCREEN
        validaLogin();

        //TRAS OS DADOS DA TELA DE LOGIN
        nome_crianca = (EditText) findViewById(R.id.txt_nome);
        email_resp = (EditText) findViewById(R.id.email_resp);

        //BOTOES DEFINIDOS NO XML
        Button confirma = (Button) findViewById(R.id.confirma);

        //confirma.setOnClickListener(this);

        Button sair = (Button) findViewById(R.id.sair);
        sair.setOnClickListener(this);
    }

    //METODO PARA VERIFICAR SE O USUARIO ESTA LOGADO
    public void validaLogin(){
        SharedPreferences preferences = getSharedPreferences("user_preferences", MODE_PRIVATE);
        if(preferences.contains("nome")){
            Intent intent = new Intent(this, LicoesActivity.class);
            startActivity(intent);
        } else {
            setContentView(R.layout.activity_main);
        }
    }

    //METODO PARA SALVAR DADOS CADASTRAIS
    public void saveData() {
        SharedPreferences preferences = getSharedPreferences("user_preferences", MODE_PRIVATE);
        SharedPreferences.Editor ed = preferences.edit();
        ed.putString("nome", nome_crianca.getText().toString());
        ed.putString("email", email_resp.getText().toString());
        ed.apply();
        //Toast.makeText(getApplicationContext(),"Gravado com sucesso", Toast.LENGTH_SHORT).show();
    }

    //METODO PARA BUSCAR DADOS CADASTRAIS
    public void getData() {
        SharedPreferences preferences = getSharedPreferences("user_preferences", MODE_PRIVATE);
        if(preferences.contains("nome")){
            System.out.println(preferences.getString("nome",""));
            System.out.println(preferences.getString("email",""));
            //nome_crianca.setText(preferences.getString("nome",""));
            //email_resp.setText(preferences.getString("email",""));
        } else {
            System.out.println("Não Localizado");
        }
    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.confirma:

                //VERIFICA OS VALORES DA TELA DE LOGIN
                if(nome_crianca.length() == 0) {
                    Toast.makeText(this, "Por favor insira seu nome.", Toast.LENGTH_LONG).show();
                    break;
                } else if(email_resp.length() == 0) {
                    Toast.makeText(this, "Por favor insira o e-mail de um dos seus responsáveis.", Toast.LENGTH_LONG).show();
                    break;
                }else {
                    Toast.makeText(this, "Bons estudos " + nome_crianca.getText() + "!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(this, LicoesActivity.class);
                    startActivity(intent);
                    saveData();
                    getData();
                    break;
                }

            case R.id.sair:
                this.finish();
                break;

            case R.id.envia:

                try{
                    JavaMail envio = new JavaMail();
                    envio.enviaEmail(email_resp.getText().toString());
                    Toast.makeText(this, "E-mail enviado com sucesso!", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(this, "Erro ao enviar e-mail!", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
