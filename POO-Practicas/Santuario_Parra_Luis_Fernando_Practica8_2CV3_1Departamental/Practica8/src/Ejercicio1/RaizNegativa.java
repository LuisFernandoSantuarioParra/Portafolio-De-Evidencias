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
public class RaizNegativa extends Exception {
        
    public RaizNegativa(){
    this("No se puede");
    }
     public RaizNegativa(String str){
    super(str + " obtener una raiz negativa pues es imaginaria");
     }
    
    
}
