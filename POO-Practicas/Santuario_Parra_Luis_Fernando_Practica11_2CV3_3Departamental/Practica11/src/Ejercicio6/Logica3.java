/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author LuisFernando
 */
public class Logica3 {
public void copiar(String [] O,String [] D){
    String origen = O[0];
    String destino = D[1];
File or = new File(origen);
                File de= new File(destino);

                try {
                        InputStream in = new FileInputStream(or);
                        OutputStream out = new FileOutputStream(de);
                                
                        byte[] buf = new byte[1024];
                        int len;

                        while ((len = in.read(buf)) > 0) {
                                out.write(buf, 0, len);
                        }
                
                        in.close();
                        out.close();
                } catch (IOException ioe){
                        ioe.printStackTrace();
                }
}    
}
