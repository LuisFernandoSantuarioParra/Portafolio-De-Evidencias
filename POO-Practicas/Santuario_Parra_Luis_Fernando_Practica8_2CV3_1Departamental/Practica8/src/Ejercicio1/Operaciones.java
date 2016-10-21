/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author LuisFernando
 */
public class Operaciones extends Exception implements MetodosDeOperaciones{
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
     double n2=(int)( Math.random() * 100);
     
    try{
    dividir(n1,n2);
    }catch(DividirEntreCero dv){
     JOptionPane.showMessageDialog(null,dv.getMessage());
    }finally{
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
     public void obtenerRaiz(){
     double n1=(int)( Math.random() * 100); 
     try{
    raiz(n1);
    }catch(RaizNegativa rn){
     JOptionPane.showMessageDialog(null,rn.getMessage());
    }finally{
    num1=n1;
    }
    }
     
    public void raiz(double n1)throws RaizNegativa{
    if(n1<=0){
    throw new RaizNegativa();
    }
    else{
    resultado=Math.sqrt(n1);
    }
    }
    
    @Override
     public void obtenerLogaritmo(){
     double n1=(int)( Math.random() * 200); 
     try{
    logaritmo(n1);
    }catch(LogaritmoNegativo rn){
     JOptionPane.showMessageDialog(null,rn.getMessage());
    }finally{
    num1=n1;
    }
    }
     
    public void logaritmo(double n1)throws LogaritmoNegativo{
    if(n1<=0){
    throw new LogaritmoNegativo();
    }
    else{
    resultado=Math.log(n1);
    }
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
    
    public void destruir(){
    num1=0;
    num2=0;
    resultado=0;
    }
    
}
