/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraPila;

/**
 *
 * @author LuisFernando
 */
import java.io.*;
import java.util.*;

public class Calculadora {

    private String cadena,cadenamod,cadenamod2;
    private char identificador;
    private Float af;
    private float num ;
    private float X ;
    private int contador;
    private String[] cadenaM = new String[20];
     Stack pil = new Stack();
     Stack pil2 = new Stack();
public Calculadora(){
num=0;
X=0;
contador=0;
identificador='\0';
}
public Calculadora(Calculadora c){
num=c.num;
X=c.X;
contador=c.contador;
identificador=c.identificador;
}
public Calculadora(int c,float nam,float var,char id){
num=nam;
X=var;
contador=c;
identificador=id;
}


    public void solicitarInfo(){
   int i=0;
   System.out.println("A continuacion se muestran las instrucciones para utilizar el programa");
   System.out.print("Introdusca >>  para terminar.\n");
   System.out.println( "Introduzca un operador(+,-,/,*) seguido de un numero : " );
   while(true){
    System.out.println( "Valor: " );
cadena=leer();
     
    if(cadena.equals("<<")){
  System.out.print( "Vuelta de carro detectado, imprimiendo resultado: \n" );
   i=1;
   break;
   }  // fin del if
         pil.push(cadena);// de esta extraere lo operadores y operandos
         pil2.push(cadena);// esta imprimira el resultado

       
    contador++;
   }

    }
    public void enviarInfo(){
   
    af = Float.valueOf( cadenamod );
    num += af.intValue();
    procesa(num,identificador);
    }

public String extraer(){
    int aux=0;
    int size;
    while(aux<contador){
    cadenamod=String.valueOf(pil.pop());

    size=cadenamod.length();
    identificador = cadenamod.charAt(0);

    if(aux==0 &&(identificador=='/'||identificador=='*'||identificador=='>')){
        X=1;

    }
    if((cadenamod.charAt(0)!='+')&&cadenamod.charAt(0)!='>'&&(cadenamod.charAt(0)!='*')&&(cadenamod.charAt(0)!='/')&&(cadenamod.charAt(0)!='-')){
    System.out.print("Operacion no encontrada en '"+cadenamod+"'\n\n");
    System.exit(0);
    }

    if((cadenamod.charAt(0)=='>')&&(cadenamod.charAt(1)=='>')){
    cadenamod2 = cadenamod.substring(2,size);
    cadenamod=cadenamod2;
identificador ='>';
       }
    else{
 cadenamod = cadenamod.substring(1,size);
    }
    af = Float.valueOf(cadenamod );
    num += af.floatValue();
    procesa(num,identificador);
    num=0;
    aux++;
    }
return cadenamod;
}



 public void procesa(float num,char identificador){
int x,x2,x3;
        switch(identificador){
case '>':
x=Math.round(X);
x2=Math.round(num);
x3=(x>>x2);
X=(float)x3;

break;
case '*':
    X*=num;
    
    break;
case '+':
    X+=num;
    
    break;
case '-':
    X-=num;
  
    break;
case '/':
   
    X/=num;
    
break;

default:
    System.out.print("Default");
    break;
        }

    }


public void mostrarResultado(){
System.out.print("El resultado de sus operaciones X= ");
System.out.print( X+"\n\n");
   
}

public  String leer(){
String s="";
DataInputStream sd = new DataInputStream(System.in);
System.out.flush();
try{
s = sd.readLine();
}
catch(IOException e){
System.out.println("ERROR: Se introdujo el dato");
System.out.println(e);
}
return s;
}
public void destruir(){
num=0;
X=0;
contador=0;
identificador='\0';
System.gc();
}


}

