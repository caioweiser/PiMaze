
package servicos;
import dao.CampanhaDAO;
import dao.DAOFactory;
import java.sql.*;
import modelo.CampanhaVO;
/**
 *
 * @author AHHAAHAHHAHAHAHA
 */
public class CampanhaServicos {
    
    public void criarCampanha(CampanhaVO cVO) throws SQLException{
        CampanhaDAO cDAO = DAOFactory.getCampanhaDAO();
            cDAO.criarCampanha(cVO);
    }
    
}
