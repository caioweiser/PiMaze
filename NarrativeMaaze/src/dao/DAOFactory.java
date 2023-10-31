/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author AHHAAHAHHAHAHAHA
 */
public class DAOFactory {

        private static CampanhaDAO campanhaDAO = new CampanhaDAO();
        
            public static CampanhaDAO getCampanhaDAO(){
                return campanhaDAO;
            }
                
}
