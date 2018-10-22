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
 */@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class dtTarjetaCredito extends dtPago {

    private String tipo;
    private String numeroTarjeta;
    private int cvc;
    private dtFecha fVencimiento;

    public dtTarjetaCredito(String tipo, String numeroTarjeta, int cvc, dtFecha fVencimiento, String titular) {
        super(titular);
        this.tipo = tipo;
        this.numeroTarjeta = numeroTarjeta;
        this.cvc = cvc;
        this.fVencimiento = fVencimiento;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return the numeroTarjeta
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * @return the cvc
     */
    public int getCvc() {
        return cvc;
    }

    /**
     * @return the fVencimiento
     */
    public dtFecha getfVencimiento() {
        return fVencimiento;
    }

}
