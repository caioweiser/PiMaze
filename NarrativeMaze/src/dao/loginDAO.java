/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.LoginVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author 182210010
 */
public class loginDAO {
    Connection con;
    public ResultSet autenticarLogin(LoginVO lVO) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        try {
            String sql = "SELECT * FROM usuario WHERE nome_usuario = ? AND senha_usuario = ?";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,lVO.getNome() );
            pstm.setString(2, lVO.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException se)
        {
            JOptionPane.showMessageDialog(null, "Houve um erro na autentificação de conta LoginDAO"+se);
        } finally {
            con.close();
        }
        return null;
    }
}
