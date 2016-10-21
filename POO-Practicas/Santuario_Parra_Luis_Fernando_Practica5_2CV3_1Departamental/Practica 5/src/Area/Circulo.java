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
 public class Circulo extends Geometria {
 private int numCirculos = 0;
 private static final double PI=3.14159265358979323846;
 private double x, y, r;
 
 public Circulo(double x, double y, double r) {
 this.x=x;
 this.y=y; 
 this.r=r;
 numCirculos++;
 }
 public Circulo(Circulo c){
 x=c.x;
 y=c.y;
 r=c.r;
 numCirculos=c.numCirculos;
 }
 public Circulo(double r) { 
     this.r=r;
 }
 @Override
 public double perimetro() { 
     return 2.0 * PI * r;
 }
 @Override
 public double area() { 
     return PI *r *r;
 }
 // método de objeto para comparar círculos
 public Circulo elMayor(Circulo c) {
 if (this.r>=c.r) return this; 
 else 
   return c;
 }
 // método de clase para comparar círculos
 public static Circulo elMayor(Circulo c, Circulo d) {
 if (c.r>=d.r) return c;
 else 
     return d;
 }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public void destruir(){
    x=0;
    y=0;
    r=0;
    numCirculos=0;
    }
 
 } // fin de la clase Circulo
