/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giaodien.Admin;

import Giaodien.Main;
import javax.swing.JOptionPane;

/**
 *
 * @author duc
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    
    public static Ham_xu_li.Admin admin = new Ham_xu_li.Admin(1, "admin", "admin", 0);
    
    public Admin() {
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

        xinchao = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        MoTK = new javax.swing.JButton();
        MoLop = new javax.swing.JButton();
        XepLop = new javax.swing.JButton();
        VaoDiem = new javax.swing.JButton();
        XetTN = new javax.swing.JButton();
        btSort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        xinchao.setText("Xin chào, admin");

        LogOut.setText("Log Out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        MoTK.setText("Mở tài khoản");
        MoTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoTKActionPerformed(evt);
            }
        });

        MoLop.setText("Mở học phần");
        MoLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoLopActionPerformed(evt);
            }
        });

        XepLop.setText("Mở lớp học");
        XepLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XepLopActionPerformed(evt);
            }
        });

        VaoDiem.setText("Vào Điểm");
        VaoDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaoDiemActionPerformed(evt);
            }
        });

        XetTN.setText("Xét Tốt Nghiệp");
        XetTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XetTNActionPerformed(evt);
            }
        });

        btSort.setText("Sắp xếp lớp");
        btSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(xinchao, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LogOut))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MoTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(VaoDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(XetTN))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MoLop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(XepLop, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 41, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xinchao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MoTK)
                    .addComponent(MoLop)
                    .addComponent(XepLop))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VaoDiem)
                    .addComponent(XetTN)
                    .addComponent(btSort))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Ban chac chan muon thoat ?", "Thong bao", 2) == 0) {
            this.dispose();
            Main main = new Main();
            main.setVisible(true);
        }
    }//GEN-LAST:event_LogOutActionPerformed

    private void MoTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoTKActionPerformed
        this.setVisible(false);
        MoTK motk = new MoTK();
        motk.setVisible(true);
    }//GEN-LAST:event_MoTKActionPerformed

    private void VaoDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaoDiemActionPerformed
        this.setVisible(false);
        Vaodiem vaodiem = new Vaodiem();
        vaodiem.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_VaoDiemActionPerformed

    private void MoLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoLopActionPerformed
        // TODO add your handling code here:
        MoHocPhan add_subject=new MoHocPhan();
        add_subject.setVisible(true);
    }//GEN-LAST:event_MoLopActionPerformed

    private void XepLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XepLopActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MoLop dslop = new MoLop();
        dslop.setVisible(true);
    }//GEN-LAST:event_XepLopActionPerformed

    private void XetTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XetTNActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        XetTotNghiep xet_tn = new XetTotNghiep();
        xet_tn.setVisible(true);
    }//GEN-LAST:event_XetTNActionPerformed

    private void btSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSortActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        XepLopNC sapxep = new XepLopNC();
        sapxep.setVisible(true);
    }//GEN-LAST:event_btSortActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOut;
    private javax.swing.JButton MoLop;
    private javax.swing.JButton MoTK;
    private javax.swing.JButton VaoDiem;
    private javax.swing.JButton XepLop;
    private javax.swing.JButton XetTN;
    private javax.swing.JButton btSort;
    private javax.swing.JLabel xinchao;
    // End of variables declaration//GEN-END:variables
}