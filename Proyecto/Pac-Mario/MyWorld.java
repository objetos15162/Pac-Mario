import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
public class MyWorld extends World
{
    protected Jugador jugador;
    private boolean band = false;
    protected ArrayList<Enemigo> malos;
    protected int jug;
    protected long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
    protected GreenfootSound cancion = new GreenfootSound("tema.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new Vida(),70,570);
        addObject(new Moneda(),600,570);
        cancion.setVolume(40);
        cancion.playLoop();
        
        malos = new ArrayList<Enemigo>();
        
        malos.add(new Koppa());
        malos.add(new Goomba());
        malos.add(new Villano());
    }
    
    /**
     * Metodo encargado de imprimir las vidas del jugador
     */
    public void imprimeVidas(int vidas)
    {
        showText("x"+vidas,100,570);
    }
    
    /**
     * Metodo encargado de imprimir las monedas obtenidas por el jugador
     */
    public void imprimeTexto(int monedas)
    {
        showText("x"+monedas,630,570);
    }
    
    /**
     * Metodo encargado de imprimir el tiempo del juego
     */
    public void imprimeTiempo()
    {
        long fin = System.currentTimeMillis();
        long t = fin - TInicio;
        t = t/1000;
        long x = t%20;
        if(x<1)
        {
            if(band)
            {
                switch(Greenfoot.getRandomNumber(3))   
                {
                    case 0: malos.add(new Villano());
                            break;
                    case 1: malos.add(new Koppa());
                            break;
                    case 2: malos.add(new Goomba());
                            break;
                }
            
                addObject(malos.get(malos.size()-1),70,70);
            
                band = false;
            }
        }
        else 
            band = true;
        
        showText(String.valueOf(t),400,570);
    }
    
    /**
     * Metodo encargado de bajar una vida al mometo que el villano se come al jugador
     */
    public void comeJugador()
    {
        for(int i = 0; i < malos.size(); i++)
        {
            if(malos.get(i).come())
            {
                jugador.setLocation(70,70);
                jugador.bajaVida();
            }
        }
    }
    
    /**
     * Metodo encargado de revisar las vidas
     */
    public void checaVidas()
    {
        if(jugador.getVidas()<1)
        {
            Greenfoot.delay(2);
            cancion.stop();
            Greenfoot.setWorld(new Menu());
        }
    }
}
