/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provatecelagem;

/**
 *
 * @author 0040482121037
 */

public class Funcionario {
    
    private String nome;
    private int rg;
    private double salarioBase;

    public Funcionario(String nome, int rg, double salarioBase) {
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = salarioBase;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    public double salarioLiquido()
    {
        return salarioBase;
    
    }
    
    public void hollerith()
    {
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("Salario: "+ salarioBase);
    
    }
    
    public void novoMes(){
        
        hollerith();
    
    }
    
}
