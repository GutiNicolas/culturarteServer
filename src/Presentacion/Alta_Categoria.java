/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.ContPropuesta;
import Logica.dtCategoria;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author juan
 */
public class Alta_Categoria extends javax.swing.JFrame {

    private ArrayList< dtCategoria> cat = new ArrayList<>();

    ContPropuesta contProp = ContPropuesta.getInstance();

    /**
     * Creates new form Alta_Categoria
     */
    public Alta_Categoria() {
        initComponents();
        this.jT_categorias.setModel(llenarjT());
        this.jt_padre.setEditable(false);
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
        jt_padre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jt_hijo = new javax.swing.JTextField();
        jb_aceptar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_categorias = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Padre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 40, 42, 15);

        jt_padre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_padreKeyTyped(evt);
            }
        });
        getContentPane().add(jt_padre);
        jt_padre.setBounds(380, 40, 164, 30);

        jLabel2.setText("Hijo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 100, 27, 15);

        jt_hijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_hijoActionPerformed(evt);
            }
        });
        getContentPane().add(jt_hijo);
        jt_hijo.setBounds(380, 90, 164, 30);

        jb_aceptar.setText("Aceptar");
        jb_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_aceptar);
        jb_aceptar.setBounds(330, 170, 89, 25);

        jb_cancelar.setText("Cancelar");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_cancelar);
        jb_cancelar.setBounds(430, 170, 96, 25);

        jT_categorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jT_categoriasMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_categoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_categorias);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 10, 230, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_categoriasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_categoriasMousePressed
        TreePath Path = jT_categorias.getPathForLocation(evt.getX(), evt.getY());
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) Path.getLastPathComponent();
        //if(node.isLeaf()){

        if (node != null) {
            jt_padre.setText(node.toString());
        } else {
            jt_padre.setText(null);
        }

        //}
    }//GEN-LAST:event_jT_categoriasMousePressed

    private void jT_categoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_categoriasMouseClicked

    }//GEN-LAST:event_jT_categoriasMouseClicked
    private boolean controlDatos() {

        if (jt_hijo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe escribir un nombre de categoria");
            jt_hijo.selectAll();
            jt_hijo.requestFocus();
            return false;
        }
        return true;
    }

    private void limpiar() {
        jt_padre.setText(null);
        jt_hijo.setText(null);
    }

    private void jb_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_aceptarActionPerformed
        if (jt_padre.getText() == null && controlDatos() == true) {

            dtCategoria cate = new dtCategoria(jt_hijo.getText(), null);
            contProp.altaCategoria(cate);
            JOptionPane.showMessageDialog(null, "Categoria " + jt_hijo.getText() + " agregada con exito!");
            this.jT_categorias.setModel(llenarjT());
            limpiar();
        }

        if (jt_padre.getText() != null && controlDatos() == true) {
            dtCategoria cate = new dtCategoria(jt_hijo.getText(), jt_padre.getText());
            contProp.altaCategoria(cate);
            JOptionPane.showMessageDialog(null, "Categoria " + jt_hijo.getText() + " agregada con exito!");
            this.jT_categorias.setModel(llenarjT());
            limpiar();
        }
    }//GEN-LAST:event_jb_aceptarActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        limpiar();
        this.dispose();
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jt_padreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_padreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_padreKeyTyped

    private void jt_hijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_hijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_hijoActionPerformed

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
            java.util.logging.Logger.getLogger(Alta_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta_Categoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jT_categorias;
    private javax.swing.JButton jb_aceptar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JTextField jt_hijo;
    private javax.swing.JTextField jt_padre;
    // End of variables declaration//GEN-END:variables

//FUNCIONES......
    private void cargaCategorias() {
        try {
            cat.clear();
            cat = (ArrayList< dtCategoria>) contProp.getdtCategorias();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private DefaultMutableTreeNode crearNodo(String nomNodo) {
        System.out.println(nomNodo);
        DefaultMutableTreeNode nuevo = new DefaultMutableTreeNode(nomNodo);
        return nuevo;
    }

    private void armarNodos(Map<String, DefaultMutableTreeNode> nodos) {
        try {

            for (int i = 0; i < cat.size(); i++) {

                dtCategoria ca = (dtCategoria) cat.get(i);
                System.out.println(ca.getNombre());
                nodos.put(ca.getNombre(), crearNodo(ca.getNombre()));

            }

        } catch (Exception e) {

            System.err.println(e.getMessage());
        }

    }

    private DefaultTreeModel armarPadres(Map<String, DefaultMutableTreeNode> nodos) {
        DefaultMutableTreeNode raiz = crearNodo("Categorias");
        DefaultTreeModel modelo = new DefaultTreeModel(raiz);
        try {

            for (int i = 0; i < cat.size(); i++) {
                dtCategoria categoriaNodo = cat.get(i);
                String padre = categoriaNodo.getPadre();
                if (padre == null) {
                    DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) nodos.get(categoriaNodo.getNombre());
                    modelo.insertNodeInto(nodo, raiz, 0);
                }
            }

        } catch (Exception e) {

            System.err.println(e.getMessage());
        }
        return modelo;
    }

    private void armarHijos(Map<String, DefaultMutableTreeNode> nodos, DefaultTreeModel modelo) {
        try {

            for (int i = 0; i < cat.size(); i++) {
                dtCategoria catNodo = cat.get(i);
                if (catNodo.getPadre() != null) {
                    DefaultMutableTreeNode padre = nodos.get(catNodo.getPadre());
                    DefaultMutableTreeNode hijo = nodos.get(catNodo.getNombre());
                    modelo.insertNodeInto(hijo, padre, 0);
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    private DefaultTreeModel llenarjT() {
        DefaultTreeModel modelo = null;
        try {
            cargaCategorias();
            Map<String, DefaultMutableTreeNode> nodos = new HashMap<>();
            armarNodos(nodos);
            modelo = armarPadres(nodos);
            armarHijos(nodos, modelo);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return modelo;
    }
}
