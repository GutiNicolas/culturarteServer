/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.ContPropuesta;
import Logica.dtPropuestasBD;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juan
 */
public class Evaluar_Prop extends javax.swing.JFrame {

    String cancel_publicada = null;
    ContPropuesta contP = ContPropuesta.getInstance();
    ArrayList<dtPropuestasBD> propuestas = new ArrayList<>();

    /**
     * Creates new form Evaluar_Prop
     */
    public Evaluar_Prop() {

        initComponents();
        contP.propAutomaticas();
        btn_aceptar.setEnabled(false);
        jT_propuesta.setEditable(false);
        propuestas = (ArrayList<dtPropuestasBD>) contP.getdtPropIngr();
        llenaGrilla(propuestas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_propuestas = new javax.swing.JTable();
        jT_busqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jR_publicada = new javax.swing.JRadioButton();
        jR_cancelada = new javax.swing.JRadioButton();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jT_propuesta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tabla_propuestas.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_propuestas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_propuestasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_propuestas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 31, 267, 441);

        jT_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jT_busquedaKeyPressed(evt);
            }
        });
        getContentPane().add(jT_busqueda);
        jT_busqueda.setBounds(77, 10, 193, 19);

        jLabel1.setText("Buscar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 48, 15);

        jR_publicada.setText("Publicada");
        jR_publicada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_publicadaActionPerformed(evt);
            }
        });
        getContentPane().add(jR_publicada);
        jR_publicada.setBounds(307, 96, 94, 23);

        jR_cancelada.setText("Cancelada");
        jR_cancelada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_canceladaActionPerformed(evt);
            }
        });
        getContentPane().add(jR_cancelada);
        jR_cancelada.setBounds(307, 126, 99, 23);

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_aceptar);
        btn_aceptar.setBounds(410, 366, 97, 25);

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar);
        btn_cancelar.setBounds(410, 412, 98, 25);

        jT_propuesta.setText("Propuesta");
        getContentPane().add(jT_propuesta);
        jT_propuesta.setBounds(307, 33, 203, 19);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jR_publicadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_publicadaActionPerformed
        // TODO add your handling code here:
        btn_aceptar.setEnabled(true);
        jR_cancelada.setSelected(false);
        cancel_publicada = null;
        cancel_publicada = "Publicada";
    }//GEN-LAST:event_jR_publicadaActionPerformed

    private void jR_canceladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_canceladaActionPerformed
        btn_aceptar.setEnabled(true);
        jR_publicada.setSelected(false);
        cancel_publicada = null;
        cancel_publicada = "Cancelada";
        // TODO add your handling code here:
    }//GEN-LAST:event_jR_canceladaActionPerformed

    private void tabla_propuestasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_propuestasMouseClicked

        int row = tabla_propuestas.rowAtPoint(evt.getPoint());
        int col = tabla_propuestas.columnAtPoint(evt.getPoint());
        System.out.println("fila" + row);
        System.out.println("columna" + col);
        jT_propuesta.setText((String) tabla_propuestas.getValueAt(row, 0));
    }//GEN-LAST:event_tabla_propuestasMouseClicked

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed

        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void jT_busquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_busquedaKeyPressed
        buscarTXT(jT_busqueda.getText());
    }//GEN-LAST:event_jT_busquedaKeyPressed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        int res = JOptionPane.showConfirmDialog(null, "Desea cambiar el estado de la propuesta: " + jT_propuesta.getText(), "Consulta", JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            if (altaEstado()) {
                JOptionPane.showMessageDialog(null, "El nuevo estado " + cancel_publicada + " se a agregado con exito!");
                limpiar();

            }
        }


    }//GEN-LAST:event_btn_aceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    private boolean altaEstado() {
        if (jT_propuesta.getText() != null) {

            return contP.nuevoEstadoProp(jT_propuesta.getText(), cancel_publicada);

        }
        return false;
    }

    private void limpiar() {
        propuestas.clear();
        propuestas = (ArrayList<dtPropuestasBD>) contP.getdtPropIngr();
        llenaGrilla(propuestas);
        jT_propuesta.setText("Propuesta");

        jR_cancelada.setSelected(false);
        jR_publicada.setSelected(false);
        btn_aceptar.setEnabled(false);
    }

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
            java.util.logging.Logger.getLogger(Evaluar_Prop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Evaluar_Prop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Evaluar_Prop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Evaluar_Prop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Evaluar_Prop().setVisible(true);
            }
        });
    }

    /**
     *
     * llena la grilla con los datos de un arreglo dtPropuestasBD, contiene el
     * titulo de la propuesta y el nickname del proponente
     *
     *
     */
    private void bloquear() {
        jT_busqueda.setEnabled(false);
        jT_propuesta.setEnabled(false);
        tabla_propuestas.setEnabled(false);
        jR_cancelada.setEnabled(false);
        jR_publicada.setEnabled(false);
        btn_aceptar.setEnabled(false);

    }

    private void llenaGrilla(ArrayList<dtPropuestasBD> prop) {
        try {

            if (prop.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay propuestas con estado Ingresada");
                bloquear();
            } else {
                DefaultTableModel modelo;
                Vector vect = new Vector();
                vect.add("Titulo");
                vect.add("Proponente");
                modelo = new DefaultTableModel(vect, prop.size());
                for (int i = 0; i < prop.size(); i++) {
                    dtPropuestasBD p = (dtPropuestasBD) prop.get(i);
                    modelo.setValueAt(p.getTitulo(), i, 0);
                    modelo.setValueAt(p.getNickproponente(), i, 1);
                }
                tabla_propuestas.setModel(modelo);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     *
     * busca coincidencias de titulo de propuesta y nickname de proponente,
     * recibe un string refresca la grilla con los datos coincidentes by jp
     */
    private void buscarTXT(String textbusqueda) {
        try {
            ArrayList<dtPropuestasBD> filtro = new ArrayList<>();
            for (int i = 0; i < propuestas.size(); i++) {
                dtPropuestasBD dtp = (dtPropuestasBD) propuestas.get(i);
                if (comparaParecido(dtp, textbusqueda)) {
                    filtro.add(dtp);
                }
            }
            llenaGrilla(filtro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * funcion derivada de buscarTXT recibe un dtPropuestasBD y un String
     * retorna true si la cadena de filtro esta contenida en la cadena titulo o
     * nickname
     */
    private boolean comparaParecido(dtPropuestasBD dtc, String filtro) {
        try {
            String titulo = null, propo = null;
            titulo = dtc.getTitulo();
            propo = dtc.getNickproponente();
            if (titulo != null && propo != null) {
                if (titulo.contains(filtro)) {
                    return true;
                }
                if (propo.contains(filtro)) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jR_cancelada;
    private javax.swing.JRadioButton jR_publicada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_busqueda;
    private javax.swing.JTextField jT_propuesta;
    private javax.swing.JTable tabla_propuestas;
    // End of variables declaration//GEN-END:variables
}
