/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraPila;

/**
 *
 * @author LuisFernando
 */
public class Provador {
    public static void main (String[] args){
    Calculadora cal= new Calculadora();
    cal.solicitarInfo();
    cal.extraer();
    cal.mostrarResultado();
    cal.destruir();
            }
}
