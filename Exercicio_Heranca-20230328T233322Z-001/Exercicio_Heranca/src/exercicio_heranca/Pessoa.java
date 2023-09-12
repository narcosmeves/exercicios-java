/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_heranca;

/**
 *
 * @author 0040482121037
 */
public class Pessoa {
    
   
    private String nome, sobrenome;

    //construtor pessoa
    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    //construtor de copia
    public Pessoa(Pessoa p)
    {
        this(p.nome, p.sobrenome);
    }
    
    //getters
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
   //Print
   public void printNome()
   {
       System.out.println(nome + " " + sobrenome);
   }
     
}
