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
public class PasarAnimales  implements IAnimales{
private String imagen;
public PasarAnimales(){
    imagen="";
   
    }
    public PasarAnimales(String I1){
    imagen=I1;
    
    }
     public PasarAnimales(PasarAnimales I){
    imagen=I.imagen;
    
    }
     
    @Override
    public String introducirLobo() {
    imagen="C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\Practica7\\src\\Imagenes\\lobo.jpg";
    return imagen;
    }

    @Override
    public String introducirZorro() {
    imagen="C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\Practica7\\src\\Imagenes\\zorro.jpg";
    return imagen;
    }

    @Override
    public String introducirPerro() {
    imagen="C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\\\Practica7\\src\\Imagenes\\perro.jpg";
    return imagen;
    }

    @Override
    public String introducirGato() {
    imagen="C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\Practica7\\src\\Imagenes\\gato.jpg";
    return imagen;
    }

    @Override
    public String introducirLeon() {
    imagen="C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\Practica7\\src\\Imagenes\\leon.jpg";
    return imagen;
    }

    @Override
    public String introducirHormiga() {
    imagen="C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\Practica7\\src\\Imagenes\\hormiga.jpg";
    return imagen;
    }

    @Override
    public String introducirPato() {
    imagen="C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\Practica7\\src\\Imagenes\\pato.jpg";
    return imagen;
    }

    @Override
    public String introducirJirafa() {
    imagen="C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\Practica7\\src\\Imagenes\\jirafa.jpg";
    return imagen;
    }

    @Override
    public String introducirPeña() {
    imagen="C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\Practica7\\src\\Imagenes\\peña.jpg";
    return imagen;
    }

    @Override
    public String introducirBurro() {
    imagen="C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\Practica7\\src\\Imagenes\\burro.jpg";
    return imagen;
    }

    @Override
    public String introducirHumano() {
    imagen="C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\Practica7\\src\\Imagenes\\humano.jpg";
    return imagen;
    }
   
    
public void destruir(){
    imagen=null;
    System.gc();
    }
}
