
package br.com.GoodRestHotel.dao;

import br.com.GoodRestHotel.jdbc.ConnectionFactory;
import br.com.GoodRestHotel.model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class FuncionarioDAO {
    public Connection con;
    
    public FuncionarioDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void salvarFuncionario(Funcionario fun){
        try{
            String sql = "insert into funcinarios(nome, sobrenome, anoNascimento, cpf, rg, sexo, cargo, usuario, senha, acesso, email, celular, rua, numero, complemento, bairro, cidade, estado, cep)" + 
                            " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, fun.getNome());
                stmt.setString(2, fun.getSobrenome());
                stmt.setString(3, fun.getAnoNascimento());
                stmt.setString(4, fun.getCpf());
                stmt.setString(5, fun.getRg());
                stmt.setString(6, fun.getSexo());
                stmt.setString(7, fun.getCargo());
                stmt.setString(8, fun.getUsuario());
                stmt.setString(9, fun.getSenha());
                stmt.setString(10, fun.getAcesso());
                stmt.setString(11, fun.getEmail());
                stmt.setString(12, fun.getCelular());
                stmt.setString(13, fun.getRua());
                stmt.setInt(14, fun.getNumero());
                stmt.setString(15, fun.getComplemento());
                stmt.setString(16, fun.getBairro());
                stmt.setString(17, fun.getCidade());
                stmt.setString(18, fun.getEstado());
                stmt.setString(19, fun.getCep());
                
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Funcionário registrado com sucesso.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e);
        }
    }
    public List<Funcionario> listarFuncionarios(){
        try{
            List<Funcionario> funcs = new ArrayList<>();
            
            String sql = "SELECT * FROM funcionarios";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
               Funcionario func = new Funcionario();
                
                func.setId(result.getInt("id"));
                func.setNome(result.getString("nome"));
                func.setSobrenome(result.getString("sobrenome"));
                func.setAnoNascimento(result.getString("ano_nascimento"));
                func.setCpf(result.getString("cpf"));
                func.setRg(result.getString("Rg"));
                func.setSexo(result.getString("sexo"));
                func.setCargo(result.getString("cargo"));
                func.setUsuario(result.getString("usuario"));
                func.setSenha(result.getString("senha"));
                func.setAcesso(result.getString("acesso"));
                func.setEmail(result.getString("email"));
                func.setCelular(result.getString("celular"));
                func.setRua(result.getString("rua"));
                func.setNumero(result.getInt("numero"));
                func.setComplemento(result.getString("complemento"));
                func.setBairro(result.getString("bairro"));
                func.setCidade(result.getString("cidade"));
                func.setEstado(result.getString("estado"));
                func.setCep(result.getString("cep"));
                
                
                funcs.add(func);
            }
            
            return funcs;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de execução de consulta: \n" + e);
            return null;
        }
    }
    public void editarFuncionario(Funcionario fun){
        try{
                String sql = "UPDATE funcionarios SET nome=?, sobrenome=?, anoNascimento=?, cpf=?, rg=?, sexo=?, cargo=?, usuario=?, senha=?, acesso=?, email=?, celular=?, rua=?, numero=?, complemento=?, bairro=?, cidade=?, estado=?, cep=? "
                        + " WHERE =  id = ?";
                        
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, fun.getNome());
                stmt.setString(2, fun.getSobrenome());
                stmt.setString(3, fun.getAnoNascimento());
                stmt.setString(4, fun.getCpf());
                stmt.setString(5, fun.getRg());
                stmt.setString(6, fun.getSexo());
                stmt.setString(7, fun.getCargo());
                stmt.setString(8, fun.getUsuario());
                stmt.setString(9, fun.getSenha());
                stmt.setString(10, fun.getAcesso());
                stmt.setString(11, fun.getEmail());
                stmt.setString(12, fun.getCelular());
                stmt.setString(13, fun.getRua());
                stmt.setInt(14, fun.getNumero());
                stmt.setString(15, fun.getComplemento());
                stmt.setString(16, fun.getBairro());
                stmt.setString(17, fun.getCidade());
                stmt.setString(18, fun.getEstado());
                stmt.setString(19, fun.getCep());
                
                stmt.setInt(20, fun.getId());
                
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Editado com sucesso!");
        }   catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ops! Ocorreu um erro: " + e);
            }
          
        }
    public void excluirFuncionario(Funcionario fun){
        try {
            String sql = "DELETE FROM funcionarios WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, fun.getId());
            
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! Ocorreu um erro: " + e);
        }
    }
    public List<Funcionario> buscarFuncionarios(String nome){
        try{
            List<Funcionario> funcs = new ArrayList<>();
            
            String sql = "SELECT * FROM funcionarios WHERE nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
               Funcionario func = new Funcionario();
                
                func.setId(result.getInt("id"));
                func.setNome(result.getString("nome"));
                func.setSobrenome(result.getString("sobrenome"));
                func.setAnoNascimento(result.getString("ano_nascimento"));
                func.setCpf(result.getString("cpf"));
                func.setRg(result.getString("Rg"));
                func.setSexo(result.getString("sexo"));
                func.setCargo(result.getString("cargo"));
                func.setUsuario(result.getString("usuario"));
                func.setSenha(result.getString("senha"));
                func.setAcesso(result.getString("acesso"));
                func.setEmail(result.getString("email"));
                func.setCelular(result.getString("celular"));
                func.setRua(result.getString("rua"));
                func.setNumero(result.getInt("numero"));
                func.setComplemento(result.getString("complemento"));
                func.setBairro(result.getString("bairro"));
                func.setCidade(result.getString("cidade"));
                func.setEstado(result.getString("estado"));
                func.setCep(result.getString("cep"));
                
                
                funcs.add(func);
            }
            
            return funcs;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de execução de consulta: \n" + e);
            return null;
        }
    }
    
}
