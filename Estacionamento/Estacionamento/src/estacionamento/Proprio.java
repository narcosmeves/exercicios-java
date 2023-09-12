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
public class Proprio extends Carro
{
    private double valorCompra;
    private String dataCompra;

    public Proprio(double valorCompra, String dataCompra, String placa, String modelo, int ano) {
        super(placa, modelo, ano);
        this.valorCompra = valorCompra;
        this.dataCompra = dataCompra;
    }
    
    // getters e setters

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    // outros métodos
    @Override
    public boolean oferta(double valor)
    {
        return valor >= valorCompra * 1.1;
    }
    
    @Override
    public void imprimeDados()
    {
        super.imprimeDados();
        System.out.println("Valor de compra: " + valorCompra + "\n" +
                "Data de compra: " + dataCompra);
    }

    @Override
    public String toString() {
        return "Proprio{" + "valorCompra=" + valorCompra + ", dataCompra=" + dataCompra + '}' + 
                " " + super.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.valorCompra) ^ (Double.doubleToLongBits(this.valorCompra) >>> 32));
        hash = 73 * hash + Objects.hashCode(this.dataCompra);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj))
            return false;
        
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proprio other = (Proprio) obj;
        if (Double.doubleToLongBits(this.valorCompra) != Double.doubleToLongBits(other.valorCompra)) {
            return false;
        }
        return Objects.equals(this.dataCompra, other.dataCompra);
    }
    
    
    
    
}
