/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 040069
 */
public class Tecnico extends Livro
{
    private boolean reservado;

    public Tecnico(String autor, String titulo, int totCopias) {
        super(autor, titulo, totCopias);
        
        reservado= false;
    }
    
    @Override
    public boolean emprestar( )
    {
        if(reservado) return false;
        else
            return consultar();
    }
    
    @Override
    public void imprimir()
    {
        super.imprimir();
        System.out.println("Reservado? " + (reservado?"Sim":"Não"));
    }
    
}
