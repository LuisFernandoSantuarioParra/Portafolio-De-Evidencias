/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

import java.text.DecimalFormat;

/**
 *
 * @author LuisFernando
 */
public class Generador {
    private String numerosantes = "";
    private int x;
    private int arreglo[];
    DecimalFormat df = new DecimalFormat("0");
    
    public Generador(int x){
    this.x=x;
    }
    
     public void generar(){
         arreglo = new int[x];
        for( int i=0; i<arreglo.length; i++ ) {
            arreglo[i] = (int)( Math.random() * 100000.0);
            numerosantes += df.format(arreglo[i])+", ";
        }   
}

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public String getNumerosantes() {
        return numerosantes;
    }

    public void setNumerosantes(String numerosantes) {
        this.numerosantes = numerosantes;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void destruirGenerador(){
   numerosantes =null;
     x=0;
    int arreglo[]=null;
    System.gc();
}
}
