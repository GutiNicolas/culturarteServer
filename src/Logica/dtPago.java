/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author juan
 */
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class dtPago {

    @XmlElement(name = "titular", namespace = "")
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
