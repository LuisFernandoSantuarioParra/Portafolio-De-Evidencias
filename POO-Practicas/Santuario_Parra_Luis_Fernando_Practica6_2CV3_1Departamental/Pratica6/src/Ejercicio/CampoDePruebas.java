/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author LuisFernando
 */
public class CampoDePruebas {
    
 public static void main(String[] args){
    Maestro m=new Maestro();
   m.lanzarHabilidad("Lanza Llamas");
    
    Avatar A =new Avatar();
    A.lanzarHabilidad();
    for(int a=1; a<8;a++){
    System.out.println("Lanzando: "+a);
    A.lanzarHabilidad(a);
    }
 }
 
}
