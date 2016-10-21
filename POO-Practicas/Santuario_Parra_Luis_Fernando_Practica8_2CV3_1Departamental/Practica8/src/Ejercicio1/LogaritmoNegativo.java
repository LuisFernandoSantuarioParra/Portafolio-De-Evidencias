/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author LuisFernando
 */
public class LogaritmoNegativo extends Exception {
        
    public LogaritmoNegativo(){
    this("No se puede");
    }
     public LogaritmoNegativo(String str){
    super(str + " obtener un logaritmo negativo o igual a cero ya que el domininio de los logaritmos son los reales positivos menos el 0");
     }
    
    
}
