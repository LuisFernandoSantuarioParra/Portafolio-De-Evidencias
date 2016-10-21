/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo;

/**
 *
 * @author LuisFernando
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.LineNumberInputStream;

/**
 *
 * @author LuisFernando
 */
    public class Contador {
    private LineNumberInputStream lineNumberInputStream;
    private FileInputStream fileInputStream;
    private String [] args;

    //Constructores
        public Contador() {
        }

        public Contador(String [] args) {
            this.args = args;
        }

        public Contador(Contador lineCounter) { 
            this(lineCounter.args);
        }

    private void leerArchivo() {
        try {
            fileInputStream = new FileInputStream(args[0]);
            lineNumberInputStream = new LineNumberInputStream (fileInputStream);
        } catch (FileNotFoundException e) {
            System.err.println("Error al Leer Archivo "+ args[0]);
            System.exit(-1);
        }
    }

    public void contarLineas() {
        leerArchivo();
        try {  
            while( lineNumberInputStream.read() != -1) {
            
            }
        }
        catch (IOException e){
            System.err.println("Error al Leer el archivo"+ args[0]);
            System.exit(-1);
        }
        System.out.println("El número de líneas es:" + lineNumberInputStream.getLineNumber());
    }   
}

