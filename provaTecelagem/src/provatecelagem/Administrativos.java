/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provatecelagem;

/**
 *
 * @author 0040482121037
 */

public class Administrativos extends Funcionario {
    
    private int faltas;

    public Administrativos(String nome, int rg, double salarioBase) {
        super(nome, rg, salarioBase);
        faltas = 0;
    }
     
    public void registarFalta()
    {
        faltas++;
    }
    
    @Override
    public double salarioLiquido()
    {
        return super.getSalarioBase()-(faltas/0.3);
    
    }
    
    @Override
    public void hollerith()
    {
            System.out.println("Administrativo");
            super.hollerith();
            System.out.println("Salario Liquido:  " + salarioLiquido());
            System.out.println("Faltas: " + faltas);
    
    }
    
    @Override
    public void novoMes()
    {
        System.out.println("Administrativo");
        super.hollerith();
        faltas = 0;
    
    }
            
}//// fim da classe
