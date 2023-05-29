package Mails_Handler;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            String message = "You Just Lent a Book : Famous Five";

            Send_Mails.Send("Book Lending Notification",message,"chetangunaratnelaksisi@gmail.com");
        }
        catch(Exception error)
        {

        }
    }
}
