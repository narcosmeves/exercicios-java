/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provatecelagemcorrecao;

/**
 *
 * @author 0040482121037
 */
public class Vendas extends Funcionario{
    
    private double totalVendas;

    public Vendas(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        totalVendas = 0;
        
    }
    
    public void registrarVenda(double valor)
    {
        totalVendas+=valor;
    }
    
    private double comissao()
    {
      return totalVendas * 0.3;
    }
    
    @Override
    public double salarioLiquido()
    {
        return salarioBase+comissao();
    }
    
    @Override
    public void novoMes()
    {
        totalVendas = 0;
    }
    
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Total de Vendas: " + totalVendas);
        System.out.println("Comissão: " + comissao());
    }
    
}///final da classe

