/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static frames.APP.updateList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
/**
 *
 * @author HP
 */
public class AllRevisions extends javax.swing.JFrame {

    /**
     * Creates new form AllRevisions
     */
    public AllRevisions() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        revlist = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(35, 35, 35));

        jPanel1.setBackground(new java.awt.Color(35, 35, 35));

        revlist.setBackground(new java.awt.Color(104, 237, 250));
        revlist.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        revlist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(revlist);

        jLabel1.setBackground(new java.awt.Color(22, 110, 215));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 107, 220));
        jLabel1.setText("Actual revisions  name -> color ");

        delete.setBackground(new java.awt.Color(99, 0, 134));
        delete.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        insert.setBackground(new java.awt.Color(99, 0, 134));
        insert.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        insert.setForeground(new java.awt.Color(255, 255, 255));
        insert.setText("Insert");
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 107, 220));
        jLabel2.setText("Delete need a selection from list !");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 107, 220));
        jLabel3.setText("New type of revision ");

        jButton1.setBackground(new java.awt.Color(99, 0, 134));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(574, 574, 574)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insert)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {delete, insert});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(insert)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {delete, insert});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public static void updateJLIST(){
        
      
     List<String> chain = new ArrayList<String>();
     List<Integer> colors = new ArrayList<Integer>(); 
      APP.updateList(chain,colors);
      
        DefaultListModel dlm=new DefaultListModel();
       
        for(int i=0;i<chain.size();i++){
            
            Integer clr=-1; 
            String x=null;
            
            clr=colors.get(i);
            
            if(clr==0){
                x="red";
               
            }
            if(clr==1){
                x="green";
            }
            if(clr==2){
                x="blue";
            }
            if(clr==3){
                x="yellow";
            }
            if(clr==4){
                x="cyan";
            }
            if(clr==5){
                x="magenta";
            }
            if(clr==6){
                x="orange";
            }
            if(clr==7){
                x="pink";
            }
            if(clr==8){
                x="gray";
            }
            if(clr==9){
                x="lightGray";
            }
            if(clr==10){
                x="darkGray";
            }
            
            String var =chain.get(i)+" -> color : "+x;
              dlm.addElement(var);
            
            
        }
        
        revlist.setModel(dlm);
        
        
    }
            
    
    
    
    
    
    
    
    
    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked

    if( revlist.isSelectionEmpty()==true)
    {
        String error= "Please select the item you want to delete from list!";
        JTextArea outputArea = new JTextArea(12,10);
        outputArea.setText(error);
        JOptionPane.showMessageDialog(null,error,"Error Mesage ",JOptionPane.ERROR_MESSAGE);
    }
    else {
        
          
        
        
        String USERNAME = "root";
         String PASSWORD = "";
         String CONN = "jdbc:mysql://localhost:3306/revteh";
        
        Connection myConn = null;
     List<String> chain = new ArrayList<String>();
     List<Integer> colors = new ArrayList<Integer>(); 
      APP.updateList(chain,colors);
        String RevName = chain.get(revlist.getSelectedIndex());
        
        System.out.println(RevName);
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
                        
                        
                
                    PreparedStatement statement = (PreparedStatement) myConn.prepareStatement("DELETE FROM rev WHERE RevName=?");
                    
                    statement.setString(1, RevName);
                    statement.executeUpdate();
                    
                        
                     statement.close();
                         

               myConn.close();
			
		}
		catch (SQLException e) {
                    System.out.println(e);
		}
        
        updateJLIST();
        
        revlist.updateUI();
        
        
        
        //introducere baza de date si stergere din aceasta .
        String error= "Revision deleted !";
        JTextArea outputArea = new JTextArea(12,10);
        outputArea.setText(error);
        JOptionPane.showMessageDialog(null,error," Mesage ",JOptionPane.PLAIN_MESSAGE);
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMouseClicked

    private void insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseClicked
       
         insert s = new insert();
         
         s.setVisible(true);
         s.setResizable(false);


// TODO add your handling code here:
    }//GEN-LAST:event_insertMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AllRevisions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllRevisions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllRevisions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllRevisions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllRevisions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JList<String> revlist;
    // End of variables declaration//GEN-END:variables
}
