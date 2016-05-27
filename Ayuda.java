import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda extends Navegacion
{

    /**
     * Constructor for objects of class Ayuda.
     * 
     */
    public Ayuda()
    {
        Archivo arc = new Archivo(0);
        addObject(arc,400,325);
        
        showText("**Instrucciones**",400,180);
        imprimeTexto(arc.getTexto());
        showText("Presione ENTER para ir al menú",200,550);
    }
    
    /**
     * Metodo encargado de regresar al menu al presionar enter
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.delay(2);
            Greenfoot.setWorld(new Menu());
        }
    }
    
    /**
     * Metodo encargado de imprimir el texto de ayuda
     */
    public void imprimeTexto(String texto)
    {
        showText(texto,400,320);
    }
}
