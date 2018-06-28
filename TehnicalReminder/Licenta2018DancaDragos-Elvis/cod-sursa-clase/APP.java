/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Component;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javaapplication1.Draw;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

/**
 *
 * @author HP
 */
public class APP extends CritRevisions {
    
    public  static   String USERNAME = "root";
    public  static  String PASSWORD = "";
    public  static  String CONN = "jdbc:mysql://localhost:3306/revteh";
    public  static   Connection myConn = null;
    
    public static  void UpdateExpDate(String RevDate ,int ID, int months){
    
            
        
         String ExpDate=null;
         int NrMonth=0;
         
         
        if(months==0){
             NrMonth=1;
         }
        if(months==1){
             NrMonth=4;
         }
        if(months==2){
             NrMonth=6;
        }
        
        if(months==3){
             NrMonth=12;
         }
         
        
        
        Statement stmt=null,state = null;
        ResultSet rs=null ,result = null;
        
       
		System.out.println("Loading driver...");

                try {
                     Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("Driver loaded!");
                        } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Cannot find the driver in the classpath!", e);
                    }
                
		try {
			
		myConn = DriverManager.getConnection(CONN,USERNAME,PASSWORD); 
		System.out.println("Connected");
                        
  
                    state = myConn.createStatement();
                    result = state.executeQuery("SELECT '"+RevDate+ "'+ INTERVAL '"+NrMonth+"' MONTH");
                    result.next();    
                    ExpDate =result.getString(1);
                    System.out.println(ExpDate);
     
                    PreparedStatement stm=(PreparedStatement) myConn.prepareStatement
                                          ("UPDATE rev\n" +"SET ExpDate = '"+ExpDate +"' \n" +"WHERE ID=" + ID);
                    stm.executeUpdate();
                    stm.close();
	
                    myConn.close();
		}
		catch (SQLException e) {
                    System.out.println(e);
		}
        
                

   }
    
    
    public static void   updateList(  List chain ,List colors ){
        
        int i=0;
        
        Statement statement = null;
        ResultSet result = null;
        
        String aux;
        Integer color;
		System.out.println("Loading driver...");

                try {
                     Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("Driver loaded!");
                        } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Cannot find the driver in the classpath!", e);
                    }
                
		try {
			
			myConn = DriverManager.getConnection(CONN,USERNAME,PASSWORD); 
			System.out.println("Connected");
                        
                      
                    statement = myConn.createStatement();
                    result = statement.executeQuery("SELECT * FROM rev ");
                    
                    while(result.next()){
                        
                       aux=result.getString("RevName");
                       color=result.getInt("Color");
                       chain.add(aux);
                       colors.add(color);
                       System.out.println(chain.get(i));
                       System.out.println(colors.get(i));
                       
                       i++;
                    }
                    
                    
	
                    myConn.close();
		}
		catch (SQLException e) {
                    System.out.println(e);
		}
     
                
                
        
    }
    
    
    public static  void updateTable(List<String> explist, List<Integer> days){
         int i=0;
        
        Statement statement = null;
        ResultSet result = null;
        
        String aux;
        String day ;
        int zi =0;
		System.out.println("Loading driver...");

                try {
                     Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("Driver loaded!");
                        } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Cannot find the driver in the classpath!", e);
                    }
                
		try {
			
			myConn = DriverManager.getConnection(CONN,USERNAME,PASSWORD); 
			System.out.println("Connected");
                        
                      
                    statement = myConn.createStatement();
                    result = statement.executeQuery("SELECT RevName,(CURRENT_DATE-ExpDate) FROM `rev` WHERE (CURRENT_DATE-ExpDate) > -10");
                    
                    while(result.next()){
                        
                       aux=result.getString("RevName");
                       day=result.getString("(CURRENT_DATE-ExpDate)");
                       zi=Integer.parseInt(day);
                       
                       explist.add(aux);
                       days.add(zi);
                       
                       System.out.println(explist.get(i));
                        System.out.println(days.get(i));
                       i++;
                    }
                    
                    
	
                    myConn.close();
		}
		catch (SQLException e) {
                    System.out.println(e);
		}
    }

   
   
 }

