/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
     private static final String URL = "jdbc:mysql://localhost:3306/locadora";
    private static final String USER = "root";
    private static final String PASS = "senacrs";
    public static Connection getConexao() {
        try {
            Connection c = DriverManager.getConnection(URL, USER, PASS);
            return c;
        } catch (Exception e) {
            return null;
        }
    }
}
