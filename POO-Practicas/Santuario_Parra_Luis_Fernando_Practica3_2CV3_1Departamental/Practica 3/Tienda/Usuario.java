/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import java.util.Scanner;

/**
 *
 * @author LuisFernando
 */
public class Usuario {
    private String nombre;
    private String cuenta;
    private float saldo;
   
 public Usuario(){
    nombre="";
    cuenta="";
    saldo=0;
    
 }
  public Usuario(String nom,String cue,float sal){
    nombre=nom;
    cuenta=cue;
    saldo=sal;
    
 }
  public Usuario(Usuario p){
    nombre=p.nombre;
    cuenta=p.cuenta;
    saldo=p.saldo;
 }
    
    public void llenar2(){
    Scanner lector=new Scanner(System.in);
    System.out.println("Bienvenido a Palacio de Hierro");
    System.out.println("Por favor ingrese el numero de cuenta y el nombre: ");
    System.out.println("Nombre:");
    nombre=lector.nextLine();
    System.out.println("N° de Cuenta:");
    cuenta=lector.nextLine();
    System.out.println("Por favor ingrese la informacion que se solicita : ");
    System.out.println("Deuda actual: ");
    saldo=lector.nextFloat();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
 
public void destructor(){
    nombre=null;
    cuenta=null;
    saldo=0;
    
 }
}
