/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import Logica.ContUsuario;
import Logica.culturarteFabrica;
import Logica.dtContieneArray;
import Logica.dtFecha;
import Logica.dtPropuesta;
import Logica.dtUsuario;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;
import javax.xml.ws.WebServiceContext;

/**
 *
 * @author jp
 */
@WebService(serviceName = "ServicioContusuario")
//@SOAPBinding(style = Style.RPC)

@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)

public class WebServiceContUsusario {

    @Resource
    private WebServiceContext context;
    ContUsuario cU = new ContUsuario();
    culturarteFabrica fb = culturarteFabrica.getInstance();
    private Endpoint endpoint = null;
    private String direccion;

    public WebServiceContUsusario() {
        this.direccion = "http://localhost:8580/ServicioU";
    }

    @WebMethod
    public String hola() {
        return "hola";
    }

    //@WebMethod(exclude = true)
    public void publicar() {
        try {
            endpoint = Endpoint.publish(direccion, this);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
/////////////////////////CARGAR DATOS DE PRUEBA

    @WebMethod
    public boolean cargarDatosPrueba() {
        try {

            fb.cargarDatosdePrueba();
            return true;

        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    //////////////////////////ServletRegistrarse funciones    
    /**
     * funcion que comprueba existencia de nickname u correo retorna 1 si existe
     * el nickname retorna -1 si existe el correo retorna 0 si no existe ninguno
     *
     * @param nick
     * @param correo
     * @return
     */
    @WebMethod
    public int verificaExistencia(@WebParam(name = "nick") String nick, @WebParam(name = "correo") String correo) {
        if (cU.existeUsuario(nick)) {
            return 1;
        }
        if (cU.existeMail(correo)) {
            return -1;
        }
        return 0;
    }

    /**
     * crearDtFecha funcion que recibe un String con la fecha y retorna un
     * dtFecha Esta func. hace referencia a creardtFecha() de ContUsuario()
     *
     * @param fecha
     * @return
     */
    @WebMethod
    public dtFecha crearDtFecha(@WebParam(name = "fecha") String fecha) {
        return (dtFecha) cU.creadtFecha(fecha);

    }

    /**
     * agregarUsu funcion que recibe un dtUsuario con el usuario a crear Esta
     * func. hace referencia a agregarUsu() de ContUsuario()
     *
     * @param usu
     * @throws java.lang.Exception
     */
    @WebMethod
    public void agregarUsu(@WebParam(name = "usuario") dtUsuario usu) throws Exception {
        try {
            cU.agregarUsu(usu);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
///////////////////////ServletSeguir funciones

    /**
     * retorna un dtContieneArray con una lista de string de nick de usuarios
     * Esta func. referencia a listarusuarios() de ContUsuario()
     *
     * @param nick
     * @return
     */
    @WebMethod
    public dtContieneArray listarUsuarios(@WebParam(name = "nick") String nick) {
        List<String> lista = (List<String>) cU.listarusuarios(nick);
        dtContieneArray nuevo = new dtContieneArray((ArrayList) lista, null);
        return nuevo;
    }

    /**
     * CargarLosSeguidosPor retorna un dtContieneArray con una lista String con
     * los nick de los seguidores Esta func. hace referencia a
     * cargarlosseguidospor() de ContUsuario()
     *
     * @param nick
     * @return
     */
    @WebMethod
    public dtContieneArray cargarLosSeguidosPor(@WebParam(name = "nick") String nick) {
        dtContieneArray nuevo = new dtContieneArray((ArrayList) cU.cargarlosseguidospor(nick), null);
        return nuevo;
    }

    /**
     * seguir funcion que recibe un String con el nickname de usuario actual y
     * un String con el nickname del usuario a seguir. Esta func. hace
     * referencia a seguir() de ContUsuario()
     *
     * @param nickusuario
     * @param usuSeguir
     * @throws java.lang.Exception
     */
    @WebMethod
    public void seguir(@WebParam(name = "nickusuario") String nickusuario, @WebParam(name = "nickUsuSeguir") String usuSeguir) throws Exception {
        try {

            cU.seguir(nickusuario, usuSeguir);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
////////////////////////ServletLogin funciones

    /**
     * usuarioLogin funcion que recibe dos parametros String el nick y el pass
     * del usuario. Retorna un dtusuario con los datos del usuario
     *
     * @param usu
     * @param Pass
     * @return dtUsuario
     */
    @WebMethod
    //dtUsuario usuarioLogin(String usu)
    public dtUsuario usuarioLogin(@WebParam(name = "nickUsuario") String usu, @WebParam(name = "pass") String Pass) {
        dtUsuario nuevo = (dtUsuario) cU.usuarioLogin(usu);
        if (nuevo.getPass().equals(Pass)) {
            return nuevo;
        }
        return null;
    }

    @WebMethod
    public dtUsuario usuarioLogin(@WebParam(name = "nick") String nick) {
        return (dtUsuario) cU.usuarioLogin(nick);
    }

//////////////////////////////////////////////////////ServletColaboracion funciones
    /**
     * infoPropuesta funcion que recibe un String con el titulo de la propuesta
     * y retorna una dtPropuesta.
     *
     * Esta func. hace referencia a infoPropuesta() de ContUsuario(). Si se
     * ṕroduce una excepcion retorna null
     *
     * @param titulo
     * @return
     */
    @WebMethod
    public dtPropuesta infoPropuesta(@WebParam(name = "titulo") String titulo) {
        try {
            return cU.infoPropuesta(titulo);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

/////////////////////////////ServletDejarDeSeguir funciones
    /**
     * cargarLosSegPor funcion que recibe un String con el nick dek usuario y
     * retorna un dtContieneArray con una lista de usuarios seguidores. Esta
     * func. hace referencia a cargarlosseguidospor() de ContUsuario().
     *
     * @param nick
     * @return
     */
    @WebMethod
    public dtContieneArray cargarLosSegPor(@WebParam(name = "nick") String nick) {
        dtContieneArray nuevo = new dtContieneArray((ArrayList) cU.cargarlosseguidospor(nick), null);
        return nuevo;
    }

    /**
     * dejarDeSeguir funcion que recibe dos parametros String el nick del
     * usuario seguidor y el nick del usuario a dejar de seguir. Esta func. hace
     * referencia a dejarDeSeguir() de ContUsuario().
     *
     * @param nickSeguidor
     * @param dejarDSeguir
     * @throws java.lang.Exception
     */
    @WebMethod
    public void dejarDeSeguir(@WebParam(name = "nickSeguidor") String nickSeguidor, @WebParam(name = "nickDejardeSeguir") String dejarDSeguir) throws Exception {
        cU.dejarDeSeguir(nickSeguidor, dejarDSeguir);
    }
//////////////////ServvletConsultadePerfil

    @WebMethod
// public List<dtUsuario> listarusuariosweb
    public dtContieneArray listarUsuariosWeb(@WebParam(name = "nick") String nick) {
        dtContieneArray nuevo = new dtContieneArray((ArrayList) cU.listarusuariosweb(nick), null);
        return nuevo;
    }

    @WebMethod
    public dtUsuario infoUsuarioGeneral(@WebParam(name = "nick") String nick) {
        return (dtUsuario) cU.infoUsuarioGeneral(nick);
    }

    @WebMethod
    public dtContieneArray listarMisSeguidores(@WebParam(name = "nick") String nick) {
        dtContieneArray nuevo = new dtContieneArray((ArrayList) cU.listarmisseguidores(nick), null);
        return nuevo;
    }

    @WebMethod
    public dtContieneArray listarMisSeguidos(@WebParam(name = "nick") String nick) {
        dtContieneArray nuevo = new dtContieneArray((ArrayList) cU.listarmisseguidos(nick), null);
        return nuevo;
    }

    @WebMethod
    // public List<String> mispropuestasfavoritas(String nick) 
    public dtContieneArray misPropFav(@WebParam(name = "nick") String nick) {
        dtContieneArray nuevo = new dtContieneArray((ArrayList) cU.mispropuestasfavoritas(nick), null);
        return nuevo;
    }
    
}
