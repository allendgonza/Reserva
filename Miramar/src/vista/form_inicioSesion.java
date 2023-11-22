
package vista;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


/**
 *
 * @author Asus
 */
public class form_inicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form form_menuPrincipal
     */
    public form_inicioSesion() {
        initComponents();
         this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabelusuario = new javax.swing.JLabel();
        jtxt_usuario = new javax.swing.JTextField();
        jLabelpassw = new javax.swing.JLabel();
        jtxt_password = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jtbn_inicioSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, -1, -1));

        jLabelusuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelusuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelusuario.setText("Usuario:");
        getContentPane().add(jLabelusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));
        getContentPane().add(jtxt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 330, -1));

        jLabelpassw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelpassw.setForeground(new java.awt.Color(255, 255, 255));
        jLabelpassw.setText("Password:");
        getContentPane().add(jLabelpassw, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));
        getContentPane().add(jtxt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 330, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("INICIAR SESION");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));

        jtbn_inicioSesion.setBackground(new java.awt.Color(0, 0, 0));
        jtbn_inicioSesion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtbn_inicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        jtbn_inicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoini.jpg"))); // NOI18N
        jtbn_inicioSesion.setText("sd");
        getContentPane().add(jtbn_inicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1149, 782));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String user,pwd;
       user=jtxt_usuario.getText();
       pwd = jtxt_password.getText();
       
        if (user.equals("pablo")&&pwd.equals("maycar")) {
            form_menuPrincipal acceso = new form_menuPrincipal();
            acceso.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"Usuario O Contraseña Es Incorrecto ");
        }
               
       
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
            java.util.logging.Logger.getLogger(form_inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_inicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelpassw;
    private javax.swing.JLabel jLabelusuario;
    private javax.swing.JLabel jtbn_inicioSesion;
    private javax.swing.JPasswordField jtxt_password;
    private javax.swing.JTextField jtxt_usuario;
    // End of variables declaration//GEN-END:variables
}
