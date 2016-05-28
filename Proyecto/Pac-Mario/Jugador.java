import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Jugador extends ObjetoMovible
{
    protected int band = 0;
    protected int moneda;
    protected int vidas = 3;
    protected GreenfootImage imagen1;
    protected GreenfootImage imagen2;
    private GreenfootSound coin = new GreenfootSound("coin.mp3");
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
        }
            
        gira();
        move();
        come();
    }
    
    /**
     * Metodo encargado del giro del jugador
     */
    public void gira()
    {
        if(Greenfoot.isKeyDown("right"))
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
       
        if(Greenfoot.isKeyDown("left"))
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
            
        if(Greenfoot.isKeyDown("up"))
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
            
        if(Greenfoot.isKeyDown("down"))
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
     * Metodo encargado de cambiar la imagen dependiendo del movimiento
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
    
    /**
     * Metodo encargado de tomar la moneda
     */
    public void come()
    {
        if(canSee(Moneda.class))
        {
            eat(Moneda.class);
            coin.play();
            moneda++;
        }
        
        if(canSee(Vida.class))
        {
            eat(Vida.class);
            vidas++;
        }
    }
    
    /**
     * Metodo de acceso
     * @return int moneda
     */
    public int getMonedas()
    {
        return moneda;
    }
    
    /**
     * Metodo de acceso 
     */
    public void setMonedas(int moneda)
    {
        this.moneda = moneda;
    }
    
    /**
     * Metodo de acceso 
     * @return vidas
     */
    public int getVidas()
    {
        return vidas;
    }
    
    /**
     * Metodo de acceso
     */
    public void setVidas(int vida)
    {
        this.vidas = vida;
    }
    
    /**
     * Metodo encargado de restar la vida
     */
    public void bajaVida()
    {
        vidas--;
    }
    
    public void AgregaVida()
    {
        vidas++;
    }
}
