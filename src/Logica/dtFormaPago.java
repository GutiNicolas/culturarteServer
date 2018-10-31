/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author jp
 */
public class dtFormaPago {

    private String tituloP;
    private String titular;
    private String nickname;
    private String codigo;
    private dtPago fP;

    public dtFormaPago(String tituloP, String titular, String nickname, String codigo, dtPago fP) {
        this.tituloP = tituloP;
        this.titular = titular;
        this.nickname = nickname;
        this.codigo = codigo;
        this.fP = fP;
    }

    public dtFormaPago() {
    }

    /**
     * @return the tituloP
     */
    public String getTituloP() {
        return tituloP;
    }

    /**
     * @param tituloP the tituloP to set
     */
    public void setTituloP(String tituloP) {
        this.tituloP = tituloP;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the fP
     */
    public dtPago getfP() {
        return fP;
    }

    /**
     * @param fP the fP to set
     */
    public void setfP(dtPago fP) {
        this.fP = fP;
    }
}
