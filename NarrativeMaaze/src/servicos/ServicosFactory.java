/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import dao.CampanhaDAO;

/**
 *
 * @author AHHAAHAHHAHAHAHA
 */
public class ServicosFactory {
    
    private static CampanhaServicos campanhaServicos = new CampanhaServicos();
        
            public static CampanhaServicos getCampanhaServicos(){
                return campanhaServicos;
            }
}
