/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author LuisFernando
 */
    public class Newton {
    private final int JMAX = 100;
    private final double ERR_VAL = -10E10;
    private double epsilon;
    private INewton funciones;
    private double a; 
    private double b;

    //Constructores
        public Newton(INewton fun, double extremoA, double extremoB, double eps) {
            funciones = fun;
            a = extremoA;
            b = extremoB;
            epsilon = eps;
        }

        public Newton() { 
            this(new Funciones(), -1.0, 8.0, 1E-15);
        }

        public Newton(Newton newtonRaphson) { 
            this(newtonRaphson.funciones, newtonRaphson.a, newtonRaphson.b, newtonRaphson.epsilon);
        }

    public double encontrarRaiz() {
        double estimacion = 0.5 * (a + b);
        
        for (int j= 0; j < JMAX; j++) {
            double funcionValor = funciones.funcion(estimacion);
            double funcionDerivada = funciones.funcionDerivada(estimacion);
            double dx = funcionValor/funcionDerivada;
            estimacion -= dx;

            if ((a - estimacion)*(estimacion - b) < 0.0) {
                System.out.println("Fuera de rango");
                return ERR_VAL; 
            }
            if (Math.abs(dx) < epsilon)
                return estimacion;
        }
        System.out.println("Excedido");
        return estimacion;
    }
    public void destruir() {
            funciones = null;
            a = 0;
            b = 0;
            epsilon = 0;
            System.gc();
        }
}

