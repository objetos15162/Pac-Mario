import greenfoot.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.lang.IndexOutOfBoundsException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 * Write a description of class Archivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Archivo extends Actor 
{
    ArrayList<String> aPuntos = new ArrayList<String>();
    ArrayList<String> aNombre = new ArrayList<String>();
    String sTexto;
    GreenfootImage newImage = new GreenfootImage(400,250);
    /**
     * Constructor for objects of class Archivo
     */
    public Archivo(int op)
    {
        iniciate(op);
    }
    
    public Archivo(String nombre,int pts)
    {
        iniciate(1);
        separaCadena();
        ordenaRecords(nombre,pts);
        write();
    }
    
    /**
     * Metodo encargado de inicializar los archivos de texto
     */
    private void iniciate(int op)
    {
        setImage(newImage);
        try{ 
            if(op<1)
                sTexto = leeArchivo("ayuda.txt");
            else
                sTexto = leeArchivo("records.txt");
        }
        catch(Exception e){
            System.out.println(" " + e.getMessage());
        }
        
        GreenfootImage newImage = getImage();
        newImage.clear();
       
        Font f= new Font("Ethnocentric",Font.PLAIN , 32);
        newImage.setFont(f);
        
        Color c=new Color(127,127,127,127);
        newImage.setColor(c);
        newImage.fill();
        newImage.setColor(Color.black);
        
        //newImage.drawString(sTexto, 400, 300);
        setImage(newImage);
    }
    
    /**
     * Metodo encargado de letura de archivo de texto
     */
    private String leeArchivo(String nArchivo) throws FileNotFoundException, IOException
    {
        String sArchivo = "";
        String cadena = "";
        FileReader f;
        BufferedReader b;
      
        try{
            f = new FileReader(nArchivo);
        }
        catch(Exception e){
            throw new FileNotFoundException("No se encontro el archivo");
        }
        
        try{ 
            b = new BufferedReader(f);
        }
        catch(Exception e){
            throw new IOException("Hubo un error en la lectura del archivo");
        }
        
        while((cadena = b.readLine())!=null) 
        {
            sArchivo += cadena+"\n";
        }
        b.close();
        return sArchivo;
      
    }
    
    /**
     * Metodo encargado de escribir en el archivo de texto
     */
    private void write()
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("records.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 5; i++)
                pw.println(aNombre.get(i) + "                        " + aPuntos.get(i));

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally 
        {
           try 
           {
               if (null != fichero)
                    fichero.close();
           } 
           catch (Exception e2) 
           {
               e2.printStackTrace();
           }
        }
    }
    
    /**
     * Metodo encargado de separar las cadenas de texto
     */
    private void separaCadena()
    {
        StringTokenizer st = new StringTokenizer(sTexto,"\n");
        
        String x = "";
        String nomb = "";
        String pts = "";
        int i = 0;
        while(st.hasMoreTokens())
        {
            try
            {
                x = st.nextToken();
                nomb = new String(x.substring(0,3)); 
                pts = new String(x.substring(27));
                aNombre.add(nomb);
                aPuntos.add(pts);
            }
            catch(Exception e)
            {
                throw new IndexOutOfBoundsException("Error de rango");
            }
            //System.out.println(x);
            //System.out.println(aNombre.get(i));
            //System.out.println(aPuntos.get(i++));
        }
    }
    
    /**
     * Metodo encargado de ordenar ascendentemente los puntajes
     */
    public void ordenaRecords(String nombre,int pts)
    {
        int i,x;
        int band=0;
        String puntos = Integer.toString(pts);
        for(i=0;band<1 && i<5;i++)
        {
            x = Integer.parseInt(aPuntos.get(i));
            if(x<pts)
                band=1;
        }
        i--;
        
        if(i<4)
        {
            for(int j = 3; j >= i;j--)
            {
                aPuntos.set(j+1,aPuntos.get(j));
                aNombre.set(j+1,aNombre.get(j));
            }
        }
        
        aPuntos.set(i,puntos);
        aNombre.set(i,nombre);
    }
    
    /**
     * Metodo encargado de dibujar texto
     */
    public void dibujate(int x,int y)
    {
        newImage.drawString(sTexto, x, y);
    }
    
    /**
     * @return cadena de texto
     */
    public String getTexto()
    {
        return sTexto;
    }
}

