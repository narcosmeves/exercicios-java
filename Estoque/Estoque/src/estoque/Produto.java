/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoque;

/**
 *
 * @author 040069
 */
public class Produto 
{
    private String descr;
    private int qtd;
    private double preco;
    
    // Construtor
    public Produto(String vDescr, double vPreco)
    {
        if(vDescr.isBlank()) System.out.println("String vazia.");
        else descr= vDescr;
        
        qtd=0;
        
        if(vPreco <= 0) System.out.println("Preço inválido.");
        else preco= vPreco;
    }
         
    public boolean acrescentar(int vQtd)
    {
        if(vQtd < 0) 
        {
            System.out.println("Quantidade negativa.");
            return false;  
        }
        
        qtd+= vQtd;
        return true;
    }
            
    public boolean retirar(int vQtd)
    {
        if(vQtd<0 || vQtd > qtd) return false;
        
        qtd -= vQtd;
        return true;
    }
    
    public double valorTotal()
    {
        return preco*qtd;
    }
    
    public void print()
    {
        System.out.println(descr + " qtd: " + qtd + " preço: " + preco + " valor total:" + valorTotal());
    }
    
}////////////////////// Classe Produto

