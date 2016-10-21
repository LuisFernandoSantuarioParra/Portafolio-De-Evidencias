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
public class Rectangulo extends Geometria {
 // definición de variables miembro de la claes
 private  int numRectangulos = 0;
 private double  base, altura,x1, y1;
 // constructores de la clase
 public Rectangulo( double p2x, double p2y,double p1x, double p1y) {
base = p1x;
altura = p1y;
 x1 = p2x;
 y1 = p2y;
 numRectangulos++;
 }
 public Rectangulo(){ 
     this.base=base;
     this.altura=altura; 
 }
 public Rectangulo(Rectangulo r){
 base =r.base;
altura = r.altura;
 x1 = r.x1;
 y1 = r.y1;
 numRectangulos=r.numRectangulos;
 
 }
 //gets y sets
  public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
 // definición de métodos
 @Override
 public double perimetro() { return 2.0 * ((base)+(altura)); }
 @Override
 public double area() { return ((base)*(altura)); }
 } // fin de la clase Rectángulo
