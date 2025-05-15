
package bibliotecaamigosdonbosco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConfigurarMora extends javax.swing.JFrame {

   public ConfigurarMora() {
        initComponents();
        llenarComboAnios();
        cargarConfiguraciones();
        setLocationRelativeTo(null);
    }

    // Rellenar el JComboBox con años
  private void llenarComboAnios() {
        int anioActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        for (int i = anioActual; i <= anioActual + 10; i++) {
            comboAno.addItem(String.valueOf(i));
        }
    }
    
     private void cargarConfiguraciones() {
        DefaultTableModel modelo = (DefaultTableModel) tablaConfiguraciones.getModel();
        modelo.setRowCount(0); // Limpiar la tabla

        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT anio, mora_diaria FROM configuracion_mora");
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String anio = rs.getString("anio");
                String mora = String.format("%.2f", rs.getDouble("mora_diaria"));
                modelo.addRow(new Object[]{anio, mora});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar las configuraciones: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtprestamos1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMoraDiaria = new javax.swing.JTextField();
        comboAno = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaConfiguraciones = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdiasvalidos = new javax.swing.JTextField();
        txtprestamos2 = new javax.swing.JTextField();
        GUARDARPRESTAMOS = new javax.swing.JButton();
        GUARDARDIAS = new javax.swing.JButton();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("CONFIGURACION DE MORA -DIAS Y CANTIDAD ");

        jLabel2.setText("DIAS PARA LA MORA :");

        jLabel3.setText("TASA DE MORA DIARIA $$ :");

        txtMoraDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoraDiariaActionPerformed(evt);
            }
        });

        comboAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026" }));

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnGuardar.setText("GUARDAR CONFIGURACION");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tablaConfiguraciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "AÑO", "MORA DIARIA USD $"
            }
        ));
        jScrollPane3.setViewportView(tablaConfiguraciones);

        jLabel4.setText("AÑO : ");

        jLabel5.setText("LIMITE DE PRESTAMOS :");

        GUARDARPRESTAMOS.setText("GUARDAR");
        GUARDARPRESTAMOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARPRESTAMOSActionPerformed(evt);
            }
        });

        GUARDARDIAS.setText("GUARDAR");
        GUARDARDIAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARDIASActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(31, 31, 31)
                                        .addComponent(txtMoraDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtprestamos2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiasvalidos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GUARDARPRESTAMOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GUARDARDIAS, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMoraDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdiasvalidos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GUARDARPRESTAMOS, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtprestamos2, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(GUARDARDIAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String moraDiaria = txtMoraDiaria.getText();
    String anio = (String) comboAno.getSelectedItem();

    if (moraDiaria.isEmpty() || anio.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        double mora = Double.parseDouble(moraDiaria);

        if (mora < 0) {
            JOptionPane.showMessageDialog(null, "La mora diaria debe ser un valor positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Connection conn = ConexionBD.getConnection();

        // Verificar si el año ya existe
        String verificarSql = "SELECT COUNT(*) FROM configuracion_mora WHERE anio = ?";
        PreparedStatement verificarStmt = conn.prepareStatement(verificarSql);
        verificarStmt.setString(1, anio);
        ResultSet rs = verificarStmt.executeQuery();
        rs.next();
        int existe = rs.getInt(1);

        // Insertar o actualizar según el caso
        if (existe > 0) {
            String updateSql = "UPDATE configuracion_mora SET mora_diaria = ? WHERE anio = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setDouble(1, mora);
            updateStmt.setString(2, anio);
            updateStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Configuración actualizada exitosamente.");
        } else {
            String insertSql = "INSERT INTO configuracion_mora (anio, mora_diaria) VALUES (?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertSql);
            insertStmt.setString(1, anio);
            insertStmt.setDouble(2, mora);
            insertStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Configuración guardada exitosamente.");
        }

        cargarConfiguraciones(); // Actualiza la tabla

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El valor de la mora diaria debe ser numérico.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar o actualizar la configuración: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
           this.dispose();
                              VentanaAdministrador ventanaAdmin = new VentanaAdministrador();                           
                            ventanaAdmin.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtMoraDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoraDiariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoraDiariaActionPerformed

    private void GUARDARPRESTAMOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARPRESTAMOSActionPerformed
        // Obtener el límite de préstamos del JTextField
    String limitePrestamosStr = txtdiasvalidos.getText().trim();
    
    try {
        // Verificar que el valor ingresado sea un número positivo
        int limitePrestamos = Integer.parseInt(limitePrestamosStr);
        if (limitePrestamos <= 0) {
            JOptionPane.showMessageDialog(this, "El límite de préstamos debe ser un número positivo.");
            return;
        }

        // Conectar a la base de datos
        Connection conn = ConexionBD.getConnection();
        String sql = "UPDATE configuracion_sistema SET limite_prestamos = ? WHERE id = 1";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, limitePrestamos);
        
        // Ejecutar actualización
        int filasAfectadas = ps.executeUpdate();
        
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Límite de préstamos actualizado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró la configuración. Verifique que exista el registro con id = 1.");
        }
        
        // Cerrar conexión
        ps.close();
        conn.close();
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar el límite de préstamos: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_GUARDARPRESTAMOSActionPerformed

    private void GUARDARDIASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARDIASActionPerformed
      String diasAntesMoraStr = txtprestamos2.getText().trim();
    
    try {
        // Verificar que el valor ingresado sea un número positivo
        int diasAntesMora = Integer.parseInt(diasAntesMoraStr);
        if (diasAntesMora <= 0) {
            JOptionPane.showMessageDialog(this, "Los días antes de mora deben ser un número positivo.");
            return;
        }

        // Conectar a la base de datos
        Connection conn = ConexionBD.getConnection();
        String sql = "UPDATE configuracion_sistema SET dias_antes_mora = ? WHERE id = 1";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, diasAntesMora);
        
        // Ejecutar actualización
        int filasAfectadas = ps.executeUpdate();
        
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Días antes de mora actualizados correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró la configuración. Verifique que exista el registro con id = 1.");
        }
        
        // Cerrar conexión
        ps.close();
        conn.close();
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar los días antes de mora: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_GUARDARDIASActionPerformed

    
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
            java.util.logging.Logger.getLogger(ConfigurarMora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigurarMora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigurarMora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigurarMora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigurarMora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GUARDARDIAS;
    private javax.swing.JButton GUARDARPRESTAMOS;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboAno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tablaConfiguraciones;
    private javax.swing.JTextField txtMoraDiaria;
    private javax.swing.JTextField txtdiasvalidos;
    private javax.swing.JTextField txtprestamos1;
    private javax.swing.JTextField txtprestamos2;
    // End of variables declaration//GEN-END:variables
}
