/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casilla;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;

/**
 *
 * @author LuisFernando
 */
public class PasarImagen extends Image {
    private String imagen;
    private String imagen2;
    
    public PasarImagen(){
    imagen="";
    imagen2="";
    }
    public PasarImagen(String I1,String I2){
    imagen=I1;
    imagen2=I2;
    }
     public PasarImagen(PasarImagen I){
    imagen=I.imagen;
    imagen2=I.imagen2;
    }
    
    public String introducirApagado() throws IOException{
    imagen2="C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\Practica 5\\src\\Casilla\\off.png";
    return imagen2;
    }
    public String introducirPrendido() throws IOException{
   imagen= "C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\Practica 5\\src\\Casilla\\on.png";
   
   return imagen;
    }
    public void destruir(){
    imagen=null;
    imagen2=null;
    }

    @Override
    public int getWidth(ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHeight(ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImageProducer getSource() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Graphics getGraphics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getProperty(String name, ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
