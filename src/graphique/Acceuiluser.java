/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

/**
 *
 * @author Frida
 */
public class Acceuiluser extends javax.swing.JFrame {

     Pret pretframe;
    private Consultation cs;
     Depot depotframe; 
    
    public Acceuiluser() {
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

        jPanel1 = new javax.swing.JPanel();
        pretuser = new javax.swing.JButton();
        consultationuser = new javax.swing.JButton();
        depotuser = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        rembourssementuser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pretuser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pretuser.setText("Prêt");
        pretuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretuserActionPerformed(evt);
            }
        });

        consultationuser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        consultationuser.setText("Consultation");
        consultationuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultationuserActionPerformed(evt);
            }
        });

        depotuser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        depotuser.setText("Depôt");
        depotuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depotuserActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Quitter");

        rembourssementuser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rembourssementuser.setText("Remboursement");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(pretuser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)))
                .addGap(164, 311, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rembourssementuser)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(depotuser)
                        .addGap(149, 149, 149))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(consultationuser)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pretuser)
                .addGap(42, 42, 42)
                .addComponent(consultationuser)
                .addGap(46, 46, 46)
                .addComponent(depotuser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(rembourssementuser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultationuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultationuserActionPerformed
        cs= new Consultation();
       cs.setBounds(4, 4, 200, 100);
       cs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       cs.setVisible(true);
       this.setVisible(false);
       this.setSize(700, 500);
       this.setLocationRelativeTo(null);
    }//GEN-LAST:event_consultationuserActionPerformed

    private void pretuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretuserActionPerformed
      Dimension p = Toolkit.getDefaultToolkit().getScreenSize();
        pretframe = new Pret();
        pretframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pretframe.setBounds(p.width/2 - 450/2, p.height/2 - 370/2, 450, 370);
        pretframe.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_pretuserActionPerformed

    private void depotuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depotuserActionPerformed
        
         Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        depotframe = new Depot();
        depotframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        depotframe.setBounds(d.width/2 - 450/2, d.height/2 - 370/2, 450, 370);
        depotframe.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_depotuserActionPerformed

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
            java.util.logging.Logger.getLogger(Acceuiluser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuiluser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuiluser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuiluser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuiluser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultationuser;
    private javax.swing.JButton depotuser;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pretuser;
    private javax.swing.JButton rembourssementuser;
    // End of variables declaration//GEN-END:variables
}