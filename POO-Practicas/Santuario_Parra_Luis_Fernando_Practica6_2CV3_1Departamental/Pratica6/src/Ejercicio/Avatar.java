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
public class Avatar extends Maestro implements IMaestriasElementales, IMetalControl,ISangreControl  {
 
    public Avatar(){
    
     this("El equilibrio de los elementos");
    
    }
    public Avatar(String maestria){
    super(maestria);
        System.out.println(maestria);
    
    }
    public Avatar(Avatar a){
    super(a);
    }
    @Override
    public void controlarMetal() {
        System.out.println("Espiritu del Metal: Loto de acero mortal");
    }

    @Override
    public void controlarTierra() {
        System.out.println("Espiritu de Tiera: Grieta del abismo ");
    }

    @Override
    public void controlarSangre() {
        System.out.println("Espiritu de Sangre: Destruccion Organica");
    }

    @Override
    public void controlarAgua() {
        System.out.println("Espiritu de agua: Gran Dragon de Mar");
    }

    @Override
    public void controlarAire() {
       System.out.println("Espiritu de viento: Tornado de cuchillas");
    }
    

    @Override
    public void controlarFuego() {
     System.out.println("Espiritu de fuego: Incineracion del alma");
    }
    
    @Override
    public void cambiarHabilidad(int habilidad) {
        String maestria;
        
        switch(habilidad){
            
            case 1:
                maestria="Aire Control";
                System.out.println("Cambiando habilidad por :"+maestria);
                controlarAire();
                
                
            break;
            case 2:
                maestria="Tierra Control";
                System.out.println("Cambiando habilidad por :"+maestria);
                controlarTierra();
                
                
            break;
            case 3:
                maestria="Agua Control";
                System.out.println("Cambiando habilidad por :"+maestria);
                 controlarAgua();
            break;
            case 4:
                maestria="Fuego Control";
                System.out.println("Cambiando habilidad por :"+maestria);
                controlarFuego();
            break;
            case 5:
                maestria="Metal Control";
                System.out.println("Cambiando habilidad por :"+maestria);
                controlarMetal();
            break;
            case 6:
                maestria="Sangre Control";
                System.out.println("Cambiando habilidad por :"+maestria);
                controlarSangre();
            break;
            default:
             maestria="Avatar";
             System.out.println("Cambiando habilidad por :"+maestria);
             System.out.println("Explosion chain skills");
             controlarSangre();
             controlarMetal();
             controlarAgua();
             controlarTierra();
             controlarFuego();
             controlarAire();
                break;
        }
    }

 public void lanzarHabilidad(int habilidad ){
 cambiarHabilidad(habilidad);
 }
public void destruir(){
super.drestruir();
}
}
