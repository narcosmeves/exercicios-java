/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionamento;

/**
 *
 * @author 040069
 */
public class Estacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Proprio p1= new Proprio(50000, "10/02/23", "ABC 1234", "HB20", 2018);
        
        p1.imprimeDados();
        
        System.out.println("");
        p1.venderCarro("Zeca", 51000);
        p1.imprimeDados();
        System.out.println("");

        p1.venderCarro("Zeca", 60000);
        p1.imprimeDados();
        
    }
    
}
