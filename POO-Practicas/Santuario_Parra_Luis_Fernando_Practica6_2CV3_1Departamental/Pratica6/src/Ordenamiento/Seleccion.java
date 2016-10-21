/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;


import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import static javafx.util.Duration.millis;

/**
 *
 * @author LuisFernando
 */
public class Seleccion {
    DecimalFormat df = new DecimalFormat("0");
    private String  numerosnuevos = "";
    private long TInicio, TFin, tiempoS;
    int[] arregloOrdenado;
    
    public void seleccion(Generador g){
    TInicio=System.currentTimeMillis();
    arregloOrdenado=seleccion(g.getArreglo());
    TFin=System.currentTimeMillis();
    tiempoS=TFin-TInicio;
    mandaraNumerosNuevos();
    
}
public void mandaraNumerosNuevos(){
   
    for(int z=0; z<arregloOrdenado.length;z++)     
        numerosnuevos += df.format(arregloOrdenado[z])+", ";
    
}
   public int[] seleccion(int numeros[]) {
          int i, j, menor, pos, tmp;
          for (i = 0; i < numeros.length - 1; i++) { // tomamos como menor el primero
                menor = numeros[i]; // de los elementos que quedan por ordenar
                pos = i; // y guardamos su posición
                for (j = i + 1; j < numeros.length; j++){ // buscamos en el resto
                      if (numeros[j] < menor) { // del array algún elemento
                          menor = numeros[j]; // menor que el actual
                          pos = j;
                      }
                }
                
                if (pos != i){ // si hay alguno menor se intercambia
                    tmp = numeros[i];
                    numeros[i] = numeros[pos];
                    numeros[pos] = tmp;
                    
                }
                
          }
          
         return numeros;
}   
   

    public long getTiempoS() {
        return tiempoS;
    }

    public void setTiempoS(long tiempoS) {
        this.tiempoS = tiempoS;
    }

    public String getNumerosnuevos() {
        return numerosnuevos;
    }

    public void setNumerosnuevos(String numerosnuevos) {
        this.numerosnuevos = numerosnuevos;
    }
    public void destruirSeleccion(){
    numerosnuevos = "";
    tiempoS=0; 
    int arregloOrdenado[]=null;
    System.gc();
    }
   
}
