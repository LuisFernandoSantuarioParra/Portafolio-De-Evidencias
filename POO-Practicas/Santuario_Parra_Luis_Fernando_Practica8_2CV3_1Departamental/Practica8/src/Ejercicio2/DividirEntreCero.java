/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;



/**
 *
 * @author LuisFernando
 */
public class DividirEntreCero extends Exception {
        
    public DividirEntreCero(){
    this("No se puede");
    }
     public DividirEntreCero(String str){
    super(str + " Dividir entre 0");
     }
    
    
}
