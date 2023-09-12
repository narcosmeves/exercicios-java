/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_heranca;

/**
 *
 * @author 0040482121037
 */
public class Aluno extends Pessoa {
    
    private String ra;
    private double nota1, nota2;
    private int faltas;

    //construtor aluno
    public Aluno(String ra, String nome, String sobrenome) {
        super(nome, sobrenome);
        this.ra = ra;
        nota1 = 0;
        nota2 = 0;
        faltas = 0;
    }

    
    //construtor de copia certo
    public Aluno(Aluno a){
        super(a);
        ra = a.ra;
        nota1 = a.nota1;
        nota2 = a.nota2;
        faltas = a.faltas;
    }
    
    
    //getters
    public String getRa() {
        return ra;
    }

    //setters 
    public void setRa(String ra) {
        this.ra = ra;
    }

    /*sem necessidade de criar setters e getters para indicadores de estados
    pois já possuem metodos que os controlam*/
    
    //metodos que manipulam os atributos
    
    public void prova1 (double nota1)
    {
        if(nota1>=0 && nota1<=10)
        this.nota1 = nota1;
    }
    
    public void prova2 (double nota2)
    {
        if(nota2>=0 && nota2<=10)
        this.nota2 = nota2;
    }
     
    public void faltou()
    {
        faltas++; //acrescenta um no atributo
    }
    
    public double media()
    {
       return (nota1+nota2)/2;
    }
 
    /*Quando o metodo retorna um valor não armazenar o valor em um atributo*/

    public boolean aprovado()
    {
        return(media()>=6 && faltas <20); 
    }
    

    public void print()
    {   
        printNome();
        System.out.println("RA: " + ra);
        //System.out.println(super.getNome()+" "+super.getSobrenome());
        System.out.println("Prova 1: " + nota1+" Prova 2: "+nota2);
        System.out.println("Média: " + media());
        System.out.println("Faltas: " + faltas);
        System.out.println("Aprovado: " + (aprovado()?"Sim":"Não")); // ? = operador ternario   
    
    }
}
