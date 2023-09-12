/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 040069
 */
public class NaoTecnico extends Livro
{

    public NaoTecnico(String autor, String titulo, int totCopias) 
    {
        super(autor, titulo, totCopias);
    }
    
    public boolean emprestar()
    {
        return consultar();
    } 
}
