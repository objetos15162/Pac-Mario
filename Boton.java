import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
   
    public Boton(String imagen)
    {
        switch(imagen)
        {
            case "jugar": image1 = new GreenfootImage("bjugar.png");
                          image2 = new GreenfootImage("bjugar2.png");
                          break;
            case "records": image1 = new GreenfootImage("brecords.png");
                          image2 = new GreenfootImage("brecords2.png");
                          break;
            case "ayuda": image1 = new GreenfootImage("bayuda.png");
                          image2 = new GreenfootImage("bayuda2.png");
                          break;
            case "salir": image1 = new GreenfootImage("bsalir.png");
                          image2 = new GreenfootImage("bsalir2.png");
                          break;
            case "mario": image1 = new GreenfootImage("mario3.png");
                          image1.scale(80,80);
                          break;
            case "luigi": image1 = new GreenfootImage("luigi3.png");
                          image1.scale(80,80);              
                          break;
            case "yoshi": image1 = new GreenfootImage("yoshi3.png");
                          image1.scale(80,80);
                          break;
        }
        setImage(image1);
    }
    
    /**
     * Act - do whatever the Boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //
    }
    
    public void changeImage(int x)
    {
        switch(x)
        {
            case 1: setImage(image1);
                    break;
            case 2: setImage(image2);
        }
    }
}
