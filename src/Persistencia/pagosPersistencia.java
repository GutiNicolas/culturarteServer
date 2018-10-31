/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.dtFecha;
import Logica.dtPago;
import Logica.dtPaypal;
import Logica.dtTarjetaCredito;
import Logica.dtTransferencia;
import Logica.utilidades;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jp
 */
public class pagosPersistencia {

    ConexionDB conexion = ConexionDB.getInstance();
    Connection conn = conexion.getConexion();
    utilidades util = utilidades.getInstance();

    public boolean agregarPagoPrimeraVez(dtPago pago) {
        System.out.println("Agregar Pago inicio...");
        String sql = null, sql2 = null;
        try {
            Statement st = conn.createStatement();
            if (pago instanceof dtTransferencia) {
                dtTransferencia dttrans = (dtTransferencia) pago;
                sql = "INSERT INTO `pagos`(`titular`, `NumTTP`, `nickname`, `tituloPropuesta`) VALUES ('" + dttrans.getTitular() + "','" + dttrans.getNumeroCuenta() + "','" + dttrans.getNickname() + "','" + dttrans.getTituloP() + "')";
                sql2 = "INSERT INTO `transferenciaBancaria`(`Titular`, `NumTransferencia`, `Banco`) VALUES ('" + dttrans.getNickname() + "','" + dttrans.getNumeroCuenta() + "','" + dttrans.getBanco() + "')";
                st.executeUpdate(sql);
                System.out.println(sql);
                st.executeUpdate(sql2);
                System.out.println(sql2);
            }
            if (pago instanceof dtPaypal) {
                dtPaypal paypal = (dtPaypal) pago;
                sql = "INSERT INTO `pagos`(`titular`, `NumTTP`, `nickname`, `tituloPropuesta`) VALUES ('" + paypal.getTitular() + "','" + paypal.getNumeroPaypal() + "','" + paypal.getNickname() + "','" + paypal.getTituloP() + "')";
                sql2 = "INSERT INTO `paypal`(`Titular`, `NumPaypal`) VALUES ('" + paypal.getNickname() + "','" + paypal.getNumeroPaypal() + "')";
                st.executeUpdate(sql);
                System.out.println(sql);
                st.executeUpdate(sql2);
                System.out.println(sql2);
            }
            if (pago instanceof dtTarjetaCredito) {
                dtTarjetaCredito tarjeta = (dtTarjetaCredito) pago;
                sql = "INSERT INTO `pagos`(`titular`, `NumTTP`, `nickname`, `tituloPropuesta`) VALUES ('" + tarjeta.getTitular() + "','" + tarjeta.getNumeroTarjeta() + "','" + tarjeta.getNickname() + "','" + tarjeta.getTituloP() + "')";
                sql2 = "INSERT INTO `tarjetaCredito`(`Titular`, `NumTarjeta`, `TipoTarjeta`, `fechaVencimiento`, `CVC`) VALUES ('" + tarjeta.getNickname() + "','" + tarjeta.getNumeroTarjeta() + "','" + tarjeta.getTipo() + "','" + tarjeta.getfVencimiento() + "','" + tarjeta.getCvc() + "')";
                st.executeUpdate(sql);
                System.out.println(sql);
                st.executeUpdate(sql2);
                System.out.println(sql2);
            }
            System.out.println("Agregar pago finalizo...");
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage() + " " + e.getCause());
            return false;
        }

    }

    public boolean agregarPago(dtPago pago) {
        System.out.println("Agregar Pago inicio...");
        String sql = null;
        try {
            Statement st = conn.createStatement();
            if (pago instanceof dtTransferencia) {
                dtTransferencia dttrans = (dtTransferencia) pago;
                sql = "INSERT INTO `pagos`(`titular`, `NumTTP`, `nickname`, `tituloPropuesta`) VALUES ('" + dttrans.getTitular() + "','" + dttrans.getNumeroCuenta() + "','" + dttrans.getNickname() + "','" + dttrans.getTituloP() + "')";
                st.executeUpdate(sql);
                System.out.println(sql);
            }
            if (pago instanceof dtPaypal) {
                dtPaypal paypal = (dtPaypal) pago;
                sql = "INSERT INTO `pagos`(`titular`, `NumTTP`, `nickname`, `tituloPropuesta`) VALUES ('" + paypal.getTitular() + "','" + paypal.getNumeroPaypal() + "','" + paypal.getNickname() + "','" + paypal.getTituloP() + "')";
                st.executeUpdate(sql);
                System.out.println(sql);
            }
            if (pago instanceof dtTarjetaCredito) {
                dtTarjetaCredito tarjeta = (dtTarjetaCredito) pago;
                sql = "INSERT INTO `pagos`(`titular`, `NumTTP`, `nickname`, `tituloPropuesta`) VALUES ('" + tarjeta.getTitular() + "','" + tarjeta.getNumeroTarjeta() + "','" + tarjeta.getNickname() + "','" + tarjeta.getTituloP() + "')";
                st.executeUpdate(sql);
                System.out.println(sql);
            }
            System.out.println("Agregar pago finalizo...");
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public ArrayList<dtPago> cargarPagos() {
        ArrayList<dtPago> pagos = new ArrayList<>();
        try {
            System.out.println("cargarPagos inicio...");
            armarPagosTransferencia(pagos);
            armarPagosTarjetaCredito(pagos);
            armarPagosPaypal(pagos);
            System.out.println("cargarPagos finalizo...");
        } catch (Exception e) {
        }
        return pagos;
    }

    private void armarPagosTransferencia(ArrayList<dtPago> pagos) {
        try {
            System.out.println("armarPagosTransferencia inicio...");
            int seguir;
            String sqlp = "SELECT * FROM `pagos`";
            String sqlT = "SELECT * FROM `transferenciaBancaria`";
            Statement stp = conn.createStatement();
            Statement stt = conn.createStatement();
            ResultSet rspagos = stp.executeQuery(sqlp);
            ResultSet rsTrans = stt.executeQuery(sqlT);
            while (rsTrans.next()) {
                String nickT = null, nickp = null;
                rspagos.first();
                seguir = 0;
                while (rspagos.next() && seguir == 0) {
                    if (rspagos.getString(3).equals(rsTrans.getString(1))) {
                        System.out.println("nick: " + rsTrans.getString(1));
                        if (rspagos.getString(2).equals(rsTrans.getString(2))) {
                            System.out.println("numTransferencia: " + rsTrans.getString(2));
                            seguir = 1;
                            dtPago pago = new dtTransferencia(rsTrans.getString(3), rsTrans.getString(2), rspagos.getString(4), rspagos.getString(1), rspagos.getString(3));
                            pagos.add(pago);
                            System.out.println("agrego el pago!");
                        }
                    }
                }
            }
            System.out.println("armarPagos fin...");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void armarPagosTarjetaCredito(ArrayList<dtPago> pagos) {
        try {
            System.out.println("armarPagosTarjataCredito inicio...");
            String sqlp = null, sqltd = null;
            sqlp = "SELECT * FROM `pagos`";
            sqltd = "SELECT * FROM `tarjetaCredito`";
            Statement stP = conn.createStatement();
            Statement sttd = conn.createStatement();
            ResultSet rsPagos = stP.executeQuery(sqlp);
            ResultSet rstd = sttd.executeQuery(sqltd);
            while (rstd.next()) {
                int seguir = 0;
                rsPagos.first();
                while (rsPagos.next() && seguir == 0) {
                    if (rsPagos.getString(3).equals(rstd.getString(1))) {
                        System.out.println("nick: "+rsPagos.getString(3));
                        if (rsPagos.getString(2).equals(rstd.getString(2))) {
                            System.out.println("numTarjeta: "+rstd.getString(2));
                            dtFecha fechaVen = (dtFecha)util.construirFecha(rstd.getString(4));
                            dtPago pago = new dtTarjetaCredito(rstd.getString(3), rstd.getString(2), rstd.getString(5), fechaVen, rsPagos.getString(4), rsPagos.getString(1), rstd.getString(1));
                            pagos.add(pago);
                            System.out.println("agrege el pago!");
                            seguir = 1;
                        }
                    }
                }
                System.out.println("fin armarPagos...");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()+" "+e.getCause());
        }
    }
    
    private void armarPagosPaypal(ArrayList<dtPago> pagos){
        try {
            String sqlP=null, sqlpp=null;
            sqlP="";
            sqlpp="";
            Statement stp = conn.createStatement();
            Statement stpp= conn.createStatement();
            ResultSet rsp= stp.executeQuery(sqlP);
            ResultSet rspp= stpp.executeQuery(sqlpp);
            while(rspp.next()){
            int seguir=0;
            rsp.first();
            while(rsp.next()&&seguir==0){
            if(rsp.getString(3).equals(rspp.getString(1))){
                System.out.println("nick: "+rsp.getString(3));
            if(rsp.getString(2).equals(rspp.getString(2))){
                System.out.println("numPaypal: "+rspp.getString(2));
            dtPago pago = new dtPaypal(rspp.getString(2), rsp.getString(2), rsp.getString(1), rsp.getString(3));
            pagos.add(pago);
            seguir=1;
                System.out.println("agrege el pago!");
            }
            }
            
            
            }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()+" "+e.getCause());
        }
    }
}
