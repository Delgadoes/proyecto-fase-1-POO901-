
package bibliotecaamigosdonbosco;

/**
 *
 * @author Marcelo Delgado
 */
public class VentanaProfesor extends javax.swing.JFrame {

    public VentanaProfesor() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("uncheck")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TITULO = new javax.swing.JLabel();
        btnIngresarUsuarios = new java.awt.Button();
        btnIngresarEjemplares = new java.awt.Button();
        btnRestablecerContraseña = new java.awt.Button();
        btnConsultarEjemplares = new java.awt.Button();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TITULO.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TITULO.setText("BIENVENIDO PROFESOR-UDB");

        btnIngresarUsuarios.setActionCommand("Ingresar usuarios");
        btnIngresarUsuarios.setLabel("Ingresar usuarios");
        btnIngresarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarUsuariosActionPerformed(evt);
            }
        });

        btnIngresarEjemplares.setActionCommand("Ingresar Ejemplares");
        btnIngresarEjemplares.setLabel("Ingresar Ejemplares");
        btnIngresarEjemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEjemplaresActionPerformed(evt);
            }
        });

        btnRestablecerContraseña.setActionCommand("Restablecer Contraseña");
        btnRestablecerContraseña.setLabel("Restablecer Contraseña");
        btnRestablecerContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerContraseñaActionPerformed(evt);
            }
        });

        btnConsultarEjemplares.setActionCommand("Consultar Ejemplares");
        btnConsultarEjemplares.setLabel("Consultar Ejemplares");
        btnConsultarEjemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarEjemplaresActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIngresarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIngresarEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultarEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRestablecerContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngresarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRestablecerContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngresarEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarUsuariosActionPerformed
         // Aquí se abriría un formulario para agregar un nuevo usuario
         AgregarUsuario agregarUsuario = new AgregarUsuario();
    agregarUsuario.setVisible(true);
    
    // Recargar la tabla de usuarios cuando se cierre la ventana de agregar
    agregarUsuario.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
            cargarUsuarios(); // Recargar la tabla después de que se cierre la ventana de agregar
        }

             private void cargarUsuarios() {
                 throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
             }
    });
    }//GEN-LAST:event_btnIngresarUsuariosActionPerformed

    private void btnRestablecerContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerContraseñaActionPerformed
        // TODO add your handling code here:
       RestablecerContrasena restablecerContrasena = new RestablecerContrasena();
    restablecerContrasena.setVisible(true);
    }//GEN-LAST:event_btnRestablecerContraseñaActionPerformed

    private void btnIngresarEjemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEjemplaresActionPerformed
        // TODO add your handling code here:
          // Abrir la ventana de AgregarEjemplares
    AgregarEjemplares agregarEjemplares = new AgregarEjemplares();
    agregarEjemplares.setVisible(true);
    }//GEN-LAST:event_btnIngresarEjemplaresActionPerformed

    private void btnConsultarEjemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarEjemplaresActionPerformed
        // TODO add your handling code here:
      ListarEjemplares listarEjemplares = new ListarEjemplares();
    listarEjemplares.setVisible(true);
    
    }//GEN-LAST:event_btnConsultarEjemplaresActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        Login login = new Login();
    login.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO;
    private java.awt.Button btnConsultarEjemplares;
    private java.awt.Button btnIngresarEjemplares;
    private java.awt.Button btnIngresarUsuarios;
    private java.awt.Button btnRestablecerContraseña;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
