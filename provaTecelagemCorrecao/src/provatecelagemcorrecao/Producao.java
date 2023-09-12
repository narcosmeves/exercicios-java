/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provatecelagemcorrecao;

/**
 *
 * @author 0040482121037
 */
public class Producao extends Funcionario {
    
    private int horasDiurnas, horasNoturnas;

    public Producao(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        horasDiurnas = 0;
        horasNoturnas = 0;
    }
    
    //metodos
    public void registrarHorasDiurnas(int horas)
    {
        horasDiurnas+=horas;
    
    }  
                      
    public void registrarHorasNoturnas(int horas)
    {
        horasNoturnas+=horas;
    }

    //metodo separado para calcular valor diurno
    private double valorDiurno()
    {
        return horasDiurnas*salarioBase;
    
    }
    
    //metodo separado para calcular valor Noturno
    private double valorNoturno()
    {
        return horasNoturnas*salarioBase*1.3;
    
    }
    
    @Override
    public double salarioLiquido()
    {
    
        return valorDiurno()+valorNoturno();
        
    }
    
    @Override
    public void novoMes()
    {
        horasDiurnas = 0;
        horasNoturnas = 0;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Horas Diurnas: " + horasDiurnas + " " + "Valor: " + valorDiurno());
        System.out.println("Horas Noturnas: " + horasNoturnas + " " + "Valor: " + valorNoturno());
    }
    
    
}///final da classe
