/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chequera;

import java.io.*;

/**
 *
 * @author LuisFernando
 */
public class FormatoCheque {
	 private String palabra="";
	 private String num="";
         private String     numero   = "";
        public int        auxnum   = 0;
	private  int auxiliar=0;
	private  int decena=0, mil=0;
	private  int longitud;
	private  int identificador;

	public  String leer(){ 
		String s="";
		DataInputStream sd = new DataInputStream(System.in);
		System.out.flush();
		try  {
			s=sd.readLine();
		}	catch(IOException e)	{
			System.out.println("ERROR: Se introdujo el dato.");
			System.out.println(e);
		}
		
		return s;
	}

	public  void identificar (int numero,int identificador){
		switch(identificador){
                    
			case 1:{
				if(decena==0){
					if(numero==1)
						palabra+="uno";
					if(numero==2)
						palabra+="dos";
					if(numero==3)
						palabra+="tres";
					if(numero==4)
						palabra+="cuatro";
					if(numero==5)
						palabra+="cinco";
					if(numero==6)
						palabra+="seis";
					if(numero==7)
						palabra+="siete";
					if(numero==8)
						palabra+="ocho";
					if(numero==9)
						palabra+="nueve";
				}
                                
				
			break;
			}
			
			case 2:{
				if(numero==1){
					if(num.charAt(auxiliar+1)=='0')
						palabra+="diez ";
					if(num.charAt(auxiliar+1)=='1')
						palabra+="once ";
					if(num.charAt(auxiliar+1)=='2')
						palabra+="doce ";
					if(num.charAt(auxiliar+1)=='3')
						palabra+="trece ";
					if(num.charAt(auxiliar+1)=='4')
						palabra+="catorce ";
					if(num.charAt(auxiliar+1)=='5')
						palabra+="quince ";
					if(num.charAt(auxiliar+1)=='6')
						palabra+="dieciseis ";
					if(num.charAt(auxiliar+1)=='7')
						palabra+="diecisiete ";
					if(num.charAt(auxiliar+1)=='8')
						palabra+="dieciocho ";
					if(num.charAt(auxiliar+1)=='9')
						palabra+="diecinueve ";
						
					decena++;
					identificador--;
					
				}
				if (num.charAt(auxiliar+1)!='0'){
					if(numero==2)
						palabra+="veinti";
					if(numero==3)
						palabra+="treinta y ";
					if(numero==4)
						palabra+="cuarenta y ";
					if(numero==5)
						palabra+="cincuenta y ";
					if(numero==6)
						palabra+="sesenta y ";
					if(numero==7)
						palabra+="sesenta y ";
					if(numero==8)
						palabra+="ochenta y ";
					if(numero==9)
						palabra+="noventa y ";
				}
				else{
                             
					if(numero==2)
						palabra+="veinte";
					if(numero==3)
						palabra+="treinta";
					if(numero==4)
						palabra+="cuarenta";
					if(numero==5)
						palabra+="cincuenta";
					if(numero==6)
						palabra+="sesenta";
					if(numero==7)
						palabra+="sesenta";
					if(numero==8)
						palabra+="ochenta";
					if(numero==9)
						palabra+="noventa";
                                        
				}
					
			break;
			}
			
			case 3:{
                            if(numero==1){
                            if(num.charAt(auxiliar+1)=='0')
			              palabra+="cien"; 
                            
                            else{
				if(numero==1)
					palabra+="ciento ";
                            }
                            }
				if(numero==2)
					palabra+="doscientos ";
				if(numero==3)
					palabra+="trescientos ";
				if(numero==4)
					palabra+="cuatrocientos ";
				if(numero==5)
					palabra+="quinientos ";
				if(numero==6)
					palabra+="seiscientos ";
				if(numero==7)
					palabra+="setecientos ";
				if(numero==8)
					palabra+="ochocientos ";
				if(numero==9)
					palabra+="novecientos ";
                            
			break;
			}
			
			case 4:{
				if(mil==0){
					if(numero==1)
						palabra+="mil";
					if(numero==2)
						palabra+="dos mil ";
					if(numero==3)
						palabra+="tres mil ";
					if(numero==4)
						palabra+="cuatromil ";
					if(numero==5)
						palabra+="cincomil ";
					if(numero==6)
						palabra+="seismil ";
					if(numero==7)
						palabra+="sietemil ";
					if(numero==8)
						palabra+="ochomil ";
					if(numero==9)
						palabra+="nuevemil ";
				}
			break;
			}
			case 5:
			{
				if(numero==1){
                                         if(num.charAt(auxiliar+1)=='0')
				          palabra+="diez mil";
					if(num.charAt(auxiliar+1)=='1')
						palabra+="once mil ";
					if(num.charAt(auxiliar+1)=='2')
						palabra+="doce mil";
					if(num.charAt(auxiliar+1)=='3')
						palabra+="trece mil";
					if(num.charAt(auxiliar+2)=='4')
						palabra+="catorce mil";
					if(num.charAt(auxiliar+1)=='5')
						palabra+="quince mil";
					if(num.charAt(auxiliar+1)=='6')
						palabra+="dieciseis mil";
					if(num.charAt(auxiliar+1)=='7')
						palabra+="diecisiete mil";
					if(num.charAt(auxiliar+1)=='8')
						palabra+="dieciocho mil";
					if(num.charAt(auxiliar+1)=='9')
						palabra+="diecinueve mil";
						
					mil++;
					identificador--;
				}
				if(num.charAt(auxiliar+1)!='0'){
					if(numero==2)
						palabra+="veinte y ";
					if(numero==3)
						palabra+="treinta y ";
					if(numero==4)
						palabra+="cuarenta y ";
					if(numero==5)
						palabra+="cincuenta y ";
					if(numero==6)
						palabra+="sesenta y ";
					if(numero==7)
						palabra+="setenta y ";
					if(numero==8)
						palabra+="ochenta y ";
					if(numero==9)
						palabra+="noventa y";
				}
				else{
                                    if(numero==1)
						palabra+="diez mil ";
					if(numero==2)
						palabra+="veinte mil ";
					if(numero==3)
						palabra+="treinta mil ";
					if(numero==4)
						palabra+="cuarenta mil ";
					if(numero==5)
						palabra+="cincuenta mil ";
					if(numero==6)
						palabra+="sesenta mil ";
					if(numero==7)
						palabra+="setenta mil ";
					if(numero==8)
						palabra+="ochenta mil ";
					if(numero==9)
						palabra+="noventa mil ";
				}	
			break;
			}
			case 6:
			{
				if(numero==1){
                                if(num.charAt(auxiliar+1)=='0')
			              palabra+="cien mil"; 
                            
                            else{
				if(numero==1)
					palabra+="cien";
                            }
                                }
					
				if(numero==2)
					palabra+="doscientos ";
				if(numero==3)
					palabra+="trescientos ";
				if(numero==4)
					palabra+="cuatrocientos ";
				if(numero==5)
					palabra+="quinientos ";
				if(numero==6)
					palabra+="seiscientos ";
				if(numero==7)
					palabra+="setecientos ";
				if(numero==8)
					palabra+="ochocientos ";
				if(numero==9)
					palabra+="novecientos ";
			break;
			}
			case 7:{
				if(numero==1){
                                    if(num.charAt(auxiliar+1)=='0')
			              palabra+="un millon"; 
                            
                            else{
				if(numero==1)
					palabra+="millones";
                            }
                                }
				if(numero==2)
					palabra+="dos millones ";
				if(numero==3)
					palabra+="tres millones ";
				if(numero==4)
					palabra+="cuatro millones ";
				if(numero==5)
					palabra+="cinco millones ";
				if(numero==6)
					palabra+="seis millones ";
				if(numero==7)
					palabra+="siete millones ";
				if(numero==8)
					palabra+="ocho millones ";
				if(numero==9)
					palabra+="nueve millones ";
			break;
			}
                        
                        
		
		} //switch
	}
	
