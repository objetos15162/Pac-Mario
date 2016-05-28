import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemigo extends ObjetoMovible
{
    protected int band = 0;
    protected int cont = 0;
    protected int cont2 = 0;
    protected ArrayList<String> ops = new ArrayList<String>();
    protected GreenfootImage imagen1;
    protected GreenfootImage imagen2;
    
    /**
     * Act - do whatever the Jugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(atWorldEdge() || canSee(Rectangle.class))
        {
            switch(band)
            {
                case 0: band = 2;
                        changeImage(2);
                        break;
                case 1: band = 3;
                        break;
                case 2: band = 0;
                        changeImage(1);
                        break;
                case 3: band = 1;
                        break;
            }
            turn(180);
            cont++;
        }
        
        if(cont>=50 || cont2>=1)
        {
            gira(ops.get(Greenfoot.getRandomNumber(4)));
            cont = 0;
            cont2 = 0;
        }
        move();
        
        cont++;
    }
    
    /**
     * Metodo encargado de inicializar los comandos
     */
    protected void inicializaCom()
    {
        ops.add("rigth");
        ops.add("left");
        ops.add("up");
        ops.add("down");
    }
    
    /**
     * Metodo encargado del giro del enemigo
     */
    public void gira(String giro)
    {
        if(giro == "rigth")
        {
            switch(band)
            {
                case 1: turn(-90);
                        break;
                case 2: turn(180);
                        break;
                case 3: turn(90);
                        break;
                default: break;
            }
            band = 0;
            changeImage(1);
        }
       
        if(giro == "left")
        {
            switch(band)
            {
                case 1: turn(90);
                        break;
                case 0: turn(180);
                        break;
                case 3: turn(-90);
                        break;
                default: break;
            }
            band = 2;
            changeImage(2);
        }
            
        if(giro == "up")
        {
            switch(band)
            {
                case 1: turn(180);
                        break;
                case 2: turn(90);
                        break;
                case 0: turn(-90);
                        break;
                default: break;
            }
            band = 3;
        }
            
        if(giro == "down")
        {
            switch(band)
            {
                case 0: turn(90);
                        break;
                case 2: turn(-90);
                        break;
                case 3: turn(180);
                        break;
                default: break;
            }
            band = 1;
        }
    }
    
    /**
     * Metodo encargado de comer al jugador
     * @return boolean
     */
    public boolean come()
    {
        return canSee(Jugador.class);
    }
    
    /**
     * Metodo encargado de cambiar imagen dependiendo del movimiento
     */
    public void changeImage(int x)
    {
        switch(x)
        {
            case 1: setImage(imagen1);
                    break;
            case 2: setImage(imagen2);
        }
    }
    
    public void setSpeed(double s)
    {
        super.setSpeed(s);
    }
}
