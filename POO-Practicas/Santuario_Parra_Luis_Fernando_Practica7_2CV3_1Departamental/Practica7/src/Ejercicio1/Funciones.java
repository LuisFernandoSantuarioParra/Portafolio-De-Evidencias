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
public class Funciones implements INewton{
     @Override
    public double funcion(double x) {
        return x*x - 2;
    }
    @Override
    public double funcionDerivada(double x) {
        return 2*x;
    }
}
