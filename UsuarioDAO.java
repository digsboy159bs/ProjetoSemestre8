package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conn;

    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto) throws SQLException {
        conn = new ConexaoDAO().ConectaBD();

        try {
            String sql = "select * from Usuario where NomeUsuario = ? and Senha = ? ";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getNome_Usuario());
            pstm.setString(2, objusuariodto.getSenha_Usuario());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + e);
            return null;
        }
    }

}
