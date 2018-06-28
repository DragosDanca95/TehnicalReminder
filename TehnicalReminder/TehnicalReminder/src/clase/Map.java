/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import static clase.FileMaker.getFileName;
import java.awt.AWTException;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import static java.lang.System.err;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import static javax.swing.UIManager.getColor;
/**
 *
 * @author HP
 */
public final class Map extends javax.swing.JFrame {

    /**
     * Creates new form Map
     */
    
    public List<String> chain = new ArrayList<String>();
    public List<Integer> colors = new ArrayList<Integer>();
    public  clase.ImagePanel maap;
    
    public   void  updateToolsCombo ()
    {
           
        
         
         
         
         
          
         for(int i=0;i<chain.size();i++){
            
           toolsrevcombo.addItem(chain.get(i));
             
    }
         Integer clr=-1; 
         String x=null;
         
         clr=colors.get(0);
            
         if(clr==0){
                x="red";
               col.setBackground(Color.red);
            }
            if(clr==1){
                x="green";
                col.setBackground(Color.green);
            }
            if(clr==2){
                x="blue";
                col.setBackground(Color.blue);
            }
            if(clr==3){
                x="yellow";
                col.setBackground(Color.yellow);
            }
            if(clr==4){
                x="cyan";
                col.setBackground(Color.cyan);
            }
            if(clr==5){
                x="magenta";
                col.setBackground(Color.magenta);
            }
            if(clr==6){
                x="orange";
                col.setBackground(Color.orange);
                
            }
            if(clr==7){
                x="pink";
                col.setBackground(Color.pink);
            }
            if(clr==8){
                x="gray";
                col.setBackground(Color.gray);
            }
            if(clr==9){
                x="lightGray";
               col.setBackground(Color.lightGray);
            }
            if(clr==10){
                x="darkGray";
                 col.setBackground(Color.darkGray);
            }
         
         
         
   }
     
     
    public void updateColor(Integer i){
         
       
         Integer clr=-1; 
         String x=null;
         
         clr=colors.get(i);
            
         if(clr==0){
                x="red";
               col.setBackground(Color.red);
            }
            if(clr==1){
                x="green";
                col.setBackground(Color.green);
            }
            if(clr==2){
                x="blue";
                col.setBackground(Color.blue);
            }
            if(clr==3){
                x="yellow";
                col.setBackground(Color.yellow);
            }
            if(clr==4){
                x="cyan";
                col.setBackground(Color.cyan);
            }
            if(clr==5){
                x="magenta";
                col.setBackground(Color.magenta);
            }
            if(clr==6){
                x="orange";
                col.setBackground(Color.orange);
                
            }
            if(clr==7){
                x="pink";
                col.setBackground(Color.pink);
            }
            if(clr==8){
                x="gray";
                col.setBackground(Color.gray);
            }
            if(clr==9){
                x="lightGray";
               col.setBackground(Color.lightGray);
            }
            if(clr==10){
                x="darkGray";
                 col.setBackground(Color.darkGray);
            }
     }

    public void updateComboRefresh(){
         
      
         
      for(int i=0;i<chain.size();i++){
            
        comborefresh.addItem(chain.get(i));
           
       
        }
      comborefresh.addItem("All");
     }
    
    public String getStringColor( Integer clr){
        
         String x=null;
               
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
        
        return x;
    }
    
    public void setColor(String clr){
         
               
         if("red".equals(clr)){
             
              col.setBackground(Color.red); 
            }
            if("green".equals(clr)){
                
               col.setBackground(Color.green);
            }
            if("blue".equals(clr)){
               
                col.setBackground(Color.blue);
            }
            if("yellow".equals(clr)){
                
                  col.setBackground(Color.yellow);
            }
            if("cyan".equals(clr)){
                
                col.setBackground(Color.cyan);
            }
            if("magenta".equals(clr)){
            
               col.setBackground(Color.magenta);
            }
            if("orange".equals(clr)){
                
               
                  col.setBackground(Color.orange);
            }
            if("pink".equals(clr)){
              
               col.setBackground(Color.pink);
            }
            if("gray".equals(clr)){
              
                  col.setBackground(Color.gray);
            }
            if("lightGray".equals(clr)){
                
              col.setBackground(Color.lightGray);
            }
            if("darkGray".equals(clr)){
                
                  col.setBackground(Color.darkGray);
            }
            
            
        
 }
    public void updateTblRefresh(Integer index){
         
        DefaultTableModel model =  (DefaultTableModel) tbrefresh.getModel();
        int rowCount = model.getRowCount();

           for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
            }
            
