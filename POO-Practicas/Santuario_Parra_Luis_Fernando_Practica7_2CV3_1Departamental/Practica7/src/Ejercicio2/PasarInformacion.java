/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;


import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author LuisFernando
 */
public class PasarInformacion  {
 private String mensaje;
 private String buffer="";
 public PasarInformacion(){
mensaje="";
buffer="";
}
 public PasarInformacion(PasarInformacion p){
p.mensaje=mensaje;
p.buffer=mensaje;
}
public PasarInformacion(String buf,String men){
mensaje=men;
buffer=buf;
}

    
public void cargarDocumento(Buscar b){
try{
FileReader lector=new FileReader(b.NombrarAnimal());

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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public void destruir(){
     mensaje=null;
     buffer=null;
     System.gc();
    }

}
