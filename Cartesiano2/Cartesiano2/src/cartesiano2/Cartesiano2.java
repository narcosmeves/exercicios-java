/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartesiano2;

/**
 *
 * @author 040069
 */
public class Cartesiano2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Ponto p1= new Ponto(10,20);
        p1.print("p1");
        Ponto p2= new Ponto();
        p2.print("p2");
        Ponto p3= new Ponto(p1);
        p3.print("p3");
        
        p3.desloc(2, 4);
        p3.print("p3");
        p1.escale(2);
        p1.print("p1");
                
        p1.setXY(4, 0);
        p2.setXY(0, 3);
        
        System.out.println("Distancia de p1 a p2: " + p1.distance(p2));
        System.out.println("Distancia de p1 a (0,0): " + p1.distance());
        System.out.println("Distancia de p1 a (0,0): " + p1.distance(0,0));
        
    }
    
}
