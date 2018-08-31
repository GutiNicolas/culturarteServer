/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.categoriaPersistencia;
import Persistencia.estadoPersistencia;
import Persistencia.propuestasPersistencia;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nicolasgutierrez
 */
public class ContPropuesta implements iConPropuesta {

    private static ContPropuesta instance;
    private ContUsuario cUsuario;
    private Map<String, categoria> categorias=new HashMap<String,categoria>();
    private Map<String, estado> estados=new HashMap<String,estado>();
    
    public static ContPropuesta getInstance() {
        if(instance==null){
            instance= new ContPropuesta();
        }
            return instance;
    }
    
    
    @Override
    public void cargarPropuestas() {
      cargaCategorias();
      cargaEstados();
      cargaPropuestas();
    }

    @Override
    public List<dtPropuesta> listaPropuestas(String idProponente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public dtInfoProp infoPropuesta(String idPropuesta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nuevaPropuesta(String idProponente, String tipoEspectaculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void datosPropuesta(dtPropuesta dtProp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void altaPropuesta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<dtPropuesta> listarPropuesta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public dtPropuesta infoProp(String idPropuesta) {
        this.cUsuario=ContUsuario.getInstance();
        proponente p=(proponente) this.cUsuario.getUsuarioRecordado();
        dtPropuesta dtp=p.getPropuestas(idPropuesta);
        dtp.setColaboradores(this.cUsuario.listarColaboradores(idPropuesta));
        return dtp;
    }

    @Override
    public void modificarPropuesta(dtPropuesta dtProp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<dtPropuestaComp> informacionPropuestas(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<dtPropuestasProponente> listarPropuestasExistentes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public dtPropuesta mostrarInfoPropuesta(String idPropuesta) throws Exception {
        return ContUsuario.getInstance().infoPropuesta(idPropuesta);
    }

    @Override
    public List<String> listartodasPropuestas(String titulo) {
        return ContUsuario.getInstance().listartodaslaspropuestas(titulo);
    }
    
    public void cargaCategorias(){
        
        this.categorias=categoriaPersistencia.CargarCategorias();
    
    }
    
    public void cargaEstados(){
        this.estados=estadoPersistencia.CargarEstados();
    }
    
    public void cargaPropuestas(){
       Map<String, dtPropuestasBD> props=propuestasPersistencia.cargarPropuestas();
       for(String key: props.keySet()){
           dtPropuestasBD dt=props.get(key);
           propuesta p=new propuesta(dt.getTitulo(),dt.getDescripcion(),dt.getImagen(),dt.getLugar(),dt.getFecha(),dt.getFecha_publicacion(),dt.getPrecio_entrada(),dt.getMonto_necesario());
           cUsuario.esteUsuariopropusoestaProp(dt.getNickproponente(), p);
           
       }
       
       List<dtEstadosPropuestas> l= estadoPersistencia.CargarEstadosPropuestas();
       Iterator it=l.iterator();
       while(it.hasNext()){
           dtEstadosPropuestas dtep=(dtEstadosPropuestas)it.next();
           propuesta p2=cUsuario.damePropuesta(dtep.getTituloprop());
           estado e=this.estados.get(dtep.getEstado());
           p2.agregarNuevoEstado(e, dtep.getFecha(), dtep.getHora());
           
       }
       cUsuario.ordenarLosEstadosdeCadaPropuesta();
    }
    
}
