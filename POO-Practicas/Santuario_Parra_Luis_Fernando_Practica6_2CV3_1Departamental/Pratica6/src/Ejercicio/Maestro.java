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
public class Maestro {
    private String habilidad;
    
    public Maestro(){
    this("El equilibrio de los elementos");
    }
    public Maestro(String maestria){
    habilidad=maestria;
    System.out.println(habilidad);
    }
    public Maestro(Maestro m){
    habilidad=m.habilidad;
    }
    public void cambiarHabilidad(String cual){
    habilidad=cual;
    }
    
    public void lanzarHabilidad(){
    System.out.println("Kiai!!!");
    }
    public void lanzarHabilidad(String habilidad){
    lanzarHabilidad();
    System.out.println(""+ habilidad);
    
    }
    public void drestruir(){
    habilidad=null;
    System.gc();
    }
}
