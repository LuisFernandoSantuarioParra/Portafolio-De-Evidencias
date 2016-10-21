/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desbordamiento;

/**
 *
 * @author LuisFernando
 */
import java.awt.*;
import java.applet.*;

public class ErrorDeDesbordamiento extends Applet {

ErrorApplet error = new ErrorApplet ();
public void init() {
	        
		error.positivo();
		error.negativo();
    }
	
	public void paint (Graphics g)	{
		
		g.drawString ("positivo contiene: " + error.positivo(), 5, 25);
		g.drawString ("negativo contiene: " + error.negativo(), 5, 40);

	}
}
