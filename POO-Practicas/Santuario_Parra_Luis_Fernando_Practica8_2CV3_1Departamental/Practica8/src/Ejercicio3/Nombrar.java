/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import javax.swing.JOptionPane;



/**
 *
 * @author LuisFernando
 */



public class Nombrar{
   private String nombre;
   private String boleta;
   
   public Nombrar(Nombrar n){
   n.nombre=nombre;
   }
   public Nombrar(){
   nombre="";
   }
   public Nombrar(String nombre){
   this.nombre=nombre;
   }
   
   
public String pasarNombre() throws BoletaNoIntroducida{
try{
boleta=nombre();
}catch(BoletaNoIntroducida bd){
JOptionPane.showMessageDialog(null,bd.getMessage());
}
return boleta;
}   
public String nombre() throws BoletaNoIntroducida{
if(nombre==null){
throw new BoletaNoIntroducida();
}
else
return nombre;
}
public String obtenerNombre(){
return nombre;
}
public void destruir(){
   nombre=null;
   boleta=null;
    System.gc();
   }
}
