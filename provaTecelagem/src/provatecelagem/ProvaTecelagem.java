/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provatecelagem;

/**
 *
 * @author 0040482121037
 */
public class ProvaTecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ///ADM
        Administrativos ad1;
        ad1 = new Administrativos("Joao", 11111111, 2000.50);
        ad1.registarFalta();
        ad1.registarFalta();
        ad1.hollerith();
        System.out.println("");
        ad1.novoMes();

        System.out.println(""); 
        
        ///Produção
        Producao pd1;   
        pd1 = new Producao("Toni", 22222222, 10.00);
        pd1.registrarHorasDiurnas(100);
        pd1.registrarHorasNoturnas(120);
        pd1.hollerith();
        System.out.println(""); 
        pd1.novoMes();
        
        System.out.println(""); 
        
        //Vendedor
        Vendedor v1;
        v1 = new Vendedor("Thiago", 69696969, 1800.00);
        v1.registrarVenda(10000.00);
        v1.registrarVenda(10000.00);
        v1.registrarVenda(10000.00);
        v1.registrarVenda(10000.00);
        v1.registrarVenda(10000.00);
        v1.hollerith();
        System.out.println(""); 
        v1.novoMes();
    }
    
}
