import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Yoshi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yoshi extends Jugador
{
    public Yoshi()
    {
        moneda = 0;
        
        imagen1 = new GreenfootImage("yoshi1.png");
        imagen2 = new GreenfootImage("yoshi2.png");
        
        setImage(imagen1);
    }
    
    public void act()
    {
        super.act();
    }  
}
