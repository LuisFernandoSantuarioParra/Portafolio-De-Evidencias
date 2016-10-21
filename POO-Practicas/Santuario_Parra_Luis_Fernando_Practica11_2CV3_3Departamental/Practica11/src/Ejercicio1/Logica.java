package Ejercicio1;

import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LuisFernando
 */
public class Logica {
 
 public void comprobar(String[] archivo){
     if(archivo.length>1)
     System.out.println("Introdusca solo un nombre de archivo.");
     else
     if(archivo.length<1)
     System.out.println("Introdusca un nombre de archivo.");
     else
      if(archivo.length==1){
      String nombre=archivo[0];
      File fichero = new File(nombre);
      if (fichero.exists()){
      System.out.println("El fichero " + nombre + " existe");
      System.out.println("El nombre del fichero es: "+fichero.getName() );
      System.out.println("La longitud del fichero es: "+fichero.length() );
      }
      else
       System.out.println("El fichero " + nombre + " no existe");
    if (fichero.exists()){
    if (fichero.canRead()){
    System.out.println("El fichero existe y se puede leer");
    }
   if (fichero.canWrite()){
    System.out.println("El fichero existe y se puede escribir en él");
   }    
   if (fichero.canExecute()){
    System.out.println("El fichero existe y se puede ejecutar");
      }
   
    } 
      
   }
 }
}
