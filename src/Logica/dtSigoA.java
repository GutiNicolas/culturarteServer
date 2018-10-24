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
 * @author nicolasgutierrez
 */@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class dtSigoA {
    private String nickusuario,rol,nombrecompleto;

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public dtSigoA(String nickusuario, String rol, String nc) {
        this.nickusuario = nickusuario;
        this.rol = rol;
        this.nombrecompleto=nc;
    }

    public String getNickusuario() {
        return nickusuario;
    }

    public String getRol() {
        return rol;
    }
    
    
}
