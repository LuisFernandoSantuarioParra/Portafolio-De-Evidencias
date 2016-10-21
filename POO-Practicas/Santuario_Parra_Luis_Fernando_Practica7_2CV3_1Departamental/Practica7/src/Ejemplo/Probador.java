/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo;

/**
 *
 * @author LuisFernando
 */
public class Probador {
    public static void main(String[] args) {
        if( args.length != 1) {
            System.err.println("Error en el contador " + args.toString());
            System.exit(-1);
        }
        else {
            new Contador(args).contarLineas();
        }
    }
}
