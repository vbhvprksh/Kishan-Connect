/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kissan_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author vaibhav
 */
public class kissan_update extends javax.swing.JFrame {

    /**
     * Creates new form kissan_update
     */
    public kissan_update() {
        initComponents();
        setSize(900,800);
        setLocation(400,100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        tfid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tflocation = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfphone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfcrop = new javax.swing.JTextField();
        tfquantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfdetails = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfcrop1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel6.setText("Your ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(68, 90, 240, 26);

        tfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidActionPerformed(evt);
            }
        });
        getContentPane().add(tfid);
        tfid.setBounds(430, 90, 140, 20);

        jLabel7.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel7.setText("Location");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 310, 230, 40);
        getContentPane().add(tflocation);
        tflocation.setBounds(430, 320, 140, 20);

        jLabel8.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel8.setText("Phone No");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 370, 210, 40);
        getContentPane().add(tfphone);
        tfphone.setBounds(430, 380, 140, 20);

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel1.setText("Changed Crop Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(68, 130, 240, 30);

        jLabel10.setText("*optional");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(580, 450, 44, 14);

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel2.setText("Updated Quantity");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(68, 192, 260, 28);
        getContentPane().add(tfcrop);
        tfcrop.setBounds(430, 140, 140, 20);
        getContentPane().add(tfquantity);
        tfquantity.setBounds(430, 200, 140, 20);

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel4.setText("Updated Price (per Kg) ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(68, 250, 280, 30);

        tfprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpriceActionPerformed(evt);
            }
        });
        getContentPane().add(tfprice);
        tfprice.setBounds(430, 250, 140, 20);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 255, 204));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 600, 220, 80);

        jLabel5.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel5.setText("Extra Details");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 450, 240, 30);
        getContentPane().add(tfdetails);
        tfdetails.setBounds(430, 440, 140, 69);

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel3.setText("Crop Name to Update");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(68, 41, 280, 35);
        getContentPane().add(tfcrop1);
        tfcrop1.setBounds(430, 40, 140, 20);

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(840, 770, 55, 23);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\vaibhav\\Desktop\\Kissan_Images\\man&lassun.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 900, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfidActionPerformed

    private void tfpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpriceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfpriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs = null;

        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","");
            pst =  conn.prepareStatement("select Id,crop_name from kissan_data where Id=? and crop_name=?");
            pst.setString(1,tfid.getText());
            pst.setString(2,tfcrop1.getText());

            rs=pst.executeQuery();

            if(rs.next()){
                //
                try{
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","");
                        String id = tfid.getText();
                        String crop_name = tfcrop1.getText();
                        int qty = Integer.parseInt(tfquantity.getText());
                        int price = Integer.parseInt(tfprice.getText());
                        int phone_no = Integer.parseInt(tfphone.getText());

  pst = conn.prepareStatement("UPDATE `kissan_data` SET `crop_name`='"+tfcrop.getText()+"', `quantity`='"+qty+"', `price`='"+price+"', `location`='"+tflocation.getText()+"', `Phone_no`='"+phone_no+"',  `details`='"+tfdetails.getText()+"'  WHERE `Id`='"+id+"' AND `crop_name`='"+crop_name+"' ");

                    


                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Your data has been sucessfully Updated");

                }

                catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Please check your Entered Details");
                }

            }
            else{
                JOptionPane.showMessageDialog(null, "Not Updated");
            }

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot Login");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new kissan_login().setVisible(true);
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
            java.util.logging.Logger.getLogger(kissan_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kissan_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kissan_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kissan_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kissan_update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfcrop;
    private javax.swing.JTextField tfcrop1;
    private javax.swing.JTextField tfdetails;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tflocation;
    private javax.swing.JTextField tfphone;
    private javax.swing.JTextField tfprice;
    private javax.swing.JTextField tfquantity;
    // End of variables declaration//GEN-END:variables
}
