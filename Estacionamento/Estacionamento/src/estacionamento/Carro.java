/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

import java.util.Objects;

/**
 *
 * @author 040069
 */
public class Carro 
{
    private String placa, modelo, vendedor;
    private int ano;
    private boolean disp;

    public Carro(String placa, String modelo, int ano) 
    {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        disp= true;
        vendedor= "";
    }
    
    // Getters e setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getVendedor() {
        return vendedor;
    }
    
    // Outros métodos
    
    public boolean disponivel()
    {
        return disp;
    }
    
    public boolean oferta(double valor)
    {
        return false;
    }
    
    public boolean venderCarro(String vendedor, double valorVenda) 
    {
        if(!disp) return false;
        if(!oferta(valorVenda)) return false;
        disp= false;
        this.vendedor= vendedor;
        return true;
    }
    
    public void imprimeDados()
    {
        System.out.println("Placa: " + placa + "\n" +
                "Modelo: " + modelo + "\n" +
                "Ano: " + ano + "\n" +
                "Disponível?: " + (disp?"Sim":"Não"));
        if(!disp)
            System.out.println("Vendedor: " + vendedor);
    }

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", modelo=" + modelo + ", vendedor=" + vendedor + ", ano=" + ano + ", disp=" + disp + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.placa);
        hash = 37 * hash + Objects.hashCode(this.modelo);
        hash = 37 * hash + Objects.hashCode(this.vendedor);
        hash = 37 * hash + this.ano;
        hash = 37 * hash + (this.disp ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (this.ano != other.ano) {
            return false;
        }
        if (this.disp != other.disp) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.vendedor, other.vendedor);
    }
    
    
}
