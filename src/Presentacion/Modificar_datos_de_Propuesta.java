/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.ContPropuesta;
import Logica.ContUsuario;
import Logica.dtFecha;
import Logica.dtHora;
import Logica.dtPropuesta;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nicolasgutierrez
 */
public class Modificar_datos_de_Propuesta extends javax.swing.JInternalFrame {
    
    ContUsuario contUsu = ContUsuario.getInstance();
    ContPropuesta contProp = ContPropuesta.getInstance();
    String imagenRuta = "COSO";
    JFileChooser navegadorArchivos = new JFileChooser();

    /**
     * Creates new form Modificar_datos_de_Propuesta
     */
    public Modificar_datos_de_Propuesta() {
        
        initComponents();
        contProp.propAutomaticas();
        this.setSize(801, 620);
        
        jLabel1.setText("Propuestas");
        jLabel13.setText("Titulo");
        labeltitulo.setText("Seleccione una propuesta");
        jLabel14.setText("Proponente");
        labelproponente.setText("Seleccione una propuesta");
        jLabel2.setText("Descripcion");
        jLabel3.setText("Lugar");
        jLabel4.setText("Imagen");
        
        btnexplorar2.setText("Explorar");
        jLabel5.setText("Fecha realizacion");
       
        jLabel11.setText("Estado");
        jLabel9.setText("Precio entrada");
        jLabel10.setText("Monto requerido");
        jLabel12.setText("Categoria");
        labelcategoria.setText("Seleccione una propuesta");
        jLabel15.setText("Fecha publicacion");
        jLabel16.setText("Retorno");
        labelretorno.setText("Seleccione una propuesta");
        btncancelar.setText("Cancelar");
        btnguardar.setText("Guardar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtlugar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprecioetrada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtmontorequerido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        labelimage = new javax.swing.JLabel();
        txtestado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnexplorar2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        busquedapropuestas = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labeltitulo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        labelproponente = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelcategoria = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        labelretorno = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Propuestas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Descripcion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane2.setViewportView(txtdescripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 298, 460, 100));

        jLabel3.setText("Lugar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel1.add(txtlugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, -1));

        jLabel4.setText("Imagen");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 52, -1));

        jLabel5.setText("Fecha realizacion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel1.add(txtprecioetrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, -1));

        jLabel9.setText("Precio entrada");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel1.add(txtmontorequerido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 170, -1));

