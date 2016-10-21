/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Olimpliadas;


import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author LuisFernando
 */
public class Dibujar {
    public void ilustrar(){
 System.out.println("Comienza main()...");
 Circulo c = new Circulo(2.0, 2.0, 4.0);
 System.out.println("Radio ="+c.r +"unidades.");
System.out.println("Centro = (" + c.x + "," + c.y + ") unidades.");
 Circulo c1 = new Circulo(1.0, 1.0, 2.0);
 Circulo c2 = new Circulo(0.0, 0.0, 3.0);
 c = c1.elMayor(c2);
 System.out.println("El mayor radio es " + c.r + ".");
 c = new Circulo(); // c.r = 0.0;
 c = Circulo.elMayor(c1, c2);
 System.out.println("El mayor radio es " + c.r + ".");
 VentanaCerrable ventana =
 new VentanaCerrable("Ventana abierta al mundo...");
 ArrayList v = new ArrayList();
 CirculoGrafico cg1 = new CirculoGrafico(200, 200, 100, Color.blue);
 CirculoGrafico cg3 = new CirculoGrafico(410, 200, 100, Color.black);
 CirculoGrafico cg5 = new CirculoGrafico(620, 200, 100, Color.red);
 CirculoGrafico cg4 = new CirculoGrafico(300, 340, 100, Color.yellow);
 CirculoGrafico cg2 = new CirculoGrafico(510, 340, 100, Color.green);
 
 RectanguloGrafico rg = new
 RectanguloGrafico(80, 80, 740, 460, Color.green);
 v.add(cg1);
 v.add(cg2);
 v.add(cg3);
 v.add(cg4);
 v.add(cg5);
 v.add(rg);
 PanelDibujo mipanel = new PanelDibujo(v);
 ventana.add(mipanel);
 ventana.setSize(850, 600);
 ventana.setVisible(true);
 System.out.println("Termina main()...");
}
}
