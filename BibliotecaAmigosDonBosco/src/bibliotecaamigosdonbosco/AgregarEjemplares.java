
package bibliotecaamigosdonbosco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AgregarEjemplares extends javax.swing.JFrame {

    
    public AgregarEjemplares() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void limpiarCampos() {
    txtTituloLibro.setText("");
    txtAutorLibro.setText("");
    txtEditorialLibro.setText("");
    txtISBNLibro.setText("");
    txtAnoPublicacionLibro.setText("");
    txtUbicacionFisicaLibro.setText("");
    spnCantidadTotalLibro.setValue(1); // Restablecer el valor del JSpinner a 1
}
    
    private void limpiarCamposRevista() {
    txtTituloRevista.setText("");
    txtEditorialRevista.setText("");
    txtISBNRevista.setText("");
    txtAnoPublicacionRevista.setText("");
    txtUbicacionFisicaRevista.setText("");
    spnCantidadTotalRevista.setValue(1); // Restablecer el valor del JSpinner a 1
}
    private void limpiarCamposTesis() {
    txtTituloTesis.setText("");
    txtAutorTesis.setText("");
    txtAnoTesis.setText("");
    txtUniversidadTesis.setText("");
    txtUbicacionFisicaTesis.setText("");
    spnCantidadTotalTesis.setValue(1); // Restablecer el valor del JSpinner a 1
}
    private void limpiarCamposObra() {
    txtTituloObra.setText("");
    txtArtistaObra.setText("");
    txtAnoCreacionObra.setText("");
    txtGeneroObra.setText("");
    txtUbicacionFisicaObra.setText("");
    spnCantidadTotalObra.setValue(1); // Restablecer el valor del JSpinner a 1
}
    private void limpiarCamposCD() {
    txtTituloCD.setText("");
    txtArtistaCD.setText("");
    txtGeneroCD.setText("");
    txtAnoPublicacionCD.setText("");
    txtUbicacionFisicaCD.setText("");
    txtCantidadTotalCD.setValue(0); // Establece el valor del JSpinner a 0
}



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtTituloTesis = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAutorTesis = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtAnoTesis = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtUniversidadTesis = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtUbicacionFisicaTesis = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        spnCantidadTotalTesis = new javax.swing.JSpinner();
        btnGuardarTesis = new javax.swing.JButton();
        limpiarCamposTesis = new javax.swing.JButton();
        btnVolverTesis = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAutorLibro = new javax.swing.JTextField();
        txtTituloLibro = new javax.swing.JTextField();
        txtISBNLibro = new javax.swing.JTextField();
        txtEditorialLibro = new javax.swing.JTextField();
        txtUbicacionFisicaLibro = new javax.swing.JTextField();
        txtAnoPublicacionLibro = new javax.swing.JTextField();
        spnCantidadTotalLibro = new javax.swing.JSpinner();
        btnLimpiarLibro = new javax.swing.JButton();
        btnVolverLibro = new javax.swing.JButton();
        btnGuardarLibro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtTituloRevista = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEditorialRevista = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtISBNRevista = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAnoPublicacionRevista = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUbicacionFisicaRevista = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        spnCantidadTotalRevista = new javax.swing.JSpinner();
        btnGuardarRevista = new javax.swing.JButton();
        limpiarCamposRevista = new javax.swing.JButton();
        btnVolverRevista = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtTituloObra = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtArtistaObra = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtAnoCreacionObra = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtGeneroObra = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtUbicacionFisicaObra = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        spnCantidadTotalObra = new javax.swing.JSpinner();
        btnGuardarObra = new javax.swing.JButton();
        btnLimpiarObra = new javax.swing.JButton();
        btnVolverObra = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        GENERO = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btnAgregarCD = new javax.swing.JButton();
        btnLimpiarCD = new javax.swing.JButton();
        btnVolverCD = new javax.swing.JButton();
        txtCantidadTotalCD = new javax.swing.JSpinner();
        txtUbicacionFisicaCD = new javax.swing.JTextField();
        txtAnoPublicacionCD = new javax.swing.JTextField();
        txtGeneroCD = new javax.swing.JTextField();
        txtArtistaCD = new javax.swing.JTextField();
        txtTituloCD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jButton3.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setText("TITULO DE TESIS");

        jLabel16.setText("AUTOR DE LA TESIS");

        jLabel17.setText("AÑO DE LA TESIS");

        jLabel18.setText("UNIVERSIDAD DE TESIS");

        jLabel19.setText("UBICACION FISICA");

        jLabel20.setText("CANTIDAD DE EJEMPLARES");

        btnGuardarTesis.setText("GUARDAR");
        btnGuardarTesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTesisActionPerformed(evt);
            }
        });

        limpiarCamposTesis.setText("LIMPIAR");
        limpiarCamposTesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCamposTesisActionPerformed(evt);
            }
        });

        btnVolverTesis.setText("VOLVER");
        btnVolverTesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverTesisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUbicacionFisicaTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnoTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUniversidadTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnCantidadTotalTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnGuardarTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(limpiarCamposTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnVolverTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTituloTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAutorTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTituloTesis, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAutorTesis, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnoTesis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUniversidadTesis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUbicacionFisicaTesis, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(spnCantidadTotalTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarCamposTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarTesis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        jTabbedPane1.addTab("TESIS", jPanel3);

        jLabel1.setText("AUTOR DEL LIBRO");

        jLabel2.setText("TITULO DEL LIBRO");

        jLabel3.setText("ISBN DEL LIBRO");

        jLabel4.setText("AÑO DE PUBLICACION");

        jLabel5.setText("CANTIDAD DE EJEMPLARES");

        jLabel6.setText("EDITORIAL DEL LIBRO");

        jLabel7.setText("UBICACION FISICA");

        btnLimpiarLibro.setText("LIMPIAR");
        btnLimpiarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarLibroActionPerformed(evt);
            }
        });

        btnVolverLibro.setText("VOLVER");
        btnVolverLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverLibroActionPerformed(evt);
            }
        });

        btnGuardarLibro.setText("GUARDAR");
        btnGuardarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUbicacionFisicaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtISBNLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEditorialLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnoPublicacionLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnCantidadTotalLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnLimpiarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnVolverLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTituloLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAutorLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEditorialLibro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtISBNLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnoPublicacionLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUbicacionFisicaLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(spnCantidadTotalLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("LIBRO", jPanel1);

        jLabel9.setText("TITULO DE REVISTA");

        jLabel10.setText("EDITORIAL REVISTA");

        jLabel12.setText("ISBN DE LA REVISTA");

        jLabel13.setText("AÑO DE PUBLICACION");

        jLabel14.setText("UBICACION FISICA");

        jLabel15.setText("CANTIDAD DE EJEMPLARES");

        btnGuardarRevista.setText("GUARDAR");
        btnGuardarRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRevistaActionPerformed(evt);
            }
        });

        limpiarCamposRevista.setText("LIMPIAR");
        limpiarCamposRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCamposRevistaActionPerformed(evt);
            }
        });

        btnVolverRevista.setText("VOLVER");
        btnVolverRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverRevistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUbicacionFisicaRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtISBNRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnoPublicacionRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnCantidadTotalRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardarRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(limpiarCamposRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnVolverRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTituloRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEditorialRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTituloRevista, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditorialRevista, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtISBNRevista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnoPublicacionRevista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUbicacionFisicaRevista, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(spnCantidadTotalRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarCamposRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        jTabbedPane1.addTab("REVISTA", jPanel2);

        jLabel21.setText("TITULO DE LA OBRA");

        jLabel22.setText("ARTISTA");

        jLabel23.setText("AÑO DE CREACION");

        jLabel24.setText("GENERO");

        jLabel25.setText("UBICACION FISICA");

        jLabel26.setText("CANTIDAD DE EJEMPLARES");

        btnGuardarObra.setText("GUARDAR");
        btnGuardarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarObraActionPerformed(evt);
            }
        });

        btnLimpiarObra.setText("LIMPIAR");
        btnLimpiarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarObraActionPerformed(evt);
            }
        });

        btnVolverObra.setText("VOLVER");
        btnVolverObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverObraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUbicacionFisicaObra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnoCreacionObra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGeneroObra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnCantidadTotalObra, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnGuardarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnLimpiarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnVolverObra, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTituloObra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtArtistaObra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTituloObra, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArtistaObra, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnoCreacionObra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneroObra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUbicacionFisicaObra, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(spnCantidadTotalObra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverObra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("OBRA", jPanel4);

        jLabel27.setText("TITULO");

        jLabel28.setText("ARTISTA");

        GENERO.setText("GENERO");

        jLabel30.setText("AÑO DE PUBLICACION");

        jLabel31.setText("UBICACION FISICA");

        jLabel32.setText("CANTIDAD DE EJEMPLARES");

        btnAgregarCD.setText("GUARDAR");
        btnAgregarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCDActionPerformed(evt);
            }
        });

        btnLimpiarCD.setText("LIMPIAR");
        btnLimpiarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCDActionPerformed(evt);
            }
        });

        btnVolverCD.setText("VOLVER");
        btnVolverCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverCDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GENERO, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUbicacionFisicaCD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGeneroCD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnoPublicacionCD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadTotalCD, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnAgregarCD, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnLimpiarCD, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnVolverCD, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTituloCD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtArtistaCD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTituloCD, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArtistaCD, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GENERO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneroCD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnoPublicacionCD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUbicacionFisicaCD, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtCantidadTotalCD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarCD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverCD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarCD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        jTabbedPane1.addTab("CD", jPanel6);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("REGISTRO DE EJEMPLARES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLibroActionPerformed
         // Obtener los valores de los campos de texto
    String titulo = txtTituloLibro.getText();
    String autor = txtAutorLibro.getText();
    String editorial = txtEditorialLibro.getText();
    String isbn = txtISBNLibro.getText();
    String anoPublicacion = txtAnoPublicacionLibro.getText();
    String ubicacionFisica = txtUbicacionFisicaLibro.getText();
    int cantidadTotal = (int) spnCantidadTotalLibro.getValue(); // Obtener valor del JSpinner
    
    // Validación de campos vacíos
    if (titulo.isEmpty() || autor.isEmpty() || editorial.isEmpty() || isbn.isEmpty() ||
        anoPublicacion.isEmpty() || ubicacionFisica.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", 
                                                  "Campos incompletos", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Insertar los datos en la base de datos
    try {
        // Usamos la clase ConexionBD para obtener la conexión
        Connection conn = ConexionBD.getConnection();
        
        // SQL de inserción de datos en la tabla 'libros'
        String sql = "INSERT INTO libros (titulo, autor, editorial, isbn, ano_publicacion, ubicacion_fisica, cantidad_total) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        // Preparar el statement
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        // Establecer los valores en el PreparedStatement
        stmt.setString(1, titulo);
        stmt.setString(2, autor);
        stmt.setString(3, editorial);
        stmt.setString(4, isbn);
        stmt.setString(5, anoPublicacion);
        stmt.setString(6, ubicacionFisica);
        stmt.setInt(7, cantidadTotal);
        
        // Ejecutar la actualización
        stmt.executeUpdate();
        
        // Mensaje de éxito
        javax.swing.JOptionPane.showMessageDialog(this, "Libro agregado correctamente.", 
                                                  "Operación exitosa", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
        // Limpiar los campos después de guardar
        limpiarCampos();
        
    } catch (SQLException e) {
        // Manejo de excepciones de SQL
        javax.swing.JOptionPane.showMessageDialog(this, "Error al agregar el libro: " + e.getMessage(), 
                                                  "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnGuardarLibroActionPerformed

    private void btnLimpiarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarLibroActionPerformed
        txtTituloLibro.setText("");
    txtAutorLibro.setText("");
    txtEditorialLibro.setText("");
    txtISBNLibro.setText("");
    txtAnoPublicacionLibro.setText("");
    txtUbicacionFisicaLibro.setText("");
    spnCantidadTotalLibro.setValue(1); // Restablecer el valor del JSpinner a 1
    }//GEN-LAST:event_btnLimpiarLibroActionPerformed

    private void btnVolverLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverLibroActionPerformed
        // Cerrar la ventana actual (AgregarEjemplares)
    this.dispose();
    }//GEN-LAST:event_btnVolverLibroActionPerformed

    private void btnGuardarRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRevistaActionPerformed
        // Obtener los valores de los campos de texto
    String titulo = txtTituloRevista.getText();
    String editorial = txtEditorialRevista.getText();
    String isbn = txtISBNRevista.getText();
    String anoPublicacion = txtAnoPublicacionRevista.getText();
    String ubicacionFisica = txtUbicacionFisicaRevista.getText();
    int cantidadTotal = (int) spnCantidadTotalRevista.getValue(); // Obtener valor del JSpinner
    
    // Validación de campos vacíos
    if (titulo.isEmpty() || editorial.isEmpty() || isbn.isEmpty() ||
        anoPublicacion.isEmpty() || ubicacionFisica.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", 
                                                  "Campos incompletos", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Insertar los datos en la base de datos
    try {
        // Usamos la clase ConexionBD para obtener la conexión
        Connection conn = ConexionBD.getConnection();
        
        // SQL de inserción de datos en la tabla 'revistas'
        String sql = "INSERT INTO revistas (titulo, editorial, isbn, ano_publicacion, ubicacion_fisica, cantidad_total) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";
        
        // Preparar el statement
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        // Establecer los valores en el PreparedStatement
        stmt.setString(1, titulo);
        stmt.setString(2, editorial);
        stmt.setString(3, isbn);
        stmt.setString(4, anoPublicacion);
        stmt.setString(5, ubicacionFisica);
        stmt.setInt(6, cantidadTotal);
        
        // Ejecutar la actualización
        stmt.executeUpdate();
        
        // Mensaje de éxito
        javax.swing.JOptionPane.showMessageDialog(this, "Revista agregada correctamente.", 
                                                  "Operación exitosa", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
        // Limpiar los campos después de guardar
        limpiarCamposRevista();
        
    } catch (SQLException e) {
        // Manejo de excepciones de SQL
        javax.swing.JOptionPane.showMessageDialog(this, "Error al agregar la revista: " + e.getMessage(), 
                                                  "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnGuardarRevistaActionPerformed

    private void limpiarCamposRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCamposRevistaActionPerformed
        txtTituloRevista.setText("");
    txtEditorialRevista.setText("");
    txtISBNRevista.setText("");
    txtAnoPublicacionRevista.setText("");
    txtUbicacionFisicaRevista.setText("");
    spnCantidadTotalRevista.setValue(1); // Restablecer el valor del JSpinner a 1
    }//GEN-LAST:event_limpiarCamposRevistaActionPerformed

    private void btnVolverRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverRevistaActionPerformed
        // Cerrar la ventana actual (AgregarEjemplares)
    this.dispose();
    }//GEN-LAST:event_btnVolverRevistaActionPerformed

    private void btnGuardarTesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTesisActionPerformed
        // Obtener los valores de los campos de texto
    String titulo = txtTituloTesis.getText();
    String autor = txtAutorTesis.getText();
    String ano = txtAnoTesis.getText();
    String universidad = txtUniversidadTesis.getText();
    String ubicacionFisica = txtUbicacionFisicaTesis.getText();
    int cantidadTotal = (int) spnCantidadTotalTesis.getValue(); // Obtener valor del JSpinner
    
    // Validación de campos vacíos
    if (titulo.isEmpty() || autor.isEmpty() || ano.isEmpty() ||
        universidad.isEmpty() || ubicacionFisica.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", 
                                                  "Campos incompletos", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Insertar los datos en la base de datos
    try {
        // Usamos la clase ConexionBD para obtener la conexión
        Connection conn = ConexionBD.getConnection();
        
        // SQL de inserción de datos en la tabla 'tesis'
        String sql = "INSERT INTO tesis (titulo, autor, año, universidad, ubicacion_fisica, cantidad_total) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";
        
        // Preparar el statement
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        // Establecer los valores en el PreparedStatement
        stmt.setString(1, titulo);
        stmt.setString(2, autor);
        stmt.setString(3, ano);
        stmt.setString(4, universidad);
        stmt.setString(5, ubicacionFisica);
        stmt.setInt(6, cantidadTotal);
        
        // Ejecutar la actualización
        stmt.executeUpdate();
        
        // Mensaje de éxito
        javax.swing.JOptionPane.showMessageDialog(this, "Tesis agregada correctamente.", 
                                                  "Operación exitosa", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
        // Limpiar los campos después de guardar
        limpiarCamposTesis();   
        
    } catch (SQLException e) {
        // Manejo de excepciones de SQL
        javax.swing.JOptionPane.showMessageDialog(this, "Error al agregar la tesis: " + e.getMessage(), 
                                                  "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnGuardarTesisActionPerformed

    private void limpiarCamposTesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCamposTesisActionPerformed
        // Limpiar todos los campos de texto y restablecer el JSpinner
    limpiarCamposTesis();
    }//GEN-LAST:event_limpiarCamposTesisActionPerformed

    private void btnVolverTesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverTesisActionPerformed
         // Si quieres cerrar la ventana actual:
    this.dispose();  // Cierra la ventana actual.
    }//GEN-LAST:event_btnVolverTesisActionPerformed

    private void btnGuardarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarObraActionPerformed
        // Obtención de los datos del formulario
    String titulo = txtTituloObra.getText();
    String artista = txtArtistaObra.getText();
    String anoCreacion = txtAnoCreacionObra.getText();
    String genero = txtGeneroObra.getText();
    String ubicacionFisica = txtUbicacionFisicaObra.getText();
    int cantidadTotal = (int) spnCantidadTotalObra.getValue();
    
    // Consulta SQL para insertar los datos
    String sql = "INSERT INTO Obras (titulo, artista, ano_creacion, genero, ubicacion_fisica, cantidad_total) VALUES (?, ?, ?, ?, ?, ?)";
    
    try {
        // Establecer la conexión
        Connection conn = ConexionBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        // Asignar valores a la consulta
        stmt.setString(1, titulo);
        stmt.setString(2, artista);
        stmt.setString(3, anoCreacion);
        stmt.setString(4, genero);
        stmt.setString(5, ubicacionFisica);
        stmt.setInt(6, cantidadTotal);
        
        // Ejecutar la consulta
        stmt.executeUpdate();
        
        // Mensaje de éxito
        JOptionPane.showMessageDialog(null, "Obra agregada con éxito.");
        
        // Limpiar los campos después de guardar
        limpiarCamposObra();
    } catch (SQLException e) {
        // Manejo de errores
        JOptionPane.showMessageDialog(null, "Error al guardar la obra: " + e.getMessage());
    }
    }//GEN-LAST:event_btnGuardarObraActionPerformed

    private void btnLimpiarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarObraActionPerformed
        // Limpiar todos los campos de texto
    txtTituloObra.setText("");
    txtArtistaObra.setText("");
    txtAnoCreacionObra.setText("");
    txtGeneroObra.setText("");
    txtUbicacionFisicaObra.setText("");
    
    // Restablecer el valor del JSpinner a 1 (por ejemplo)
    spnCantidadTotalObra.setValue(1);
    }//GEN-LAST:event_btnLimpiarObraActionPerformed

    private void btnVolverObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverObraActionPerformed
        // Cerrar la ventana actual
    this.dispose();  
    }//GEN-LAST:event_btnVolverObraActionPerformed

    private void btnAgregarCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCDActionPerformed
        // Validación de los campos
    String titulo = txtTituloCD.getText();
    String artista = txtArtistaCD.getText();
    String genero = txtGeneroCD.getText();
    String anoPublicacion = txtAnoPublicacionCD.getText();
    String ubicacionFisica = txtUbicacionFisicaCD.getText();
    int cantidadTotal = (int) txtCantidadTotalCD.getValue();

    // Validar si alguno de los campos está vacío
    if (titulo.isEmpty() || artista.isEmpty() || genero.isEmpty() || anoPublicacion.isEmpty() || 
        ubicacionFisica.isEmpty() || cantidadTotal <= 0) {
        
        // Mostrar mensaje de error si algún campo está vacío o inválido
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
    } else {
        // Si todos los campos están llenos, proceder con la inserción en la base de datos
        String sql = "INSERT INTO CDs (titulo, artista, genero, ano_publicacion, ubicacion_fisica, cantidad_total) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            // Establecer la conexión
            Connection conn = ConexionBD.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            // Asignar valores a la consulta
            stmt.setString(1, titulo);
            stmt.setString(2, artista);
            stmt.setString(3, genero);
            stmt.setString(4, anoPublicacion);
            stmt.setString(5, ubicacionFisica);
            stmt.setInt(6, cantidadTotal);
            
            // Ejecutar la consulta
            stmt.executeUpdate();
            
            // Mensaje de éxito
            JOptionPane.showMessageDialog(null, "CD agregado con éxito.");
            
            // Limpiar los campos después de guardar
            limpiarCamposCD();
        } catch (SQLException e) {
            // Manejo de errores
            JOptionPane.showMessageDialog(null, "Error al guardar el CD: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnAgregarCDActionPerformed

    private void btnLimpiarCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCDActionPerformed
        // Llamar al método para limpiar los campos
    limpiarCamposCD();
    }//GEN-LAST:event_btnLimpiarCDActionPerformed

    private void btnVolverCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverCDActionPerformed
        // Cerrar la ventana actual (AgregarEjemplares)
    this.dispose();
    }//GEN-LAST:event_btnVolverCDActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarEjemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEjemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEjemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEjemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEjemplares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GENERO;
    private javax.swing.JButton btnAgregarCD;
    private javax.swing.JButton btnGuardarLibro;
    private javax.swing.JButton btnGuardarObra;
    private javax.swing.JButton btnGuardarRevista;
    private javax.swing.JButton btnGuardarTesis;
    private javax.swing.JButton btnLimpiarCD;
    private javax.swing.JButton btnLimpiarLibro;
    private javax.swing.JButton btnLimpiarObra;
    private javax.swing.JButton btnVolverCD;
    private javax.swing.JButton btnVolverLibro;
    private javax.swing.JButton btnVolverObra;
    private javax.swing.JButton btnVolverRevista;
    private javax.swing.JButton btnVolverTesis;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton limpiarCamposRevista;
    private javax.swing.JButton limpiarCamposTesis;
    private javax.swing.JSpinner spnCantidadTotalLibro;
    private javax.swing.JSpinner spnCantidadTotalObra;
    private javax.swing.JSpinner spnCantidadTotalRevista;
    private javax.swing.JSpinner spnCantidadTotalTesis;
    private javax.swing.JTextField txtAnoCreacionObra;
    private javax.swing.JTextField txtAnoPublicacionCD;
    private javax.swing.JTextField txtAnoPublicacionLibro;
    private javax.swing.JTextField txtAnoPublicacionRevista;
    private javax.swing.JTextField txtAnoTesis;
    private javax.swing.JTextField txtArtistaCD;
    private javax.swing.JTextField txtArtistaObra;
    private javax.swing.JTextField txtAutorLibro;
    private javax.swing.JTextField txtAutorTesis;
    private javax.swing.JSpinner txtCantidadTotalCD;
    private javax.swing.JTextField txtEditorialLibro;
    private javax.swing.JTextField txtEditorialRevista;
    private javax.swing.JTextField txtGeneroCD;
    private javax.swing.JTextField txtGeneroObra;
    private javax.swing.JTextField txtISBNLibro;
    private javax.swing.JTextField txtISBNRevista;
    private javax.swing.JTextField txtTituloCD;
    private javax.swing.JTextField txtTituloLibro;
    private javax.swing.JTextField txtTituloObra;
    private javax.swing.JTextField txtTituloRevista;
    private javax.swing.JTextField txtTituloTesis;
    private javax.swing.JTextField txtUbicacionFisicaCD;
    private javax.swing.JTextField txtUbicacionFisicaLibro;
    private javax.swing.JTextField txtUbicacionFisicaObra;
    private javax.swing.JTextField txtUbicacionFisicaRevista;
    private javax.swing.JTextField txtUbicacionFisicaTesis;
    private javax.swing.JTextField txtUniversidadTesis;
    // End of variables declaration//GEN-END:variables
}
