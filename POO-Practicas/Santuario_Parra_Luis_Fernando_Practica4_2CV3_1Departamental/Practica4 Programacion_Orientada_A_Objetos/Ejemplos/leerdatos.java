/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

/**
 *
 * @author LuisFernando
 */
import java.io.*;

 

public class leerdatos {

public String leer(){

String s="";

DataInputStream sd = new DataInputStream(System.in);

System.out.flush();

try

{

s = sd.readLine();

}

catch(IOException e)

{

System.out.println("ERROR: Se introdujo el dato");

System.out.println(e);

}

return s;

}

public  void correr (  ){

char ca;

String cadena;

int ban = 0;

float a = (float)0.0;//, b;

Float af;//, bf;

 

while( ban!=1 ) {

System.out.print( "Introduzca un flotante :: " );

cadena = leer();

ca = cadena.charAt(0);

if( ca!='\r' ) {

af = Float.valueOf( cadena );

a += af.floatValue();

}

else ban = 1;

}

System.out.print( "La suma de sus n£meros es :: " + a );

}

}

 