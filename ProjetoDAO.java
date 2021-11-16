package DAO;

import DTO.ProjetoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProjetoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ProjetoDTO>lista = new ArrayList<>();

    public void CriarProjeto(ProjetoDTO objprojetodto) throws SQLException {
        String sql = "INSERT INTO Projeto (NomeProjeto, Autor, Descricao, Complexidade, Versao, Estado, DataCriacao, DataModificacao, Esforco"
                + ", Prioridade, Funcionalidades, Modulo) VALUES (?, ?, ?, ?, ? , ? , ? , ?, ?, ?, ?, ?)";

        Connection conn = ConexaoDAO.ConectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprojetodto.getNome_Projeto());
            pstm.setString(2, objprojetodto.getAutor());
            pstm.setString(3, objprojetodto.getDescricao());
            pstm.setString(4, objprojetodto.getComplexidade());
            pstm.setString(5, objprojetodto.getVersao());
            pstm.setString(6, objprojetodto.getEstado());
            pstm.setString(7, objprojetodto.getData_criacao());
            pstm.setString(8, objprojetodto.getData_modificacao());
            pstm.setString(9, objprojetodto.getEsforco());
            pstm.setString(10, objprojetodto.getPrioridade());
            pstm.setString(11, objprojetodto.getFuncionalidades());
            pstm.setString(12, objprojetodto.getModulo());
            
            pstm.execute();
            pstm.close();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "projetoDAO Cadastrar" + e);
        }
    }
    
    public ArrayList<ProjetoDTO> ListarProjetos() throws SQLException{
        String sql = "SELECT * FROM Projeto";
        
        Connection conn = ConexaoDAO.ConectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                ProjetoDTO objprojetodto = new ProjetoDTO();
                objprojetodto.setId_Projeto(rs.getInt("IdProjeto"));
                objprojetodto.setNome_Projeto(rs.getString("NomeProjeto"));
                objprojetodto.setAutor(rs.getString("Autor"));
                objprojetodto.setModulo(rs.getString("Modulo"));
//                objprojetodto.setFuncionalidades(rs.getString("Funcionalidades"));
                objprojetodto.setComplexidade(rs.getString("Complexidade"));
                objprojetodto.setData_criacao(rs.getString("DataCriacao"));
                objprojetodto.setEstado(rs.getString("Estado"));
                objprojetodto.setVersao(rs.getString("Versao"));
                objprojetodto.setPrioridade(rs.getString("Prioridade"));
                
                
                lista.add(objprojetodto);
                              
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "projetoDAO ListarProjeto" + e);
        }
        
        return lista;

    }

}
