import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mario extends Jugador
{
    public Mario()
    {
        moneda = 0;
        
        imagen1 = new GreenfootImage("mario1.png");
        imagen2 = new GreenfootImage("mario2.png");
        
        setImage(imagen1);
    }
    
    public void act()
    {
        super.act();
    }
}
