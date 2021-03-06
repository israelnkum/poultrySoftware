/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all_package;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author oSikaNi iSraeL
 */
public class Employee_new_bird extends javax.swing.JFrame {
             Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    /**
     * Creates new form Employee_new_bird
     */
    public Employee_new_bird() {
        initComponents();
            conn = java_Connection.ConnecrDb();
        
        jPanel2.setBackground(new Color(0,0,0,7));
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
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        color_type = new javax.swing.JTextField();
        pen_no = new javax.swing.JTextField();
        cage_no = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox<>();
        bird_type = new javax.swing.JComboBox<>();
        breed_type = new javax.swing.JComboBox<>();
        bird_cat = new javax.swing.JComboBox<>();
        dateAdded = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 8, 45));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pen Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cage Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bird Type");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Type of Breed");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bird Category");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 150, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sex");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 150, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Color");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date Added");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 150, 30));

        jButton1.setBackground(new java.awt.Color(8, 8, 45));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Plus_25px.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        jButton2.setBackground(new java.awt.Color(8, 8, 45));
        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back_25px_4.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        color_type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(color_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 70, 30));

        pen_no.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pen_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pen_noKeyPressed(evt);
            }
        });
        jPanel1.add(pen_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 70, 30));

        cage_no.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cage_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 70, 30));

        sex.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose...", "Female", "Male" }));
        jPanel1.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 170, 30));

        bird_type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bird_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose...", "Chicken", "Turkey", "Duck", "Geese", "Pigeon", "Guinea", "Fowl", "Quail", "Ostrich", "Emu" }));
        jPanel1.add(bird_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 170, 30));

        breed_type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        breed_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose...", "Ancona", "Araucana", "Barnevelder", "Black Rock", "Brahma", "Cochin", "Cream Legbar", "Dorking", "Dutch Partridge", "Hybrids", "Japanese Bantam (Chabo)", "Marans", "Marsh Daisy", "Modern Game", "Old English Game", "Orpington", "Pekin (Lemon Cuckoo)", "Poland", "Rhode Island Red", "Seabright", "Silkie", "Speckeldy", "Sultan", "Sussex Light" }));
        jPanel1.add(breed_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 170, 30));

        bird_cat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bird_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose...", "Category A", "Category B", "Category C", "Category D" }));
        jPanel1.add(bird_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 170, 30));

        dateAdded.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(dateAdded, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 370, 540));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        setSize(new java.awt.Dimension(619, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         if(
                bird_type.getSelectedItem().equals("Choose one...")
                || pen_no.getText().isEmpty() 
                ||cage_no.getText().isEmpty() 
                ||breed_type.getSelectedItem().equals("Choose one...") 
                ||  bird_cat.getSelectedItem().equals("Choose one...")
                ||  sex.getSelectedItem().equals("Choose one...")
                ||color_type.getText().isEmpty())
                
        {
        
         setVisible(false);

        employee_Add_bird_error lf = new employee_Add_bird_error();

        lf.setVisible(true);
        }
        
        else{
        
        Connection  conn = java_Connection.ConnecrDb();
       
       PreparedStatement ps;
         ResultSet rs = null;
         
          
         try{
             String sql ="INSERT INTO new_bird (pen_number, cage_number, bird_type, breed_type, bird_Cate, gender, color,date_added) VALUES (?,?,?,?,?,?,?,?)";
         
             ps=conn.prepareStatement(sql);
             ps.setString(1,pen_no.getText());
             ps.setString(2, cage_no.getText());
             ps.setString(3,(String)bird_type.getSelectedItem());
             ps.setString(4,(String)breed_type.getSelectedItem());
             ps.setString(5,(String)bird_cat.getSelectedItem());
             ps.setString(6,(String)sex.getSelectedItem());
             ps.setString(7, color_type.getText());
             ps.setString(8, ((JTextField)dateAdded.getDateEditor().getUiComponent()).getText());
             
             ps.execute();
             JOptionPane.showMessageDialog(null, "success");
             
             pen_no.setText("");
             cage_no.setText("");
             bird_type.setSelectedItem("Choose...");
             breed_type.setSelectedItem("Choose...");
             bird_cat.setSelectedItem("Choose...");
             sex.setSelectedItem("Choose...");
             color_type.setText("");
             dateAdded.setDate(null);
             
            
         }
         catch(Exception e){
         
             JOptionPane.showMessageDialog(null, e);
         }
           finally{
        
        try{
         rs.close();
         pst.close();
        }
        catch(Exception e){
        
        
        }}
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void pen_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pen_noKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_pen_noKeyPressed

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
            java.util.logging.Logger.getLogger(Employee_new_bird.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_new_bird.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_new_bird.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_new_bird.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_new_bird().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bird_cat;
    private javax.swing.JComboBox<String> bird_type;
    private javax.swing.JComboBox<String> breed_type;
    private javax.swing.JTextField cage_no;
    private javax.swing.JTextField color_type;
    private com.toedter.calendar.JDateChooser dateAdded;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField pen_no;
    private javax.swing.JComboBox<String> sex;
    // End of variables declaration//GEN-END:variables
}
