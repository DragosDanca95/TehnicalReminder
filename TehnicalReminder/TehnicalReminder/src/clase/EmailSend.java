/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * https://www.google.com/settings/security/lesssecureapps
 */

package clase;

/**
 *
 * @author Naveen
 */

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;
import java.util.TimerTask;

public class EmailSend extends TimerTask {

    public  String send (String adresa){
        
       List<String> expirenames = new ArrayList<String>();
       List<Integer> dayleft = new ArrayList<Integer>();
       String generalmsg="";
       
        APP.updateTable(expirenames, dayleft);
        
      
       
        if(expirenames.size()==0){
            generalmsg=" \n We dont have tehnical revisions in expiration date limit yet ! /n Have a nice Day!";
           
        }else {
            
        String firstmessage="Tehnical revisions with expiration date limit exceed : \n";
        String endmessage="\n \n Please check TR-Application  right now !\n Have a nice day  ! \n";
        String middlemessage="";
        String days="";
        for(int i=0;i<expirenames.size();i++){
            
            if(dayleft.get(i)>=-10 & dayleft.get(i)<=0){
                
                days=(Math.abs(dayleft.get(i))) +" left";
            }else{
                   days="expired";}
            
            middlemessage= middlemessage+"\n " + i +") "+expirenames.get(i)+" : "+ "has " +days;
            
        }
        

         generalmsg=firstmessage+middlemessage+endmessage ;
         
        } 
        
        
        try{
            String host ="smtp.gmail.com" ;
            String user = "tehnical.revisions2018@gmail.com";
            String pass = "tehnical11";
            String to = adresa;
            String from = "tehnical.revisions2018@gmail.com";
            String subject = "Tehnical Revision Notifyer !";
            String messageText = generalmsg;
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);

           Transport transport=mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           System.out.println("Message send successfully!");
        }catch(Exception ex)
        {
            System.out.println(ex);
        }
    
       
        return "";
    }

    
    public void run() {
        
        notify n =new notify();
        String adr=n.getA();
        send(adr);
    }
   
}
