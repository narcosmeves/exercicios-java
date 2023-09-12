/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provatecelagemcorrecao;

/**
 *
 * @author 0040482121037
 */
public class ProvaTecelagemCorrecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Administracao adm1 = new Administracao("Toni", "1111111-11", 9000);
        adm1.registrarFalta();
        adm1.hollerith();
        
        System.out.println("");
        
        Producao pd1 = new Producao("Marta", "22222222-22", 50);
        pd1.registrarHorasDiurnas(100);
        pd1.registrarHorasNoturnas(100);
        pd1.hollerith();
        
        System.out.println("");
        
        Vendas vd1 = new Vendas("João", "3333333-33", 1000);
        vd1.registrarVenda(10000);
        vd1.registrarVenda(10000);
        vd1.hollerith();
        
    }
    
}
