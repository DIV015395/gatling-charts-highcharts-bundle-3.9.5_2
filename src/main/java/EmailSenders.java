import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Properties;

public class EmailSenders {

    public static void emailSenderToManjeetSharma() {
        // Set up properties for the email server (Gmail SMTP)
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Replace with your actual email and password (securely stored)
        String senderEmail = "manjeet.instantsys@gmail.com";
        String senderPassword = "idmj elos fyqc zvix";

        // Replace with the recipient's email address
        String recipientEmail = "sharmaboymanjeet12@gmail.com";

        // Specify the full path to the folder you want to send
        String folderPath = "C:\\Users\\ManjeetSharma\\Downloads\\gatling-charts-highcharts-bundle-3.9.5-bundle\\gatling-charts-highcharts-bundle-3.9.5\\results";

        // Create a temporary zip file
        String zipFilePath = System.getProperty("user.dir") + File.separator + "temp.zip"; // Specify the path for the temporary zip file
        try {
            ZipUtils.zipFolder(new File(folderPath), new File(zipFilePath));

            // Create a session with your credentials
            Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(senderEmail, senderPassword);
                }
            });

            // Create a new message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Gatling Report");

            // Create a multipart message
            Multipart multipart = new MimeMultipart();

            // Create the email body text
            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setText("Dear Client, Websocket Load Testing");
            multipart.addBodyPart(textPart);

            // Attach the zip file to the email
            MimeBodyPart attachmentPart = new MimeBodyPart();
            DataSource source = new FileDataSource(zipFilePath);
            attachmentPart.setDataHandler(new DataHandler(source));
            attachmentPart.setFileName("results.zip"); // Set the desired name for the zip file
            multipart.addBodyPart(attachmentPart);

            // Set the message content
            message.setContent(multipart);

            // Send the email
            Transport.send(message);
            System.out.println("Email sent successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exceptions more gracefully and log them
        } finally {
            // Delete the temporary zip file
            new File(zipFilePath).delete();
        }
    }