       if(index == chain.size())
       {
          for(int i=0;i<chain.size();i++){

           
        
        
        String view=getStringColor(colors.get(i));
        Object[] rows ={chain.get(i),view};
        
         
        model.addRow(rows);
        tbrefresh.setModel(model);
        }
       }else{
       
       
        String view=getStringColor(colors.get(index));
        Object[] rows ={chain.get(index),view};
        
        
         
        model.addRow(rows);
        tbrefresh.setModel(model);
       
       
       }
           
        
    }
    
    
 
  
    public void  drawMap() {
        
       
         maap = new clase.ImagePanel(new ImageIcon("C:\\Users\\HP\\Desktop\\imge.jpg").getImage());
          
         Insets insets = schita.getInsets();
        

         schita.add(maap,0);
       
         
         
    }
    
     public Map(){
         
        initComponents();
        schita.equals(maap);
        APP.updateList(chain,colors);
        updateComboRefresh();
        drawMap();
        updateToolsCombo();
        finall.clear();
        
        setLocationRelativeTo(null);
               
       
    }
    
   
   private Graphics2D g ;
   private int x1,x2,y1,y2;
   private Line2D linebuffer;
   private Rectangle2D rectangle;
   private Point2D point;
   private Ellipse2D elipse;
   private final List<Line2D> lines =new ArrayList();
   private final List<Rectangle2D> rectangles =new ArrayList();
   private final List<Point2D> points =new ArrayList();
   private final List<Ellipse2D> elipses =new ArrayList();
   public List<Points> finall=new ArrayList<Points>();
   
   public Integer CounterClick=0;
   public String FileName;
    
    
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
        schita = new javax.swing.JPanel();
        tooltxt = new javax.swing.JTabbedPane();
        layerpanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comborefresh = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        refreshmap = new javax.swing.JButton();
        savemap = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbrefresh = new javax.swing.JTable();
        toolspanel = new javax.swing.JPanel();
        toolsrevcombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        col = new javax.swing.JPanel();
        clearpoints = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        pointtxt = new javax.swing.JTextArea();
        savepoints = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tooltext = new javax.swing.JTextArea();
        filepanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        coord = new javax.swing.JLabel();
        pos = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        open = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        save = new javax.swing.JMenuItem();
        saveas = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        quit = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        copy = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();
        cut = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        tools = new javax.swing.JMenu();
        lineselect = new javax.swing.JRadioButtonMenuItem();
        rectangleselect = new javax.swing.JRadioButtonMenuItem();
        elipseselected = new javax.swing.JRadioButtonMenuItem();
        pointselect = new javax.swing.JRadioButtonMenuItem();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MAP");
        setBackground(new java.awt.Color(35, 35, 35));
        setExtendedState(MAXIMIZED_BOTH);
        setSize(new java.awt.Dimension(0, 0));

        schita.setBackground(new java.awt.Color(102, 102, 255));
        schita.setForeground(new java.awt.Color(35, 35, 35));
        schita.setAutoscrolls(true);
        schita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        schita.setFocusCycleRoot(true);
        schita.setFocusTraversalPolicyProvider(true);
        schita.setNextFocusableComponent(maap);
        schita.setVerifyInputWhenFocusTarget(false);
        schita.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                schitaMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                schitaMouseMoved(evt);
            }
        });
        schita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                schitaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                schitaMouseReleased(evt);
            }
        });

        tooltxt.setBackground(new java.awt.Color(99, 0, 134));
        tooltxt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 255)));
        tooltxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tooltxt.setMaximumSize(new java.awt.Dimension(180, 32767));

        layerpanel.setBackground(new java.awt.Color(35, 35, 35));
        layerpanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Revision :");

        comborefresh.setBackground(new java.awt.Color(0, 102, 102));
        comborefresh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comborefresh.setForeground(new java.awt.Color(255, 255, 255));
        comborefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comborefreshActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("This is the color :");

        refreshmap.setBackground(new java.awt.Color(99, 0, 134));
        refreshmap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        refreshmap.setForeground(new java.awt.Color(255, 255, 255));
        refreshmap.setText("Refresh Map ");
        refreshmap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshmapMouseClicked(evt);
            }
        });

        savemap.setBackground(new java.awt.Color(99, 0, 134));
        savemap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        savemap.setForeground(new java.awt.Color(255, 255, 255));
        savemap.setText("Save Map ");
        savemap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savemapMouseClicked(evt);
            }
        });

        tbrefresh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rev Name", "Color"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbrefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbrefreshMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbrefresh);

        javax.swing.GroupLayout layerpanelLayout = new javax.swing.GroupLayout(layerpanel);
        layerpanel.setLayout(layerpanelLayout);
        layerpanelLayout.setHorizontalGroup(
            layerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comborefresh, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layerpanelLayout.createSequentialGroup()
                        .addGroup(layerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(refreshmap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savemap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layerpanelLayout.setVerticalGroup(
            layerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comborefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refreshmap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savemap)
                .addContainerGap(470, Short.MAX_VALUE))
        );

        tooltxt.addTab("Layers", layerpanel);

        toolspanel.setBackground(new java.awt.Color(35, 35, 35));
        toolspanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        toolsrevcombo.setBackground(new java.awt.Color(0, 102, 102));
        toolsrevcombo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        toolsrevcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolsrevcomboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Revision :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("This is the color :");

        col.setBackground(new java.awt.Color(255, 0, 0));
        col.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 102, 0)));

        javax.swing.GroupLayout colLayout = new javax.swing.GroupLayout(col);
        col.setLayout(colLayout);
        colLayout.setHorizontalGroup(
            colLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        colLayout.setVerticalGroup(
            colLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        clearpoints.setBackground(new java.awt.Color(99, 0, 134));
        clearpoints.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        clearpoints.setForeground(new java.awt.Color(255, 255, 255));
        clearpoints.setText("Clean map ");
        clearpoints.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearpointsMouseClicked(evt);
            }
        });

        pointtxt.setEditable(false);
        pointtxt.setColumns(20);
        pointtxt.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        pointtxt.setRows(5);
        jScrollPane3.setViewportView(pointtxt);

        savepoints.setBackground(new java.awt.Color(99, 0, 134));
        savepoints.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        savepoints.setForeground(new java.awt.Color(255, 255, 255));
        savepoints.setText("Save point to file");
        savepoints.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savepointsMouseClicked(evt);
            }
        });
        savepoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savepointsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout toolspanelLayout = new javax.swing.GroupLayout(toolspanel);
        toolspanel.setLayout(toolspanelLayout);
        toolspanelLayout.setHorizontalGroup(
            toolspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(toolspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toolsrevcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(toolspanelLayout.createSequentialGroup()
                        .addGroup(toolspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(toolspanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(col, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(savepoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(clearpoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
        );
        toolspanelLayout.setVerticalGroup(
            toolspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolspanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toolsrevcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(toolspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(col, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(clearpoints)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(savepoints)
                .addContainerGap(426, Short.MAX_VALUE))
        );

        tooltxt.addTab("Tools", toolspanel);

        tooltext.setColumns(20);
        tooltext.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tooltext.setRows(5);
        tooltext.setText("test text\n");
        tooltext.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(tooltext);

        tooltxt.addTab("File", jScrollPane1);

        filepanel.setBackground(new java.awt.Color(35, 35, 35));

        jLabel5.setBackground(new java.awt.Color(35, 35, 35));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Era Shopping Park Iasi -> Map ");

        javax.swing.GroupLayout filepanelLayout = new javax.swing.GroupLayout(filepanel);
        filepanel.setLayout(filepanelLayout);
        filepanelLayout.setHorizontalGroup(
            filepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        filepanelLayout.setVerticalGroup(
            filepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap())
        );

        coord.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        coord.setText("Coordinate :");

        pos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pos.setText("Position :");

        menubar.setBackground(new java.awt.Color(99, 0, 134));
        menubar.setForeground(new java.awt.Color(99, 0, 134));

        file.setText("File");

        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        file.add(New);

        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        file.add(open);
        file.add(jSeparator1);

        save.setText("Save");
        file.add(save);

        saveas.setText("Save as...");
        file.add(saveas);
        file.add(jSeparator2);

        quit.setText("Quit");
        file.add(quit);

        menubar.add(file);

        edit.setText("Edit");

        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        edit.add(copy);

        paste.setText("Pase");
        edit.add(paste);

        cut.setText("Cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        edit.add(cut);

        delete.setText("Delete");
        edit.add(delete);

        menubar.add(edit);

        tools.setText("Tools");

        lineselect.setSelected(true);
        lineselect.setText("Line");
        tools.add(lineselect);

        rectangleselect.setText("Rectangle");
        tools.add(rectangleselect);

        elipseselected.setText("Ellipse");
        elipseselected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elipseselectedActionPerformed(evt);
            }
        });
        tools.add(elipseselected);

        pointselect.setText("Point");
        tools.add(pointselect);

        menubar.add(tools);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(schita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(coord, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tooltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(filepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tooltxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(schita, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coord)
                    .addComponent(pos)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed

   tooltext.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_NewActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyActionPerformed

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cutActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed

    int confirm =JOptionPane.showConfirmDialog(null, " Want to open a new  file ?");
    
    if(confirm==0){
        
        String cwd=System.getProperty("user.dir");
        JFileChooser chooser=new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setMultiSelectionEnabled(false);
        chooser.setDialogTitle("Open a txt file");
        FileNameExtensionFilter filter= new FileNameExtensionFilter("Text Files","txt");
        chooser.setFileFilter(filter);
        
        int returnVal=chooser.showOpenDialog(Map.this);
        
        if(returnVal==JFileChooser.APPROVE_OPTION){
            
            String filename=chooser.getSelectedFile().getPath();
            FileReader reader=null;
            try{
                reader=new FileReader(filename);
            }catch(FileNotFoundException ex){
                Logger.getLogger(Map.class.getName()).log(Level.SEVERE,null,ex);
            }
            
           
            try {
                tooltext.read(reader, filename);
            } catch (IOException ex) {
                Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
            
        }
        
        
        
    }


        // TODO add your handling code here:
    }//GEN-LAST:event_openActionPerformed
  
    private void savepointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savepointsActionPerformed

     
        
        
       
    }//GEN-LAST:event_savepointsActionPerformed

    private void toolsrevcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolsrevcomboActionPerformed

        CounterClick=0;
       int index=toolsrevcombo.getSelectedIndex();
       FileName=getFileName(chain.get(index));
      updateColor(toolsrevcombo.getSelectedIndex());
        clearMap();
        repaint();
        

    // TODO add your handling code here:
    }//GEN-LAST:event_toolsrevcomboActionPerformed

    private void comborefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comborefreshActionPerformed

       updateTblRefresh(comborefresh.getSelectedIndex());
       System.out.println(comborefresh.getSelectedIndex());
       System.out.println(chain.size());

        // TODO add your handling code here:
    }//GEN-LAST:event_comborefreshActionPerformed

    private void elipseselectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elipseselectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elipseselectedActionPerformed

    private void schitaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schitaMouseReleased

        if(lineselect.isSelected()){

            maap.update(g);
            x2=evt.getX();
            y2=evt.getY();
            linebuffer=new Line2D.Float((float)x1,(float)y1,(float)x2,(float)y2);
            lines.add(linebuffer);
            DrawAll(col.getBackground());
            
   Points pline = new Points() ;
            pline.setType("line");
            pline.setx1y1(x1, y1);
            pline.setx2y2(x2, y2);
            finall.add(pline);
        }

        if(rectangleselect.isSelected()){

            maap.update(g);
            x2=evt.getX();
            y2=evt.getY();
            rectangle=new Rectangle2D.Float((float)x1,(float)y1,(float)x2,(float)y2);
            rectangles.add(rectangle);
            DrawAll(col.getBackground());
            
   Points prectangle =new Points();
            
            prectangle.setType("rectangle");
            prectangle.setx1y1(x1, y1);
            prectangle.setx2y2(x2, y2);
            finall.add(prectangle);
        }
        if(elipseselected.isSelected()){

            maap.update(g);
            x2=evt.getX();
            y2=evt.getY();
            elipse=new Ellipse2D.Float((float)x1,(float)y1,(float)x2,(float)y2);
            elipses.add(elipse);
            DrawAll(col.getBackground());
            
     Points pelipse =new Points();
            
            pelipse.setType("elipse");
            pelipse.setx1y1(x1, y1);
            pelipse.setx2y2(x2, y2);
            
            finall.add(pelipse);

        }
        if(pointselect.isSelected()){

            maap.update(g);

            point=new Point2D.Float((float)x1,(float)y1);
            points.add(point);
            DrawAll(col.getBackground());

        }

        
    }//GEN-LAST:event_schitaMouseReleased

    private void schitaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schitaMousePressed
        
        CounterClick=CounterClick+1;
        if(g==null){

            g=(Graphics2D) schita.getGraphics();
            
        }
        x1=evt.getX();
        y1=evt.getY();
        x2=evt.getX();
        y2=evt.getY();
        

        
    }//GEN-LAST:event_schitaMousePressed

    private void schitaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schitaMouseMoved

        coord.setText(("Coordinate = " + evt.getX()+" , "+ evt.getY()));

        
    }//GEN-LAST:event_schitaMouseMoved

    private void schitaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schitaMouseDragged

        if(lineselect.isSelected()){
            maap.update(g);
            x2=evt.getX();
            y2=evt.getY();

            linebuffer=new Line2D.Float((float)x1,(float)y1,(float)x2,(float)y2);

            DrawAll(col.getBackground());
            g.draw(linebuffer);
        

            String txt="p"+CounterClick+" : line \n"+"x1:"+x1+"\n"+"y1:"+y1+"\n"+"x2:"+x2+"\n"+"y2:"+y2+"\n";
            
            pointtxt.setText(txt);
            pointtxt.repaint();
           
        }

        if(rectangleselect.isSelected()){

            maap.update(g);
            x2=evt.getX();
            y2=evt.getY();
            rectangle=new Rectangle2D.Float((float)x1,(float)y1,(float)x2,(float)y2);

            DrawAll(col.getBackground());
            g.draw(rectangle);

            
            String txt="p"+CounterClick+" : rectangle \n"+"x1:"+x1+"\n"+"y1:"+y1+"\n"+"x2:"+x2+"\n"+"y2:"+y2+"\n";
            
            pointtxt.setText(txt);
            pointtxt.repaint();

        }
        if(elipseselected.isSelected()){

            maap.update(g);
            x2=evt.getX();
            y2=evt.getY();
            elipse=new Ellipse2D.Float((float)x1,(float)y1,(float)x2,(float)y2);

            DrawAll(col.getBackground());
            g.draw(elipse);
            
           
            
            String txt="p"+CounterClick+" : elipse \n"+"x1:"+x1+"\n"+"y1:"+y1+"\n"+"x2:"+x2+"\n"+"y2:"+y2+"\n";
            
            pointtxt.setText(txt);
            pointtxt.repaint();

        }
        if(pointselect.isSelected()){

            maap.update(g);

            point=new Point2D.Float((float)x1,(float)y1);

            DrawAll(col.getBackground());
            g.draw((Shape) point);

        }

        pos.setText(("Position = " + evt.getX()+" , "+ evt.getY()));
        // TODO add your handling code here:
    }//GEN-LAST:event_schitaMouseDragged

    private void clearpointsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearpointsMouseClicked
 
        CounterClick=0;

     clearMap();
     repaint();


        // TODO add your handling code here:
    }//GEN-LAST:event_clearpointsMouseClicked

    private void savepointsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savepointsMouseClicked

        FileMaker.writeToFile(FileName,finall,col.getBackground().toString());
      
        String error= "Points saved succesfully, please open "+FileName+".txt in <File> menu  !";
        JTextArea outputArea = new JTextArea(12,10);
        outputArea.setText(error);
        JOptionPane.showMessageDialog(null,error,"Mesage ",JOptionPane.PLAIN_MESSAGE);
          
          finall.clear();

        // TODO add your handling code here:
    }//GEN-LAST:event_savepointsMouseClicked

    private void refreshmapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshmapMouseClicked

         
        if(tbrefresh.getSelectedRow()==-1)
        {
             String error= "Please select the revision  that you want to show on map !";
            JTextArea outputArea = new JTextArea(12,10);
            outputArea.setText(error);
            JOptionPane.showMessageDialog(null,error,"Error Mesage ",JOptionPane.ERROR_MESSAGE);
        }
        else 
        {    
            int row =tbrefresh.getSelectedRow();
            
            List<Points> list=new ArrayList<Points>();
            
            String fname=tbrefresh.getModel().getValueAt(row,0).toString();
            String color=tbrefresh.getModel().getValueAt(row, 1).toString();
            
            System.out.println(color);
            String filename=getFileName(fname);
            lines.clear();
            rectangles.clear();
            elipses.clear();
            
            FileMaker.readFromFile(filename,lines,rectangles,elipses);

           
             
             
            
            
            g=(Graphics2D) schita.getGraphics();
            maap.update(g);
            DrawAll(col.getBackground());
            
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshmapMouseClicked

    private void tbrefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbrefreshMouseClicked

       int row =tbrefresh.getSelectedRow();
       String color=tbrefresh.getModel().getValueAt(row, 1).toString();
       setColor(color);

        // TODO add your handling code here:
    }//GEN-LAST:event_tbrefreshMouseClicked

    private void savemapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savemapMouseClicked

 
        
 try {
            Robot robot = new Robot();
            String format = "jpg";
            int row =tbrefresh.getSelectedRow();
            
            String name=tbrefresh.getModel().getValueAt(row, 0).toString();
            String fileName = name+ "." + format;
             
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, format, new File("C:\\Users\\HP\\Desktop\\"+fileName));
             
            String error="The "+name+"has saved succesfully as image!";
            JTextArea outputArea = new JTextArea(12,10);
            outputArea.setText(error);
            JOptionPane.showMessageDialog(null,error,"Message",JOptionPane.PLAIN_MESSAGE);
        } catch (AWTException | IOException ex) {
           String error= "Image don't saved !!";
           
            JTextArea outputArea = new JTextArea(12,10);
            outputArea.setText(error);
            JOptionPane.showMessageDialog(null,error,"Error !",JOptionPane.ERROR_MESSAGE);
        }
    
  


        
    }//GEN-LAST:event_savemapMouseClicked

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
                new Map().setVisible(true);

                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem New;
    private javax.swing.JButton clearpoints;
    private javax.swing.JPanel col;
    private javax.swing.JComboBox<String> comborefresh;
    private javax.swing.JLabel coord;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenu edit;
    private javax.swing.JRadioButtonMenuItem elipseselected;
    private javax.swing.JMenu file;
    private javax.swing.JPanel filepanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPanel layerpanel;
    private javax.swing.JRadioButtonMenuItem lineselect;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem open;
    private javax.swing.JMenuItem paste;
    private javax.swing.JRadioButtonMenuItem pointselect;
    public javax.swing.JTextArea pointtxt;
    private javax.swing.JLabel pos;
    private javax.swing.JMenuItem quit;
    private javax.swing.JRadioButtonMenuItem rectangleselect;
    private javax.swing.JButton refreshmap;
    private javax.swing.JMenuItem save;
    private javax.swing.JMenuItem saveas;
    private javax.swing.JButton savemap;
    private javax.swing.JButton savepoints;
    private javax.swing.JPanel schita;
    public javax.swing.JTable tbrefresh;
    private javax.swing.JMenu tools;
    private javax.swing.JPanel toolspanel;
    public javax.swing.JComboBox<String> toolsrevcombo;
    private javax.swing.JTextArea tooltext;
    private javax.swing.JTabbedPane tooltxt;
    // End of variables declaration//GEN-END:variables

    private void DrawAll(Color c) {
        
        g.setColor(c);
        
        for(int i=0;i<lines.size();i++){
            
            g.draw(lines.get(i));
        
        }
        
        for(int i=0;i<rectangles.size();i++){
            
            
            g.draw(rectangles.get(i));
        }
         
        for(int i=0;i<elipses.size();i++){
            
            
            g.draw(elipses.get(i));
        }
       for(int i=0;i<points.size();i++){
            
            
            g.draw((Shape)points.get(i));
        }
       
        }
    
    public void clearMap(){
        
        lines.clear();
        rectangles.clear();
        elipses.clear();
        points.clear();
        pointtxt.setText("");
        finall.clear();

    }
 
    }
  
      
    

