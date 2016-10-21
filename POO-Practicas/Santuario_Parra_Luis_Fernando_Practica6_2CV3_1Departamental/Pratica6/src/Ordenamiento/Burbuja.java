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
public class Burbuja {
   DecimalFormat df = new DecimalFormat("0");
   private String  numerosnuevos = "";
   private long TInicio, TFin, tiempoB; 
   int arregloOrdenado[];
   
   public void ordenarBurbuja(Generador g){
    TInicio=System.currentTimeMillis();
    arregloOrdenado=ordenarBurbuja(g.getArreglo());
    TFin=System.currentTimeMillis();
    tiempoB=TFin-TInicio;
    mandaraNumerosNuevos();
    
    
}
public void mandaraNumerosNuevos(){
   
    for(int z=0; z<arregloOrdenado.length;z++)     
        numerosnuevos += df.format(arregloOrdenado[z])+", ";
    
}
   
public int[] ordenarBurbuja( int burbuja[]){

    numerosnuevos = "";
         int i, j, aux;
         for(i=0;i<burbuja.length-1;i++)
              for(j=0;j<burbuja.length-i-1;j++)
                   if(burbuja[j+1]<burbuja[j]){
                      aux=burbuja[j+1];
                      burbuja[j+1]=burbuja[j];
                      burbuja[j]=aux;
                      
                   }
    return burbuja;  
    }

    public long getTiempoB() {
        return tiempoB;
    }

    public void setTiempoB(long tiempoB) {
        this.tiempoB = tiempoB;
    }
    
    public String getNumerosnuevos() {
        return numerosnuevos;
    }

    public void setNumerosnuevos(String numerosnuevos) {
        this.numerosnuevos = numerosnuevos;
    }
    public void destruirBurbuja(){
    
    numerosnuevos = "";
    tiempoB=0; 
    int arregloOrdenado[]=null;
     System.gc();
    }
}
