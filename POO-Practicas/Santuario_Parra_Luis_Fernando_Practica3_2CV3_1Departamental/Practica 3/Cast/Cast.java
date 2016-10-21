/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cast;

/**
 *
 * @author LuisFernando
 */
public class Cast {
    private byte enterop;
    private short enteroc;
    private int entero;
    private long enterol;
    private float realc;
    private double reall;


    public Cast (){
    enterop=0;
    enteroc=0;
    entero=0;
    enterol=0;
    realc=0;
     
    }
    public Cast(byte ent,short enterp,int enter,long enterl,float realf,double reald,char cara,boolean est){
    enterop=ent;
    enteroc=enterp;
    entero=enter;
    enterol=enterl;
    realc=realf;
    reall=reald;
   
    }
    public Cast(Cast d){
    enterop=d.enterop;
    enteroc=d.enteroc;
    entero=d.entero;
    enterol=d.enterol;
    realc=d.realc;
    reall=d.reall;
   
    }
    public void casting(){
    enterop=127;
    enteroc=32767;
    entero=2147483647;
    enterol= Long.MAX_VALUE;
    realc=Float.MAX_VALUE;
    reall=1.7976931348623157E308;
    
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    
    System.out.println("Casteo de los datos: ");
    
    System.out.println("Byte valor: "+enterop);
    System.out.println("Byte con casting a short: "+(s=(short)enterop));
    System.out.println("Byte con casting a int: "+(i=(int)enterop));
    System.out.println("Byte con casting a long: "+(l=(long)enterop));
    System.out.println("Byte con casting a float: "+(f=(float)enterop));
    System.out.println("Byte con casting a double: "+(d=(double)enterop));
    
    System.out.println("Short valor: "+enteroc);
    System.out.println("Short con casting a byte: "+(b=(byte)enteroc));
    System.out.println("Short con casting a int: "+(i=(int)enteroc));
    System.out.println("Shortcon casting a long: "+(l=(long)enteroc));
    System.out.println("Short con casting a float: "+(f=(float)enteroc));
    System.out.println("Short con casting a double: "+(d=(double)enteroc));
    
    System.out.println("Entero valor: "+entero);
    System.out.println("Entero con casting a byte: "+(b=(byte)entero));
    System.out.println("Entero con casting a short: "+(s=(short)entero));
    System.out.println("Entero con casting a long: "+(l=(long)entero));
    System.out.println("Entero con casting a float: "+(f=(float)entero));
    System.out.println("Entero con casting a double: "+(d=(double)entero));
    
    System.out.println("Long valor: "+enterol);
    System.out.println("Long con casting a byte: "+(b=(byte)enterol));
    System.out.println("Long con casting a short: "+(s=(short)enterol));
    System.out.println("Long con casting a int: "+(i=(int) enterol));
    System.out.println("Long con casting a float: "+(f=(float)enterol));
    System.out.println("Long con casting a double: "+(d=(double)enterol));
    
    System.out.println("Float valor: "+realc);
    System.out.println("Float con casting a byte: "+(b=(byte)realc));
    System.out.println("Float con casting a short: "+(s=(short)realc));
    System.out.println("Float con casting a int: "+(i=(int) realc));
    System.out.println("Float con casting a long: "+(l=(long)realc));
    System.out.println("Float con casting a double: "+(d=(double)realc));
    
    System.out.println("Double valor: "+reall);
    System.out.println("Double con casting a byte: "+(b=(byte)reall));
    System.out.println("Double con casting a short: "+(s=(short)reall));
    System.out.println("Double con casting a int: "+(i=(int) reall));
    System.out.println("Double con casting a long: "+(l=(long)reall));
    System.out.println("Double con casting a float: "+(f=(float)reall));
    }
    public void destructor (){
    enterop=0;
    enteroc=0;
    entero=0;
    enterol=0;
    realc=0;
    reall=0;
    System.gc();
   }
    
    }

