/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author juan
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class dtContieneArray {

    private ArrayList myArreglo;
    private String nombreArray;
    private dtProponente prop;
    private dtColaborador cola;
    private dtSigoA sigoA;
    private dtUsuario usu;
    private dtColProp colp;
    private dtPago pago;
    private dtPaypal paypal;
    private dtTransferencia trans;
    private dtTarjetaCredito tarCredito;

    /**
     * Clase que contiene ArrayList para usar en Web recibe dos parametros el
     * arreglo y un nombre para el arreglo
     *
     * @param myArreglo
     * @param nombreArray
     */
    public dtContieneArray(ArrayList myArreglo, String nombreArray) {

        this.myArreglo = myArreglo;
        this.nombreArray = nombreArray;

    }

    /**
     * @return the myArreglo
     */
    public ArrayList getMyArreglo() {
        return myArreglo;
    }

    /**
     * @return the nombreArray
     */
    public String getNombreArray() {
        return nombreArray;
    }

    /**
     * @return the prop
     */
    public dtProponente getProp() {
        return prop;
    }

    /**
     * @return the cola
     */
    public dtColaborador getCola() {
        return cola;
    }

    /**
     * @return the sigoA
     */
    public dtSigoA getSigoA() {
        return sigoA;
    }

    /**
     * @return the usu
     */
    public dtUsuario getUsu() {
        return usu;
    }

    /**
     * @param usu the usu to set
     */
    public void setUsu(dtUsuario usu) {
        this.usu = usu;
    }

    /**
     * @return the colp
     */
    /*public dtColProp getColp() {
        return colp;
    }*/
}
