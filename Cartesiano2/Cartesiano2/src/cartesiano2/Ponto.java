/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano2;

/**
 *
 * @author 040069
 */
public class Ponto 
{
    private double x, y;

    public Ponto()
    {
        x= y= 0;
    }
    
    public Ponto(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }
    
    public Ponto(Ponto p)
    {
//        x= p.x;
//        y= p.y;
        this(p.x, p.y);
    }

    // Getters e setters
    public double getX() 
    {
        return x;
    }

    public void setX(double x) 
    {
        this.x = x;
    }

    public double getY() 
    {
        return y;
    }

    public void setY(double y) 
    {
        this.y = y;
    }
    
    // Outros métodos
    
    public void setXY(double x, double y)
    {
        this.x= x;
        this.y= y;
    }
    
    public void assign(Ponto pt)
    {
//        x= pt.x;
//        y= pt.y;
        setXY(pt.x, pt.y);
    }
    
    public double deltaX(double vX)
    {
        return vX-x;
    }
    
    public double deltaY(double vY)
    {
        return vY-y;
    }
    
    public void desloc(double dX, double dY)
    {
        x= x + dX;
        y= y + dY;
    }
    
    public void escale(double factor)
    {
        x= x * factor;
        y= y * factor;
    }
    
    public double distance(double posX, double posY)
    {
        double dx= deltaX(posX);
        double dy= deltaY(posY);
        
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    // Exercício 4
    public double distance(Ponto pt)
    {
        return distance(pt.x, pt.y);
    }
    
    public double distance()
    {
        return distance(0,0);
    }
    
    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
    
    public void print()
    {
        System.out.println(toString());
    }
    
    public void print(String caption)
    {
        System.out.println(caption + toString());
    }
}
