/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

/**
 *
 * @author LuisFernando
 */
public class Probador {
public static void main(String[] args){
DosDim dos=new DosDim();
Matrix ma = new Matrix();
tresDMatriz three = new tresDMatriz();
System.out.println("Dos Dimenciones");
dos.bidimencion();
System.out.println();
System.out.println("Matriz");
ma.Matriz();
System.out.println();
System.out.println("Tres dimenciones");
three.arreglo3D();

}    
}
