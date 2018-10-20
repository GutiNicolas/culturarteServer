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
public class tarjetaCredito extends pago{
    private String tipo;
    private String numeroTarjeta;
    private int cvc;
    private dtFecha fVencimiento;

    public tarjetaCredito(String tipo, String numeroTarjeta, int cvc, dtFecha fVencimiento, String titular) {
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
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the numeroTarjeta
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * @param numeroTarjeta the numeroTarjeta to set
     */
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     * @return the cvc
     */
    public int getCvc() {
        return cvc;
    }

    /**
     * @param cvc the cvc to set
     */
    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    /**
     * @return the fVencimiento
     */
    public dtFecha getfVencimiento() {
        return fVencimiento;
    }

    /**
     * @param fVencimiento the fVencimiento to set
     */
    public void setfVencimiento(dtFecha fVencimiento) {
        this.fVencimiento = fVencimiento;
    }

  

   
    
    
}
