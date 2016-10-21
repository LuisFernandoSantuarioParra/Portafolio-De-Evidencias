/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;
import java.io.DataInputStream;
import java.io.IOException;
/**
 *
 * @author LuisFernando
 */
public class Calculadora {
    private double  X;
    private int  x1;
    private String lector = "";
    private String numero;
    private String numeroE;
   

    public Calculadora() {
        X = 0;
        x1 = 0;
        lector = "";
        numero = "";
        numeroE = "";
       
    }
    public Calculadora(double v,int  v2,String lec ,String num,String numE) {
        X = v;
        x1 = v2;
        lector =lec;
        numero = num;
        numeroE = numE;
       
    }
     public Calculadora(Calculadora c) {
        X = c.X;
        x1 = c.x1;
        lector =c.lector;
        numero =c.numero;
        numeroE =c.numeroE;
       
    }

    
    public String leer() {
        String s = "";
        DataInputStream sd = new DataInputStream(System.in);
        System.out.flush();
        try {
            System.gc();
            s = sd.readLine();
            lector = s;
            numero = lector.substring(1);
            numeroE = lector.substring(2);
        } catch (IOException e) {
            System.out.println("ERROR: Se introdujo el dato erroneo");
            System.out.println(e);
        }
        return s;
    }

    public boolean operador1(String lector) {
        return (lector.charAt(0) == '+' || lector.charAt(0) == '-' || lector.charAt(0) == '*' || lector.charAt(0) == '>'
                || lector.charAt(0) == '<' || lector.charAt(0) == '/' || lector.charAt(0) == '%');

    }

    public boolean operador2(String lector) {
        return (lector.charAt(1) == '<' || lector.charAt(1) == '>');
    }
    public void instruccion(){
   System.out.println("A continuacion se muestran las instrucciones para utilizar el programa");
   System.out.println("Introduzca un operador aritmetico(+,-,*,/) seguido de un numero ");
   System.out.println("Para terminar el programa introdusca >> o << seguido de un numero");
   System.out.println("No introduzca numeros sin operadores ni operadores sin numeros");
    } 
    public void correr() {
        while (true) {
           
            System.out.println("Valor: ");
            lector = leer();
            if (operador1(lector)||operador2(lector)) {
                operar();
                System.out.println(X);
            } else {
                
                    System.out.println("No se a introducido un operador al principio");
                
            }
        }
    }

    public void operar() {

        switch (lector.charAt(0)) {
        case '+':
            if (operador2(lector)) {
                System.out.println("operacion invalida");
            } else {
                X += Float.valueOf(numero);
            }
            break;
        case '-':
            if (operador2(lector)) {
                System.out.println("operacion invalida");
            } else {
                X -= Float.valueOf(numero);
            }

            break;
        case '*':
            if (operador2(lector)) {
                System.out.println("operacion invalida");
            } else {
                X *= Float.valueOf(numero);
            }

            break;
        case '/':
            if (operador2(lector)) {
                System.out.println("operacion invalida");
            } else {
                X /= Float.valueOf(numero);
            }

            break;
        case '%':
            if (operador2(lector)) {
                System.out.println("operacion invalida");
            } else {
                X %= Float.valueOf(numero);
            }

            break;
        case '>':
            if (lector.charAt(1) == '>') {
                x1 = (x1 >> Integer.valueOf(numeroE));
                System.out.println("El total es:"+X);
              System.exit(0);
            } else {
                System.out.println("operacion invalida");
            }
            break;
        case '<':
            if (lector.charAt(1) == '<') {
                x1 = (x1 << Integer.valueOf(numeroE));
                System.out.println("El total es:"+X);
                System.exit(0);
            } else {
                System.out.println("operacion invalida");
            }
            break;

        default:
            System.out.println("opcion invalida");
            break;
        }

    }
    public void  destructor() {
        X = 0;
        x1 = 0;
        lector = null;
        numero = null;
        numeroE = null;
       
    }

   
}
