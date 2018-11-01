/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.ContPropuesta;
import Logica.ContUsuario;
import Logica.dtFecha;
import Logica.dtPropuesta;
import Logica.utilidades;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author nicolasgutierrez
 */
public class Alta_de_Propuesta extends javax.swing.JInternalFrame {

    /**
     * Creates new form Alta_de_Propuesta
     */
    private ContUsuario ICU = ContUsuario.getInstance();
    private ContPropuesta ICP = ContPropuesta.getInstance();
    private utilidades util = utilidades.getInstance();
    String imagenRuta = "COSO";
    JFileChooser navegadorArchivos = new JFileChooser();

    private String rearmarFecha(String f) {
        String fecha = null;
        String[] a = f.split("/");
        fecha = a[2] + "/" + a[1] + "/" + a[0];
        return fecha;
    }

    public Alta_de_Propuesta() {
        initComponents();
        jT_cat.setModel((DefaultTreeModel) ICP.modeloJT3Categorias());
        this.setSize(850, 600);
        String imagenRuta = null;
        String fecha = (String) util.getFecha().getFecha();
        Date min = new Date(rearmarFecha((String) util.getFechaInc(fecha, null, 1)));
        Date max = new Date("2020/12/31");
        jdc_fecha.getDateEditor().setEnabled(false);
        jdc_fecha.setMaxSelectableDate(max);
        jdc_fecha.setMinSelectableDate(min);
        jLabel14.setText("Proponentes");
        jLabel1.setText("Proponente");
        jLabel2.setText("Tipo de Espectaculo");
        jLabel4.setText("Titulo");
        jLabel7.setText("Fecha realizacion");
        jLabel5.setText("Descripcion");
        jLabel6.setText("Lugar");
        jLabel13.setText("Retornos posibles");
        cbporcentaje.setText("Porcentaje");
        cbentradas.setText("Entrada");
        jLabel16.setText("Monto requerido");
        jLabel11.setText("Costo entrada");
        jLabel12.setText("Imagen");
        btnexplorar.setText("Explorar");
        btndardealta.setText("Dar de Alta");
        btncancelar.setText("Cancelar");
        ICP.propAutomaticas();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txttipoespectaculo = new javax.swing.JTextField();
        txtproponente1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtlugar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttitulo1 = new javax.swing.JTextField();
        txtcostoentrada = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnexplorar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btndardealta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbporcentaje = new javax.swing.JCheckBox();
        cbentradas = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        labelimage = new javax.swing.JLabel();
        txtmontorec = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        jdc_fecha = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        jT_cat = new javax.swing.JTree();

        jLabel3.setText("Tipo de espectaculo");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Proponente");

        jLabel2.setText("Tipo de espectaculo");

        txttipoespectaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipoespectaculoActionPerformed(evt);
            }
        });

        txtproponente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproponente1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(txtproponente1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttipoespectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtproponente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttipoespectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 52, 436, 71));

        jLabel4.setText(" Titulo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 129, -1, -1));

        jLabel5.setText(" Descripcion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 175, -1, -1));

        jLabel6.setText(" Lugar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 415, -1, -1));

        txtlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlugarActionPerformed(evt);
            }
        });
        getContentPane().add(txtlugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 434, 153, -1));

        jLabel7.setText("Fecha prevista");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 129, -1, -1));

        txttitulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttitulo1ActionPerformed(evt);
            }
        });
        getContentPane().add(txttitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 150, 153, -1));

        txtcostoentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcostoentradaActionPerformed(evt);
            }
        });
        getContentPane().add(txtcostoentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 253, 153, -1));

        jLabel11.setText("Costo entrada");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 232, -1, -1));

        jLabel12.setText("Imagen");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 289, -1, -1));

        btnexplorar.setText("Explorar");
        btnexplorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexplorarActionPerformed(evt);
            }
        });
        getContentPane().add(btnexplorar, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 284, -1, -1));

        jLabel13.setText(" Retornos posibles");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 457, -1, -1));

        btndardealta.setText("Dar de alta");
        btndardealta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndardealtaActionPerformed(evt);
            }
        });
        getContentPane().add(btndardealta, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 457, 150, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nickname"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 82, 133, 417));

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarKeyPressed(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 39, 125, -1));

        jLabel14.setText("Proponentes");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 20, -1, -1));

        cbporcentaje.setText("Porcentaje");
        getContentPane().add(cbporcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 476, -1, -1));

        cbentradas.setText("Entrada");
        getContentPane().add(cbentradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 496, -1, -1));

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtdescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 194, 249, 201));
        getContentPane().add(labelimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 312, 150, 100));

        txtmontorec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmontorecActionPerformed(evt);
            }
        });
        getContentPane().add(txtmontorec, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 545, 153, -1));

        jLabel16.setText("Monto requerido");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 526, -1, -1));

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 499, 140, -1));
        getContentPane().add(jdc_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 137, -1));

        jT_cat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jT_catMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jT_cat);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 39, 142, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttipoespectaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipoespectaculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipoespectaculoActionPerformed

    private void txtproponente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproponente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproponente1ActionPerformed

    private void txtlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlugarActionPerformed

    private void txttitulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttitulo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttitulo1ActionPerformed

    private void txtcostoentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcostoentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcostoentradaActionPerformed

    private void btnexplorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexplorarActionPerformed
        // TODO add your handling code here:
        selecImagen();
    }//GEN-LAST:event_btnexplorarActionPerformed

    private void btndardealtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndardealtaActionPerformed
        // TODO add your handling code here:
        altaProp();

    }//GEN-LAST:event_btndardealtaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.rowAtPoint(evt.getPoint());
        int col = jTable1.columnAtPoint(evt.getPoint());

        txtproponente1.setText((String) jTable1.getValueAt(row, col));


    }//GEN-LAST:event_jTable1MouseClicked

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed
        // TODO add your handling code here:
        List<String> proponentes = ICU.listarProponentes(txtbuscar.getText());
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < proponentes.size(); i++) {
            String p = proponentes.get(i);
            Object[] dat = {p};
            modelo.addRow(dat);
        }

    }//GEN-LAST:event_txtbuscarKeyPressed

    private void txtmontorecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmontorecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmontorecActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:

        DefaultTableModel modelo2 = (DefaultTableModel) jTable1.getModel();
        modelo2.setRowCount(0);

        this.limpiartodo(jPanel1);
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void jT_catMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_catMousePressed
        TreePath Path = jT_cat.getPathForLocation(evt.getX(), evt.getY());
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) Path.getLastPathComponent();
        //if(node.isLeaf()){

        if (node != null) {
            if (!node.toString().equals("Categorias")) {
                txttipoespectaculo.setText(node.toString());
            }
        } else {
            txttipoespectaculo.setText(null);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jT_catMousePressed

    public boolean controlardatos() {

        boolean existp = false;
        List<String> propss = ICP.listartodasPropuestas("");
        Iterator ite = propss.iterator();
        while (ite.hasNext()) {
            String stp = (String) ite.next();
            if (stp.contentEquals(txttitulo1.getText())) {
                existp = true;
            }
        }
        if (existp == true) {
            JOptionPane.showMessageDialog(null, "Ya existe una propuesta con este titulo");
            txttitulo1.selectAll();
            txttitulo1.requestFocus();
            return false;
        }

        String re = "";

        if (cbentradas.isSelected() && !cbporcentaje.isSelected()) {
            re = cbentradas.getText();
        } else if (cbentradas.isSelected() && cbporcentaje.isSelected()) {
            re = cbentradas.getText() + "/" + cbporcentaje.getText();
        } else if (!cbentradas.isSelected() && cbporcentaje.isSelected()) {
            re = cbporcentaje.getText();
        }

        if (this.txtproponente1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Proponente vacio");
            txtproponente1.selectAll();
            txtproponente1.requestFocus();
            return false;
        }
        if (this.txttipoespectaculo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Categoria vacia");
            txttipoespectaculo.selectAll();
            txttipoespectaculo.requestFocus();
            return false;
        }
        if (this.txttitulo1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Titulo vacio");
            txttitulo1.selectAll();
            txttitulo1.requestFocus();
            return false;
        }
        if (this.txtlugar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lugar vacio");
            txtlugar.selectAll();
            txtlugar.requestFocus();
            return false;
        }
        if (this.txtcostoentrada.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Costo de entrada vacio");
            txtcostoentrada.selectAll();
            txtcostoentrada.requestFocus();
            return false;
        }
        if (isNumeric(this.txtcostoentrada.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Costo de entrada no numerico");
            txtmontorec.selectAll();
            txtmontorec.requestFocus();
            return false;
        }
        if (this.txtcostoentrada.getText().contains(",") || this.txtcostoentrada.getText().contains(".") || this.txtcostoentrada.getText().contains(" ")) {
            JOptionPane.showMessageDialog(null, "Costo de entrada no numerico");
            txtmontorec.selectAll();
            txtmontorec.requestFocus();
            return false;
        }
        if (this.txtmontorec.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Monto requerido vacio");
            txtmontorec.selectAll();
            txtmontorec.requestFocus();
            return false;
        }
        if (this.txtmontorec.getText().contains(",") || this.txtmontorec.getText().contains(".") || this.txtmontorec.getText().contains(" ")) {
            JOptionPane.showMessageDialog(null, "Monto requerido no numerico");
            txtmontorec.selectAll();
            txtmontorec.requestFocus();
            return false;
        }
        if (isNumeric(this.txtmontorec.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Monto requerido no numerico");
            txtmontorec.selectAll();
            txtmontorec.requestFocus();
            return false;
        }

        if (re.equals("")) {
            JOptionPane.showMessageDialog(null, "Retorno incorrecto");
            cbporcentaje.requestFocus();
            return false;
        } else {
            return true;
        }

    }

    private void selecImagen() {
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        navegadorArchivos.setFileFilter(filtroImagen);
        navegadorArchivos.showOpenDialog(this);
        File imagen = navegadorArchivos.getSelectedFile();
        String path = navegadorArchivos.getSelectedFile().getPath();
        labelimage.setIcon(new ImageIcon(path));
        ImageIcon icon = new ImageIcon(path);
        Image foto = icon.getImage();
        Image nuevaFoto = foto.getScaledInstance(labelimage.getWidth(), labelimage.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon nuevoIcono = new ImageIcon(nuevaFoto);
        labelimage.setIcon(nuevoIcono);
        //BufferedImage img= nuevoIcono;
        salvarImagen(foto);
    }

    private void salvarImagen(Image imagen) {
        BufferedImage img = (BufferedImage) imagen;
        File outputfile = new File("/home/juan/ProgAplicaciones2018/progAplicaciones/imagenesPropuesta" + txttitulo1.getText() + ".png");
        imagenRuta = "/home/juan/ProgAplicaciones2018/progAplicaciones/imagenesPropuesta" + txttitulo1.getText() + ".png";
        try {
            ImageIO.write(img, "png", outputfile);
        } catch (IOException ex) {
            Logger.getLogger(Alta_perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void limpiartodo(JPanel panel) {
        for (int i = 0; panel.getComponents().length > i; i++) {
            if (panel.getComponents()[i] instanceof JTextField) {
                ((JTextField) panel.getComponents()[i]).setText("");
            }
        }
    }

    private boolean altaProp() {

        if (controlardatos()) {

            String re = null;
            dtFecha dtfrealizar = null, dtfpublicada = null;
            dtfpublicada = (dtFecha) util.getFecha();
            dtfrealizar = (dtFecha) getFechajdc();

            if (cbentradas.isSelected() && !cbporcentaje.isSelected()) {
                re = cbentradas.getText();
            } else if (cbentradas.isSelected() && cbporcentaje.isSelected()) {
                re = cbentradas.getText() + "/" + cbporcentaje.getText();
            } else if (!cbentradas.isSelected() && cbporcentaje.isSelected()) {
                re = cbporcentaje.getText();
            }

            dtPropuesta dtp = new dtPropuesta(txttitulo1.getText(), txtdescripcion.getText(), imagenRuta, txtlugar.getText(), "Ingresada", txttipoespectaculo.getText(), txtproponente1.getText(), dtfrealizar, dtfpublicada, Integer.parseInt(txtcostoentrada.getText()), Integer.parseInt(txtmontorec.getText()), 0, re);
            ICP.datosPropuesta(dtp);

            JOptionPane.showMessageDialog(null, "Propuesta agregada con exito");
            sacarlabasura();
        } else {
            JOptionPane.showMessageDialog(null, "Controle los datos");
        }

        return true;
    }

    private dtFecha getFechajdc() {
        dtFecha fecha;
        fecha = new dtFecha(Integer.toString(jdc_fecha.getDate().getDay()), Integer.toString(jdc_fecha.getDate().getMonth()), Integer.toString(jdc_fecha.getDate().getYear()));
        return fecha;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btndardealta;
    private javax.swing.JButton btnexplorar;
    private javax.swing.JCheckBox cbentradas;
    private javax.swing.JCheckBox cbporcentaje;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTree jT_cat;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdc_fecha;
    private javax.swing.JLabel labelimage;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcostoentrada;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtlugar;
    private javax.swing.JTextField txtmontorec;
    private javax.swing.JTextField txtproponente1;
    private javax.swing.JTextField txttipoespectaculo;
    private javax.swing.JTextField txttitulo1;
    // End of variables declaration//GEN-END:variables

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private void sacarlabasura() {
        txtproponente1.setText("");
        txttipoespectaculo.setText("");
        txttitulo1.setText("");
        txtdescripcion.setText("");
        txtlugar.setText("");
        txtmontorec.setText("");
        txtcostoentrada.setText("");
        cbporcentaje.setSelected(false);
        cbentradas.setSelected(false);
        jT_cat.setModel(ICP.modeloJT3Categorias());

    }
//////////Categorias jtree -jp

}
