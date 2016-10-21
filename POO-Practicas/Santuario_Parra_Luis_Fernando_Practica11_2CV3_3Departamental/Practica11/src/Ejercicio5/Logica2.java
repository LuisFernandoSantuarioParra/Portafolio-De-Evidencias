package Ejercicio5;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LuisFernando
 */
public class Logica2 {
 public void contarLineas(String[] archivo) throws FileNotFoundException, IOException{
     long lNumeroLineas = 0;
		
		String nombre=archivo[0];
			FileReader fr = new FileReader(nombre);
		
     try (BufferedReader bf = new BufferedReader(fr)) {
         String sCadena = "";
         
         while ((sCadena = bf.readLine())!=null) {
             lNumeroLineas++;
         }
     }

		System.out.println("El fichero tiene " + lNumeroLineas + " lineas");

 }
 }	
	
