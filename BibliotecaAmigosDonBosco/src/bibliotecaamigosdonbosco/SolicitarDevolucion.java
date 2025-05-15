
package bibliotecaamigosdonbosco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class SolicitarDevolucion extends javax.swing.JFrame {

    public SolicitarDevolucion() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbTipoEjemplar = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spinnerFechaDevolucion = new javax.swing.JSpinner();
        btnConfirmarDevolucion = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cbPrestamosPendientes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("REALIZAR DEVOLUCION");

        jLabel2.setText("TIPO DE EJEMPLAR");

        cbTipoEjemplar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Revista", "Tesis", "Obra", "CD" }));
        cbTipoEjemplar.setToolTipText("Libro, Revista, Tesis, Obra, CD");
        cbTipoEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoEjemplarActionPerformed(evt);
            }
        });

        jLabel3.setText("SELECIONAR EJEMPLAR");

        jLabel4.setText("FECHA DE DEVOLUCION");

        spinnerFechaDevolucion.setModel(new javax.swing.SpinnerDateModel());

        btnConfirmarDevolucion.setText("CONFIRMAR DEVOLUCION");
        btnConfirmarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarDevolucionActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cbPrestamosPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPrestamosPendientesActionPerformed(evt);
            }
        });
        jScrollPane1.setViewportView(cbPrestamosPendientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnConfirmarDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbTipoEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spinnerFechaDevolucion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbTipoEjemplar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConfirmarDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoEjemplarActionPerformed
         String tipoEjemplar = cbTipoEjemplar.getSelectedItem().toString();
         cargarPrestamosPendientes(tipoEjemplar);
    }//GEN-LAST:event_cbTipoEjemplarActionPerformed

