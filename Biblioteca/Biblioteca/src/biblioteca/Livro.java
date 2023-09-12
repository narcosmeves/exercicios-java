/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 040069
 */
public abstract class Livro extends Publicacao
{
    private String autor;

    public Livro(String autor, String titulo, int totCopias) 
    {
        super(titulo, totCopias);
        this.autor = autor;
    }
    
    public abstract boolean emprestar();
    
    public boolean devolver( )
    {
        return retornar();
    }
    
    public void imprimir()
    {
        super.imprimir();
        System.out.println("Autor: " + autor);
                
    }
}
