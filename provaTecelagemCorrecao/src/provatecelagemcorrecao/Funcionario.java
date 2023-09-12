/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provatecelagemcorrecao;

/**
 *
 * @author 0040482121037
 */

public abstract class Funcionario 
{
    private String nome, rg;
    protected double salarioBase; //pode ser visto pelas classes descendentes

    public Funcionario(String nome, String rg, double salarioBase) {
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = salarioBase;
    }
    
    //caracteristicas podem colocar getters e setters do construtor
    //Indicador de Estado não se faz getters e setters
    //getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }
    
    
    //setters
    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public abstract double salarioLiquido( ); //usado em todas as classes porem os calculos são diferentes
    
    public abstract void novoMes();//usado em todas as classes porem os calculos são diferentes
    
    public void hollerith()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Rg: " + rg);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Salário Liquido: " + salarioLiquido());
    
    }
    
}///final da classe
