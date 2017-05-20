/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giaodien;

import Giaodien.SinhvienNC.SinhvienNC;
import Giaodien.SinhvienTC.SinhvienTC;
import Giaodien.Admin.Admin;
import Ham_xu_li.ConnectDB;
import Ham_xu_li.checkLogIn;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;

public class Main extends javax.swing.JFrame {

    public static int user_id;
    public static String name;
    public static Connection conn = ConnectDB.getConnect();

    public Main() {
        initComponents();
        this.jLabel3.setText(checkLogIn.testConnect());
    }

    public static ResultSet rs = null;
    public static PreparedStatement pst = null;
    public String user;
    public static int role;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtStudentNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quan li sinh vien");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tên đăng nhập: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 150, 30));

        txtStudentNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentNumActionPerformed(evt);
            }
        });
        getContentPane().add(txtStudentNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 133, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mật khẩu:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 140, 30));

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordKeyPressed(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 133, 30));

        jButton1.setText("Log In");
        jButton1.setRolloverEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 100, 40));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 230, 90, 40));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 206, 201, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("HỆ THỐNG QUẢN LÍ SINH VIÊN ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.txtStudentNum.getText().length() == 0 || String.valueOf(this.txtpassword.getPassword()).length() == 0) {
                JOptionPane.showMessageDialog(null, "Ban chua nhap thong tin tai khoan hoac mat khau", "Thong bao", 1);
            } else {

                rs = checkLogIn.checkUser(this.txtStudentNum.getText(), String.valueOf(this.txtpassword.getPassword()));
                try {
                    if (rs.next()) {
                        // dang nhap thanh cong
                        user = this.txtStudentNum.getText();
                        //passwd = String.valueOf(this.txtpassword.getPassword());2

                        int role = rs.getInt(4);
                        name = rs.getString(2);
                        
                        //JOptionPane.showMessageDialog(null, role);
                        if (role == 0) {
                            Admin admin = new Admin();
                            this.setVisible(false);
                            admin.setVisible(true);
                        }
                        else if (role == 1) {
                        SinhvienTC svtc = new SinhvienTC();
                        this.setVisible(false);
                        svtc.setVisible(true);
                        user_id = rs.getInt(1);
                    } else if (role == 2) {
                        //JOptionPane.showMessageDialog(null, name);// cái này chạy
                        // cái dưới thfi k 
                        SinhvienNC svnc = new SinhvienNC();
                        this.setVisible(false);
                        svnc.setVisible(true);
                        user_id = rs.getInt(1);
                    }
                    }  else {
                        // dang nhap that bai
                        JOptionPane.showMessageDialog(null, "Tai khoan khong ton tai", "Thong bao", 0);

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e, "Thong bao", 1);
                }
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Ban chac chan muon thoat chuong trinh", "Thong bao", 2) == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.txtStudentNum.getText().length() == 0 || String.valueOf(this.txtpassword.getPassword()).length() == 0) {
                JOptionPane.showMessageDialog(null, "Ban chua nhap thong tin tai khoan hoac mat khau", "Thong bao", 1);
            } else {

                rs = checkLogIn.checkUser(this.txtStudentNum.getText(), String.valueOf(this.txtpassword.getPassword()));
                try {
                    if (rs.next()) {
                        // dang nhap thanh cong
                        user = this.txtStudentNum.getText();
                        //passwd = String.valueOf(this.txtpassword.getPassword());

                        int role = rs.getInt(4);
                        name = rs.getString(2);
                        
                        //JOptionPane.showMessageDialog(null, role);
                        if (role == 0) {
                            Admin admin = new Admin();
                            this.setVisible(false);
                            admin.setVisible(true);
                        }
                        else if (role == 1) {
                        SinhvienTC svtc = new SinhvienTC();
                        this.setVisible(false);
                        svtc.setVisible(true);
                        user_id = rs.getInt(1);
                    } else if (role == 2) {
                        //JOptionPane.showMessageDialog(null, name);// cái này chạy
                        // cái dưới thfi k 
                        SinhvienNC svnc = new SinhvienNC();
                        this.setVisible(false);
                        svnc.setVisible(true);
                        user_id = rs.getInt(1);
                    }
                    }  else {
                        // dang nhap that bai
                        JOptionPane.showMessageDialog(null, "Tai khoan khong ton tai", "Thong bao", 0);

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e, "Thong bao", 1);
                }
            }
        }
    }//GEN-LAST:event_txtpasswordKeyPressed

    private void txtStudentNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentNumActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
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
    private javax.swing.JTextField txtStudentNum;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
