
package bibliotecaamigosdonbosco;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConsultarEjemplaresAlumno extends javax.swing.JFrame {

    
    public ConsultarEjemplaresAlumno() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setLabelFor(jLabel1);
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
                "ID", "TITULO ", "AUTOR / ARTISTA", "UBICACION"
            }
        ));
        jScrollPane1.setViewportView(tablaEjemplares);
        tablaEjemplares.getAccessibleContext().setAccessibleName("jTABLE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbTipoEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addGap(29, 29, 29))
        );

        jLabel1.getAccessibleContext().setAccessibleName("lblCONSULTAREJEMPLARES");
        jLabel2.getAccessibleContext().setAccessibleName("lblTIPOEJEMPLAR");
        cbTipoEjemplar.getAccessibleContext().setAccessibleName("cbTIPOEJEMPLAR");
        txtBuscar.getAccessibleContext().setAccessibleName("txtBUSCAR");
        btnCerrar.getAccessibleContext().setAccessibleName("btnCERRAR");
        btnBuscar.getAccessibleContext().setAccessibleName("btnBUSCAR");

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
    // Preparar la consulta SQL según el tipo de ejemplar
    String sql = "";
    if (tipoEjemplar.equals("Libro")) {
        sql = "SELECT id, titulo, autor AS autor_artista, ubicacion_fisica FROM libros WHERE titulo LIKE ?";
    } else if (tipoEjemplar.equals("Revista")) {
        sql = "SELECT id, titulo, editorial AS autor_artista, ubicacion_fisica FROM revistas WHERE titulo LIKE ?";
    } else if (tipoEjemplar.equals("Tesis")) {
        sql = "SELECT id, titulo, autor AS autor_artista, ubicacion_fisica FROM tesis WHERE titulo LIKE ?";
    } else if (tipoEjemplar.equals("Obra")) {
        sql = "SELECT id, titulo, artista AS autor_artista, ubicacion_fisica FROM obras WHERE titulo LIKE ?";
    } else if (tipoEjemplar.equals("CD")) {
        sql = "SELECT id, titulo, artista AS autor_artista, ubicacion_fisica FROM CDs WHERE titulo LIKE ?";
    }

    // Si no se construyó la consulta SQL, mostrar un mensaje de error
    if (sql.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se ha seleccionado un tipo de ejemplar válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Ejecutar la consulta y llenar la tabla con los resultados
    try (Connection conn = ConexionBD.getConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {
        
        // Agregar el parámetro de búsqueda al SQL
        pst.setString(1, "%" + buscar + "%");

        // Ejecutar la consulta y obtener los resultados
        ResultSet rs = pst.executeQuery();

        // Llenar la tabla con los resultados
        DefaultTableModel model = (DefaultTableModel) tablaEjemplares.getModel();
        while (rs.next()) {
            Object[] row = new Object[4];
            row[0] = rs.getInt("id");
            row[1] = rs.getString("titulo");
            row[2] = rs.getString("autor_artista");
            row[3] = rs.getString("ubicacion_fisica");
            model.addRow(row);
        }

    } catch (SQLException e) {
        System.out.println("Error al realizar la búsqueda: " + e.getMessage());
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
                        
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarEjemplaresAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarEjemplaresAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarEjemplaresAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarEjemplaresAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarEjemplaresAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> cbTipoEjemplar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEjemplares;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
