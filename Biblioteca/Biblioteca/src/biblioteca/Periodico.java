/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 040069
 */
public class Periodico extends Publicacao
{
    private String volume;

    public Periodico(String volume, String titulo, int totCopias) 
    {
        super(titulo, totCopias);
        this.volume = volume;
    }

    public void imprimir()
    {
        super.imprimir();
        System.out.println("Volume: " + volume);
    }
    
    
    
}
