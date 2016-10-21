/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HolaMundoApplet;

import java.applet.*;
import java.awt.*;
/**
 *
 * @author LuisFernando
 */
public class HolaMundoApplet extends Applet { 
    
    private  String Saludo="Hola Mundo Esto es Java, Primera Practica de POO";
    
    @Override
    public void paint( Graphics g ) {
        // Despliega en un entorno grafico "Hola Mundo Java en Applet!"
        g.drawString( Saludo, 50, 25 );
    }
}
