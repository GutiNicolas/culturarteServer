/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author juan
 */
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
