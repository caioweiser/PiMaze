/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.CampanhaVO;
import java.sql.Connection;
import modelo.LoginVO;
import persistencia.ConexaoBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author AHHAAHAHHAHAHAHA
 */
public class CampanhaDAO {
    
    /**
     * @author Caio
     * @since 29102023
     * @verison 1.0 primeiro teste do código
     * @param cVO para conseguir inserir os valores na tabela de campanha
     * @throws SQLException caso ocorra algum tipo de erro no SQL
     */
        public void criarCampanha(CampanhaVO cVO) throws SQLException{
            Connection con = new ConexaoBanco().getConexao();
                LoginVO lVO = new LoginVO();
                try {
                    String sql = "INSERT INTO campanha VALUES (null , ? , ? , "+lVO.getIdLogin()+" )";
                        PreparedStatement pstm = con.prepareStatement(sql);
                            pstm.setString(1, cVO.getNomeCampanha());
                            pstm.setString(2, cVO.getSistemaCampanha());
                                pstm.execute();
                                    pstm.close();
                } catch (SQLException se) {
                    throw new SQLException(" Houve um erro ao cadastrar a campanha CampanhaDAO!"+se.getMessage());
                } finally{
                    con.close();
                }//fechando a conexao
        }//fim do método criar campanha
        
}//fim da classe CampanhaDAO
