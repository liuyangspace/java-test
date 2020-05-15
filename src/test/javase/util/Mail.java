package test.javase.util;

import com.sun.mail.util.MailSSLSocketFactory;
import com.sun.mail.util.MimeUtil;
import org.junit.Test;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.util.Properties;

public class Mail {
    @Test
    public void send() throws Exception{
        MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        //设置SSL连接、邮件环境
        Properties properties = new Properties();
        properties.put("mail.smtp.host","smtp.huan.tv");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.ssl.socketFactory", sf);

        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("liuyang@huan.tv","!");
            }
        };
        Session session = Session.getDefaultInstance(properties,authenticator);

        session.setDebug(true);
        MimeMessage mimeMessage = new MimeMessage(session);
        mimeMessage.setFrom(new InternetAddress("liuyang@huan.tv"));
        mimeMessage.setRecipient(Message.RecipientType.TO,new InternetAddress("2260597513@qq.com"));
        // mimeMessage.setRecipient(Message.RecipientType.CC,new InternetAddress("2260597513@qq.com"));//抄送
        mimeMessage.setSubject("Java Test");
        // mimeMessage.setContent("This is java send mail test!<br/><a href='https://javaee.github.io'>LinkTest</a>","text/html;charset=UTF-8");

        MimeMultipart mimeMultipart = new MimeMultipart();
        // 附件
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        DataSource dataSource = new FileDataSource(new File("D:\\Users\\VULCAN\\Desktop\\2018封账.jpg"));
        DataHandler dataHandler = new DataHandler(dataSource);
        mimeBodyPart.setDataHandler(dataHandler);
        mimeBodyPart.setFileName(MimeUtility.encodeText("图片.jpg"));
        mimeMultipart.addBodyPart(mimeBodyPart);
        // HTML
        MimeBodyPart mimeBodyPart2 = new MimeBodyPart();
        mimeBodyPart2.setText("This is java send mail test!<br/><a href='https://javaee.github.io'>LinkTest</a>");
        mimeMultipart.addBodyPart(mimeBodyPart2);
        //
        mimeMessage.setContent(mimeMultipart);

        Transport.send(mimeMessage);
    }


}
