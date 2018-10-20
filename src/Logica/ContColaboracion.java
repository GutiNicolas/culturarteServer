/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.colaboracionesPersistencia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author nicolasgutierrez
 */
public class ContColaboracion implements iConColaboracion {

    private static ContColaboracion instance;
    private colProp colaboracion;
    private ContUsuario cUsuario = ContUsuario.getInstance();
    private colaboracionesPersistencia colPer = new colaboracionesPersistencia();
    private ContCargaBD contCarga = ContCargaBD.getInstance();

    public static ContColaboracion getInstance() {
        if (instance == null) {
            instance = new ContColaboracion();
        }
        return instance;
    }

    @Override
    public void cargarColaboracion() {
        cargarColaboraciones();
    }

    @Override
    public dtColProp seleccionarColaboracion(String nickusuario, String titulo) {
        colProp cp = (colProp) this.cUsuario.seleccionarColaboracion(nickusuario, titulo);
        this.colaboracion = cp;
        dtColProp dtcp = new dtColProp(nickusuario, cp.getRetorno(), cp.getFecha(), cp.getHora(), cp.getMontocolaborado(), cp.getComentario());
        return dtcp;
    }

    @Override
    public void eliminar() throws Exception {
        this.cUsuario.eliminarColaboracion(this.colaboracion);
    }

    public void cargarColaboraciones() {
        ArrayList<dtColaboracionCompleto> dtColaComp = new ArrayList<>();
        //////////////     
        try {
            contCarga.levantarBDcolPer();
            colPer.cargarColaboraciones(dtColaComp);
            for (int i = 0; i < dtColaComp.size(); i++) {
                dtColaboracionCompleto dt = (dtColaboracionCompleto) dtColaComp.get(i);
                contCarga.agregardtcolaboraciones(dt);
                pago pago = null;////verificar
                colProp cp = new colProp(dt.getFecha(), dt.getHora(), dt.getMonto(), dt.getRetorno(), null, dt.getComentario(), pago);
                cUsuario.registrarcolaboracion(dt.getNickname(), dt.getTitulo(), cp);

            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    @Override
    public void borrartodocColaboraciones() {
        cUsuario.borrarColaboraciones();
    }

    @Override
    public List<dtCola> listarcolaboracionesdelcolaborador(String nickcolaborador) {
        return cUsuario.colaboracionesde(nickcolaborador);
    }

    @Override
    public void eliminarcolaboracion(String nickname, String titulo) throws Exception {
        cUsuario.eliminarcolaboracion(nickname, titulo);
    }

    void borrarColecciones() {
        this.colaboracion = null;
    }

    @Override
    public boolean registrarColaboracion(dtColaboracionCompleto cola, dtPago pf) {

        String titulo = (String) cola.getTitulo();
        String colab = (String) cola.getNickname();
        int monto = (Integer) cola.getMonto();
        String retorno = (String) cola.getRetorno();
        String comentario = (String) cola.getComentario();
        pago pago = null;
        if(pf!=null){
        pago = (pago) crearPago(pf);}
        
        return cUsuario.registrarColaboracion(titulo, colab, monto, retorno, comentario, pago);

    }

    private pago crearPago(dtPago p) {
        pago fp = null;
        if (p instanceof dtTarjetaCredito) {
            dtTarjetaCredito dttc = (dtTarjetaCredito) p;
            fp = new tarjetaCredito(dttc.getTipo(), dttc.getNumeroTarjeta(), dttc.getCvc(), dttc.getfVencimiento(), dttc.getTitular());
        }
        if (p instanceof dtTransferencia) {
            dtTransferencia dttf = (dtTransferencia) p;
            fp = new transferencia(dttf.getBanco(), dttf.getNumeroCuenta(), dttf.getTitular());
        }
        if (p instanceof dtPaypal) {
            dtPaypal dtpp = (dtPaypal) p;
            fp = new payPal(dtpp.getNumeroPaypal(), dtpp.getTitular());
        }

        return fp;

    }

}