	public  void leerNumero(){
		longitud=num.length();
		identificador=longitud;
		int numero;

		while( auxiliar<longitud )
		{
			char caracter=num.charAt(auxiliar);
			numero=Integer.parseInt(caracter+"");
			identificar(numero,identificador);
			identificador--;
                        auxiliar++;
		}
	}
        public void llenar(){
         
        String nombre = "";
        System.out.println("Dame tu nombre: ");
        nombre = leer();   
    while (auxnum == 0) {
        try {
            System.out.println("Dame la cantidad: ");
            numero = leer();
            auxnum = Integer.parseInt(numero);
        }
        catch (NumberFormatException e) {
            System.out.println("No es un numero entero, introduce un numero entero, intenta de nuevo: ");
            
        }
    }
        num = Integer.toString(auxnum);
        
        leerNumero();	
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
                System.out.println(" ___________________________________________________________________________________");
                System.out.println("|                                                                                     ");
		System.out.println("| BANCO NACIONAL DE SANGHELIOS         Fecha:_________________                        ");
		System.out.println("| Nombre: "+ nombre+"\t\t                                                             ");
		System.out.println("| Cantidad c/letra: "+ palabra +" \t $ "+num+"                \t\t\t\t                ");
		System.out.println("|                                                                                     ");
		System.out.println("| Firma:_________________                                                             ");
                System.out.println("|___________________________________________________________________________________  ");
}
}
