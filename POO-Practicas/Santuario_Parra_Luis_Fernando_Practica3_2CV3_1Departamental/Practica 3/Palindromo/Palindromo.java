/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Palindromo;

import java.util.Scanner;

/**
 *
 * @author LuisFernando
 */
public class Palindromo {
   private String palabra ; 
   
    public Palindromo(){
    palabra="";
    }
    public Palindromo(String cadena ) {
        palabra = cadena;
    }
    public Palindromo( Palindromo p ) {
        palabra = p.palabra;
    }
  
   public boolean comparar(String Palabra){
    for(int i=0;i<palabra.length();i++){
      if(Palabra.charAt(i)!=Palabra.charAt(Palabra.length() -i -1)){
        return false;
      }
    }
   return true;
   }
   
   public void introducir (){
   Scanner lector=new Scanner(System.in);
   
   System.out.println("Ingrese los valores del palindromo: ");
   
   palabra=lector.nextLine();
   
   if(comparar(palabra)==true){
   System.out.println("La cadena "+ palabra +" Si es un palindromo");
   }
   else{
   System.out.println("La cadena "+ palabra +" No un palindromo");
   }
}
   public void destructor(){
     palabra=null;
       System.gc();
   }
}