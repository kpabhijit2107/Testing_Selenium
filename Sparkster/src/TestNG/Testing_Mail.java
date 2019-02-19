package TestNG;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class Testing_Mail {

	public static void main(String[] args) throws EmailException, InterruptedException {
		System.out.println("email started");
		Thread.sleep(60000);
		EmailAttachment attachment = new EmailAttachment();
		   
		   attachment.setPath("C:\\seelniumautomation\\uisparkster\\test-output\\Sparkster_Extent.html");
		   attachment.setDisposition(EmailAttachment.ATTACHMENT);
		   attachment.setDescription("Picture of errors");
		   attachment.setName("sparkster");

		   
		   MultiPartEmail email = new MultiPartEmail();
		   
		   email.setHostName("smtp.googlemail.com");
		    //email.setSmtpPort(587);
		   email.setSmtpPort(465);
		   email.setAuthenticator(new DefaultAuthenticator("abhijitpatel110@gmail.com", "patel21."));
		   email.setSSLOnConnect(true);
		   email.addTo("abhijitrcert21@gmail.com", "abhijit");
		   
		   email.addCc("abhijit.patel@syncoms.com", "sds");
		   //email.addCc("amit.k@syncoms.com", "amit kumar");
		   
		   email.setFrom("abhijitpatel110@gmail.com","abhijit");
		   email.setSubject("The picture of sparkster");
		   email.setMsg("Here is the screenshot picture of saved document");

		   // add the attachment
		  email.attach(attachment);
		   
		   email.send();
		   System.out.println("email sent");
		
		

	}

}
