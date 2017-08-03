/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all_package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author oSikaNi iSraeL
 */
public class Admin_BirdPage extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
       Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    /**
     * Creates new form Admin_BirdPage
     */
    public Admin_BirdPage() {
        initComponents();
        
        bird_id.setVisible(false);
        conn = java_Connection.ConnecrDb();
       Update_table();
    }
    
    private void Update_table(){
    
        try {
            String sql="SELECT bird_id as 'Bird id', pen_number as 'Pen Number', cage_number as ' Cage Number', bird_type as 'Bird Type', breed_type as 'Breed Type', bird_Cate as 'Bird Category', gender as 'Gender', color as 'Bird Color', date_added as 'Date Added' FROM new_bird";
            pst=conn.prepareStatement(sql);
            
            rs=pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, e);
        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        cage_no = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        collor = new javax.swing.JTextField();
        Pen_no = new javax.swing.JTextField();
        bre_type = new javax.swing.JComboBox<>();
        bird_Type = new javax.swing.JComboBox<>();
        sex_ = new javax.swing.JComboBox<>();
        category = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        bird_id = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 8, 45));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Print_25px.png"))); // NOI18N
        jButton2.setText("Print");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("RockStar Farms");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1030, 60));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Filled Filter_25px.png"))); // NOI18N
        jLabel2.setText("Filter");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, 60));

        jButton1.setBackground(new java.awt.Color(8, 8, 45));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Plus_25px_1.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        jButton4.setBackground(new java.awt.Color(8, 8, 45));
        jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete_25px.png"))); // NOI18N
        jButton4.setText("Delete");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, -1, -1));

        jButton5.setBackground(new java.awt.Color(8, 8, 45));
        jButton5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit Property_25px.png"))); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, -1, -1));

        cage_no.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cage_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 80, 30));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bird_id", "bird_type", "breed_type", "color", "date_added" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 140, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search_25px_4.png"))); // NOI18N
        jLabel3.setText("Search");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 90, 40));

        jComboBox2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category A", "Categoty B", "Category C", "Category D" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 150, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1030, 290));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar_20px.png"))); // NOI18N
        jLabel4.setText("Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3D Farm_25px_1.png"))); // NOI18N
        jLabel5.setText("Pen Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Henhouse_25px.png"))); // NOI18N
        jLabel6.setText("Cage Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Chicken_25px.png"))); // NOI18N
        jLabel7.setText("Bird Type");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Chicken_25px.png"))); // NOI18N
        jLabel8.setText("Breed Type");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Category_20px.png"))); // NOI18N
        jLabel9.setText("Category");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gender_25px.png"))); // NOI18N
        jLabel10.setText("Sex");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fill Color_25px.png"))); // NOI18N
        jLabel11.setText("Color");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, -1, 40));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, 40));

        collor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(collor, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, 140, 30));

        Pen_no.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Pen_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 80, 30));

        bre_type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bre_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ancona", "Araucana", "Barnevelder", "Black Rock", "Brahma", "Cochin", "Cream Legbar", "Dorking", "Dutch Partridge", "Hybrids", "Japanese Bantam (Chabo)", "Marans", "Marsh Daisy", "Modern Game", "Old English Game", "Orpington", "Pekin (Lemon Cuckoo)", "Poland", "Rhode Island Red", "Seabright", "Silkie", "Speckeldy", "Sultan", "Sussex Light" }));
        jPanel1.add(bre_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 140, 30));

        bird_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bird_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chicken", "Turkey", "Duck", "Geese", "Pigeon", "Guinea", "Fowl", "Quail", "Ostrich", "Emu" }));
        jPanel1.add(bird_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 140, 30));

        sex_.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sex_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        jPanel1.add(sex_, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 150, 30));

        category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category A", "Category B", "Category C", "Category D" }));
        jPanel1.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 150, 30));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 490, 140, 30));

        jButton3.setBackground(new java.awt.Color(8, 8, 45));
        jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh_25px.png"))); // NOI18N
        jButton3.setText("Refresh");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(15);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 440, -1, 90));
        jPanel1.add(bird_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 550));

        jMenuBar1.setBackground(new java.awt.Color(8, 8, 45));
        jMenuBar1.setBorder(null);

        jMenu1.setBackground(new java.awt.Color(8, 8, 45));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu_15px_1.png"))); // NOI18N
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem1.setBackground(new java.awt.Color(8, 8, 45));
        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logout Rounded Left_15px.png"))); // NOI18N
        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(8, 8, 45));
        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cancel_15px.png"))); // NOI18N
        jMenuItem2.setText("Close");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(8, 8, 45));
        jMenuItem3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/About_15px.png"))); // NOI18N
        jMenuItem3.setText("About");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1062, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Update_table();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        login_Window lq = new login_Window();
        lq.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation (x-xMouse, y-yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(true);
        admin_New_Bird ad = new admin_New_Bird();
        ad.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
          try{

            int row = jTable1.getSelectedRow();
            String Table_click=(jTable1.getModel().getValueAt(row,0).toString());

            String sql ="SELECT * FROM new_bird WHERE  bird_id = '"+Table_click+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();

            if(rs.next()){

                String id = rs.getString("bird_id");
                bird_id.setText(id);
                String pen = rs.getString("pen_number");
                Pen_no.setText(pen);
                String cage = rs.getString("cage_number");
                cage_no.setText(cage);
                String bird = rs.getString("bird_type");
                bird_Type.setSelectedItem(bird);

                String breed =rs.getString("breed_type");
                bre_type.setSelectedItem(breed);

                String cat = rs.getString("bird_Cate");
                category.setSelectedItem(cat);

                String sex = rs.getString("gender");
                sex_.setSelectedItem(sex);

                String color =rs.getString("color");
                collor.setText(color);

            }

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        int row=jTable1.getSelectedRow();

        if(row==-1){

            JOptionPane.showMessageDialog(null, " Please Select a Row and Update Where Neccessary");

        }
        else{
            try{
                String value1=bird_id.getText();
                String value2=Pen_no.getText();
                String value3=cage_no.getText();
                String value4=(String) bird_Type.getSelectedItem();
                String value5=(String) bre_type.getSelectedItem();
                String value6=(String) category.getSelectedItem();
                String value7=(String) category.getSelectedItem();
                String value8=collor.getText();
                String value9=((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();

                String sql ="update new_bird set bird_id='"+value1+"', pen_number='"+value2+"', cage_number='"+value3+"', bird_type='"+value4+"', breed_type='"+value5+"', bird_Cate='"+value6+"', gender='"+value7+"', color='"+value8+"', date_added='"+value9+"' where bird_id='"+value1+"'";

                pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Update Successful");
            }

            catch(Exception e){

                JOptionPane.showMessageDialog(null, e);
            }

        }

    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_BirdPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_BirdPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_BirdPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_BirdPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_BirdPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pen_no;
    private javax.swing.JComboBox<String> bird_Type;
    private javax.swing.JTextField bird_id;
    private javax.swing.JComboBox<String> bre_type;
    private javax.swing.JTextField cage_no;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JTextField collor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<String> sex_;
    // End of variables declaration//GEN-END:variables
}
