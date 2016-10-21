/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;


import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author LuisFernando
 */
public class Archivo {
    private String buffer="";
    private String mensaje;
    private boolean bandera=false;
    
    public Archivo(){
    buffer="";
    mensaje="";
    }
    public Archivo(Archivo a){
    a.buffer=buffer;
    a.mensaje=mensaje;
    }
    public Archivo(String buff,String men){
    buff=buffer;
    men=mensaje;
    }
    public void crearDocumento(Nombrar n,Texto t){
    
    try{
    File archivo=new File(n.pasarNombre());
    
        try (FileWriter escribir = new FileWriter(archivo,true)) {
            escribir.write(t.introducirTexto());
        }
    JOptionPane.showMessageDialog(null, "¡Archivo Creado!");
    }catch(IOException | HeadlessException e){
     JOptionPane.showMessageDialog(null, "¡Archivo no Creado!");
     bandera=true;
     }
  }
    
public void cargarDocumento(Nombrar n){
    try{
FileReader lector=new FileReader(n.obtenerNombre());

//El contenido de lector se guarda en un BufferedReader
 BufferedReader contenido=new BufferedReader(lector);

//Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
while((buffer=contenido.readLine())!=null){
 mensaje=buffer;
 }
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null, "¡Error al leer!");
}
    }
 public void destuir(){
    buffer=null;
    mensaje=null;
     System.gc();
    }
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
