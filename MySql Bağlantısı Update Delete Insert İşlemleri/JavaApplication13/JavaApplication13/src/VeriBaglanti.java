/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
/**
 *
 * @author Boy
 */
public class VeriBaglanti {
    
    static final String DB_URL="jdbc:mysql://localhost/obs";
    static final String USER="root";
    static final String PASS="";
    
    public static Connection baglanti(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //bağlantının açılması
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println("Veritabanına bağlanırken hata oluştu");
            return null;
        }
    }
}
