/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import static javax.swing.UIManager.getColor;
import jdk.nashorn.internal.objects.NativeArray;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author HP
 */
public class FileMaker {
    
    
    
    
    public static String getFileName(String selection){
         
         String USERNAME = "root";
         String PASSWORD = "";
         String CONN = "jdbc:mysql://localhost:3306/revteh";
         Connection myConn = null;
         Statement stmt=null;
         ResultSet rs=null ;
         String filename=null;
        
      
  
		

                try {
                     Class.forName("com.mysql.jdbc.Driver");
                        
                        } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Cannot find the driver in the classpath!", e);
                    }
                
		try {
			
			myConn = DriverManager.getConnection(CONN,USERNAME,PASSWORD); 
			
                        
                        
                     stmt = myConn.createStatement();
                     rs = stmt.executeQuery("SELECT FileName FROM rev  where RevName='"+selection+"'" );
                        
                     rs.next();
                      filename=rs.getString("FileName");
                     
                     
                     rs.close();
                     stmt.close();
                     myConn.close();	
		}
		catch (SQLException e) {
                    System.out.println(e);
		}
           
        return filename ;
    }
    
    
    public void createFile(String filename){
        
        
       
    }    
    
    public static void  writeToFile(String filename,List<Points> list,String color) {
        
        File file = null ;
    	if(file == new File("C:\\Users\\HP\\Documents\\"+filename+".txt"))
                {file.delete();}
        PrintWriter writer;
        try {
            writer = new PrintWriter("C:\\Users\\HP\\Documents\\"+filename+".txt");
            
            writer.println(color);
            writer.println("********");
             writer.println("Format : ");
             writer.println("-point number  ");
             writer.println("-type ");
             writer.println("-x1 ");
             writer.println("-y1 ");
             writer.println("-x2 ");
             writer.println("-y2 ");
            writer.println("********");
           
             int i=0;
          for (Iterator<Points> iter = list.iterator(); iter.hasNext(); ) {
   
               Points elem = iter.next();
            i++;
            writer.println("P"+(i)+":"); 
            writer.println(elem.getType());
            writer.println(elem.getx1());
            writer.println(elem.gety1());
            writer.println(elem.getx2());
            writer.println(elem.gety2());
            writer.println("");
            
            
            }
            writer.println("end");
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileMaker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    
    public static void readFromFile(String filename,List<Line2D> lines,List<Rectangle2D> rectangles,List<Ellipse2D> elipses) {
        
         File file = new File("C:\\Users\\HP\\Documents\\"+filename+".txt");
 
         BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(file));
            String st;
            String color=br.readLine();
            for(int i=0;i<9;i++)
            {
                br.readLine();
            }
            while (!"end".equals(st = br.readLine()))
            {    
                System.out.println(st);
                
                String type=br.readLine();
                int x1=Integer.parseInt(br.readLine());
                int y1=Integer.parseInt(br.readLine());
                int x2=Integer.parseInt(br.readLine());
                int y2=Integer.parseInt(br.readLine());
                
                
                    
                switch (type) {
                    case "line":
                        Line2D line=new Line2D.Float((float)x1,(float)y1,(float)x2,(float)y2);
                        lines.add(line);
                        break;
                    case "rectangle":
                        Rectangle2D rectangle=new Rectangle2D.Float((float)x1,(float)y1,(float)x2,(float)y2);
                        rectangles.add(rectangle);
                        break;
                    case "elipse":
                        Ellipse2D elipse=new Ellipse2D.Float((float)x1,(float)y1,(float)x2,(float)y2);
                        elipses.add(elipse);
                        break;
                    default:
                        Point2D point;
                        //do nothing at this time
                        break;
                }
                
                br.readLine();
               
                
            }
            
          br.close();
          
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileMaker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileMaker.class.getName()).log(Level.SEVERE, null, ex);
        }
 
  
  }
    
    
    
    public void deleteFile(String filename){
        
    }
         public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
           
            }
        });
    }
}
