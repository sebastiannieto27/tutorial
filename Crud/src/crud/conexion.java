/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sebastian
 */
public class conexion {

    private Connection conection;

    public Connection getConection() {
        return conection;
    }

    public void setConection(Connection conection) {
        this.conection = conection;
    }
    
    public void conexio() throws Exception{
        try {
           Class.forName("org.postgresql.Driver");
           conection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?user=postgres&password=123456");
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void cerrar(){
        try {
            if (true) {
                
            }else{
                
            }
        } catch (Exception e) {
        }
    }
    
    
}
