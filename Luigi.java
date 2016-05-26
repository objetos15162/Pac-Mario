import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Luigi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Luigi extends Jugador
{
    public Luigi()
    {
        moneda = 0;
        
        imagen1 = new GreenfootImage("luigi1.png");
        imagen2 = new GreenfootImage("luigi2.png");
        
        setImage(imagen1);
    }
    
    public void act()
    {
        super.act();
    }
}
