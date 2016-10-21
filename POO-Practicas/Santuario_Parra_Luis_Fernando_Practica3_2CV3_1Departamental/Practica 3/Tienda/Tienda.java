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
public class Tienda extends Usuario {
    Usuario us=new Usuario();
    private String nombre;
    private String cuenta;
    private int articulos;
    private float saldo;
    private float creditosAplicados;
    private float creditosPermitidos;
    private float nuevoSaldo;
    private float restante;
    
 public Tienda(){
    articulos=0;
    creditosAplicados=0;
    creditosPermitidos=0;
    nuevoSaldo=0;
    restante=0;
 }
  public Tienda(String nom,String cue,int art, float sal, float cre,float crep, float nue, float res){
    articulos=art;
    creditosAplicados=cre;
    creditosPermitidos=crep;
    nuevoSaldo=nue;
    restante=res;
 }
  public Tienda(Tienda p){
    articulos=p.articulos;
    creditosAplicados=p.creditosAplicados;
    creditosPermitidos=p.creditosPermitidos;
    nuevoSaldo=p.nuevoSaldo;
    restante=p.restante;
 }
    
    public void llenar(){
    us.llenar2();
    Scanner lector=new Scanner(System.in);
    System.out.println("Numero de Articulos comprados drante el mes: ");
    articulos=lector.nextInt();
    System.out.println("Creditos aplicados a la cuenta: ");
    creditosAplicados=lector.nextFloat();
    System.out.println("Limite de creditos permitidos: ");
    creditosPermitidos=lector.nextFloat();
    }
    
public void calcular(){
nuevoSaldo=us.getSaldo()+creditosAplicados;
restante=creditosPermitidos-nuevoSaldo;
System.out.println("Usuario: "+us.getNombre()+",N° de cuenta: "+us.getCuenta()+",N° de Articulos comprados: "+ articulos
+",Limite de Credito permitido: "+creditosPermitidos+",Corte actual: "+nuevoSaldo );
if(nuevoSaldo<creditosPermitidos){
System.out.println("El limite de creditos no ha sido superado restan :"+restante+"Creditos");
}
else{
System.out.println("Límite de crédito excedido");
System.out.println("Crédito excedido por "+Math.abs(restante)+"Creditos");
}
}
public void destructor(){
    articulos=0;
    creditosAplicados=0;
    creditosPermitidos=0;
    nuevoSaldo=0;
    restante=0;
    System.gc();
 }
}
