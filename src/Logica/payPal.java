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
public class payPal extends pago{
    private String numeroPaypal;

    public payPal(String numeroPaypal, String titular) {
        super(titular);
        this.numeroPaypal = numeroPaypal;
    }

   

    /**
     * @return the numeroPaypal
     */
    public String getNumeroPaypal() {
        return numeroPaypal;
    }

    /**
     * @param numeroPaypal the numeroPaypal to set
     */
    public void setNumeroPaypal(String numeroPaypal) {
        this.numeroPaypal = numeroPaypal;
    }
    
    
}
