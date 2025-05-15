
package bibliotecaamigosdonbosco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListarEjemplares extends javax.swing.JFrame {

    public ListarEjemplares() {
        initComponents();
        cargarDatosTabla(); // Cargar los datos al abrir la ventana
        setLocationRelativeTo(null);
    }
    
    // Método para llenar la tabla con los ejemplares
private void cargarDatosTabla() {
    // Consulta SQL para obtener los ejemplares de todas las tablas
String sql = "SELECT titulo, 'Libro' AS tipo, ubicacion_fisica, cantidad_total FROM libros "
           + "UNION SELECT titulo, 'Revista' AS tipo, ubicacion_fisica, cantidad_total FROM revistas "
           + "UNION SELECT titulo, 'Tesis' AS tipo, ubicacion_fisica, cantidad_total FROM tesis "
           + "UNION SELECT titulo, 'Obra' AS tipo, ubicacion_fisica, cantidad_total FROM Obras "
           + "UNION SELECT titulo, 'CD' AS tipo, ubicacion_fisica, cantidad_total FROM CDs";

    
    try {
        // Obtener la conexión a la base de datos
        Connection conn = ConexionBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        // Crear un modelo de tabla para los datos
        DefaultTableModel model = new DefaultTableModel();
        
        // Definir las columnas de la tabla
        model.addColumn("Título");
        model.addColumn("Tipo");
        model.addColumn("Ubicación Física");
        model.addColumn("Cantidad Total");
        
        // Llenar la tabla con los datos obtenidos
        while (rs.next()) {
            String titulo = rs.getString("titulo");
            String tipo = rs.getString("tipo");
            String ubicacionFisica = rs.getString("ubicacion_fisica");
            int cantidadTotal = rs.getInt("cantidad_total");
            model.addRow(new Object[]{titulo, tipo, ubicacionFisica, cantidadTotal});
        }
        
        // Asignar el modelo de la tabla al JTable
        tblEjemplares.setModel(model);
        
        // Cerrar la conexión
        rs.close();
        stmt.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage());
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEjemplares = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEjemplares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TITULO", "TIPO", "UBICACION", "CANTIDAD TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tblEjemplares);

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jLabel2.setText("TABLA DE EJEMPLARES");

        btnEliminar.setText("ELIMINAR EJEMPLAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // Cerrar la ventana de listar ejemplares
    this.dispose();
     
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Obtener la fila seleccionada
    int selectedRow = tblEjemplares.getSelectedRow();
    
    // Verificar si se ha seleccionado una fila
    if (selectedRow == -1) {
        // Mostrar un mensaje de error si no hay fila seleccionada
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un ejemplar para eliminar.");
        return;
    }
    
    // Obtener el título del ejemplar de la fila seleccionada
    String titulo = (String) tblEjemplares.getValueAt(selectedRow, 0);
    String tipo = (String) tblEjemplares.getValueAt(selectedRow, 1);
    
    // Confirmar la eliminación con el usuario
    int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar el ejemplar \"" + titulo + "\"?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return; // Cancelar la eliminación si el usuario no confirma
    }
    
    // Crear la consulta SQL para eliminar el ejemplar según el tipo
    String sql = "";
    switch (tipo) {
        case "Libro":
            sql = "DELETE FROM libros WHERE titulo = ?";
            break;
        case "Revista":
            sql = "DELETE FROM revistas WHERE titulo = ?";
            break;
        case "Tesis":
            sql = "DELETE FROM tesis WHERE titulo = ?";
            break;
        case "Obra":
            sql = "DELETE FROM Obras WHERE titulo = ?";
            break;
        case "CD":
            sql = "DELETE FROM CDs WHERE titulo = ?";
            break;
        default:
            JOptionPane.showMessageDialog(this, "Tipo de ejemplar no válido.");
            return;
    }
    
    // Conectar a la base de datos y ejecutar la consulta
    try {
        Connection conn = ConexionBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, titulo);
        
        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Ejemplar eliminado exitosamente.");
            // Actualizar la tabla
            cargarDatosTabla();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar el ejemplar.");
        }
        
        stmt.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al eliminar el ejemplar: " + e.getMessage());
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarEjemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarEjemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarEjemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarEjemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarEjemplares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEjemplares;
    // End of variables declaration//GEN-END:variables
}
