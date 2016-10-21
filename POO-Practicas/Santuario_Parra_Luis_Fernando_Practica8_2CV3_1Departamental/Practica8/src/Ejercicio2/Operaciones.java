/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;


import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LuisFernando
 */
public class Operaciones extends Exception implements MetodosDeOperaciones{
    DecimalFormat df = new DecimalFormat("0");
    private String arregloCopiado = "";
    private String arregloGenerado = "";
    private double resultado;
    private double num1;
    private double num2;
   public Operaciones(){
    resultado=0;
    num1=0;
    num2=0;
    }
   public Operaciones(Operaciones o){
    resultado=o.resultado;
    num1=o.num1;
    num2=o.num2;
    }
   public Operaciones(double resultado,double n1,double n2){
    this.resultado=resultado;
    this.num1=n1;
    this.num2=n2;
    }
    
    
    @Override
    public void obtenerDivision(){
     double n1=(int)( Math.random() * 100);
     double n2=(int)( Math.random() * 1);
    try{
    dividir(n1,n2);
    }catch(DividirEntreCero dv){
     JOptionPane.showMessageDialog(null,dv.getMessage());
    }finally{
    n2++;
         try {
             dividir(n1,n2);
         } catch (DividirEntreCero ex) {
             Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
         }
    num1=n1;
    num2=n2;
    }
    }
     public void dividir(double n1, double n2) throws DividirEntreCero{
    if(n2==0){
    throw new DividirEntreCero();
    }
    else{
     resultado=n1/n2;
    }
    }
     
    @Override
     public void obtenerArreglo() {
            int []b = new int[20];
            
            for( int i=0; i<b.length; i++ ) {
            b[i] = (int)( Math.random() * 100.0);
            arregloGenerado+=df.format(b[i])+",";
            }
                int[] a=new int[10];
		try {
	         copiar(a,b);
		} catch(ArregloFueraDeLimite af) {
			JOptionPane.showMessageDialog(null,af.getMessage());
                }
		finally {
                    a=new int[20]; 
                try {
                    copiar(a,b);
                    JOptionPane.showMessageDialog(null,"Se incremento el tamaño del arreglo y se procedio a copiar");
                } catch (ArregloFueraDeLimite ex) {
                    Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
		}
	}
    
     public void copiar(int a [], int b [])throws ArregloFueraDeLimite { 
	if(a.length<b.length){
        throw new ArregloFueraDeLimite();
        }
        else{
	for (int i = 0; i < b.length; i++)
	a[i] = b[i];
           }  
        for (int z = 0; z < b.length; z++)
        arregloCopiado+=df.format(a[z])+",";
     }
     

    public double getN1() {
        return num1;
    }

    public void setN1(double num1) {
        this.num1 = num1;
    }

    public double getN2() {
        return num2;
    }

    public void setN2(double num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getArregloCopiado() {
        return arregloCopiado;
    }

    public void setArregloCopiado(String arregloCopiado) {
        this.arregloCopiado = arregloCopiado;
    }

    public String getArregloGenerado() {
        return arregloGenerado;
    }

    public void setArregloGenerado(String arregloGenerado) {
        this.arregloGenerado = arregloGenerado;
    }
    
    public void destruir(){
    num1=0;
    num2=0;
    resultado=0;
    }

    

    
}
