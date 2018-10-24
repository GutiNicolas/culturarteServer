/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author nicolasgutierrez
 */
public interface iConPropuesta {

    public abstract void cargarPropuestas();

    public abstract List<DtPropuesta> listaPropuestas(String idProponente);

    public abstract dtInfoProp infoPropuesta(String idPropuesta);

    public abstract void nuevaPropuesta(String idProponente, String tipoEspectaculo);

    public abstract void datosPropuesta(DtPropuesta dtProp);

    public abstract void altaPropuesta();

    public abstract List<DtPropuesta> listarPropuesta();

    public abstract DtPropuesta infoProp(String idPropuesta);

    public abstract void modificarPropuesta(DtPropuesta dtProp);

    public abstract List<dtPropuestaComp> informacionPropuestas(String titulo);

    public abstract List<dtPropuestasProponente> listarPropuestasExistentes();

    public abstract DtPropuesta mostrarInfoPropuesta(String idPropuesta) throws Exception;

    public abstract List<String> listartodasPropuestas(String titulo);

    public abstract void borrartodocPropuesta();

    public abstract propEstado crearEstado(dtEstadosPropuestas dtestProp);

    public abstract propuesta armarPropuesta(dtPropuestasBD dtProp);

    public abstract estado getEstado(String estaNombre);

    public abstract categoria getCategoria(String cateNombre);

    public abstract void cargarEstadosProp(propuesta prop, ArrayList<dtEstadosPropuestas> estProp);

    public abstract int getIdEstado(String estadoNom);

    public abstract void agregarEstadoAPropuesta(String e, String titulo, dtFecha dtf, dtHora dth);

    public abstract void actualizardatospropuesta(DtPropuesta dtp, String e, dtFecha dtf, dtHora dth) throws Exception;

    public abstract List<String> listarEstados();

    public abstract List<dtCategoria> getdtCategorias();

    public abstract Map<String, categoria> getCategorias();

    public abstract void altaCategoria(dtCategoria cate);

    public abstract ArrayList<dtPropuestasBD> getdtPropIngr();

    public abstract boolean nuevoEstadoProp(String idProp, String estado);

    public abstract void propAutomaticas();

    public abstract DefaultTreeModel modeloJT3Categorias();

    public abstract ArrayList<DtPropuesta> getPropuestasxEstado(String stado);

    public abstract List<String> listartodaslaspropuestas(String titulo);

    public abstract List<String> listarmispropsfavs(String nickusuario);

    public abstract void agregarpropuestacomofav(String nickusuario, String titulo);

    public abstract List<DtPropuesta> listarpropuestasenlaweb();

    public abstract List<String> listarpropuestasparacancelar(String nickp);

    public abstract List<DtPropuesta> listarpropuestasencategoria(String cat);
    
    public abstract List<String> listarpropuestasmenosingresadas(String titulo);
    
    public abstract List<String> listarpropuestascolaboradaspor(String string);
    
    public abstract void agregarcomentarioapropuesta(String string, String titulo, String comentario);
    
    public abstract List<String> mispropuestasaceptadas(String nick);
    
    public abstract List<String> mispropuestasaingresadas(String nick);
}
