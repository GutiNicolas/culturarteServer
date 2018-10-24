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
public class dtPaypal extends dtPago {

    private String numeroPaypal;

    public dtPaypal(String numeroPaypal, String titular) {
        super(titular);
        this.numeroPaypal = numeroPaypal;
    }

    /**
     * @return the numeroPaypal
     */
    public String getNumeroPaypal() {
        return numeroPaypal;
    }

}
