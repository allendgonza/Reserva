/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Asus
 */
public class form_enlace extends javax.swing.JFrame {

    /**
     * Creates new form form_enlace
     */
    public form_enlace() {
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
        jbtn_youtube = new javax.swing.JButton();
        jbtn_facebook = new javax.swing.JButton();
        jbtn_instagram = new javax.swing.JButton();
        jbtn_gmail = new javax.swing.JButton();
        jbtn_word = new javax.swing.JButton();
        jbtn_volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jbtn_youtube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo youtube1.png"))); // NOI18N
        jbtn_youtube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_youtubeActionPerformed(evt);
            }
        });

        jbtn_facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo facebook.png"))); // NOI18N
        jbtn_facebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_facebookActionPerformed(evt);
            }
        });

        jbtn_instagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo insta.png"))); // NOI18N
        jbtn_instagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_instagramActionPerformed(evt);
            }
        });

        jbtn_gmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo gmail1.png"))); // NOI18N
        jbtn_gmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_gmailActionPerformed(evt);
            }
        });

        jbtn_word.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo word1.png"))); // NOI18N
        jbtn_word.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_wordActionPerformed(evt);
            }
        });

        jbtn_volver.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_volver.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtn_volver.setText("VOLVER");
        jbtn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volverActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maycarpaint.png"))); // NOI18N
        jLabel1.setText("dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jbtn_youtube)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_word, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_facebook, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_gmail, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_instagram, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jbtn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtn_youtube))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtn_facebook, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_instagram, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_gmail, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_word, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 920));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_youtubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_youtubeActionPerformed
           if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI("https://www.youtube.com/");
                    desktop.browse(uri);
                } catch (Exception e) {

                }

            }
        }
    }//GEN-LAST:event_jbtn_youtubeActionPerformed

    private void jbtn_facebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_facebookActionPerformed
            if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI("https://es-la.facebook.com/");
                    desktop.browse(uri);
                } catch (Exception e) {

                }

            }
        }
    }//GEN-LAST:event_jbtn_facebookActionPerformed

    private void jbtn_instagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_instagramActionPerformed
         if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI("https://www.instagram.com/");
                    desktop.browse(uri);
                } catch (Exception e) {

                }

            }
        }
    }//GEN-LAST:event_jbtn_instagramActionPerformed

    private void jbtn_gmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_gmailActionPerformed
   if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI("https://www.gmail.com/mail/help/intl/es/about.html?iframe");
                    desktop.browse(uri);
                } catch (Exception e) {

                }

            }
        }

    }//GEN-LAST:event_jbtn_gmailActionPerformed

    private void jbtn_wordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_wordActionPerformed
          if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI("https://www.office.com/launch/word?ui=es-ES&rs=ES&auth=2");
                    desktop.browse(uri);
                } catch (Exception e) {

                }

            }
        }
    }//GEN-LAST:event_jbtn_wordActionPerformed

    private void jbtn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volverActionPerformed
     form_menuPrincipal fmp = new form_menuPrincipal();
        fmp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtn_volverActionPerformed

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
            java.util.logging.Logger.getLogger(form_enlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_enlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_enlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_enlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_enlace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtn_facebook;
    private javax.swing.JButton jbtn_gmail;
    private javax.swing.JButton jbtn_instagram;
    private javax.swing.JButton jbtn_volver;
    private javax.swing.JButton jbtn_word;
    private javax.swing.JButton jbtn_youtube;
    // End of variables declaration//GEN-END:variables
}