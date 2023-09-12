/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provatecelagem;

/**
 *
 * @author marco
 */

public class Vendedor extends Funcionario {
    
    private double valorVenda;

    public Vendedor(String nome, int rg, double salarioBase) {
        super(nome, rg, salarioBase);
        valorVenda = 0;
    }
    
    public void registrarVenda(double valor)
    {
        
        valorVenda += valor;
    
    }
    
    @Override
    public double salarioLiquido()
    {
        return super.getSalarioBase()+(valorVenda*0.03);
    
    }
    
    @Override
    public void hollerith()
    {
            System.out.println("Vendedor");
            super.hollerith();
            System.out.println("Salario Liquido " + salarioLiquido());
            System.out.println("Valor Total de Venda do Mês: " + valorVenda);
    
    }
    
    @Override
    public void novoMes()
    {
        System.out.println("Vendedor");
        super.hollerith();
        valorVenda = 0;
    
    }
}////final da classe
