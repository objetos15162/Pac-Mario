import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Villano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Villano extends Enemigo
{
    public Villano()
    {
        imagen1 = new GreenfootImage("enemigo1.png");
        imagen2 = new GreenfootImage("enemigo2.png");
        
        setImage(imagen1);
        turn(-90);
        band=3;
        
        inicializaCom();
    }
    
    public void act() 
    {
        super.act();
    }
}
