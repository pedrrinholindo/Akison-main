
package br.com.GoodRestHotel.model;

import javax.swing.JOptionPane;


public class Hospede {
   private int id;
   private String nome;
   private String sobrenome;
   private int idade;
   private String cpf;
   private String rg;
   private String email;
   private String numero;
   private Double consumo;
   private int quarto;

    public Hospede(int id, String nome, String sobrenome, int idade, String cpf, String rg, String email, String numero, Double consumo, int quarto) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.numero = numero;
        this.consumo = consumo;
        this.quarto = quarto;
    }

   public Hospede(){
       
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }
    
    
    public void calcularEstadia(Integer dias, Double diaria){
        Double valorEstadia= 0.0;
        if(dias > 0 && diaria > 0){
            valorEstadia = dias * diaria;
        }else{
            JOptionPane.showMessageDialog(null, "Erro, algum dos valores é menor que ou igual a 0!");
        }
        this.consumo = this.getConsumo() + valorEstadia;
    }
   
    
}
