/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author LuisFernando
 */
public class Datos {
    private byte enterop;
    private short enteroc;
    private int entero;
    private long enterol;
    private float realc;
    private double reall;
    
    public Datos(){
    enterop=0;
    enteroc=0;
    entero=0;
    enterol=0;
    realc=0;
     
    }
    public Datos(byte ent,short enterp,int enter,long enterl,float realf,double reald,char cara,boolean est){
    enterop=ent;
    enteroc=enterp;
    entero=enter;
    enterol=enterl;
    realc=realf;
    reall=reald;
   
    }
    public Datos(Datos d){
    enterop=d.enterop;
    enteroc=d.enteroc;
    entero=d.entero;
    enterol=d.enterol;
    realc=d.realc;
    reall=d.reall;
   
    }
    
    public void desbordar(){
    enterop=127;
    enteroc=32767;
    entero=2147483647;
    enterol= Long.MAX_VALUE;
    realc=Float.MAX_VALUE;
    reall=1.7976931348623157E308;
    System.out.println("Desbordamiento de los datos: ");
    
    System.out.println("Byte en el maximo valor: "+enterop);
    System.out.println("Byte desbordado: "+(enterop+=1));
    
    System.out.println("Short en el maximo valor: "+enteroc);
    System.out.println("Short desbordado: "+(enteroc+=1));
    
    System.out.println("Entero en el maximo valor: "+entero);
    System.out.println("Entero desbordado: "+(entero+=1));
    
    System.out.println("Long en el maximo valor: "+enterol);
    System.out.println("Long desbordado: "+(enterol+=1));
    
    System.out.println("Float en el maximo valor: "+realc);
    System.out.println("Float desbordado: "+(realc*=1.1));
    
    System.out.println("Double en el maximo valor: "+reall);
    System.out.println("Double desbordado: "+(reall*=1.1));
    
    
    
    }
    public void destructor(){
    enterop=0;
    enteroc=0;
    entero=0;
    enterol=0;
    realc=0;
    reall=0;
       System.gc();
   }
}
