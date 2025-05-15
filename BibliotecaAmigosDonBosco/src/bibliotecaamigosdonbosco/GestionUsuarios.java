
package bibliotecaamigosdonbosco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class GestionUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form GestionUsuarios
     */
    public GestionUsuarios() {
        initComponents();
        cargarUsuarios();
        setLocationRelativeTo(null);
    }
    
    // Método para cargar los usuarios desde la base de datos
private void cargarUsuarios() {
    DefaultTableModel modelo = (DefaultTableModel) tablaUsuarios.getModel();
     // Establecer los encabezados de la tabla
    String[] columnas = {"ID", "Nombre", "Usuario", "Privilegio"};
    modelo.setColumnIdentifiers(columnas); // Modificamos los encabezados
    modelo.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos
    Connection conn = ConexionBD.getConnection();
    if (conn != null) {
        try {
            String sql = "SELECT * FROM usuarios";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                // Asumiendo que las columnas son: id, nombre, usuario, privilegio
                Object[] fila = {
                    rs.getInt("id"), 
                    rs.getString("nombre"), 
                    rs.getString("usuario"), 
                    rs.getString("privilegio")
                };
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Error al cargar los usuarios: " + e.getMessage(),
                "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TITULO = new javax.swing.JLabel();
        btnAgregarUsuario = new java.awt.Button();
        btnEliminarUsuario = new java.awt.Button();
        btnModificarUsuario = new java.awt.Button();
        btnVolver = new java.awt.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TITULO.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TITULO.setText("PANEL - GESTION DE USUARIOS");

        btnAgregarUsuario.setActionCommand("Ingresar usuarios");
        btnAgregarUsuario.setLabel("AGREGAR USUARIOS");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setLabel("ELIMINAR USUARIO");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnModificarUsuario.setLabel("MODIFICAR USUARIO");
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        btnVolver.setLabel("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jScrollPane3.setToolTipText("");

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
         // Aquí se abriría un formulario para agregar un nuevo usuario
         AgregarUsuario agregarUsuario = new AgregarUsuario();
    agregarUsuario.setVisible(true);
    
    // Recargar la tabla de usuarios cuando se cierre la ventana de agregar
    agregarUsuario.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
            cargarUsuarios(); // Recargar la tabla después de que se cierre la ventana de agregar
        }
    });
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
         int filaSeleccionada = tablaUsuarios.getSelectedRow();
    
    if (filaSeleccionada == -1) {
        // Si no se seleccionó ninguna fila
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un usuario para eliminar.",
                                                  "Error", javax.swing.JOptionPane.WARNING_MESSAGE);
    } else {
        // Obtener el ID del usuario seleccionado
        int id = (int) tablaUsuarios.getValueAt(filaSeleccionada, 0);

        // Confirmar si el administrador realmente quiere eliminar el usuario
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, 
                "¿Está seguro de que desea eliminar al usuario?", "Confirmación", 
                javax.swing.JOptionPane.YES_NO_OPTION);
        
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            // Eliminar el usuario de la base de datos
            Connection conn = ConexionBD.getConnection();
            if (conn != null) {
                try {
                    String sql = "DELETE FROM usuarios WHERE id = ?";
                    PreparedStatement stmt = conn.prepareStatement(sql);
                    stmt.setInt(1, id);
                    
                    int filasEliminadas = stmt.executeUpdate();
                    if (filasEliminadas > 0) {
                        javax.swing.JOptionPane.showMessageDialog(this, "Usuario eliminado exitosamente.",
                                                                  "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                        
                        // Reiniciar el contador de autoincremento a 1
                        String reiniciarSQL = "ALTER TABLE usuarios AUTO_INCREMENT = 1";
                        Statement stmtReiniciar = conn.createStatement();
                        stmtReiniciar.executeUpdate(reiniciarSQL);
                        
                        // Recargar la tabla de usuarios después de la eliminación
                        cargarUsuarios();
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(this, "No se pudo eliminar el usuario.",
                                                                  "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException e) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Error al eliminar el usuario: " + e.getMessage(),
                                                              "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        int filaSeleccionada = tablaUsuarios.getSelectedRow();
    if (filaSeleccionada == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un usuario para modificar.",
                                                  "Error", javax.swing.JOptionPane.WARNING_MESSAGE);
    } else {
        // Obtener los datos del usuario seleccionado
        int id = (int) tablaUsuarios.getValueAt(filaSeleccionada, 0);
        String nombre = (String) tablaUsuarios.getValueAt(filaSeleccionada, 1);
        String usuario = (String) tablaUsuarios.getValueAt(filaSeleccionada, 2);
        String privilegio = (String) tablaUsuarios.getValueAt(filaSeleccionada, 3);

        // Abrir el formulario ModificarUsuario con los datos
        ModificarUsuario modificarUsuario = new ModificarUsuario();
        modificarUsuario.setDatos(id, nombre, usuario, privilegio);
        modificarUsuario.setVisible(true);

        // Recargar la tabla de usuarios
        modificarUsuario.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                cargarUsuarios(); // Recargar la tabla después de que se cierre la ventana
            }
        });
    }
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // Cerrar la ventana actual
    this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO;
    private java.awt.Button btnAgregarUsuario;
    private java.awt.Button btnEliminarUsuario;
    private java.awt.Button btnModificarUsuario;
    private java.awt.Button btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
