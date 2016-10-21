/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Area;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author LuisFernando
 */
public class LineaGrafica  extends Linea implements Dibujable {
// nueva variable miembro
 Color color;
 // constructor
 public LineaGrafica(double x1, double y1, double x2, double y2,Color unColor) {
 // llamada al constructor de Rectangulo
 super(x1,y1,y2,x2);
 this.color = unColor; // en este caso this es opcional
 }
 // métodos de la interface Dibujable
 public void dibujar(Graphics dw) {
 dw.setColor(color);
 dw.drawLine(10, 100, (int)longitud(), 100);
 }
 public void setPosicion(double x, double y) {
  // método vacío, pero necesario de definir
 }
}
