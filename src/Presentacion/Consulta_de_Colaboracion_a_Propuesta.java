/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.ContColaboracion;
import Logica.ContPropuesta;
import Logica.ContUsuario;
import Logica.dtColProp;
import Logica.dtCola;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nicolasgutierrez
 */
public class Consulta_de_Colaboracion_a_Propuesta extends javax.swing.JInternalFrame {

    private ContUsuario ICU = ContUsuario.getInstance();
    private ContColaboracion ICC= ContColaboracion.getInstance();
    private ContPropuesta contP = ContPropuesta.getInstance();
    /**
     * Creates new form Consulta_de_Colaboracion_a_Propuesta
     * 
     */
    public Consulta_de_Colaboracion_a_Propuesta() {
        initComponents();
        contP.propAutomaticas();
        this.setSize(626, 582);
        
        jLabel1.setText("Colaboradores");
        jLabel4.setText("Colaboraciones realizadas");
        labelnick.setText("Seleccione un colaborador");
        jLabel5.setText("Informacion de colaboracion");
        jButton1.setText("Cancelar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablacolaboradores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablacolaboraciones = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablainfocol = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        labelnick = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablacolaboradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nickname"
            }
        ));
        tablacolaboradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablacolaboradoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablacolaboradores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 98, 120, 410));

        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        tablacolaboraciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Titulo", "Nickname"
            }
        ));
        tablacolaboraciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablacolaboracionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablacolaboraciones);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 88, 390, 125));

        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 225, -1, -1));

        tablainfocol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Monto", "Fecha", "Hora", "Retorno"
            }
        ));
        jScrollPane3.setViewportView(tablainfocol);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 247, 390, 220));

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
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, -1));

        getContentPane().add(labelnick, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, 20));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed
        // TODO add your handling code here:
        List<String> colaboradores= ICU.listarColaboradoresporNick(txtbuscar.getText());
        DefaultTableModel modelo=(DefaultTableModel) tablacolaboradores.getModel();
        modelo.setRowCount(0);
        for (int i=0;i<colaboradores.size();i++) {
            String c=colaboradores.get(i);
            Object[] dat={c};
            modelo.addRow(dat);
        }
    }//GEN-LAST:event_txtbuscarKeyPressed

    private void tablacolaboradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacolaboradoresMouseClicked
        // TODO add your handling code here:
        vaciarTablas();
        int row=tablacolaboradores.rowAtPoint(evt.getPoint());
        int col=tablacolaboradores.columnAtPoint(evt.getPoint());
        
        DefaultTableModel modelo=(DefaultTableModel) tablacolaboraciones.getModel();
        modelo.setRowCount(0);
        List<dtCola> list=ICC.listarcolaboracionesdelcolaborador((String)tablacolaboradores.getValueAt(row, col));
        labelnick.setText((String)tablacolaboradores.getValueAt(row, col));
        Iterator it=list.iterator();
        while(it.hasNext()){
            dtCola dtco=(dtCola) it.next();
            Object[] dat={dtco.getTitulo(),(String)tablacolaboradores.getValueAt(row, col)};
            modelo.addRow(dat);
        }
        
    }//GEN-LAST:event_tablacolaboradoresMouseClicked

    private void tablacolaboracionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacolaboracionesMouseClicked
        // TODO add your handling code here:
        int row=tablacolaboraciones.rowAtPoint(evt.getPoint());
        int col=tablacolaboraciones.columnAtPoint(evt.getPoint());        
        DefaultTableModel modelo=(DefaultTableModel) tablainfocol.getModel();
        modelo.setRowCount(0);
        dtColProp dtcp=ICC.seleccionarColaboracion(labelnick.getText(),(String)tablacolaboraciones.getValueAt(row, col));       
        
            Object[] dat={(String)tablacolaboraciones.getValueAt(row, col),dtcp.getMontoColaborado(),dtcp.getFecha().getFecha(),dtcp.getHora().getHora(),dtcp.getRetorno()};
            modelo.addRow(dat);
        
    }//GEN-LAST:event_tablacolaboracionesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelnick;
    private javax.swing.JTable tablacolaboraciones;
    private javax.swing.JTable tablacolaboradores;
    private javax.swing.JTable tablainfocol;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables

    public void vaciarTablas(){
    DefaultTableModel modelo=(DefaultTableModel) tablainfocol.getModel();
    modelo.setRowCount(0);   
    }
}
