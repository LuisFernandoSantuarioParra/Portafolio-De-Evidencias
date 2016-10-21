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
public class ArregloFueraDeLimite extends Exception {
        
    public ArregloFueraDeLimite(){
    this("No se puede");
    }
     public ArregloFueraDeLimite(String str){
    super(str + " copiar un arreglo mas grande en uno de menor longitud");
     }
    
    
}
