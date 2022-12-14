package com.util;

import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.entities.Email;
import com.entities.Utilisateur;

public class SendMail {
    public void send(Email email, Utilisateur user){
        Properties properties = new Properties();
        String MAIL_HOST="192.168.0.255";
        Session session;
        MimeMessage message;
        properties.put("mail.smtp.host", MAIL_HOST);
        properties.put("mail.smtp.port","25");
        properties.put("mail.smtp.auth","true");
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user.getEmail(),user.getPassword());
            }
        };
        session = Session.getDefaultInstance(properties,authenticator);
        try {
            InternetAddress[] recipients = new InternetAddress[1];
            recipients[0] = new InternetAddress(email.getTo());
            message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email.getFrom()));
            message.addRecipients(Message.RecipientType.TO,recipients);
            message.setSubject("test");
            message.setText(email.getMessage());
            Transport.send(message);
            System.out.println("Mail sent");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
  }
}