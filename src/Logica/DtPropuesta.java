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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;

/**
 *
 * @author Esteban Menendez
 */
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class DtPropuesta {

    @XmlElement(name = "titulo", namespace = "")
    private String titulo;
    @XmlElement(name = "descripcion", namespace = "")
    private String descripcion;
    @XmlElement(name = "imagen", namespace = "")
    private String imagen;
    @XmlElement(name = "lugar", namespace = "")
    private String lugar;
    @XmlElement(name = "estado", namespace = "")
    private String estado;
    @XmlElement(name = "categoria", namespace = "")
    private String categoria;
    @XmlElement(name = "proponente", namespace = "")
    private String proponente;
    @XmlElement(name = "retorno", namespace = "")
    private String retorno;
    @XmlElement(name = "fechaRealizacion", namespace = "")
    private dtFecha fechaRealizacion;
    @XmlElement(name = "fechaPublicada", namespace = "")
    private dtFecha fechapublicada;
    @XmlElement(name = "precioentrada", namespace = "")
    private int precioentrada;
    @XmlElement(name = "montorequerido", namespace = "")
    private int montorequerido;
    @XmlElement(name = "montoactual", namespace = "")
    private int montoactual;
    @XmlElement(name = "colaboradores", namespace = "")
    private List<String> colaboradores;

//CONSTRUCTOR//
    public DtPropuesta(DtPropuesta dt, int monto) {
        this.titulo = dt.getTitulo();
        this.descripcion = dt.getDescripcion();
        this.imagen = dt.getImagen();
        this.lugar = dt.getLugar();
        this.estado = dt.getEstado();
        this.categoria = dt.getCategoria();
        this.proponente = dt.getProponente();
        this.fechaRealizacion = dt.getFechaRealizacion();
        this.fechapublicada = dt.getFechapublicada();
        this.precioentrada = dt.getPrecioentrada();
        this.montorequerido = dt.getMontorequerido();
        this.montoactual = dt.getMontoTotal();
        this.retorno = dt.getRetorno();
        this.colaboradores = (ArrayList) dt.detColaboradores();
    }

    public DtPropuesta(String titulo, String descripcion, String imagen, String lugar, String estado, String categoria, String proponente, dtFecha fechaRealizacion, dtFecha fechapublicada, int precioentrada, int montorequerido, int montoactual, String retorno) {
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
        this.montoactual = montoactual;
        this.retorno = retorno;
        this.colaboradores = new ArrayList<String>();
    }

    public DtPropuesta(String titulo, String descripcion, String imagen, String lugar, String estado, String categoria, String proponente, dtFecha fechaRealizacion, dtFecha fechapublicada, int precioentrada, int montorequerido, int montoactual, String retorno, List<String> colaboradores) {
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

    public DtPropuesta(String titulo, String proponente) {
        this.titulo = titulo;
        this.proponente = proponente;
    }

    public boolean colabora(String nick) {
        boolean ret = false;
        Iterator it = this.colaboradores.iterator();
        while (it.hasNext()) {
            String c = (String) it.next();
            if (c.equals(nick)) {
                ret = true;
            }
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

    public List<String> detColaboradores() {
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

    /**
     * @param titulo the titulo to set
     */
    public void setTitulop(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcionp(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagenp(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugarp(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstadop(String estado) {
        this.estado = estado;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoriap(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @param proponente the proponente to set
     */
    public void setProponentep(String proponente) {
        this.proponente = proponente;
    }

    /**
     * @param retorno the retorno to set
     */
    public void setRetornop(String retorno) {
        this.retorno = retorno;
    }

    /**
     * @param fechaRealizacion the fechaRealizacion to set
     */
    public void setFechaRealizacionp(dtFecha fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    /**
     * @param fechapublicada the fechapublicada to set
     */
    public void setFechapublicadap(dtFecha fechapublicada) {
        this.fechapublicada = fechapublicada;
    }

    /**
     * @param precioentrada the precioentrada to set
     */
    public void setPrecioentradap(int precioentrada) {
        this.precioentrada = precioentrada;
    }

    /**
     * @param montorequerido the montorequerido to set
     */
    public void setMontorequeridop(int montorequerido) {
        this.montorequerido = montorequerido;
    }

    /**
     * @param montoactual the montoactual to set
     */
    public void setMontoactualp(int montoactual) {
        this.montoactual = montoactual;
    }

    /**
     * @param colaboradores the colaboradores to set
     */
    public void setColaboradoresP(List<String> colaboradores) {
        this.colaboradores = colaboradores;
    }
}
