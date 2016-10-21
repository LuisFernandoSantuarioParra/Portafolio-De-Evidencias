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
public class Buscar {
    String nombre;
    public Buscar(String nombre){
    this.nombre=nombre;
    }
    public Buscar(Buscar b){
    b.nombre=nombre;
    }
    public Buscar(){
    nombre="";
    }
     public String NombrarAnimal(){
    return nombre;
    }
   public void destruir(){
    nombre=null;
    System.gc();
    }
}
