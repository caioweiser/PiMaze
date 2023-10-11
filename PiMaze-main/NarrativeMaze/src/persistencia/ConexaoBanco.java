/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author 182210010
 */
public class ConexaoBanco {
    
    public Connection getConexao(){
    Connection c = null;
        
      try{
            String url = "jdbc:mysql://localhost:3306/Maze?user=root&password=";
            c = DriverManager.getConnection(url);    
            } catch (SQLException se){
                JOptionPane.showMessageDialog(null, "Houve um erro na conexão"+se.getMessage());
            }
      return c;
    }
}
        
        
        
    
    


