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
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelnickname = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableproponente = new javax.swing.JTable();
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
        labelimagen = new javax.swing.JLabel();

        getContentPane().setLayout(new java.awt.GridBagLayout());

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 102;
        gridBagConstraints.ipady = 355;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(11, 36, 0, 0);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 58, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 41, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 32, 0, 0);
        getContentPane().add(labelnickname, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 38;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 380;
        gridBagConstraints.ipady = 44;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 41, 0, 31);
        getContentPane().add(jScrollPane2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 41, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 21, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 185;
        gridBagConstraints.ipady = 73;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(14, 49, 4, 0);
        getContentPane().add(jScrollPane3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 41, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 35;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 253;
        gridBagConstraints.ipady = 73;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(9, 16, 0, 31);
        getContentPane().add(jScrollPane4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 30;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 25, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 25, 0, 0);
        getContentPane().add(labelmonto, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 268;
        gridBagConstraints.ipady = 54;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 41, 0, 0);
        getContentPane().add(jScrollPane5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 22;
        gridBagConstraints.ipadx = 81;
        gridBagConstraints.ipady = 81;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 18, 0, 0);
        getContentPane().add(labelimgpropuesta, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 114;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 36, 0, 0);
        getContentPane().add(txtbuscar, gridBagConstraints);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(46, 32, 0, 0);
        getContentPane().add(jButton1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 49, 0, 0);
        getContentPane().add(labelimagen, gridBagConstraints);

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
        vaciarTablas();
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

public void vaciarTablas(){
    DefaultTableModel model=(DefaultTableModel) tableinfopropuesta.getModel();
    model.setRowCount(0); 
    DefaultTableModel model2=(DefaultTableModel) tablepropuestas1.getModel();
    model2.setRowCount(0); 
    DefaultTableModel model3=(DefaultTableModel) tablecolaboradores.getModel();
    model3.setRowCount(0);     
}
}
