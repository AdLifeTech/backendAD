//package adlifetech.email;
//
//import org.springframework.stereotype.Service;
//
//import javax.mail.*;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import java.util.Properties;
//
//@Service
//public class EmailSender {
//
//    private static final String SMTP_HOST = "smtp.gmail.com";
//    private static final String SMTP_PORT = "587";
//    private static final String SMTP_USER = "rrohit9122@gmail.com";
//    private static final String SMTP_PASSWORD = "hwcv iuyg etuw ihnf";
//
//    public void sendMail(String to, String subject, String emailBody) {
//
//        Properties properties = new Properties();
//        properties.put("mail.smtp.host", SMTP_HOST);
//        properties.put("mail.smtp.port", SMTP_PORT);
//        properties.put("mail.smtp.ssl.enable", "true");
//        properties.put("mail.smtp.auth", "true");
//
//
//        Session session = Session.getInstance(properties, new Authenticator() {
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(SMTP_USER, SMTP_PASSWORD);
//            }
//        });
//
//        try {
//
//            MimeMessage mimeMessage = new MimeMessage(session);
//            mimeMessage.setFrom(new InternetAddress(SMTP_USER));
//            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            mimeMessage.setSubject(subject);
//            mimeMessage.setContent(emailBody, "text/html");
//
//
//            Transport.send(mimeMessage);
//            System.out.println("Email sent successfully to: " + to);
//        } catch (MessagingException e) {
//            e.printStackTrace();
//            throw new IllegalStateException("Failed to send email: " + e.getMessage());
//        }
//    }
//}
