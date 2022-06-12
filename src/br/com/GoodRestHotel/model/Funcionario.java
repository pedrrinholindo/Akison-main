
package br.com.GoodRestHotel.model;

import java.awt.Image;
import java.util.Calendar;

public class Funcionario {
    private int id;
    private String nome;
    private String sobrenome;
    private Calendar anoNascimento;
    private String cpf;
    private String rg;
    private char sexo;
    private String cargo;
    private Image foto;
    private String usuario;
    private String senha;
    private String acesso;
    private String email;
    private String celular;
    private Endereco endereco;

    public Funcionario(int id, String nome, String sobrenome, Calendar anoNascimento, String cpf, String rg, char sexo, String cargo, Image foto, String usuario, String senha, String acesso, String email, String celular, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.anoNascimento = anoNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.cargo = cargo;
        this.foto = foto;
        this.usuario = usuario;
        this.senha = senha;
        this.acesso = acesso;
        this.email = email;
        this.celular = celular;
        this.endereco = endereco;
    }

    public Funcionario() {
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

    public Calendar getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Calendar anoNascimento) {
        this.anoNascimento = anoNascimento;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
    
    
    
}
