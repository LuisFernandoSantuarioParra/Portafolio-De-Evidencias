/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

/**
 *
 * @author LuisFernando
 */
public interface IOrdenamientos {
    public void generar();
    public int[] quicksort(int numeros[], int izq, int der);
    public void quicksort(Generador g);
    public int[] ordenarBurbuja( int burbuja[]);
    public void ordenarBurbuja(Generador g);
    public int[] seleccion( int numeros[]);
    public void seleccion(Generador g);
    public int[] insecion( int numeros[]);
    public void insercion(Generador g);
    public void destruirSeleccion();
    public void destruirBurbuja();
    public void destruirInsercion();
    public void destruirGenerador();
    public void destruirQuickSort();
            
}
