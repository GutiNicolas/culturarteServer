/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;
import javax.xml.ws.WebServiceContext;

/**
 *
 * @author jp
 */
@WebService(serviceName = "ServicioContPropuesta")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)

public class WebServiceContPropuesta {

    @Resource
    private WebServiceContext context;
    private Endpoint endpoint = null;
    private String direccion;

    public WebServiceContPropuesta() {
        this.direccion = "http://192.168.1.115:8680/ServicioP";
    }

    @WebMethod
    public String hola() {
        return "hola";
    }

    //@WebMethod(exclude = true)
    public void publicar() {
        endpoint = Endpoint.publish(direccion, this);
    }
}
