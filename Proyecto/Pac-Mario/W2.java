import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Segundo mundo
 * 
 */
public class W2 extends MyWorld
{
    /**
     * Constructor for objects of class W2.
     * 
     */
    public W2(int op,Jugador player,long ti)
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
        
        jugador.setVidas(player.getVidas());
        jugador.setMonedas(player.getMonedas());
        
        addObject(jugador,70,70);
        
        addObject(malos.get(1),70,490);
        addObject(malos.get(0),730,70);
        addObject(malos.get(2),250,370);
        
        malos.get(1).setSpeed(7.0);
        malos.get(0).setSpeed(7.0);
        malos.get(2).setSpeed(7.0);
        
        TInicio = ti;
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
            
        if(jugador.getMonedas() >= 132)
        {
            Greenfoot.delay(2);
            cancion.stop();
            Greenfoot.setWorld(new W3(jug,jugador,TInicio));
        }
    }
    
    /**
     * Metodo encargado de imprimir las monedas
     */
    public void imprimeTexto(int monedas)
    {
        super.imprimeTexto(monedas);
    }
    
    /**
     * Metodo encargado de insertar los rectangulos en el mundo
     */
    private void insertRectangles()
    {
        addObject(new Rectangle(2),160,430);
        addObject(new Rectangle(2),640,130);
        addObject(new Rectangle(4),400,130);
        
        Rectangle r1 = new Rectangle(2);
        addObject(r1,310,280);
        r1.turn(90);
        
        Rectangle r2 = new Rectangle(2);
        addObject(r2,490,280);
        r2.turn(90);
        
        addObject(new Rectangle(3),640,370);
        addObject(new Rectangle(3),160,190);
        addObject(new Rectangle(4),400,430);
        
    }
    
    /**
     * Metodo encargado de insertar las monedas en el mundo
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
       
        addObject(new Moneda(),490,190);
        addObject(new Moneda(),310,190);
        addObject(new Moneda(),490,370);
        addObject(new Moneda(),310,370);
        
        for(int i=0;i<2;i++)
        {
            addObject(new Moneda(),130+60*i,310);
        }
        
        for(int i=0;i<2;i++)
        {
            addObject(new Moneda(),130+60*i,370);
        }
        
        for(int i=0;i<2;i++)
        {
            addObject(new Moneda(),610+60*i,190);
        }
        
        for(int i=0;i<2;i++)
        {
            addObject(new Moneda(),610+60*i,250);
        }
        
        for(int i=0;i<4;i++)
        {
            addObject(new Moneda(),430,370-60*i);
        }
        
        for(int i=0;i<4;i++)
        {
            addObject(new Moneda(),370,370-60*i);
        }
    }
}