private void cargarPrestamosPendientes(String tipoEjemplar) {
    String tabla = "";
    switch (tipoEjemplar) {
        case "Libro":
            tabla = "libros";
            break;
        case "Revista":
            tabla = "revistas";
            break;
        case "Tesis":
            tabla = "tesis";
            break;
        case "Obra":
            tabla = "obras";
            break;
        case "CD":
            tabla = "CDs";
            break;
        default:
            JOptionPane.showMessageDialog(this, "Tipo de ejemplar no reconocido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
    }

    int usuarioId = UsuarioSesion.getIdUsuario();

    // Consulta que filtra por el tipo de ejemplar
    String sql = "SELECT p.id, e.titulo " +
                 "FROM prestamos p " +
                 "JOIN " + tabla + " e ON p.id_ejemplar = e.id " +
                 "WHERE p.fecha_devolucion IS NULL AND p.id_usuario = ? AND p.tipo_ejemplar = ?";

    cbPrestamosPendientes.removeAllItems();

    try (Connection conn = ConexionBD.getConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {
        
        pst.setInt(1, usuarioId);
        pst.setString(2, tipoEjemplar);  // Asegura que solo se traen préstamos del tipo seleccionado
        ResultSet rs = pst.executeQuery();
        
        while (rs.next()) {
            cbPrestamosPendientes.addItem(rs.getInt("id") + " - " + rs.getString("titulo"));
        }
        
        if (cbPrestamosPendientes.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "No tienes préstamos pendientes para este tipo de ejemplar.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException e) {
        System.out.println("Error al cargar los préstamos pendientes: " + e.getMessage());
    }
}

/*
    private void btnConfirmarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarDevolucionActionPerformed

    }//GEN-LAST:event_btnConfirmarDevolucionActionPerformed
*/
        
private void btnConfirmarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {                                                       
    String selectedPrestamo = (String) cbPrestamosPendientes.getSelectedItem();
    
    if (selectedPrestamo == null || selectedPrestamo.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un préstamo pendiente.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    int prestamoId = Integer.parseInt(selectedPrestamo.split(" - ")[0]);
    Date fechaDevolucion = (Date) spinnerFechaDevolucion.getValue();

    // Validar que se ha seleccionado una fecha de devolución
    if (fechaDevolucion == null) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una fecha de devolución.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener fecha de préstamo y calcular mora
    String sqlVerificar = "SELECT fecha_prestamo FROM prestamos WHERE id = ? AND fecha_devolucion IS NULL";
    try (Connection conn = ConexionBD.getConnection();
         PreparedStatement pstVerificar = conn.prepareStatement(sqlVerificar)) {
        
        pstVerificar.setInt(1, prestamoId);
        ResultSet rs = pstVerificar.executeQuery();
        
        if (rs.next()) {
            Date fechaPrestamo = rs.getDate("fecha_prestamo");
            int plazoMaximo = obtenerPlazoMaximo(cbTipoEjemplar.getSelectedItem().toString());
            double moraCalculada = calcularMora(fechaPrestamo, fechaDevolucion, plazoMaximo);
            
            // Actualizar la devolución en la base de datos
String sqlActualizar = "UPDATE prestamos SET fecha_devolucion = ?, mora = ? WHERE id = ?";
try (PreparedStatement pstActualizar = conn.prepareStatement(sqlActualizar)) {
    pstActualizar.setDate(1, new java.sql.Date(fechaDevolucion.getTime()));
    pstActualizar.setDouble(2, moraCalculada);  // Monto de mora calculado
    pstActualizar.setInt(3, prestamoId);
    
    int filasActualizadas = pstActualizar.executeUpdate();


                if (filasActualizadas > 0) {
                    JOptionPane.showMessageDialog(this, "Devolución registrada exitosamente.\nMonto de Mora: $" + moraCalculada);
                    actualizarCantidadPrestados(prestamoId);  // Actualiza cantidades
                    cargarPrestamosPendientes(cbTipoEjemplar.getSelectedItem().toString());  // Refresca la lista
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "El préstamo seleccionado ya ha sido devuelto o no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    } catch (SQLException e) {
        System.out.println("Error al confirmar la devolución: " + e.getMessage());
    }
}  



private void actualizarCantidadPrestados(int prestamoId) {
    // Obtenemos el tipo de ejemplar seleccionado
    String tipoEjemplar = cbTipoEjemplar.getSelectedItem().toString();
    
    // Mapa de tipo de ejemplar a tabla
    String tabla = "";
    switch (tipoEjemplar) {
        case "Libro":
            tabla = "libros";
            break;
        case "Revista":
            tabla = "revistas";
            break;
        case "Tesis":
            tabla = "tesis";
            break;
        case "Obra":
            tabla = "obras";
            break;
        case "CD":
            tabla = "CDs";
            break;
        default:
            JOptionPane.showMessageDialog(this, "Tipo de ejemplar no reconocido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
    }

    // Validar que hay ejemplares prestados antes de restar
    String sqlVerificar = "SELECT cantidad_prestados FROM " + tabla +
                          " WHERE id IN (SELECT id_ejemplar FROM prestamos WHERE id = ?)";
    
    try (Connection conn = ConexionBD.getConnection();
         PreparedStatement pstVerificar = conn.prepareStatement(sqlVerificar)) {
        
        pstVerificar.setInt(1, prestamoId);
        ResultSet rs = pstVerificar.executeQuery();
        
        if (rs.next()) {
            int cantidadPrestados = rs.getInt("cantidad_prestados");
            
            if (cantidadPrestados > 0) {
                // Actualizamos las cantidades
                String sqlActualizar = "UPDATE " + tabla + 
                                       " SET cantidad_prestados = cantidad_prestados - 1, " +
                                       "cantidad_total = cantidad_total + 1 " +
                                       "WHERE id IN (SELECT id_ejemplar FROM prestamos WHERE id = ?)";
                
                try (PreparedStatement pstActualizar = conn.prepareStatement(sqlActualizar)) {
                    pstActualizar.setInt(1, prestamoId);
                    pstActualizar.executeUpdate();
                }
            } else {
                JOptionPane.showMessageDialog(this, "No hay ejemplares prestados para este préstamo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al actualizar la cantidad de " + tipoEjemplar + " prestados y disponibles: " + e.getMessage());
    }
}

    
private double calcularMora(Date fechaPrestamo, Date fechaDevolucion, int plazoMaximo) {
    // Obtener la fecha límite permitida
    Date fechaLimite = new Date(fechaPrestamo.getTime() + plazoMaximo * 24L * 60L * 60L * 1000L);
    
    // Calcular días de retraso
    long diferencia = fechaDevolucion.getTime() - fechaLimite.getTime();
    if (diferencia > 0) {
        long diasDeRetraso = diferencia / (1000 * 60 * 60 * 24);  // Convertir milisegundos a días
        double tasaMora = obtenerTasaMora();  // Obtener tasa de mora actual
        return diasDeRetraso * tasaMora;
    } else {
        return 0;  // No hay mora si se devolvió a tiempo o antes
    }
}


private double obtenerTasaMora() {
    double tasaMora = 0.0;
    int anioActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
    String sql = "SELECT mora_diaria FROM configuracion_mora WHERE anio = ?";
    
    try (Connection conn = ConexionBD.getConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {
        
        pst.setInt(1, anioActual);
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            tasaMora = rs.getDouble("mora_diaria");
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener la tasa de mora: " + e.getMessage());
    }
    
    return tasaMora;
}


private int obtenerPlazoMaximo(String tipoEjemplar) {
    int diasAntesMora = 30; // Valor predeterminado en caso de error

    try (Connection conn = ConexionBD.getConnection();
         PreparedStatement stmt = conn.prepareStatement("SELECT dias_antes_mora FROM configuracion_sistema ORDER BY id DESC LIMIT 1")) {
        
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            diasAntesMora = rs.getInt("dias_antes_mora");
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return diasAntesMora;
}



    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbPrestamosPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPrestamosPendientesActionPerformed
        
    }//GEN-LAST:event_cbPrestamosPendientesActionPerformed

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
            java.util.logging.Logger.getLogger(SolicitarDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitarDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitarDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitarDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolicitarDevolucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmarDevolucion;
    private javax.swing.JComboBox<String> cbPrestamosPendientes;
    private javax.swing.JComboBox<String> cbTipoEjemplar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinnerFechaDevolucion;
    // End of variables declaration//GEN-END:variables
}
