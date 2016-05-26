import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Goomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goomba extends Enemigo
{
    public Goomba()
    {
        imagen1 = new GreenfootImage("villano1.png");
        imagen2 = new GreenfootImage("villano2.png");
        
        setImage(imagen1);
        
        inicializaCom();
    }
    
    public void act() 
    {
        super.act();
    }
}
    