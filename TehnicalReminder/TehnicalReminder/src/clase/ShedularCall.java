/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;


import java.io.IOException;
import java.util.Calendar;
import java.util.Timer;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 *
 * @author HP
 */
public class ShedularCall {
    
    
    public boolean  ok=false;
    public static  Timer time;
    public static void end(){
        
      
       
       
        String error= "Timer cenceled !  We will don't notify any longer .";
        JTextArea outputArea = new JTextArea(12,10);
        outputArea.setText(error);
        JOptionPane.showMessageDialog(null,error,"Error Mesage ",JOptionPane.ERROR_MESSAGE);
        
         time.cancel();
    }
    
    
    
    public static void maiden() {
        
        String error= "Notifyer starts ,check your email !";
        JTextArea outputArea = new JTextArea(12,10);
        outputArea.setText(error);
        JOptionPane.showMessageDialog(null,error," Run Mesage ",JOptionPane.PLAIN_MESSAGE);
        
        time=new Timer();
        EmailSend schedule =new EmailSend();
        Calendar date = Calendar.getInstance();
        
        date.set(Calendar.HOUR, 10);
        date.set(Calendar.MINUTE,30);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);
        time.scheduleAtFixedRate(schedule,date.getTime(),1000); //24*60*60*1000 once a day 
        
     
        
        
        }
    
}
