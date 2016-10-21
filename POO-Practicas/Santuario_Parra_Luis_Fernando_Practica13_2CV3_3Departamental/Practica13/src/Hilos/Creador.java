package Hilos;

import java.awt.EventQueue;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class Creador {

    public static void main(String[] args) throws BasicPlayerException, Exception {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Reproductor y=new Reproductor();
        y.AbrirFichero("C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\Practica13\\src\\nyan\\Nyan.mp3");
        y.Play();
                    new PistaDeCarreras();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
