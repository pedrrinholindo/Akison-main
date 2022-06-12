
package br.com.GoodRestHotel.model;

public class Quarto {
    private int numero;
    private String estado;
    private Double diaria;

    public Quarto() {
        
    }

    public Quarto(int numero, String estado, Double diaria) {
        this.numero = numero;
        this.estado = estado;
        this.diaria = diaria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getDiaria() {
        return diaria;
    }

    public void setDiaria(Double diaria) {
        this.diaria = diaria;
    }
    
    
    
}
