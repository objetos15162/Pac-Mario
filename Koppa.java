import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Koppa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Koppa extends Enemigo
{
    public Koppa()
    {
        imagen1 = new GreenfootImage("koppa1.png");
        imagen2 = new GreenfootImage("koppa2.png");
        
        setImage(imagen2);
        turn(180);
        band = 2;
        
        inicializaCom();
    }
    
    public void act() 
    {
        super.act();
    } 
}
