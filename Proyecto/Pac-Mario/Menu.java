import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Navegacion
{
    private Boton jugar = new Boton("jugar");
    private Boton records = new Boton("records");
    private Boton ayuda = new Boton("ayuda");
    private Boton salir = new Boton("salir");
    boolean band = true;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {
        addObject(jugar,280,250);
        addObject(ayuda,280,400);
        addObject(records,520,250);
        addObject(salir,520,400);
    }
    
    /**
     * Metodo encargado del comportamiento del menu
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(jugar))
        {
            jugar.changeImage(2);
            Greenfoot.delay(2);
            Greenfoot.setWorld(new SelectPlayer());
        }
        
        if(Greenfoot.mouseClicked(records))
        {
            records.changeImage(2);
            Greenfoot.delay(2);
            Greenfoot.setWorld(new Records());
        }
        
        if(Greenfoot.mouseClicked(ayuda))
        {
            ayuda.changeImage(2);
            Greenfoot.delay(2);
            Greenfoot.setWorld(new Ayuda());
        }
        
        if(Greenfoot.mouseClicked(salir))
        {
            salir.changeImage(2);
            Greenfoot.delay(2);
            Greenfoot.stop();
        }
    }
}
