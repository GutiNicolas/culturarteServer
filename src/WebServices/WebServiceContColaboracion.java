/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import Logica.ContColaboracion;
import Logica.dtColaboracionCompleto;
import Logica.dtContieneArray;
import Logica.dtPago;
import java.util.ArrayList;
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
@WebService(serviceName = "ServicioContColabiracion")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class WebServiceContColaboracion {

    @Resource
    private WebServiceContext context;
    private Endpoint endpoint = null;
    private String direccion;
    ContColaboracion cC = ContColaboracion.getInstance();

    public WebServiceContColaboracion() {
        this.direccion = "http://localhost:8780/ServicioC";
    }

    @WebMethod
    public String hola() {
        return "hola";
    }

    //@WebMethod(exclude = true)
    public void publicar() {
        endpoint = Endpoint.publish(direccion, this);
    }
///////////////////ServletColaboracion funciones

    @WebMethod
    public void registrarColaboracion(@WebParam(name = "tituloProp") String titulo, @WebParam(name = "nick") String nick, @WebParam(name = "monto") int monto, @WebParam(name = "retorno") String retorno) {
        dtColaboracionCompleto cola = new dtColaboracionCompleto(nick, titulo, null, null, monto, retorno, null);
        cC.registrarColaboracion(cola, null);
    }

    @WebMethod
    public boolean registrarPago(@WebParam(name = "nick") String nick, @WebParam(name = "titulo") String titulo, @WebParam(name = "pago") dtPago pago) {
        return cC.reagistrarPago(nick, titulo, pago);
    }
//////////////////////////////ServletConsultaDePerfil funciones

    //public List<String> listarColaboraciones(String nick)
    @WebMethod
    public dtContieneArray listarColaboraciones(@WebParam(name = "nick") String nick) {
        dtContieneArray nuevo = new dtContieneArray((ArrayList) cC.listarColaboraciones(nick), null);
        return nuevo;
    }
    
    //public List<dtColProp> listarmiscolaboraciones(String nick)
    @WebMethod 
    public dtContieneArray listarMisColaboraciones(@WebParam(name="nick")String nick){
    dtContieneArray nuevo = new dtContieneArray((ArrayList) cC.listarmiscolaboraciones(nick), null);
    return nuevo;
    }
}
