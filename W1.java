import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Primer mundo
 * 
 */

public class W1 extends MyWorld
{
    
    /**
     * Constructor for objects of class W1.
     * 
     */
    public W1(int op)
    {
        super();
        
        jug = op;
        
        insertRectangles();
        
        insertCoins();
        switch(op)
        {
            case 1: jugador = new Mario();
                    break;
            case 2: jugador = new Luigi();
                    break;
            case 3: jugador = new Yoshi();
                    break;
        }
        addObject(jugador,70,70);
        
        addObject(malos.get(1),70,490);
        addObject(malos.get(0),730,70);
        addObject(malos.get(2),250,370);
        
        TInicio = System.currentTimeMillis();
    }
    
    /**
     * Metodo encargado del acto del jugador
     */
    public void act()
    {
        imprimeTexto(jugador.getMonedas());
        
        imprimeVidas(jugador.getVidas());
        
        imprimeTiempo();
        
        comeJugador();
        
        checaVidas();
            
        if(jugador.getMonedas() >= 65)
        {
            Greenfoot.delay(2);
            cancion.stop();
            Greenfoot.setWorld(new W2(jug,jugador,TInicio));
        }
    }
    
    /**
     * Metodo encargado de insertar los rectangulos al mundo
     */
    private void insertRectangles()
    {
        addObject(new Rectangle(1),160,160);
        addObject(new Rectangle(1),640,160);
        addObject(new Rectangle(2),400,130);
        addObject(new Rectangle(1),400,280);
        addObject(new Rectangle(3),640,370);
        addObject(new Rectangle(3),160,370);
        addObject(new Rectangle(4),400,430);
    }
    
    /**
     * Metodo encargado de agregar las monedas al mundo
     */
    private void insertCoins()
    {
        for(int i=0;i<7;i++)
        {
            addObject(new Moneda(),70,130+60*i);
        }
        
        for(int i=0;i<7;i++)
        {
            addObject(new Moneda(),730,130+60*i);
        }
        
        for(int i=0;i<11;i++)
        {
            addObject(new Moneda(),130+60*i,70);
        }
        
        for(int i=0;i<10;i++)
        {
            addObject(new Moneda(),130+60*i,490);
        }
        
        for(int i=0;i<6;i++)
        {
            addObject(new Moneda(),250,130+60*i);
        }
        
        for(int i=0;i<6;i++)
        {
            addObject(new Moneda(),550,130+60*i);
        }
        
        for(int i=0;i<5;i++)
        {
            addObject(new Moneda(),310,130+60*i);
        }
        
        for(int i=0;i<5;i++)
        {
            addObject(new Moneda(),490,130+60*i);
        }
        
        for(int i=0;i<2;i++)
        {
            addObject(new Moneda(),130+60*i,250);
        }
        
        for(int i=0;i<2;i++)
        {
            addObject(new Moneda(),610+60*i,250);
        }
        
        for(int i=0;i<2;i++)
        {
            addObject(new Moneda(),370+60*i,190);
        }
        
        for(int i=0;i<2;i++)
        {
            addObject(new Moneda(),370+60*i,370);
        }
    }
}
