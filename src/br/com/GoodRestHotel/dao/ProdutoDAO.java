
package br.com.GoodRestHotel.dao;
import br.com.GoodRestHotel.jdbc.ConnectionFactory;
import br.com.GoodRestHotel.model.Hospede;
import br.com.GoodRestHotel.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
    private Connection con;
    
    public ProdutoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
        public void salvarProduto(Produto pro){
        try{
            String sql = "insert into produtos(nome, preco, quantidade, fornecedor, descricao, fab, val)" + 
                            " values(?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, pro.getNome());
                stmt.setDouble(2, pro.getPreco());
                stmt.setInt(3, pro.getQtd());
                stmt.setString(4, pro.getFornecedor());
                stmt.setString(5, pro.getDescricao());
                stmt.setString(6, pro.getFab());
                stmt.setString(7, pro.getVal());
                
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Produto registrado com sucesso.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e);
        }
    }
    public List<Produto> listarProdutos(){
        try{
            List<Produto> produtos = new ArrayList<>();
            
            String sql = "SELECT * FROM produtos";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
               Produto pro = new Produto();
                
                pro.setId(result.getInt("id"));
                pro.setNome(result.getString("nome"));
                pro.setPreco(result.getDouble("preco"));
                pro.setQtd(result.getInt("quantidade"));
                pro.setFornecedor(result.getString("fornecedor"));
                pro.setDescricao(result.getString("descricao"));
                pro.setFab(result.getString("fab"));
                pro.setVal(result.getString("val"));
                
                
                produtos.add(pro);
            }
            
            return produtos;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de execução de consulta: \n" + e);
            return null;
        }
    }
    public void editarFuncionario(Produto pro){
        try{
            String sql = "update produtos SET nome=?, preco=?, quantidade=?, fornecedor=?, descricao=?, fab=?, val=?" + 
                            " values(?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, pro.getNome());
                stmt.setDouble(2, pro.getPreco());
                stmt.setInt(3, pro.getQtd());
                stmt.setString(4, pro.getFornecedor());
                stmt.setString(5, pro.getDescricao());
                stmt.setString(6, pro.getFab());
                stmt.setString(7, pro.getVal());
                
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Produto editado com sucesso.");
        }   catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e);
            }
        }
    public void excluirFuncionario(Produto pro){
        try {
            String sql = "DELETE FROM produtos WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, pro.getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops! Ocorreu um erro: " + e);
        }
    }
    public List<Produto> buscarProdutos(String nome){
        try{
            List<Produto> produtos = new ArrayList<>();
            
            String sql = "SELECT * FROM produtos WHERE nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet result = stmt.executeQuery();
            
            
            while(result.next()){
               Produto pro = new Produto();
                
                pro.setId(result.getInt("id"));
                pro.setNome(result.getString("nome"));
                pro.setPreco(result.getDouble("preco"));
                pro.setQtd(result.getInt("quantidade"));
                pro.setFornecedor(result.getString("fornecedor"));
                pro.setDescricao(result.getString("descricao"));
                pro.setFab(result.getString("fab"));
                pro.setVal(result.getString("val"));
                
                produtos.add(pro);
            }
            
            return produtos;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de execução de consulta: \n" + e);
            return null;
        }
    }
    public void compraProduto(Produto pro, Integer quant, Hospede hosp){
        pro.comprarProduto(quant);
        Double consumoCompra = pro.calcConsumo(quant, pro.getPreco());
        Hospede hospT = new Hospede();
        try{
            String sql = "update produtos SET quantidade=?" + 
                            " where id = ?";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, pro.getQtd());
                stmt.setInt(2, pro.getId());
                
                stmt.execute();
                stmt.close();
                 } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e);
            }
               try { 
                    String consumoHospede = "SELECT * FROM hospedes where id=?";
                    PreparedStatement consumoStmt = con.prepareStatement(consumoHospede);
                    consumoStmt.setInt(1, hosp.getId());
                    ResultSet result = consumoStmt.executeQuery();
                 
                    hospT.setConsumo(result.getDouble("consumo"));
                    hospT.setConsumo(consumoCompra + hospT.getConsumo());
        }   catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e);
            }
               
               hosp.setConsumo(hospT.getConsumo());
               
               try{
                   String sql = "update hospedes SET consumo=? where id =?";
                   PreparedStatement stmt = con.prepareStatement(sql);
                   stmt.setDouble(1, hosp.getConsumo());
                   stmt.setInt(2, hosp.getId());
                   stmt.execute();
                   stmt.close();
                   
                   JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");
               } catch(Exception e){
                   JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e);
               }
    }
    
}
