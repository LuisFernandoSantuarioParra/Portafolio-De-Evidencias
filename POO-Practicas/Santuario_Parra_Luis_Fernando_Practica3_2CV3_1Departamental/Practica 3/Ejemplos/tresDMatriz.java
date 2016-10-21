/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

/**
 *
 * @author LuisFernando
 */
public class tresDMatriz {

public void arreglo3D() {

int tresD[][][] = new int[3][4][5];

int i, j, k;

for(i=0; i<3; i++)

for(j=0; j<4; j++)

for(k=0; k<5; k++)

tresD[i][j][k] = i * j * k;

 

for(i=0; i<3; i++) {

for(j=0; j<4; j++) {

for(k=0; k<5; k++)

System.out.print(tresD[i][j][k] + " ");

System.out.println();

}

System.out.println();

}

}

} 
