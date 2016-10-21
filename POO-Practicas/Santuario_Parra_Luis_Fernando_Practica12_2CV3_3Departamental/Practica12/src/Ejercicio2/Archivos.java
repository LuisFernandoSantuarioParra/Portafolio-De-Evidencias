/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import Ejercicio2.Control.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LuisFernando
 */ 
public class Archivos {
   
    public Archivos(){

     }
    public void crearArchivo(Nombrar n,Titulo t,Editorial ed,Autor au,Clave cl) throws FileNotFoundException{
    File archivo=new File(n.pasarNombre());
    RandomAccessFile fichero = new RandomAccessFile(archivo, "rw");
        try {
            fichero.seek(fichero.length());
            fichero.writeBytes("\r \n");
            fichero.writeBytes("Numero de clave: ");
            fichero.writeDouble(cl.getClave());
            fichero.writeBytes("\r \n");
            fichero.writeBytes("Titulo : ");
            fichero.writeBytes(t.pasarTitulo());
            fichero.writeBytes("\r \n");
            fichero.writeBytes("Autor: ");
            fichero.writeBytes(au.pasarAutor());
            fichero.writeBytes("\r \n");
            fichero.writeBytes("Editorial: ");
            fichero.writeBytes(ed.pasarEditorial());
            fichero.writeBytes("\r \n");
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        try {
            fichero.close();
             JOptionPane.showMessageDialog(null, "¡Archivo Creado!");
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "¡Archivo No Creado!");
        }
                
        }
    
    }
    
    public void buscarStrings(Nombrar n,Dato d) throws FileNotFoundException{
    String cadena="";
    File archivo=new File(n.pasarNombre());
    FileReader fichero = new FileReader(archivo);
        try {
        try (BufferedReader reader = new BufferedReader(fichero)) {
            while((cadena=reader.readLine())!=null){
                if((cadena.indexOf(d.pasarDato()))!=-1){
                    JOptionPane.showMessageDialog(null, "¡Cadena encontrada!"+cadena);
                }
    
            }
            
        }
    }   catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}

