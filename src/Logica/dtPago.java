/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author juan
 */
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class dtPago {
    private String titular;

    public dtPago(String titular) {
        this.titular = titular;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }
    
}
