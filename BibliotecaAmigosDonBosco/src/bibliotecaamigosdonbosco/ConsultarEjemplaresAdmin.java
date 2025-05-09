
package bibliotecaamigosdonbosco;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultarEjemplaresAdmin extends javax.swing.JFrame {

    public ConsultarEjemplaresAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbTipoEjemplar = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEjemplares = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("CONSULTAR EJEMPLARES");

        jLabel2.setText("TIPO DE EJEMPLAR");

        cbTipoEjemplar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLICK AQUI PARA CONSULTAR", "Libro", "Revista", "Obra", "Tesis", "CD" }));
        cbTipoEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoEjemplarActionPerformed(evt);
            }
        });

        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("ACTUALIZAR - BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tablaEjemplares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TITULO ", "AUTOR / ARTISTA", "UBICACION", "CANTIDAD TOTAL", "CANTIDAD PRESTADOS"
            }
        ));
        jScrollPane1.setViewportView(tablaEjemplares);

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(cbTipoEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbTipoEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnEliminar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoEjemplarActionPerformed
        // Limpiar la tabla cuando se cambie el tipo de ejemplar
        DefaultTableModel model = (DefaultTableModel) tablaEjemplares.getModel();
        model.setRowCount(0);  // Limpiar las filas de la tabla

        // Obtener el tipo de ejemplar seleccionado
        String tipoEjemplar = cbTipoEjemplar.getSelectedItem().toString();

        // Actualizar la tabla con los ejemplares correspondientes al tipo seleccionado
        actualizarTabla(tipoEjemplar, "");
    }//GEN-LAST:event_cbTipoEjemplarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();

    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String tipoEjemplar = cbTipoEjemplar.getSelectedItem().toString();  // Obtener el tipo de ejemplar seleccionado
        String buscar = txtBuscar.getText().trim();  // Obtener el texto de búsqueda

        // Verificar que el tipo de ejemplar esté seleccionado
        if (tipoEjemplar == null || tipoEjemplar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un tipo de ejemplar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Limpiar la tabla antes de mostrar nuevos resultados
        DefaultTableModel model = (DefaultTableModel) tablaEjemplares.getModel();
        model.setRowCount(0);  // Limpiar las filas anteriores

        // Actualizar la tabla con la búsqueda filtrada por el texto ingresado
        actualizarTabla(tipoEjemplar, buscar);
        }

    // Método para actualizar la tabla con los ejemplares del tipo seleccionado y filtro de búsqueda
    private void actualizarTabla(String tipoEjemplar, String buscar) {
        String sql = "";        
    // Selecciona la consulta SQL según el tipo de ejemplar
    if (tipoEjemplar.equals("Libro")) {
        sql = "SELECT l.id, l.titulo, l.autor AS autor_artista, l.ubicacion_fisica, l.cantidad_total, " +
              "(SELECT COUNT(*) FROM prestamos p WHERE p.id_ejemplar = l.id AND p.tipo_ejemplar = 'Libro' AND p.fecha_devolucion IS NULL) AS cantidad_prestados " +
              "FROM libros l WHERE l.titulo LIKE ?";
    } else if (tipoEjemplar.equals("Revista")) {
        sql = "SELECT r.id, r.titulo, r.editorial AS autor_artista, r.ubicacion_fisica, r.cantidad_total, " +
              "(SELECT COUNT(*) FROM prestamos p WHERE p.id_ejemplar = r.id AND p.tipo_ejemplar = 'Revista' AND p.fecha_devolucion IS NULL) AS cantidad_prestados " +
              "FROM revistas r WHERE r.titulo LIKE ?";
    } else if (tipoEjemplar.equals("Tesis")) {
        sql = "SELECT t.id, t.titulo, t.autor AS autor_artista, t.ubicacion_fisica, t.cantidad_total, " +
              "(SELECT COUNT(*) FROM prestamos p WHERE p.id_ejemplar = t.id AND p.tipo_ejemplar = 'Tesis' AND p.fecha_devolucion IS NULL) AS cantidad_prestados " +
              "FROM tesis t WHERE t.titulo LIKE ?";
    } else if (tipoEjemplar.equals("Obra")) {
        sql = "SELECT o.id, o.titulo, o.artista AS autor_artista, o.ubicacion_fisica, o.cantidad_total, " +
              "(SELECT COUNT(*) FROM prestamos p WHERE p.id_ejemplar = o.id AND p.tipo_ejemplar = 'Obra' AND p.fecha_devolucion IS NULL) AS cantidad_prestados " +
              "FROM obras o WHERE o.titulo LIKE ?";
    } else if (tipoEjemplar.equals("CD")) {
        // En CDs usamos directamente el campo cantidad_prestados que ya está en la tabla
        sql = "SELECT c.id, c.titulo, c.artista AS autor_artista, c.ubicacion_fisica, c.cantidad_total, c.cantidad_prestados " +
              "FROM CDs c WHERE c.titulo LIKE ?";
    }

    // Verifica que se haya generado una consulta válida
    if (sql.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se ha seleccionado un tipo de ejemplar válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Ejecuta la consulta y llena la tabla
    try (Connection conn = ConexionBD.getConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {

        pst.setString(1, "%" + buscar + "%");
        ResultSet rs = pst.executeQuery();

        // Limpia la tabla antes de llenarla con los resultados
        DefaultTableModel model = (DefaultTableModel) tablaEjemplares.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            Object[] row = new Object[6];
            row[0] = rs.getInt("id");
            row[1] = rs.getString("titulo");
            row[2] = rs.getString("autor_artista");
            row[3] = rs.getString("ubicacion_fisica");
            row[4] = rs.getInt("cantidad_total");
            row[5] = rs.getInt("cantidad_prestados");  // Ahora obtenemos la cantidad prestada correctamente
            model.addRow(row);
        }

    } catch (SQLException e) {
        System.out.println("Error al realizar la búsqueda: " + e.getMessage());
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       int filaSeleccionada = tablaEjemplares.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un ejemplar para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int idEjemplar = (int) tablaEjemplares.getValueAt(filaSeleccionada, 0);
        String tipoEjemplar = cbTipoEjemplar.getSelectedItem().toString();

        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este ejemplar?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.NO_OPTION) {
            return;
        }

        String sql = "";
        if (tipoEjemplar.equals("Libro")) {
            sql = "DELETE FROM libros WHERE id = ?";
        } else if (tipoEjemplar.equals("Revista")) {
            sql = "DELETE FROM revistas WHERE id = ?";
        } else if (tipoEjemplar.equals("Tesis")) {
            sql = "DELETE FROM tesis WHERE id = ?";
        } else if (tipoEjemplar.equals("Obra")) {
            sql = "DELETE FROM obras WHERE id = ?";
        } else if (tipoEjemplar.equals("CD")) {
            sql = "DELETE FROM CDs WHERE id = ?";
        }

        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idEjemplar);
            int filasAfectadas = pst.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "El ejemplar ha sido eliminado correctamente.");
                DefaultTableModel model = (DefaultTableModel) tablaEjemplares.getModel();
                model.setRowCount(0);
                actualizarTabla(tipoEjemplar, txtBuscar.getText().trim());
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el ejemplar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar el ejemplar: " + e.getMessage());
        }
    
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarEjemplaresAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarEjemplaresAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarEjemplaresAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarEjemplaresAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarEjemplaresAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbTipoEjemplar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEjemplares;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
