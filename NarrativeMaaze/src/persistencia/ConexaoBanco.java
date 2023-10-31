/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *@since 27102023
 * @version 1.0
 * @author AHHAAHAHHAHAHAHA
 */
public class ConexaoBanco {
    
    public Connection getConexao(){
        Connection con = null;
            try {
            String url = "jdbc:mysql://localhost:3306/TestePI?user=root&password=";
                con = DriverManager.getConnection(url);
                
        } catch (SQLException se) {
                JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco ConexaoBanco!"+se.getMessage());
        }//Fim do catch
        return con;
    }//Fim do método getConexao
}//fim da classe ConexaoBanco
