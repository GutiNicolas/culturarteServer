/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
/**
 *
 * @author apias
 */
public class ConexionDB {

    private  String host;//="localhost"
    private  String port;//="3306"
    private  String db;//="cultuRarte"
    private  String user;//="administrador"
    private  String pass;//= "1234"
    private static Connection conexion=null;

    
    private static ConexionDB instance;

    public static ConexionDB getInstance() {
           if (instance == null) {
            instance = new ConexionDB();
        }
        return instance;
    }
    
    public Connection getConexion() {
        if (conexion == null) {
            try {              
                Driver driver=new com.mysql.jdbc.Driver();
                DriverManager.registerDriver(driver);                
                conexion = DriverManager.getConnection("jdbc:mysql://"+getHost()+":"+getPort()+"/"+getDb(), getUser(), getPass());
                } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return conexion;
    }
    public void closeConn(Connection con){
        if(con!=null){
                try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
    }

    public static void cerrar(Connection conexion){

        if (conexion != null) {

            try {
                conexion.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return the port
     */
    public String getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * @return the db
     */
    public String getDb() {
        return db;
    }

    /**
     * @param db the db to set
     */
    public void setDb(String db) {
        this.db = db;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

   
    
    
    
}
