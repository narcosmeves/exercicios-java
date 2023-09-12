/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 040069
 */
public abstract class Publicacao
{
    private String titulo;
    private int totCopias, copiasDisp;

    public Publicacao(String titulo, int totCopias) 
    {
        this.titulo = titulo;
        this.totCopias = totCopias;
        copiasDisp= totCopias;
    }
    
    public boolean disponivel( )
    {
        return copiasDisp > 0;
    }
    
    public boolean consultar()
    {
        if(copiasDisp > 0)
        {
            copiasDisp--;
            return true;
        }
        else return false;
    }
    
    public boolean retornar()
    {
        if(copiasDisp < totCopias)
        {
            copiasDisp++;
            return true;
        }
        else return false;
    }
    
    public void imprimir( )
    {
        System.out.println("Título : " + titulo + "\n" + 
                "Total de cópias: " + totCopias + "\n" +
                "Cópias disponíveis: " + copiasDisp);
    }
}
