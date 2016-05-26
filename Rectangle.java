import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle extends Actor
{
    private GreenfootImage imagen1 = new GreenfootImage("c1.png");
    private GreenfootImage imagen2 = new GreenfootImage("c2.png");
    private GreenfootImage imagen3 = new GreenfootImage("c3.png");
    private GreenfootImage imagen4 = new GreenfootImage("c4.png");
    
    public Rectangle(int image)
    {
        switch(image)
        {
            case 1: setImage(imagen1);
                    break;
            case 2: setImage(imagen2);
                    break;
            case 3: setImage(imagen3);
                    break;
            case 4: setImage(imagen4);
                    break;
        }
    }
    
    /**
     * Act - do whatever the Rectangle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
