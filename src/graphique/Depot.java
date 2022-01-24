/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique;

import javax.swing.JFrame;

/**
 *
 * @author Frida
 */
public class Depot extends javax.swing.JFrame {

    /**
     * Creates new form Depot
     */
    private Acceuiluser d;
    public Depot() {
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

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        validedepot = new javax.swing.JButton();
        quitterdepot = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textcomptedepot = new javax.swing.JTextField();
        textmontantdepot = new javax.swing.JTextField();
        choixcaissedepot = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Montant");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("N° Compte");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Choix Caisse");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        validedepot.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        validedepot.setText("Validé");
        validedepot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validedepotActionPerformed(evt);
            }
        });
        jPanel1.add(validedepot, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        quitterdepot.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        quitterdepot.setText("Quitter");
        quitterdepot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterdepotActionPerformed(evt);
            }
        });
        jPanel1.add(quitterdepot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Depôt");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 50, 20));
        jPanel1.add(textcomptedepot, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 140, -1));
        jPanel1.add(textmontantdepot, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 140, -1));

        choixcaissedepot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choix", "caisse secours", "caisse epagne", "caisse ration", "caisse transport", "caisse developpement", " " }));
        jPanel1.add(choixcaissedepot, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 140, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphique/images/dmontant.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 330));

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

    private void quitterdepotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterdepotActionPerformed
       d= new Acceuiluser();
       d.setBounds(4, 4, 200, 100);
       d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       d.setVisible(true);
       this.setVisible(false);
       this.setSize(700, 500);
       this.setLocationRelativeTo(null);
    }//GEN-LAST:event_quitterdepotActionPerformed

    private void validedepotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validedepotActionPerformed
        // TODO add your handling code here:
        System.out.println("depot du compte :"+textcomptedepot.getText()+" d'un montant de : "+
                textmontantdepot.getText()+" dans la caisse "+
                (String)choixcaissedepot.getModel().getSelectedItem());
    }//GEN-LAST:event_validedepotActionPerformed

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
            java.util.logging.Logger.getLogger(Depot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Depot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Depot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Depot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Depot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> choixcaissedepot;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton quitterdepot;
    private javax.swing.JTextField textcomptedepot;
    private javax.swing.JTextField textmontantdepot;
    private javax.swing.JButton validedepot;
    // End of variables declaration//GEN-END:variables
}