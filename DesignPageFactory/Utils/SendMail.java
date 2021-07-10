package Utils;


import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

// always add two jar one is activation jar, second is javax.mail.1.6.1
// more thing into your gmail account set two step verification off and allow less secure app option turn on


public class SendMail {

	public static final String SMTP_HOST_NAME = "smtp.gmail.com";
	public static final String SMTP_AUTH_USER = "sahil@simple2trade.com";
	public static final String SMTP_AUTH_PWD = "Welcome2019@";

	public static final String emailMsgTxt = "Please Find Attached Log File";
	public static final String emailSubjectTxt = "Selenium Script Fail";
	public static final String emailFromAddress = "sahil@simple2trade.com";

	// Add List of Email address where user wish to send the email
	public static final String[] emailList = { "sahil@simple2trade.com" };

	public void MailSend(String Recipients[], String subject, String message, String from) throws MessagingException {


		
		
		
		// boolean debug = false;

		// Set the host smtp address
		Properties props = new Properties();
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", SMTP_HOST_NAME);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "587");
		

		Authenticator auth = new SMTPAuthenticator();
		Session session = Session.getDefaultInstance(props, auth);

		session.setDebug(false);// identied java mail version
		
		// create a message
		try {
			Message msg = new MimeMessage(session);
			

			// set the from and to address
			InternetAddress addressFrom = new InternetAddress(from);
			msg.setFrom(addressFrom);

			InternetAddress[] addressTo = new InternetAddress[Recipients.length];
			for (int i = 0; i < Recipients.length; i++) {
				addressTo[i] = new InternetAddress(Recipients[i]);
			}
			msg.setRecipients(Message.RecipientType.TO, addressTo);

			// Setting the Subject and Content Type
			msg.setSubject(subject);
			//msg.setContent(message, "text/plain");
			// file to attach with mail
		      String filename = "D:\\output.txt";
               BodyPart body=new MimeBodyPart();
               body.setContent(
            	          "<h1>Mail from selenium</h1></br>" + message, "text/html");
            	  Multipart multipart = new MimeMultipart();
            	 multipart.addBodyPart(body);
            	 body = new MimeBodyPart();
            	      DataSource source = new FileDataSource(filename);
            	      body.setDataHandler(new DataHandler(source));
            	      body.setFileName(filename);
            	      multipart.addBodyPart(body);
            	      msg.setContent(multipart);

				
			
				

			Transport.send(msg);
			System.out.println("Sucessfully Sent mail to All Users");
		} catch (MessagingException mse) {
                 System.out.println(mse);
		}
	}

	/**
	 * SimpleAuthenticator is used to do simple authentication when the SMTP server
	 * requires it.
	 */
	private class SMTPAuthenticator extends javax.mail.Authenticator {

		public PasswordAuthentication getPasswordAuthentication() {
			String username = SMTP_AUTH_USER;
			String password = SMTP_AUTH_PWD;
			return new PasswordAuthentication(username, password);
		}
	}

}
