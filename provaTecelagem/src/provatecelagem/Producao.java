/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provatecelagem;

/**
 *
 * @author 0040482121037
 */

public class Producao extends Funcionario{
    
    private int horasDiurnas;
    private int horasNoturnas;

    public Producao(String nome, int rg, double salarioBase) {
        super(nome, rg, salarioBase);
        horasDiurnas = 0;
        horasNoturnas = 0;
    }

    
    public void registrarHorasDiurnas(int horas)
    {
        horasDiurnas+=horas;
    }
    
        public void registrarHorasNoturnas(int horas)
    {
        horasNoturnas+=horas;
    }
    
    @Override
    public double salarioLiquido()
    {
        return (super.getSalarioBase()*horasDiurnas) + ((super.getSalarioBase()*horasNoturnas) + 
                (super.getSalarioBase()*(horasNoturnas*0.3)));
    
    }
    
    @Override
        public void hollerith()
    {
            System.out.println("Produção");
            super.hollerith();
            System.out.println("Salario Liquido " + salarioLiquido());
            System.out.println("Horas Diurnas: " + horasDiurnas);
            System.out.println("Horas Noturnas: " + horasNoturnas);
    
    }
        
    @Override
    public void novoMes()
    {
        System.out.println("Produção");
        super.hollerith();
        horasDiurnas = 0;
        horasNoturnas = 0;
    
    }
}
