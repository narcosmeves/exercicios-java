/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estoque;

/**
 *
 * @author 040069
 */
public class Estoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Produto p1= new Produto("Caneta", 3);
        
        p1.print();
        p1.acrescentar(100);
        p1.print();
        p1.retirar(50);
        p1.print();
        p1.acrescentar(-10);
        p1.print();
    }
    
}
