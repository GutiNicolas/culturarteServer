/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class dtContieneArray {

    private ArrayList myArreglo; 
    private String nombreArray;

    public dtContieneArray(ArrayList myArreglo, String nombreArray) {

        this.myArreglo=myArreglo;
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
}
