/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_heranca;

/**
 *
 * @author 0040482121037
 */
public class Exercicio_Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Aluno p1, p2, p3;
        
        p1 = new Aluno("1111111111","Mario","Silva");
        p1.prova1(8);
        p1.prova2(5);
        p1.faltou();        
        p1.print();
        
        System.out.println("  ");
       
        p2 = new Aluno("222222222", "Toni", "Lindo");
        p2.prova1(6.5);
        p2.prova2(5.5);
        p2.faltou();
        p2.print();
        
        System.out.println("  ");
        
        p3 = new Aluno(p1);
        p3.print();
        
    }
    
}