//    public static void emailSenderToCompanyManjeetSharma() {
//        // Set up properties for the email server (Gmail SMTP)
//        Properties properties = new Properties();
//        properties.put("mail.smtp.host", "smtp.gmail.com");
//        properties.put("mail.smtp.port", "587");
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.starttls.enable", "true");
//        properties.put("mail.smtp.socketFactory.port", "465");
//        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        properties.put("mail.smtp.socketFactory.fallback", "false");
//
//        String reportFilePath = "C:\\Users\\ManjeetSharma\\Downloads\\gatling-charts-highcharts-bundle-3.9.5-bundle\\gatling-charts-highcharts-bundle-3.9.5\\results";
//
//
//        // Replace with your actual email and password (securely stored)
//        String senderEmail = "manjeet.instantsys@gmail.com";
//        String senderPassword = "abzu rkcq csar ikzo";
//
//        // Replace with the recipient's email address
//        String recipientEmail = "manjeet.sharma@instantsys.com";
//
//        // Specify the full path to the Extent Report file
//
//        try {
//            // Create a session with your credentials
//            Session session = Session.getInstance(properties, new Authenticator() {
//                @Override
//                protected PasswordAuthentication getPasswordAuthentication() {
//                    return new PasswordAuthentication(senderEmail, senderPassword);
//                }
//            });
//
//            // Create a new message
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(senderEmail));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
//            message.setSubject("Gatling Report");
//
//            // Create a multipart message
//            Multipart multipart = new MimeMultipart();
//
//            // Create the email body text
//            MimeBodyPart textPart = new MimeBodyPart();
//            textPart.setText("Dear Client,Websocket Load Testing");
//            multipart.addBodyPart(textPart);
//
//            // Attach the Extent Report file
//            MimeBodyPart attachmentPart = new MimeBodyPart();
//            attachmentPart.attachFile(new File(reportFilePath));
//            multipart.addBodyPart(attachmentPart);
//
//            // Set the message content
//            message.setContent(multipart);
//
//            // Send the email
//            Transport.send(message);
//            System.out.println("Email sent successfully!");
//        } catch (Exception e) {
//            e.printStackTrace();
//            // Handle exceptions more gracefully and log them
//        }
//    }
//
//    public static void emailSenderToRajeshMishra() {
//        // Set up properties for the email server (Gmail SMTP)
//        Properties properties = new Properties();
//        properties.put("mail.smtp.host", "smtp.gmail.com");
//        properties.put("mail.smtp.port", "587");
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.starttls.enable", "true");
//        properties.put("mail.smtp.socketFactory.port", "465");
//        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        properties.put("mail.smtp.socketFactory.fallback", "false");
//
//        String reportFilePath = "C:\\Users\\ManjeetSharma\\Downloads\\gatling-charts-highcharts-bundle-3.9.5-bundle\\gatling-charts-highcharts-bundle-3.9.5\\results";
//
//        // Replace with your actual email and password (securely stored)
//        String senderEmail = "manjeet.instantsys@gmail.com";
//        String senderPassword = "hlri mjpu vejg pyhf";
//
//        // Replace with the recipient's email address
//        String recipientEmail = "rajesh.mishra@instantsys.com";
//
//        // Specify the full path to the Extent Report file
//
//        try {
//            // Create a session with your credentials
//            Session session = Session.getInstance(properties, new Authenticator() {
//                @Override
//                protected PasswordAuthentication getPasswordAuthentication() {
//                    return new PasswordAuthentication(senderEmail, senderPassword);
//                }
//            });
//
//            // Create a new message
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(senderEmail));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
//            message.setSubject("Gatling Report");
//
//            // Create a multipart message
//            Multipart multipart = new MimeMultipart();
//
//            // Create the email body text
//            MimeBodyPart textPart = new MimeBodyPart();
//            textPart.setText("Dear Client,Websocket Load Testing");
//            multipart.addBodyPart(textPart);
//
//            // Attach the Extent Report file
//            MimeBodyPart attachmentPart = new MimeBodyPart();
//            attachmentPart.attachFile(new File(reportFilePath));
//            multipart.addBodyPart(attachmentPart);
//
//            // Set the message content
//            message.setContent(multipart);
//
//            // Send the email
//            Transport.send(message);
//            System.out.println("Email sent successfully!");
//        } catch (Exception e) {
//            e.printStackTrace();
//            // Handle exceptions more gracefully and log them
//        }
//    }
//
//    public static void emailSenderToVikasSood() {
//        // Set up properties for the email server (Gmail SMTP)
//        Properties properties = new Properties();
//        properties.put("mail.smtp.host", "smtp.gmail.com");
//        properties.put("mail.smtp.port", "587");
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.starttls.enable", "true");
//        properties.put("mail.smtp.socketFactory.port", "465");
//        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        properties.put("mail.smtp.socketFactory.fallback", "false");
//
//        String reportFilePath = "C:\\Users\\ManjeetSharma\\Downloads\\gatling-charts-highcharts-bundle-3.9.5-bundle\\gatling-charts-highcharts-bundle-3.9.5\\results";
//
//        // Replace with your actual email and password (securely stored)
//        String senderEmail = "manjeet.instantsys@gmail.com";
//        String senderPassword = "pjgx knni utsr bxiw";
//
//        // Replace with the recipient's email address
//        String recipientEmail = "vikas@instantsys.com";
//
//        // Specify the full path to the Extent Report file
//
//        try {
//            // Create a session with your credentials
//            Session session = Session.getInstance(properties, new Authenticator() {
//                @Override
//                protected PasswordAuthentication getPasswordAuthentication() {
//                    return new PasswordAuthentication(senderEmail, senderPassword);
//                }
//            });
//
//            // Create a new message
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(senderEmail));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
//            message.setSubject("Gatling Report");
//
//            // Create a multipart message
//            Multipart multipart = new MimeMultipart();
//
//            // Create the email body text
//            MimeBodyPart textPart = new MimeBodyPart();
//            textPart.setText("Dear Client,Websocket Load Testing");
//            multipart.addBodyPart(textPart);
//
//            // Attach the Extent Report file
//            MimeBodyPart attachmentPart = new MimeBodyPart();
//            attachmentPart.attachFile(new File(reportFilePath));
//            multipart.addBodyPart(attachmentPart);
//
//            // Set the message content
//            message.setContent(multipart);
//
//            // Send the email
//            Transport.send(message);
//            System.out.println("Email sent successfully!");
//        } catch (Exception e) {
//            e.printStackTrace();
//            // Handle exceptions more gracefully and log them
//        }
//    }
    public static void main(String[] args) {
        EmailSenders.emailSenderToManjeetSharma();
//        EmailSenders.emailSenderToCompanyManjeetSharma();
//        EmailSenders.emailSenderToRajeshMishra();
    }

}
