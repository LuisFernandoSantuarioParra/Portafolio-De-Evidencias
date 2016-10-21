/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;


import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author LuisFernando
 */
public class Insercion {
    DecimalFormat df = new DecimalFormat("0");
    private String  numerosnuevos = "";
    private long TInicio, TFin, tiempoI; 
    int[] arregloOrdenado;
    
    public void insercion(Generador g){
    TInicio=System.currentTimeMillis();
    arregloOrdenado=insertar(g.getArreglo());
    TFin=System.currentTimeMillis();
    tiempoI=TFin-TInicio;
    mandaraNumerosNuevos();
   
    
}
public void mandaraNumerosNuevos(){
   
    for(int z=0; z<arregloOrdenado.length;z++)     
        numerosnuevos += df.format(arregloOrdenado[z])+", ";
    
}
    public int[] insertar(int numeros[]){
    int p, j;
    int aux;
    for (p = 1; p < numeros.length; p++){ // desde el segundo elemento hasta
              aux = numeros[p]; // el final, guardamos el elemento y
              j = p - 1; // empezamos a comprobar con el anterior
              while ((j >= 0) && (aux < numeros[j])){ // mientras queden posiciones y el
                                                                    // valor de aux sea menor que los
                             numeros[j + 1] = numeros[j];       // de la izquierda, se desplaza a
                             j--;                   // la derecha
                
              }
              numeros[j + 1] = aux; // colocamos aux en su sitio
              
    }
 return numeros;
}

    public long getTiempoI() {
        return tiempoI;
    }

    public void setTiempoI(long tiempoI) {
        this.tiempoI = tiempoI;
    }

    public String getNumerosnuevos() {
        return numerosnuevos;
    }

    public void setNumerosnuevos(String numerosnuevos) {
        this.numerosnuevos = numerosnuevos;
    }
    public void destruirInsercion(){
    numerosnuevos = "";
    tiempoI=0; 
    int arregloOrdenado[]=null;
     System.gc();
    }
}
