/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynews;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author riquemlo
 */
public class Conexao {
    static final String DB_URL = "jdbc:mysql://localhost:3306/MyNewsDB";
    static final String DB_DRV = "com.mysql.jdbc.Driver";
    static final String DB_USER = "riquemlo";
    static final String DB_PASS = "riquemlo";
    public Connection conn;
    
    public Conexao() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            this.conn = DriverManager.getConnection(this.DB_URL, this.DB_USER, this.DB_PASS);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
