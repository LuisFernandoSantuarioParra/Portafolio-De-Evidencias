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
public class Linea extends Geometria {
 // definición de variables miembro de la claes
private  int numLineas = 0;
private double x1,x2,y1,y2;

 // constructores de la clase
 public Linea(double p1x,double p2x, double p1y,double p2y) {
 x1 = p1x;
 y1 = p1y;
 x2 = p2x;
 y2 = p2y;
 numLineas++;
 }
 public Linea(Linea l){
 x1=l.x1;
 x2=l.x2;
 y1=l.y1;
 y2=l.y2;
 numLineas=l.numLineas;
 }
 public Linea(){ 
     this.x1=x1; 
     this.x2=x2; 
     this.y1=y1; 
     this.y2=y2;
 }
 // definición de métodos

 public double longitud() { 
     return (Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
 }
 //metodos get y set
  public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
// destructor
    public void destuir(){
    x1=0;
    x2=0;
    y1=0;
    y2=0;
    numLineas=0;
    }
    @Override
    public double perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   