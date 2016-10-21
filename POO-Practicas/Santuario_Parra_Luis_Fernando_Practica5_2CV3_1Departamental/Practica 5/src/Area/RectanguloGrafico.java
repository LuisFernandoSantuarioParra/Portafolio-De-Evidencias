/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Area;

/**
 *
 * @author LuisFernando
 */


 import java.awt.Graphics;
 import java.awt.Color;
public  class RectanguloGrafico extends Rectangulo implements Dibujable {
// nueva variable miembro
 Color color;
 // constructor
 public RectanguloGrafico(double x1, double y1, double base, double altura,Color unColor) {
 // llamada al constructor de Rectangulo
     super (x1, y1,base, altura);
 this.color = unColor; // en este caso this es opcional
 }
 // métodos de la interface Dibujable
 public void dibujar(Graphics dw) {
 dw.setColor(color);
 dw.drawRect(10, 150, (int)(getBase()),(int)(getAltura()));
 }
 public void setPosicion(double x, double y) {
  // método vacío, pero necesario de definir
 }
 
 } // fin de la clase RectanguloGrafico