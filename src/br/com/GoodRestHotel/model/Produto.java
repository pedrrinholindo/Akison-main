package br.com.GoodRestHotel.model;

import javax.swing.JOptionPane;

public class Produto {
    private int id;
    private String nome;
    private Double preco;
    private int qtd;
    private String fornecedor;
    private String descricao;
    private String fab;
    private String val;

    public Produto() {
        
    }

    public Produto(int id, String nome, Double preco, int qtd, String fornecedor, String descricao, String fab, String val) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.fab = fab;
        this.val = val;
    }

   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFab() {
        return fab;
    }

    public void setFab(String fab) {
        this.fab = fab;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
    
    public void comprarProduto(Integer quant){
        if(quant > 0){
        int quantidade;
        
        if(this.getQtd() > quant){
            quantidade = this.getId() - quant;
        }else if(this.getQtd() < quant){
            quantidade = quant - this.getQtd();
        }else{
            quantidade = this.getQtd() - quant;
        }
        
        this.qtd = quantidade;
            
        }else{
            JOptionPane.showMessageDialog(null, "Erro, a quantidade comprada não deve ser menor que 0! ");
        }
    }
    
    public void addproduto(Integer quant){
        if(quant > 0){
        this.qtd = this.getQtd() + quant;
        }else{
            JOptionPane.showMessageDialog(null, "Erro, o número de produtos adicionado não pode ser negativo!");
        }
    }
    public Double calcConsumo(Integer quant, Double preco){
        Double consumo = 0.0;
        if(quant > 0 && preco > 0){ 
            consumo = quant * preco;
        }else{
            JOptionPane.showMessageDialog(null, "Erro, a quantidade ou o preço não podem ser menores que 0!");
        }
        return consumo;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", preco=" + preco + ", qtd=" + qtd + '}';
    }
    
}
