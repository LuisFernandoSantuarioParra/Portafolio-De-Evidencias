/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;




import Ejercicio1.Control.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
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
    public void crearArchivo(Nombrar n,Nombres ns,Especie es,Familia f,Infraclase i,Clase c,Orden o,Clave cl) throws FileNotFoundException{
    File archivo=new File(n.pasarNombre());
    RandomAccessFile fichero = new RandomAccessFile(archivo, "rw");
        try {
            fichero.seek(fichero.length());
            fichero.writeBytes("\r \n");
            fichero.writeBytes("Numero de clave: ");
            fichero.writeInt(Integer.parseInt(cl.getClave()));
            fichero.writeBytes("\r \n");
            fichero.writeBytes("Nombre(s): ");
            fichero.writeBytes(ns.pasarNombres());
            fichero.writeBytes("\r \n");
            fichero.writeBytes("Especie: ");
            fichero.writeBytes(es.pasarEspecie());
            fichero.writeBytes("\r \n");
            fichero.writeBytes("Familia: ");
            fichero.writeBytes(f.pasarFamilia());
            fichero.writeBytes("\r \n");
            fichero.writeBytes("Clase :");
            fichero.writeBytes(c.pasarClase());
            fichero.writeBytes("\r \n");
            fichero.writeBytes("Infraclase: ");
            fichero.writeBytes(i.pasarInfraclase());
            fichero.writeBytes("\r \n");
            fichero.writeBytes("Orden: ");
            fichero.writeBytes(o.pasarOrden());
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
}
