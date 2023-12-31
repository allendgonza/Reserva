/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.RegistroCliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import modelo.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;

public class form_ingresarCliente extends javax.swing.JFrame {

    public Connection obtenerConexion() {

        Connection conexion = null;//variable de conexion 

        try {/*el trycatch lo que hace es tratar de poder ejecutar el codigo que se coloca en el bloque
            y si algo sale mal lo va a captura catch obtner de alguna "Exception e"<-- es una clase grande  */

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/maycar1", "root", "");

            System.out.println("Conexion Exitosa");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;

    }

    PreparedStatement ps;
    ResultSet rs;

    public form_ingresarCliente() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxt_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxt_rut = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxt_nCelular = new javax.swing.JTextField();
        jtxt_reparar = new javax.swing.JTextField();
        jtxt_direccion = new javax.swing.JTextField();
        jtxt_marca = new javax.swing.JTextField();
        jtxt_modelo = new javax.swing.JTextField();
        jtxt_patente = new javax.swing.JTextField();
        jtxt_año = new javax.swing.JTextField();
        jtbn_ingresar = new javax.swing.JButton();
        jbtn_volver = new javax.swing.JButton();
        jbtn_limpiar = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_buscar = new javax.swing.JButton();
        jbtn_modificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 12, 15));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresar Cliente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre Cliente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jtxt_nombre.setBackground(new java.awt.Color(0, 0, 0));
        jtxt_nombre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtxt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 470, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rut :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jtxt_rut.setBackground(new java.awt.Color(0, 0, 0));
        jtxt_rut.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtxt_rut.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxt_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 470, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("N°Celular:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Direccion:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Marca:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Modelo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Patente:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Año:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Reparar:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jtxt_nCelular.setBackground(new java.awt.Color(0, 0, 0));
        jtxt_nCelular.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtxt_nCelular.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxt_nCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 470, -1));

        jtxt_reparar.setBackground(new java.awt.Color(0, 0, 0));
        jtxt_reparar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtxt_reparar.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxt_reparar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 470, 80));

        jtxt_direccion.setBackground(new java.awt.Color(0, 0, 0));
        jtxt_direccion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtxt_direccion.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 470, -1));

        jtxt_marca.setBackground(new java.awt.Color(0, 0, 0));
        jtxt_marca.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtxt_marca.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxt_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 470, -1));

        jtxt_modelo.setBackground(new java.awt.Color(0, 0, 0));
        jtxt_modelo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtxt_modelo.setForeground(new java.awt.Color(255, 255, 255));
        jtxt_modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_modeloActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 470, -1));

        jtxt_patente.setBackground(new java.awt.Color(0, 0, 0));
        jtxt_patente.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtxt_patente.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxt_patente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 470, -1));

        jtxt_año.setBackground(new java.awt.Color(0, 0, 0));
        jtxt_año.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtxt_año.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxt_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 470, -1));

        jtbn_ingresar.setBackground(new java.awt.Color(0, 0, 0));
        jtbn_ingresar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtbn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        jtbn_ingresar.setText("INGRESAR");
        jtbn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbn_ingresarActionPerformed(evt);
            }
        });
        jPanel1.add(jtbn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, -1, -1));

        jbtn_volver.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_volver.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtn_volver.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_volver.setText("VOLVER");
        jbtn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volverActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 120, -1));

        jbtn_limpiar.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_limpiar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_limpiar.setText("LIMPIAR");
        jbtn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 120, -1));

        jbtn_eliminar.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_eliminar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_eliminar.setText("ELIMINAR");
        jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 120, -1));

        jbtn_buscar.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_buscar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_buscar.setText("BUSCAR");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 120, -1));

        jbtn_modificar.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_modificar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtn_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_modificar.setText("MODIFICAR");
        jbtn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 120, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maycarpaint_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -20, -1, 850));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_modeloActionPerformed

    private void jbtn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volverActionPerformed
        form_menuPrincipal fmp = new form_menuPrincipal();
        fmp.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_jbtn_volverActionPerformed

    private void jtbn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbn_ingresarActionPerformed
        String nombre = this.jtxt_nombre.getText();
        String rut = this.jtxt_rut.getText();
        String nCelular = this.jtxt_nCelular.getText();
        String direccion = this.jtxt_direccion.getText();
        String marca = this.jtxt_marca.getText();
        String modelo = this.jtxt_modelo.getText();
        String patente = this.jtxt_patente.getText();
        String año = this.jtxt_año.getText();
        String reparar = this.jtxt_reparar.getText();

        Cliente cli = new Cliente(nombre, rut, direccion, marca, modelo, patente, reparar, ' ', ' ', 0);

        RegistroCliente reg = new RegistroCliente();

        if (reg.ingresarCliente(cli)) {
            JOptionPane.showMessageDialog(null, "Cliente Ingresado Correctamente", "Ingresar Cliente", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente No Ingresado Correctamente", "Ingresar Cliente", 0);
        }

    }//GEN-LAST:event_jtbn_ingresarActionPerformed

    private void jbtn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_limpiarActionPerformed
        this.jtxt_nombre.setText("");
        this.jtxt_rut.setText("");
        this.jtxt_nCelular.setText("");
        this.jtxt_direccion.setText("");
        this.jtxt_marca.setText("");
        this.jtxt_modelo.setText("");
        this.jtxt_patente.setText("");
        this.jtxt_año.setText("");
        this.jtxt_reparar.setText("");

    }//GEN-LAST:event_jbtn_limpiarActionPerformed

    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed
             String patente = this.jtxt_patente.getText(); 
        
        RegistroCliente reg = new RegistroCliente();
        if (reg.eliminarCliente(patente)) { 
            JOptionPane.showMessageDialog(null,"Cliente Eliminado","Eliminar Cliente",1);
        }else{
            JOptionPane.showMessageDialog(null,"Cliente No Eliminado","Eliminar Cliente",0);
            
        }
    }//GEN-LAST:event_jbtn_eliminarActionPerformed

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
        Connection con = null;

        try {

            con = obtenerConexion();
            ps = con.prepareCall("SELECT * FROM cliente WHERE rut = ?");
            ps.setString(1, jtxt_rut.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                jtxt_nombre.setText(rs.getString("nombre"));
                jtxt_rut.setText(rs.getString("rut"));
                jtxt_nCelular.setText(rs.getString("nCelular"));
                jtxt_direccion.setText(rs.getString("direccion"));
                jtxt_marca.setText(rs.getString("marca"));
                jtxt_modelo.setText(rs.getString("modelo"));
                jtxt_patente.setText(rs.getString("patente"));
                jtxt_año.setText(rs.getString("año"));
                jtxt_reparar.setText(rs.getString("reparar"));

            }else{
                JOptionPane.showMessageDialog(null,"No existe un cliente con el rut ingresado ");
            }

        } catch (Exception e) {
            System.err.println(e);
        }

    }//GEN-LAST:event_jbtn_buscarActionPerformed

    private void jbtn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_modificarActionPerformed
        
        Connection con = null;

        try {

            con = obtenerConexion();
            ps = con.prepareCall("UPDATE cliente SET nombre=?,rut=?,nCelular=?,direccion=?,marca=?,modelo=?,patente=?,año=?,reparar=? WHERE RUT =?");
            ps.setString(1, jtxt_nombre.getText());
            ps.setString(2, jtxt_rut.getText());
            ps.setString(3, jtxt_nCelular.getText());
            ps.setString(4, jtxt_direccion.getText());
            ps.setString(5, jtxt_marca.getText());
            ps.setString(6, jtxt_modelo.getText());
            ps.setString(7, jtxt_patente.getText());
            ps.setString(8, jtxt_año.getText());
            ps.setString(9, jtxt_reparar.getText());
            ps.setString(10, jtxt_rut.getText());

            int res = ps.executeUpdate();

            if (res > 0) {
             JOptionPane.showMessageDialog(null,"Persona Modificada");

            }else{
                JOptionPane.showMessageDialog(null,"Error al modificar persona "); 
            }
            con.close();

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jbtn_modificarActionPerformed

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
            java.util.logging.Logger.getLogger(form_ingresarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_ingresarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_ingresarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_ingresarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_ingresarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JButton jbtn_limpiar;
    private javax.swing.JButton jbtn_modificar;
    private javax.swing.JButton jbtn_volver;
    private javax.swing.JButton jtbn_ingresar;
    private javax.swing.JTextField jtxt_año;
    private javax.swing.JTextField jtxt_direccion;
    private javax.swing.JTextField jtxt_marca;
    private javax.swing.JTextField jtxt_modelo;
    private javax.swing.JTextField jtxt_nCelular;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_patente;
    private javax.swing.JTextField jtxt_reparar;
    private javax.swing.JTextField jtxt_rut;
    // End of variables declaration//GEN-END:variables
}
