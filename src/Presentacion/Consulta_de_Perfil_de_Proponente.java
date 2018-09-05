/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.ContPropuesta;
import Logica.ContUsuario;
import Logica.dtProponente;
import Logica.dtPropuesta;
import Logica.iConPropuesta;
import Logica.iConUsuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nicolasgutierrez
 */
public class Consulta_de_Perfil_de_Proponente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Consulta_de_Perfil_de_Proponente
     */
    
    private ContUsuario ICU = ContUsuario.getInstance();
    private ContPropuesta ICP = ContPropuesta.getInstance();
    
    public Consulta_de_Perfil_de_Proponente() {
        initComponents();
        this.setSize(660, 530);
        
        jLabel1.setText("Proponentes");
        jLabel2.setText("Informacion para:");
        labelnickname.setText("Seleccione un proponente...");
        jLabel3.setText("Imagen");
        jLabel4.setText("Propuestas");
        jLabel5.setText("Colaboradores para la propuesta");
        jLabel6.setText("Monto recaudado");
        labelmonto.setText("Monto");
        jButton1.setText("Cancelar");
        labelimagen.setText("");
        labelimgpropuesta.setText("");
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelnickname = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableproponente = new javax.swing.JTable();
        labelimagen = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablecolaboradores = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablepropuestas1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        labelmonto = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableinfopropuesta = new javax.swing.JTable();
        labelimgpropuesta = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 96, 125, 382));

        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 26, -1, -1));

        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 26, -1, -1));

        getContentPane().add(labelnickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 26, -1, -1));

        tableproponente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Email", "Nacimiento", "Web", "Biografia"
            }
        ));
        jScrollPane2.setViewportView(tableproponente);
        if (tableproponente.getColumnModel().getColumnCount() > 0) {
            tableproponente.getColumnModel().getColumn(2).setHeaderValue("Email");
            tableproponente.getColumnModel().getColumn(3).setResizable(false);
            tableproponente.getColumnModel().getColumn(3).setHeaderValue("Nacimiento");
            tableproponente.getColumnModel().getColumn(4).setHeaderValue("Web");
            tableproponente.getColumnModel().getColumn(5).setHeaderValue("Biografia");
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 42, 403, 71));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, labelimagen, org.jdesktop.beansbinding.ObjectProperty.create(), labelimagen, org.jdesktop.beansbinding.BeanProperty.create("icon"));
        

        getContentPane().add(labelimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 151, 100, 100));

        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 125, -1, -1));

        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 125, -1, -1));

        tablecolaboradores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablecolaboradores);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 208, 100));

        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 350, -1, -1));

        tablepropuestas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Titulo", "Estado"
            }
        ));
        tablepropuestas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablepropuestas1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablepropuestas1);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 150, 276, 100));

        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 350, 149, -1));

        getContentPane().add(labelmonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 378, 49, -1));

        tableinfopropuesta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Descripcion", "Lugar", "Fecha"
            }
        ));
        jScrollPane5.setViewportView(tableinfopropuesta);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 257, 291, 81));
        getContentPane().add(labelimgpropuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 257, 81, 81));

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
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 59, 125, -1));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

       

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed
        // TODO add your handling code here:
        List<String> proponentes= ICU.listarProponentes(txtbuscar.getText());
        DefaultTableModel modelo=(DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        for (int i=0;i<proponentes.size();i++) {
            String p=proponentes.get(i);
            Object[] dat={p};
            modelo.addRow(dat);
        }                
        
    }//GEN-LAST:event_txtbuscarKeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row=jTable1.rowAtPoint(evt.getPoint());
        int col=jTable1.columnAtPoint(evt.getPoint());
        dtProponente dtp=ICU.infoProponente((String)jTable1.getValueAt(row, col)); //una forma
        labelnickname.setText(dtp.getNickname());
        DefaultTableModel modelo=(DefaultTableModel) tableproponente.getModel();
        modelo.setRowCount(0);
        Object[] dat={dtp.getNombre(),dtp.getApellido(),dtp.getEmail(),dtp.getFechaNac().getFecha(),dtp.getSitioWeb(),dtp.getBiografia()};
        modelo.addRow(dat);
        
        List<dtPropuesta> ldtp=ICU.listarPropuestas((String)jTable1.getValueAt(row, col)); //otra forma // jTable1.getValueAt(row, col).toString()
        DefaultTableModel modelo2=(DefaultTableModel) tablepropuestas1.getModel();
        modelo2.setRowCount(0);
        for (int i=0;i<ldtp.size();i++) {
            dtPropuesta p=(dtPropuesta)ldtp.get(i);
            Object[] dat2={p.getTitulo(),p.getEstado()};
            modelo2.addRow(dat2);
            
        }
            
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void tablepropuestas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablepropuestas1MouseClicked
        // TODO add your handling code here:
        int row=jTable1.rowAtPoint(evt.getPoint());
        int col=jTable1.columnAtPoint(evt.getPoint());
        String titulo= (String)tablepropuestas1.getValueAt(row, col);
        dtPropuesta dtp=ICP.infoProp(titulo); //pide el titulo al array
        DefaultTableModel model=(DefaultTableModel) tableinfopropuesta.getModel();
        model.setRowCount(0);
        
        Object[] inf={dtp.getTitulo(),dtp.getDescripcion(),dtp.getLugar(),dtp.getFechaRealizacion().getFecha()};
        model.addRow(inf);
        labelmonto.setText(Integer.toString(dtp.getMontoTotal()));
        
        List<String> lc=dtp.detColaboradores();
        DefaultTableModel model2=(DefaultTableModel) tablecolaboradores.getModel();
        model2.setRowCount(0);
        for (int i=0;i<lc.size();i++){
            String nick=(String)lc.get(i);
            Object[] colabs={nick};
            model2.addRow(colabs);
        }
        
    }//GEN-LAST:event_tablepropuestas1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelimagen;
    private javax.swing.JLabel labelimgpropuesta;
    private javax.swing.JLabel labelmonto;
    private javax.swing.JLabel labelnickname;
    private javax.swing.JTable tablecolaboradores;
    private javax.swing.JTable tableinfopropuesta;
    private javax.swing.JTable tableproponente;
    private javax.swing.JTable tablepropuestas1;
    private javax.swing.JTextField txtbuscar;
  
    // End of variables declaration//GEN-END:variables
}
