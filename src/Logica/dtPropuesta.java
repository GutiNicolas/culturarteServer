/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author Esteban Menendez
 */
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class dtPropuesta {

    String titulo, descripcion, imagen, lugar, estado, categoria, proponente;
    private String retorno;
    dtFecha fechaRealizacion, fechapublicada;
    int precioentrada, montorequerido, montoactual;
    List<String> colaboradores;

//CONSTRUCTOR//
    public dtPropuesta(String titulo, String descripcion, String imagen, String lugar, String estado, String categoria, String proponente, dtFecha fechaRealizacion, dtFecha fechapublicada, int precioentrada, int montorequerido, int montoactual, String retorno) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.lugar = lugar;
        this.estado = estado;
        this.categoria = categoria;
        this.proponente = proponente;
        this.fechaRealizacion = fechaRealizacion;
        this.fechapublicada = fechapublicada;
        this.precioentrada = precioentrada;
        this.montorequerido = montorequerido;
        this.montoactual=montoactual;
       this.retorno=retorno;
        this.colaboradores= new ArrayList<String>();
    }

    public dtPropuesta(String titulo, String descripcion, String imagen, String lugar, String estado, String categoria, String proponente, dtFecha fechaRealizacion, dtFecha fechapublicada, int precioentrada, int montorequerido, int montoactual, String retorno, List<String> colaboradores) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.lugar = lugar;
        this.estado = estado;
        this.categoria = categoria;
        this.proponente = proponente;
        this.retorno = retorno;
        this.fechaRealizacion = fechaRealizacion;
        this.fechapublicada = fechapublicada;
        this.precioentrada = precioentrada;
        this.montorequerido = montorequerido;
        this.montoactual = montoactual;
        this.colaboradores = colaboradores;
    }

    public dtPropuesta(String titulo, String proponente) {
        this.titulo = titulo;
        this.proponente = proponente;
    }
    
    public boolean colabora(String nick){
        boolean ret=false;
        Iterator it=this.colaboradores.iterator();
        while(it.hasNext()){
            String c=(String) it.next();
            if(c.equals(nick))
                ret=true;
        }
        return ret;
    }
    
    

//GETTERS//
    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public String getLugar() {
        return lugar;
    }

    public String getEstado() {
        return estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getProponente() {
        return proponente;
    }

    public dtFecha getFechaRealizacion() {
        return fechaRealizacion;
    }

    public dtFecha getFechapublicada() {
        return fechapublicada;
    }

    public int getPrecioentrada() {
        return precioentrada;
    }

    public int getMontorequerido() {
        return montorequerido;
    }
    
    public List<String> detColaboradores(){
        return colaboradores;
    }
    
    public int getMontoTotal() {
        return montoactual;
    }


    /**
     * @return the retorno
     */
    public String getRetorno() {
        return retorno;
    }
}
