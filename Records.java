import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.StringTokenizer;
/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Records extends Navegacion
{
    Archivo arc;
    /**
     * Constructor for objects of class Records.
     * 
     */
    public Records()
    {
        arc = new Archivo(1);
        muestraTexto();
    }
    
    public Records(String nombre,int pts)
    {
        arc = new Archivo(nombre,pts);
        arc = new Archivo(1);
        muestraTexto();
    }
    
    /**
     * Metodo encargado de imprimir los records
     */
    private void muestraTexto()
    {
        arc = new Archivo(1);
        addObject(arc,400,325);
        
        showText("**Records**",400,180);
        imprime(arc.getTexto());
        showText("Presione ENTER para ir al menú",200,550);
    }
    
    /**
     * Metodo encargado de regresar al menu
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.delay(2);
            Greenfoot.setWorld(new Menu());
        }
    }
    
    
    public void imprime(String texto)
    {
        StringTokenizer st = new StringTokenizer(texto,"\n",true);
        
        for(int i = 220; st.hasMoreTokens(); i+=20)
        {
            showText(st.nextToken()+"\n",400,i);
        }
        //showText(texto,400,300);
    }
}
