package br.com.GoodRestHotel.dao;
import br.com.GoodRestHotel.jdbc.ConnectionFactory;
import br.com.GoodRestHotel.model.Quarto;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class QuartoDAO {
    private Connection con;
    
    public QuartoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    public void registrarQuarto(Quarto quarto){
        try {
            String sql = "INSERT INTO quartos(numero, estado, diaria) " + 
                        " VALUES(?, ?, ?) ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, quarto.getNumero());
            stmt.setString(2, "Desocupado");
            stmt.setDouble(3, quarto.getDiaria());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e);
        }
  
    }
    public List<Quarto> listarQuartos(){
        try {
            List<Quarto> quartos = new ArrayList<>();
            String sql = "SELECT * FROM quartos";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            
            while(result.next()){
                Quarto quarto = new Quarto();
                
                quarto.setEstado(result.getString("estado"));
                quarto.setDiaria(result.getDouble("diaria"));
                quarto.setNumero(result.getInt("numero"));
                quartos.add(quarto);
            }
            return quartos;
            
            
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro de consulta: " + e );
            return null;
        }
    }
    public void editarQuarto(Quarto quarto){
        try {
            String sql = "UPDATE quartos SET numero = ?, estado = ?, diaria = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, quarto.getNumero());
            stmt.setString(2, quarto.getEstado());
            stmt.setDouble(3, quarto.getDiaria());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Quarto editado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e);
        }
    }
    public void excluirQuarto(Quarto quarto){
        try {
            String sql = "DELETE FROM quartos WHERE numero = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, quarto.getNumero()); 
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Quarto excluído com sucesso!");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e);
        }
    }
    public List<Quarto> buscarQuarto(String estado){
        try {
            List<Quarto> quartos = new ArrayList<>();
            String sql = "SELECT * FROM quartos WHERE estado LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, estado);
            ResultSet result = stmt.executeQuery();
            
            while(result.next()){
                Quarto q = new Quarto();
                q.setNumero(result.getInt("numero"));
                q.setEstado(result.getString("estado"));
                q.setDiaria(result.getDouble("diaria"));
                
                quartos.add(q);
            }
            return quartos;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de consulta: " + e);
            return null;
        }
    }
}
