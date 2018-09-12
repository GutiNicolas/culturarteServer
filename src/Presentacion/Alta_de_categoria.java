/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.ContPropuesta;
import Logica.categoria;
import Logica.dtCategoria;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author nicolasgutierrez
 */
public class Alta_de_categoria extends javax.swing.JInternalFrame {

    private Map<String, dtCategoria> cat = new HashMap<>();

    ContPropuesta contProp = ContPropuesta.getInstance();

    /**
     * Creates new form Alta_de_categoria
     */
    public Alta_de_categoria() {
        initComponents();

        this.jT_categorias.setModel(llenarjT());

    }

    private DefaultMutableTreeNode crearNodo(String nomNodo) {
        DefaultMutableTreeNode nuevo = new DefaultMutableTreeNode(nomNodo);
        return nuevo;
    }

    private DefaultTreeModel armarPadres(Map<String, DefaultMutableTreeNode> nodos) {
        DefaultMutableTreeNode raiz = crearNodo("Categorias");
        DefaultTreeModel modelo = new DefaultTreeModel(raiz);
        try {
            ArrayList<dtCategoria> cat = contProp.getdtCategorias();

            for (int i = 0; i < cat.size(); i++) {
                dtCategoria categoriaNodo = cat.get(i);
                String padre = categoriaNodo.getPadre();
                if (padre == null) {
                    modelo.insertNodeInto(nodos.get(categoriaNodo.getNombre()), raiz, 1);
                }
            }

        } catch (Exception e) {

            System.err.println(e.getMessage());
        }
        return modelo;
    }

    private void armarHijos(Map<String, DefaultMutableTreeNode> nodos, DefaultTreeModel modelo) {
        try {
        ArrayList<dtCategoria> cat = contProp.getdtCategorias();
        for (int i = 0; i < cat.size(); i++) {
            dtCategoria catNodo = cat.get(i);
            if (catNodo.getPadre() != null) {
                DefaultMutableTreeNode padre = nodos.get(catNodo.getPadre());
                DefaultMutableTreeNode hijo = nodos.get(catNodo.getNombre());
                modelo.insertNodeInto(hijo, padre, 1);
            }
        }    
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
private void llenarDtCat(ArrayList<dtCategoria> dtCat){
//uhuuh
}
    private void armarNodos(Map<String, DefaultMutableTreeNode> nodos) {
        try {
            ArrayList<dtCategoria> dtCat=new ArrayList<>();
           dtCat=(ArrayList < dtCategoria >)contProp.getdtCategorias();
            for (int i = 0; i < dtCat.size(); i++) {
                dtCategoria ca = dtCat.get(i);
                nodos.put(ca.getNombre(), crearNodo(ca.getNombre()));

            }

        } catch (Exception e) {

            System.err.println(e.getMessage());
        }

    }

    private DefaultTreeModel llenarjT() {
        DefaultTreeModel modelo = null;
        try {
            Map<String, DefaultMutableTreeNode> nodos = new HashMap<>();
            armarNodos(nodos);
            modelo = armarPadres(nodos);
            armarHijos(nodos, modelo);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return modelo;
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
        jT_categorias = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        jt_padre = new javax.swing.JTextField();
        jt_hijo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jb_aceptar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(jT_categorias);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 23, 280, 509));

        jLabel1.setText("Padre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));
        getContentPane().add(jt_padre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 170, -1));
        getContentPane().add(jt_hijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 170, -1));

        jLabel2.setText("Hijo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jb_aceptar.setText("Aceptar");
        getContentPane().add(jb_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        jb_cancelar.setText("Cancelar");
        getContentPane().add(jb_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
}
