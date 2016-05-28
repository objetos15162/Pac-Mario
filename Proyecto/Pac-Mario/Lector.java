import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lector extends Navegacion
{
    private char x,y,z;
    private int puntos;
    private int c;
    Indicador ind = new Indicador();
    /**
     * Constructor for objects of class Lector.
     * 
     */
    public Lector(int pts)
    {
        puntos = pts;
        
        x = y = z = 65;
        
        c = 0;
        
        showText("**Registra tu nombre**",400,200);
        
        addObject(ind,355,320);
    }
    
    /**
     * Metodo encargado del acto de seleccion de letra y guardar el record
     */
    public void act()
    {
        imprimeTexto();
        
        if(Greenfoot.isKeyDown("right"))
        {
            if(c<2)
                c++;
            else
                c = 0;
            ind.setLocation(355+c*45,320);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            if(c>0)
                c--;
            else
                c = 2;
            ind.setLocation(355+c*45,320);
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            switch(c)
            {
                case 0: if(x > 65)
                            x--;
                        else 
                            x = 90;
                        break;
                case 1: if(y > 65)
                            y--;
                        else 
                            y = 90;
                        break;
                case 2: if(z > 65)
                            z--;
                        else 
                            z = 90;
                        break;
            }
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            switch(c)
            {
                case 0: if(x < 90)
                            x++;
                        else 
                            x = 65;
                        break;
                case 1: if(y < 90)
                            y++;
                        else 
                            y = 65;
                        break;
                case 2: if(z < 90)
                            z++;
                        else 
                            z = 65;
                        break;
            }
        }
        
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new Records(Character.toString(x)+Character.toString(y)+Character.toString(z),puntos));
        }
    }
    
    /**
     * Metodo encargado de imprimir texto para el nombre del jugador al terminar juego
     */
    private void imprimeTexto()
    {
        showText(Character.toString(x)+"    "+Character.toString(y)+"    "+Character.toString(z),400,300);
    }
}
