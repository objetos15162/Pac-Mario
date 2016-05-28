import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class SelectPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectPlayer extends Navegacion
{
    Boton j1 = new Boton("mario");
    Boton j2 = new Boton("luigi");
    Boton j3 = new Boton("yoshi");
    /**
     * Constructor for objects of class SelectPlayer.
     * 
     */
    public SelectPlayer()
    {
        showText("**Selecciona tu personaje**",400,220);
        
        showText("Mario",270,360);
        showText("Luigi",400,360);
        showText("Yoshi",530,360);
        
        addObject(j1,270,300);
        addObject(j2,400,300);
        addObject(j3,530,300);
        
        showText("Presione ENTER para ir al menú",200,550);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(j1))
        {
            Greenfoot.delay(3);
            Greenfoot.setWorld(new W1(1));
        }
        
        if(Greenfoot.mouseClicked(j2))
        {
            Greenfoot.delay(3);
            Greenfoot.setWorld(new W1(2));
        }
        
        if(Greenfoot.mouseClicked(j3))
        {
            Greenfoot.delay(3);
            Greenfoot.setWorld(new W1(3));
        }
        
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.delay(2);
            Greenfoot.setWorld(new Menu());
        }
    }
}
