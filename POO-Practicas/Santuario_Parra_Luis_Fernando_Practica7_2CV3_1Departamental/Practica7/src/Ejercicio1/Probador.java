/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author LuisFernando
 */
public class Probador {
     public static void main(String[] args) {
        // TODO code application logic here
        Newton newtonRaphson = new Newton(new Funciones(), -1.0, 8.0, 1E-15);
	System.out.println("Raíz: " + newtonRaphson.encontrarRaiz());
    }
}
