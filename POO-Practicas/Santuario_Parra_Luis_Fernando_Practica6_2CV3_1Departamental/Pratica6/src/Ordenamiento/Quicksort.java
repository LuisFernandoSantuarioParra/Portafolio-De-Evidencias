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
public class Quicksort {

private String  numerosnuevos = "";
DecimalFormat df = new DecimalFormat("0");
int[] arregloOrdenado;
private long TInicio, TFin, tiempoQ;

public void quicksort(Generador g){
    TInicio=System.currentTimeMillis();
    arregloOrdenado=quicksort(g.getArreglo(), 0, (g.getArreglo().length-1));
    TFin=System.currentTimeMillis();
    tiempoQ=TFin-TInicio; 
    mandaraNumerosNuevos();
   
   
}
public void mandaraNumerosNuevos(){
   
    for(int z=0; z<arregloOrdenado.length;z++)     
        numerosnuevos += df.format(arregloOrdenado[z])+", ";
    
}

public int[] quicksort(int numeros[], int izq, int der) {

  int pivote=numeros[izq]; // tomamos primer elemento como pivote
  int i=izq; // i realiza la búsqueda de izquierda a derecha
  int j=der; // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i<j){            // mientras no se crucen las búsquedas
     while(numeros[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
     while(numeros[j]>pivote) j--;         // busca elemento menor que pivote
     if (i<j) {                      // si no se han cruzado                      
         aux= numeros[i];                  // los intercambia
         numeros[i]=numeros[j];
         numeros[j]=aux;
     }
   }
   numeros[izq]=numeros[j]; // se coloca el pivote en su lugar de forma que tendremos
   numeros[j]=pivote; // los menores a su izquierda y los mayores a su derecha
   if(izq<j-1)
      quicksort(numeros,izq,j-1); // ordenamos subarray izquierdo
   if(j+1 <der)
      quicksort(numeros,j+1,der); // ordenamos subarray derecho
   
   return numeros;
}


    public long getTiempoQ() {
        return tiempoQ;
    }

    public void setTiempoQ(long tiempoQ) {
        this.tiempoQ = tiempoQ;
    }

public String getNumerosnuevos() {
        return numerosnuevos;
    }

    public void setNumerosnuevos(String numerosnuevos) {
        this.numerosnuevos = numerosnuevos;
    }
    
    public void destruirQuickSort(){
    numerosnuevos = "";
    tiempoQ=0; 
    int arregloOrdenado[]=null;
     System.gc();
    }
}
