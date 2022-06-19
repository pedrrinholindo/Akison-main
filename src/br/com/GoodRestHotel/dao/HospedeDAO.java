
package br.com.GoodRestHotel.dao;
import br.com.GoodRestHotel.jdbc.ConnectionFactory;
import br.com.GoodRestHotel.model.Hospede;
import br.com.GoodRestHotel.model.Quarto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class HospedeDAO {
    private Connection con;
    
    public HospedeDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    public void hospedar(Quarto quarto, Hospede hosp){
        try{
            String sql = "insert into hospedes(nome, idade, celular, cpf, email, quarto)" + 
                            " values(?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, hosp.getNome());
                stmt.setInt(2, hosp.getIdade());
                stmt.setString(3, hosp.getNumero());
                stmt.setString(4, hosp.getCpf());
                stmt.setString(5, hosp.getEmail());
                stmt.setInt(6, hosp.getQuarto());
                
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Hospede registrado com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e);
        }
        try {
            String sql = "update quartos SET estado=? WHERE numero=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "Ocupado por " + hosp.getNome());
            stmt.setInt(2, quarto.getNumero());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro" + e);
        }
    }
}
