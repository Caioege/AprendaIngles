package br.com.aprendainglesfanap;

import android.os.StrictMode;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
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

public class JavaMail {

    Properties props = new Properties();
    Session session;

    public JavaMail() {
    }

    public void enviaEmail(String email_resp) {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        //Parâmetros de conexão com servidor Gmail
        props.put("mail.smtp.host", "smtp.googlemail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        try {

            session = Session.getDefaultInstance(props, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("projetolinguas.fanap@gmail.com", "fanap123456");
                }
            });

            if (session != null) {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("projetolinguas.fanap@gmail.com"));
                message.setSubject("ESCREVA AQUI O ASSUNTO");
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email_resp));
                message.setContent("ESCREVA AQUI A MENSAGEM", "text/html; charset=utf-8");
                Transport.send(message);

                //Toast.makeText(this, "E-mail enviado!", Toast.LENGTH_LONG).show();
            }

        } catch (Exception e) {
            e.printStackTrace();
            //Toast.makeText(this, "Erro!", Toast.LENGTH_LONG).show();
        }
    }
}
