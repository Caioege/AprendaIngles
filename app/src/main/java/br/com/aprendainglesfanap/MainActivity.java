package br.com.aprendainglesfanap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import br.com.aprendainglesfanap.JavaMail;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nome_crianca, email_resp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);getSupportActionBar().hide();//FULLSCREEN
        setContentView(R.layout.activity_main);

        //TRAS OS DADOS DA TELA DE LOGIN
        nome_crianca = (EditText) findViewById(R.id.txt_nome);
        email_resp = (EditText) findViewById(R.id.email_resp);

        //BOTOES DEFINIDOS NO XML
        Button confirma = (Button) findViewById(R.id.confirma);
        confirma.setOnClickListener(this);

        Button sair = (Button) findViewById(R.id.sair);
        sair.setOnClickListener(this);

        Button envia = (Button) findViewById(R.id.envia);
        envia.setOnClickListener(this);
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
