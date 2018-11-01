/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.ContUsuario;
import Logica.iConUsuario;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nicolasgutierrez
 */
public class Seguir_Usuario extends javax.swing.JInternalFrame{

    
    private iConUsuario ICU= ContUsuario.getInstance();
 
    /**
     * Creates new form Seguir_Usuario
     */
    public Seguir_Usuario() {
        initComponents();
        
        this.setSize(580, 565);
        
        jLabel3.setText("Buscar usuario seguidor");
        jLabel4.setText("Buscar usuario a seguir");
        jLabel1.setText("Usuario seguidor");
        jLabel2.setText("Usuario a seguir");
        btncancelar.setText("Cancelar");
        btnseguir.setText("Seguir");
        
        tableseguidor.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int row = tableseguidor.rowAtPoint(evt.getPoint());
            int col = tableseguidor.columnAtPoint(evt.getPoint());
            if (row >= 0 && col >= 0) {
                    
            String aseguir=(String)tableseguidor.getValueAt(row, col);
            txtaseguir1.setText(aseguir);
            }
        }
        });

        
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
        txtseguidor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnseguir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableseguidor = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableseguidor1 = new javax.swing.JTable();
        txtaseguir1 = new javax.swing.JTextField();
        txtbuscar2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Usuario seguidor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 85, -1, -1));
        getContentPane().add(txtseguidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 112, 100, -1));

        jLabel2.setText("Usuario a seguir");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 161, 122, -1));

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarKeyPressed(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 47, 112, -1));

        btnseguir.setText("Seguir");
        btnseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseguirActionPerformed(evt);
            }
        });
        getContentPane().add(btnseguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 252, 107, -1));

        tableseguidor.setModel(new javax.swing.table.DefaultTableModel(
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
        tableseguidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableseguidorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableseguidor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 85, 96, 442));

        tableseguidor1.setModel(new javax.swing.table.DefaultTableModel(
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
        tableseguidor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableseguidor1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableseguidor1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 85, 147, 442));
        getContentPane().add(txtaseguir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 188, 100, -1));

        txtbuscar2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscar2KeyPressed(evt);
            }
        });
        getContentPane().add(txtbuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 47, 96, -1));

        jLabel3.setText("Buscar usuario seguidor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 26, 145, -1));

        jLabel4.setText("Buscar usuario a seguir");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 26, 123, -1));

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 226, 108, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseguirActionPerformed

        
        
        try{
           if(txtseguidor.getText()==txtaseguir1.getText())
               throw new Exception("Jaja buen intento, no puedes seguirte tu mismo");
            
        if(txtseguidor.getText().isEmpty()==false){
            if(txtaseguir1.getText().isEmpty()==false){
                ICU.seguir(txtseguidor.getText(), txtaseguir1.getText());
                javax.swing.JOptionPane.showMessageDialog(null,"Seguimiento realizado con exito");
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(null,"Seleccione un usuario a seguir");
                txtaseguir1.requestFocus();
            }
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(null,"Seleccione un usuario seguidor");
            txtseguidor.requestFocus();
        }
        
        
        // TODO add your handling code here:
        }catch(Exception ex){
         javax.swing.JOptionPane.showMessageDialog(null,ex);
        }
        
        this.txtseguidor.setText("");
        this.txtaseguir1.setText("");
        this.txtbuscar.setText("");
        this.txtbuscar2.setText("");
        
    }//GEN-LAST:event_btnseguirActionPerformed

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed
        // TODO add your handling code here:
        List<String> lu=ICU.listarusuarios(txtbuscar.getText());
        DefaultTableModel modelo=(DefaultTableModel) tableseguidor1.getModel();
        modelo.setRowCount(0);
        Iterator it=lu.iterator();
        while(it.hasNext()){
            String n=(String)it.next();
            Object[] obj={n};
            modelo.addRow(obj);
        
        }
    }//GEN-LAST:event_txtbuscarKeyPressed

    private void txtbuscar2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscar2KeyPressed
        // TODO add your handling code here:
        List<String> lu=ICU.listarusuarios(txtbuscar2.getText());
        DefaultTableModel modelo=(DefaultTableModel) tableseguidor.getModel();
        modelo.setRowCount(0);
        Iterator it=lu.iterator();
        while(it.hasNext()){
            String n=(String)it.next();
            Object[] obj={n};
            modelo.addRow(obj);
        
        }
    }//GEN-LAST:event_txtbuscar2KeyPressed

    private void tableseguidor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableseguidor1MouseClicked
        // TODO add your handling code here:
        int row=tableseguidor1.getSelectedRow();
        int col=tableseguidor1.getSelectedColumn();
        String seguidor=(String)tableseguidor1.getValueAt(row, col);
    
        txtseguidor.setText(seguidor);
        
    }//GEN-LAST:event_tableseguidor1MouseClicked

    private void tableseguidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableseguidorMouseClicked
        // TODO add your handling code here:
        int row=tableseguidor.rowAtPoint(evt.getPoint());
        int col=tableseguidor.columnAtPoint(evt.getPoint());
        String aseguir=(String)tableseguidor.getValueAt(row, col);
            txtaseguir1.setText(aseguir);
    }//GEN-LAST:event_tableseguidorMouseClicked

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnseguir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableseguidor;
    private javax.swing.JTable tableseguidor1;
    private javax.swing.JTextField txtaseguir1;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtbuscar2;
    private javax.swing.JTextField txtseguidor;
    // End of variables declaration//GEN-END:variables
}
