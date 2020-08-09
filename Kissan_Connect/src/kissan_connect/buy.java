/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kissan_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author vaibhav
 */
public class buy extends javax.swing.JFrame {

    /**
     * Creates new form buy
     */
    public buy() {
        initComponents();
        setSize(800,900);
        setLocation(400,100);
    }
    public buy(String para){
        initComponents();
        tfid.setText(para);
        
        setSize(800,900);
        setLocation(400,100);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfqty = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfnego = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfid1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfcrop = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tfid.setEditable(false);
        tfid.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        tfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidActionPerformed(evt);
            }
        });
        getContentPane().add(tfid);
        tfid.setBounds(528, 47, 180, 32);

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel1.setText("Kissan Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(133, 44, 230, 32);

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel2.setText("Purchase Quantity");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(133, 383, 321, 35);

        tfqty.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        getContentPane().add(tfqty);
        tfqty.setBounds(528, 387, 180, 32);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 255));
        jButton1.setText("Place Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(339, 634, 258, 62);

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel3.setText("Negotiable Cost");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(133, 469, 307, 28);

        tfnego.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        getContentPane().add(tfnego);
        tfnego.setBounds(528, 465, 180, 32);

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel4.setText("Your Id");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(133, 112, 230, 22);

        tfid1.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        getContentPane().add(tfid1);
        tfid1.setBounds(528, 112, 180, 32);

        jLabel5.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel5.setText("Phone no");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(133, 550, 201, 22);

        tfno.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        getContentPane().add(tfno);
        tfno.setBounds(528, 553, 180, 22);

        jLabel6.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel6.setText("Your Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(133, 289, 219, 35);

        tfname.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        getContentPane().add(tfname);
        tfname.setBounds(528, 292, 180, 32);

        jLabel7.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel7.setText("Crop Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(133, 192, 230, 35);

        tfcrop.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        getContentPane().add(tfcrop);
        tfcrop.setBounds(528, 195, 180, 32);

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(710, 740, 130, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\vaibhav\\Desktop\\Kissan_Images\\tractor.jpeg")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 10, 850, 790);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfidActionPerformed
        // TODO add your handling code here:
        tfid.setEditable(false);
    }//GEN-LAST:event_tfidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Connection conn=null;
        PreparedStatement pst=null;
        
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","");
        pst = conn.prepareStatement("insert into status (customer_name,customer_id,your_id,nego_cost,quantity,phone_no,crop) values(?,?,?,?,?,?,?)");
//        
    
        int no = Integer.parseInt(tfno.getText());
        int nego_price = Integer.parseInt(tfnego.getText());
        int qty = Integer.parseInt(tfqty.getText());
    
    pst.setString(1, tfname.getText());
    pst.setString(2, tfid.getText());
    pst.setString(3, tfid1.getText());
    pst.setInt(4, nego_price);
    pst.setInt(5,qty);
    pst.setInt(6,no);
    pst.setString(7,tfcrop.getText());
    
    pst.executeUpdate();
    
    JOptionPane.showMessageDialog(null, "Your Order has been placed");
            

            
        }
        
        catch(Exception ex){
            System.out.println("Enter valid entries");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new first().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(buy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfcrop;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfid1;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfnego;
    private javax.swing.JTextField tfno;
    private javax.swing.JTextField tfqty;
    // End of variables declaration//GEN-END:variables
}
