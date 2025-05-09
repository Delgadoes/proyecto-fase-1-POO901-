
package bibliotecaamigosdonbosco;

public class VentanaAdministrador extends javax.swing.JFrame {

    public VentanaAdministrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TITULO = new javax.swing.JLabel();
        btnGestionarUsuarios = new java.awt.Button();
        btnAgregarEjemplares = new java.awt.Button();
        btnConfigurarMora = new java.awt.Button();
        btnSalir = new java.awt.Button();
        btnConsultarEjemplaresAdmin = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TITULO.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TITULO.setText("BIENVENIDO ADMINISTRADOR");

        btnGestionarUsuarios.setActionCommand("Ingresar usuarios");
        btnGestionarUsuarios.setLabel("GESTIONAR USUARIOS");
        btnGestionarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarUsuariosActionPerformed(evt);
            }
        });

        btnAgregarEjemplares.setLabel("AGREGAR EJEMPLARES");
        btnAgregarEjemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEjemplaresActionPerformed(evt);
            }
        });

        btnConfigurarMora.setLabel("CONFIGURAR MORA");
        btnConfigurarMora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigurarMoraActionPerformed(evt);
            }
        });

        btnSalir.setLabel("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnConsultarEjemplaresAdmin.setActionCommand("CONSULTAR / ELIMINAR EJEMPLARES");
        btnConsultarEjemplaresAdmin.setLabel("CONSULTAR / ELIMINAR EJEMPLARES");
        btnConsultarEjemplaresAdmin.setName(""); // NOI18N
        btnConsultarEjemplaresAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarEjemplaresAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGestionarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultarEjemplaresAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfigurarMora, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGestionarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfigurarMora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarEjemplaresAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarUsuariosActionPerformed
        // Aquí abriremos la ventana de gestionar usuarios
    GestionUsuarios gestionUsuarios = new GestionUsuarios();
    gestionUsuarios.setVisible(true);
    }//GEN-LAST:event_btnGestionarUsuariosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // Cerrar la ventana del administrador
    this.dispose();
    Login login = new Login();
    login.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarEjemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEjemplaresActionPerformed
        // Abrir la ventana de AgregarEjemplares
    AgregarEjemplares agregarEjemplares = new AgregarEjemplares();
    agregarEjemplares.setVisible(true);
    }//GEN-LAST:event_btnAgregarEjemplaresActionPerformed

    private void btnConfigurarMoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigurarMoraActionPerformed
        // Abrir la ventana de ConfigurarMora
    ConfigurarMora configurarMora = new ConfigurarMora();
    configurarMora.setVisible(true);

    }//GEN-LAST:event_btnConfigurarMoraActionPerformed

    private void btnConsultarEjemplaresAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarEjemplaresAdminActionPerformed
        // Abrir la ventana de AgregarEjemplares
    ConsultarEjemplaresAdmin consultarEjemplaresAdmin = new ConsultarEjemplaresAdmin();

    // Mostrar la ventana
    consultarEjemplaresAdmin.setVisible(true);
    }//GEN-LAST:event_btnConsultarEjemplaresAdminActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO;
    private java.awt.Button btnAgregarEjemplares;
    private java.awt.Button btnConfigurarMora;
    private java.awt.Button btnConsultarEjemplaresAdmin;
    private java.awt.Button btnGestionarUsuarios;
    private java.awt.Button btnSalir;
    // End of variables declaration//GEN-END:variables
}
