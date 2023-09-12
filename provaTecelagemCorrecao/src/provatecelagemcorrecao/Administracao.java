/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provatecelagemcorrecao;

/**
 *
 * @author 0040482121037
 */
public class Administracao extends Funcionario{
    
    private int faltas;

    public Administracao(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        faltas = 0;
    }
    
    //metodos
    public void registrarFalta( )
    {
        faltas++; //acumulador
    }
    
    private double descontoFaltas()//calculo para descontar faltas
    {
        return (salarioBase / 30) * faltas;
    
    }
    
    @Override
    public double salarioLiquido( )//deixa de ser um metodo abstrato
    {
     
        return salarioBase - descontoFaltas();
        
    }
    
    
    @Override
    public void novoMes()
    {
        faltas = 0;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Faltas: " + faltas);
        System.out.println("Desconto por faltas: " + descontoFaltas());
    }
    
}
