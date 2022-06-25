
package br.com.GoodRestHotel.dao;
import br.com.GoodRestHotel.jdbc.ConnectionFactory;
import br.com.GoodRestHotel.model.Hospede;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HospedeDAO {
    private Connection con;
    
    public HospedeDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    public HospedeDAO(Hospede hosp){
        this.con = new ConnectionFactory().getConnection();
    }

    
    public void hospedar(Hospede hosp){   
        
        try{
            String sql = "insert into hospedes(nome, idade, numero, cpf, rg, email, quarto)" + 
                            " values(?, ?, ?, ?, ?, ?, ?); ";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, hosp.getNome());
                stmt.setInt(2, hosp.getIdade());
                stmt.setString(3, hosp.getNumero());
                stmt.setString(4, hosp.getCpf());
                stmt.setString(5, hosp.getRg());
                stmt.setString(6, hosp.getEmail());
                stmt.setInt(7, hosp.getQuarto());
                
                
                
                
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Hospede registrado com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e);
        }
    }
    
    public void editarHospede(Hospede hosp){
        
        try{
            String sql = "UPDATE hospedes SET nome=?, idade=?, numero=?, cpf=?, rg=?, email=?, quarto=? " +
                    " WHERE id = ?";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, hosp.getNome());
                stmt.setInt(2, hosp.getIdade());
                stmt.setString(3, hosp.getNumero());
                stmt.setString(4, hosp.getCpf());
                stmt.setString(5, hosp.getRg());
                stmt.setString(6, hosp.getEmail());
                stmt.setInt(7, hosp.getQuarto());
                
                
                stmt.setInt(8, hosp.getId());
               
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Hospede editado com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e);
      
        }
        
    }
        
        public void excluirHospede(int id){
        try {
            String sql = "DELETE FROM hospedes WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Hospede excluido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! Ocorreu um erro: " + e);
        }
    }
        public List<Hospede> listarHospede(int quarto){
        try{
            List<Hospede> hospedes = new ArrayList<>();
            
            String sql = "SELECT * FROM hospedes where quarto = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, quarto);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
               Hospede hosp = new Hospede();
                
                hosp.setId(result.getInt("id"));
                hosp.setNome(result.getString("nome"));
                hosp.setIdade(result.getInt("idade"));
                hosp.setCpf(result.getString("cpf"));
                hosp.setRg(result.getString("rg"));
                hosp.setEmail(result.getString("email"));
                hosp.setNumero(result.getString("numero"));
                
                hosp.setQuarto(result.getInt("quarto"));
                
                
                hospedes.add(hosp);
            }
            
            return hospedes;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de execução de consulta: \n" + e);
            return null;
        }
    
    }
      
}
