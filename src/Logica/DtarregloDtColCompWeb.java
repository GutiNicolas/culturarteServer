/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;

/**
 *
 * @author jp
 */@XmlAccessorType(XmlAccessType.FIELD)
public class DtarregloDtColCompWeb {
    //@XmlElement(name="arregloColaboracion", namespace = "")
  
    private ArrayList<DtColaboracionCompWeb> arregloColaBoraciion=new ArrayList<>();

    public DtarregloDtColCompWeb() {
    }

    /**
     * @return the arregloCola
     */
    public ArrayList<DtColaboracionCompWeb> getArregloCola() {
        return arregloColaBoraciion;
    }

    /**
     * @param arregloCola the arregloCola to set
     */
    public void setArregloCola(ArrayList<DtColaboracionCompWeb> arregloCola) {
        this.arregloColaBoraciion = arregloCola;
    }
    
}
