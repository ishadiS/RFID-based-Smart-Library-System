package Mails_Handler;

import com.email.durgesh.Email;

import javax.mail.MessagingException;

import java.io.UnsupportedEncodingException;

public class Send_Mails
{
    public static void Send(String subject_,String Message,String receiver_mail) throws MessagingException, UnsupportedEncodingException
    {
        String mail_body = "<h4>"+Message+"</h4>";

        String sender_mail = "managerlibrary7@gmail.com";

        String password  = "sltc@admin_library";

        Email email = new Email(sender_mail,password);

        String sender_name = "System Admin";

        email.setFrom(sender_mail,sender_name);

        email.setSubject(subject_);

        email.setContent(mail_body,"text/html");

        email.addRecipient(receiver_mail);

        email.send();
    }
}
