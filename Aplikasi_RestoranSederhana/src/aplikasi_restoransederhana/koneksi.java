/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_restoransederhana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static java.time.Clock.system;
import javax.swing.JOptionPane;

/**
 *
 * @author microsoft
 */
public class koneksi {
    private String url="jdbc:mysql://localhost/db_restoran";
    private String username_xampp = "root";
    private String password_xampp = "";
    private Connection con;
    
    public void connect(){
        try {
            con = DriverManager.getConnection(url, username_xampp, password_xampp);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }
    
//    Connection con=null;
//    public static Connection getCon() {
//    try {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_restoran","root","");
//        return con;
//    } catch(Exception e) {
//        JOptionPane.showMessageDialog(null, e);
//        return null;
//    }
//}
}
