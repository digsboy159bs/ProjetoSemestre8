package DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Intel
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Intel
 */
public class ConexaoDAO {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // Obtém conexão com o banco de dados
    public static Connection ConectaBD() throws SQLException {
        String servidor = "localhost";
        String porta = "3306";
        String database = "ProjetoSemestrePSC";
        return DriverManager.getConnection("jdbc:mysql://" + servidor + ":" + porta + "/" + database + "?useTimezone=true&serverTimezone=UTC", "root", "D@igsboy159");

    }

}
