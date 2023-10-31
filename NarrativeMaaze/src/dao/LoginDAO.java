/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import persistencia.ConexaoBanco;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.LoginVO;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 * @since 27102023
 * @version 1.0
 * @author AHHAAHAHHAHAHAHA
 */
public class LoginDAO {
    Connection con;
    
    /**
     * @param lVO a classe LoginVO que tem os métodos acessores
     * @return ResutlSet 
     * @throws SQLException para pegar qualquer tipo de exceção SQL que possa ocorrer
     * @author Caio
     * @since 27102023
     * @version 1.0 primeira versão do código
     */
        public ResultSet autenticarLogin(LoginVO lVO) throws SQLException{
            Connection con = new ConexaoBanco().getConexao();
                try {
                    String sql = "SELECT * FROM Usuario WHERE nomeUsuario = ? AND senhaUsuario = ? OR idUsuario = ? ";
                        PreparedStatement pstm = con.prepareStatement(sql);
                            pstm.setString(1, lVO.getNomeLogin());
                            pstm.setString(2, lVO.getSenhaLogin());
                            pstm.setInt(3, lVO.getIdLogin());
                            
                                ResultSet rs = pstm.executeQuery();
                                    return rs;
                               
            } catch (SQLException se) {
                    JOptionPane.showMessageDialog(null, "Houve um erro ao autenticar o usuário LoginDAO"+se.getMessage());
                        return null;
            }//Fim do catch
        }//Fim do método autenticarUsuario
        
         
}//fim do LoginDAO