        jLabel10.setText("Monto requerido");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        labelimage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 0)));
        jPanel1.add(labelimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 210, 150));
        jPanel1.add(txtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, -1));

        jLabel11.setText("Estado");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        btnexplorar2.setText("Explorar");
        btnexplorar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexplorar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnexplorar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 490, 410));

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, -1, -1));

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, -1, -1));

        busquedapropuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedapropuestasActionPerformed(evt);
            }
        });
        busquedapropuestas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                busquedapropuestasKeyPressed(evt);
            }
        });
        getContentPane().add(busquedapropuestas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 220, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Titulo"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 91, 220, 360));

        labeltitulo.setText("Seleccione una propuesta");
        getContentPane().add(labeltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 170, -1));

        jLabel13.setText("Titulo");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jLabel14.setText("Proponente");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        labelproponente.setText("Seleccione una propuesta");
        getContentPane().add(labelproponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 170, -1));

        jLabel12.setText("Categoria");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        labelcategoria.setText("Seleccione una propuesta");
        getContentPane().add(labelcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, -1));

        jLabel15.setText("Fecha publicacion");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        jLabel16.setText("Retorno");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        labelretorno.setText("Seleccione una propuesta");
        getContentPane().add(labelretorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busquedapropuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedapropuestasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedapropuestasActionPerformed

    private void busquedapropuestasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedapropuestasKeyPressed
        List<String> proponentes = contUsu.listartodaslaspropuestas(busquedapropuestas.getText());
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < proponentes.size(); i++) {
            String p = proponentes.get(i);
            Object[] dat = {p};
            modelo.addRow(dat);
        }
        
       
    }//GEN-LAST:event_busquedapropuestasKeyPressed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try {
            int row = jTable1.rowAtPoint(evt.getPoint());
            int col = jTable1.columnAtPoint(evt.getPoint());
            dtPropuesta dtp;
            
            dtp = contUsu.infoPropuesta((String) jTable1.getValueAt(row, col));
            txtdescripcion.setText(dtp.getDescripcion());
            txtlugar.setText(dtp.getLugar());
        /*    txtdiadia.setText(dtp.getFechaRealizacion().getDia());
            txtmesmes.setText(dtp.getFechaRealizacion().getMes());
            txtanioanio.setText(dtp.getFechaRealizacion().getAnio());*/
            txtprecioetrada.setText(Integer.toString(dtp.getPrecioentrada()));
            txtmontorequerido.setText(Integer.toString(dtp.getMontorequerido()));
            txtestado.setText(dtp.getEstado());
            labeltitulo.setText(dtp.getTitulo());
            labelproponente.setText(dtp.getProponente());
            imagenRuta = dtp.getImagen();
            labelcategoria.setText(dtp.getCategoria());
     //       labelfechacreacion.setText(dtp.getFechapublicada().getFecha());
            labelretorno.setText(dtp.getRetorno());
            
        } catch (Exception ex) {
            Logger.getLogger(Registrar_Colaboracion_a_Propuesta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        try {
       //     dtFecha dtf = new dtFecha(txtdiadia.getText(), txtmesmes.getText(), txtanioanio.getText());
         //   String[] fp = labelfechacreacion.getText().split("/");
      //      dtFecha dtfp = new dtFecha(fp[0], fp[1], fp[2]);
     //       dtPropuesta dtp = new dtPropuesta(labeltitulo.getText(), txtdescripcion.getText(), imagenRuta, txtlugar.getText(), txtestado.getText(), labelcategoria.getText(), labelproponente.getText(), dtf, dtfp, Integer.parseInt(txtprecioetrada.getText()), Integer.parseInt(txtmontorequerido.getText()), 0, labelretorno.getText());
            
            Calendar cal = Calendar.getInstance();
            Date da = cal.getTime();
            da.setYear(2018);
            dtFecha dtf2 = new dtFecha(Integer.toString(da.getDay()), Integer.toString(da.getMonth()), Integer.toString(da.getYear()));
            dtHora dth2 = new dtHora(da.getHours(), da.getMinutes());
            
       //     contProp.actualizardatospropuesta(dtp, txtestado.getText(), dtf2, dth2);
            JOptionPane.showMessageDialog(null, "Propuesta modificada con exito");
            sacarlabasura();
            
        } catch (Exception ex) {
            Logger.getLogger(Registrar_Colaboracion_a_Propuesta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnexplorar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexplorar2ActionPerformed
        // TODO add your handling code here:
        selecImagen();
    }//GEN-LAST:event_btnexplorar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnexplorar2;
    private javax.swing.JButton btnguardar;
    private javax.swing.JTextField busquedapropuestas;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelcategoria;
    private javax.swing.JLabel labelimage;
    private javax.swing.JLabel labelproponente;
    private javax.swing.JLabel labelretorno;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtlugar;
    private javax.swing.JTextField txtmontorequerido;
    private javax.swing.JTextField txtprecioetrada;
    // End of variables declaration//GEN-END:variables

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
        File outputfile = new File("/home/juan/ProgAplicaciones2018/progAplicaciones/imagenesPropuesta" + labeltitulo.getText() + ".png");
        imagenRuta = "/home/juan/ProgAplicaciones2018/progAplicaciones/imagenesPropuesta" + labeltitulo.getText() + ".png";
        try {            
            ImageIO.write(img, "png", outputfile);
        } catch (IOException ex) {
            Logger.getLogger(Alta_perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void sacarlabasura() {
        labeltitulo.setText("Seleccione una propuesta");
        labelproponente.setText("Seleccione una propuesta");
        labelcategoria.setText("Seleccione una propuesta");
        labelretorno.setText("Seleccione una propuesta");        
        txtdescripcion.setText("");
        txtlugar.setText("");
        txtestado.setText("");
        txtprecioetrada.setText("");
        txtmontorequerido.setText("");
    }
    
}
