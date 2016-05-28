import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Tercer mundo
 * 
 */
public class W3 extends MyWorld
{
    /**
     * Constructor for objects of class W2.
     * 
     */
    public W3(int op,Jugador player,long ti)
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
        addObject(malos.get(2),310,370);
        
        malos.get(1).setSpeed(8.5);
        malos.get(0).setSpeed(8.5);
        malos.get(2).setSpeed(8.5);
        
        TInicio = ti;
    }
    
    /**
     * Metodo encargado del acto del jugador en el mundo
     */
    public void act()
    {
        imprimeTexto(jugador.getMonedas());
        
        imprimeVidas(jugador.getVidas());
        
        imprimeTiempo();
        
        comeJugador();
        
        checaVidas();
        
        if(jugador.getMonedas() >= 196)
        {
            TFin = System.currentTimeMillis();
            tiempo = TFin - TInicio;
            Greenfoot.delay(2);
            cancion.stop();
            Greenfoot.setWorld(new Lector(((int)tiempo)/1000));
        }
    }
    
    /**
     * Metodo encargado de imprimir las monedas del jugado
     */
    public void imprimeTexto(int monedas)
    {
        super.imprimeTexto(monedas);
    }
    
    /**
     * Metodo encargado de insertar los rectágulos en el mundo
     */
    private void insertRectangles()
    {
        addObject(new Rectangle(2),160,130);
        addObject(new Rectangle(2),220,250);
        addObject(new Rectangle(4),520,190);
        addObject(new Rectangle(4),400,430);
        addObject(new Rectangle(1),640,400);
        
        Rectangle r1 = new Rectangle(2);
        addObject(r1,670,160);
        r1.turn(90);
        
        Rectangle r2 = new Rectangle(2);
        addObject(r2,370,220);
        r2.turn(90);
        
        Rectangle r3 = new Rectangle(3);
        addObject(r3,190,400);
        r3.turn(90);
        
        Rectangle r4 = new Rectangle(2);
        addObject(r4,490,340);
        r4.turn(90);
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
        
        for(int i=0;i<7;i++)
        {
            addObject(new Moneda(),250+60*i,130);
        }
        
        for(int i=0;i<4;i++)
        {
            addObject(new Moneda(),130+60*i,190);
        }
       
        for(int i=0;i<6;i++)
        {
            addObject(new Moneda(),130+60*i,310);
        }
        
        for(int i=0;i<5;i++)
        {
            addObject(new Moneda(),430+60*i,250);
        }
        
        for(int i=0;i<3;i++)
        {
            addObject(new Moneda(),550+60*i,310);
        }
        
        for(int i=0;i<3;i++)
        {
            addObject(new Moneda(),310+60*i,370);
        }
        
        addObject(new Vida(),130,250);
        addObject(new Vida(),310,250);
        addObject(new Moneda(),550,370);
        addObject(new Vida(),550,430);
       //addObject(new Vida(), 550,130);
    }
}