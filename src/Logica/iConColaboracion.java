/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.List;

/**
 *
 * @author nicolasgutierrez
 */
public interface iConColaboracion {

    public abstract void cargarColaboracion();

    public abstract dtColProp seleccionarColaboracion(String nickusuario, String titulo);

    public abstract void eliminar() throws Exception;

    public abstract void borrartodocColaboraciones();

    public abstract List<dtCola> listarcolaboracionesdelcolaborador(String nickcolaborador);

    public abstract void eliminarcolaboracion(String nickname, String titulo) throws Exception;

    public abstract boolean registrarColaboracion(dtColaboracionCompleto cola, dtPago pf);

    public abstract boolean reagistrarPago(String usuario, String tituloP, dtPago pago);

    public abstract List<String> listarColaboraciones(String nick);
    
    public abstract List<dtColProp> listarmiscolaboraciones(String nick);
    
    public abstract String armarretorno(String cbe, String cbp);
}
