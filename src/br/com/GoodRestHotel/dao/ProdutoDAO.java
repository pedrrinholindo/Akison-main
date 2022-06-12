
package br.com.GoodRestHotel.dao;
import br.com.GoodRestHotel.jdbc.ConnectionFactory;
import java.sql.Connection;

public class ProdutoDAO {
    
    private Connection con;
    
    public ProdutoDAO(){
        this.con = new ConnectionFactory.getConnection();
    }
    
}
