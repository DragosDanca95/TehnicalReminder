
package clase;


import static clase.APP.UpdateExpDate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static javax.management.remote.JMXConnectorFactory.connect;
import static javax.rmi.PortableRemoteObject.connect;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class insert extends javax.swing.JFrame {

    
    public insert() {
        initComponents();
    }

   
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        revname = new javax.swing.JTextField();
        filename = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        okb2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        revdate = new com.toedter.calendar.JDateChooser();
        revtype = new javax.swing.JComboBox<>();
        color = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INSERT IN DB");

        jPanel1.setBackground(new java.awt.Color(35, 35, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Revision name :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Repetition type :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Revision date :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("File Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Color : ");

        revname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        filename.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 18));
        jLabel6.setText("All information will be inserted in to the data base .");

        okb2.setBackground(new java.awt.Color(99, 0, 134));
        okb2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        okb2.setForeground(new java.awt.Color(255, 255, 255));
        okb2.setText("OK ");
        okb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okb2MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(225, 246, 8));
        jLabel8.setText("Write necessary informations about tehnical revision ...");

        revdate.setDateFormatString("yyyy-MM-dd"); // NOI18N

        revtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "monthly", "triennial", "biannual", "annual" }));

        color.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "red ", "green", "blue ", "yellow", "cyan", "magenta", "orange", "pink", "gray", "lightGray", "darkGray", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(filename, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(revname)
                            .addComponent(revdate, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(revtype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(color, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(okb2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(revname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(revtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(revdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(filename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okb2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okb2MouseClicked

         String USERNAME = "root";
         String PASSWORD = "";
         String CONN = "jdbc:mysql://localhost:3306/revteh";
        
        Connection myConn = null;
        Statement stmt=null,state = null;
        ResultSet rs=null ,result = null;
        
        int ID=0;
        String RevName =revname.getText();
        int RevType=revtype.getSelectedIndex();
        String RevDate=((JTextField) revdate.getDateEditor().getUiComponent()).getText();
        String ExpDate=null;
        
        
        
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
                        
                        int rowCount = -1;
                try {
                     stmt = myConn.createStatement();
                     rs = stmt.executeQuery("SELECT COUNT(*) FROM rev " );
                        // get the number of rows from the result set
                        rs.next();
                        rowCount = rs.getInt(1);
                        ID=rowCount+1;
                        } finally {
                         rs.close();
                         stmt.close();
                         }

                
             try (PreparedStatement statement = (PreparedStatement) myConn.prepareStatement("INSERT INTO rev(ID,RevName,RevType,RevDate,FileName,Color,CountRev) VALUES (?,?,?,?,?,?,?)")) {
                 statement.setInt(1, ID);
                 statement.setString(2,RevName);
                 statement.setInt(3,RevType);
                 statement.setString(4,RevDate);
                 statement.setString(5, filename.getText());
                 statement.setInt(6,color.getSelectedIndex());
                 statement.setInt(7, 0);
                 statement.executeUpdate();
             }
                        
                  
                       
                        
                        
		myConn.close();	
		}
		catch (SQLException e) {
                    System.out.println(e);
		}
        
        
         APP n =new APP();
         APP.UpdateExpDate(RevDate,ID,RevType);
         AllRevisions.updateJLIST();
         AllRevisions.revlist.updateUI();
        String error= "Item inserted successfully !";
        JTextArea outputArea = new JTextArea(12,10);
        outputArea.setText(error);
        JOptionPane.showMessageDialog(null,error,"Successfully Mesage ",JOptionPane.PLAIN_MESSAGE);
        
        
        dispose();
        
      
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> color;
    private javax.swing.JTextField filename;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okb2;
    private com.toedter.calendar.JDateChooser revdate;
    private javax.swing.JTextField revname;
    private javax.swing.JComboBox<String> revtype;
    // End of variables declaration//GEN-END:variables
}
