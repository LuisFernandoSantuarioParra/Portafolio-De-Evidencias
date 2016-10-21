package MetodosNumericosHilos;

import javax.swing.JOptionPane;

/**
 *
 * @author LuisFernando
 */
 
public class NewtonRamphson extends Thread {
    private static final String METHOD_NAME = "NewtonRaphson";
    private Funcion             fx;
    private Funcion             derivada;
    double                      parametroInicial;
    double                      toleranciaError;
    int                         numMaximaIteraciones;
    private String              functionString;
    private double              raizEsperada;
    private double              RaizCalculada;

    public NewtonRamphson(Funcion f, Funcion fderived, double p0, double error, int maxIterations, String StringF) {
        fx = f;
        derivada = fderived;
        parametroInicial = p0;
        toleranciaError = error;
        numMaximaIteraciones = maxIterations;
        functionString = StringF;

    }
    public void run(){
        calcular();
    }

    public NewtonRamphson() {
        this(null, null, 0, 0, 0, "");
    }

    public Funcion getFx() {
        return fx;
    }

    public void setFx(Funcion fun) {
        fx = fun;
    }

    public Funcion getDerivada() {
        return derivada;
    }

    public void setDerivada(Funcion dfx) {
        derivada = dfx;
    }

    public void setValorInicial(double d) {
        parametroInicial = d;
    }

    public void setmargenError(double e) {
        toleranciaError = e;
    }

    public void setIteracionesMaximas(int i) {
        numMaximaIteraciones = i;
    }

    public String getFunctionString() {
        return functionString;
    }

    public void setFunctionString(String functionString) {
        this.functionString = functionString;
    }

    public double getRaizEsperada() {
        return raizEsperada;
    }

    public void setRaizEsperada(double raizEsperada) {
        this.raizEsperada = raizEsperada;
    }

    /**
     * Este metodo encuentra la raiz de la funcion por medio de Newton Raphson
     *
     * @param f
     *            la funcion a la cual le queremos hayar la raiz
     * @param fderived
     *            la derivada de la funcion
     * @param p0
     *            punto de inicio. Debe ser lo mas cercano posible a la raiz
     * @param error
     *            margen de error tolerado
     * @param maxIterations
     *            numero maximo de iteraciones permitidas
     * @return raiz de la funcion
     * @throws RaizNoEncontradaExcepcion
     *             en caso de que la raiz no haya podidod ser encontrada o que
     *             la funcion no cumpla con las condiciones minimas necesarias
     */

    public static double encontrarRaiz(Funcion f, Funcion fderived, double p0, double error, int maxIterations)
            throws RaizNoEncontradaExcepcion {
        int iterations = 1;
        double p = p0;
        while (iterations < maxIterations) {
            // Xn+1 = Xn - f(x) / f'(x)
            double p1 = p - f.eval(p) / fderived.eval(p);
            if (Math.abs(f.eval(p1)) < error) {
                return p1;
            }
            p = p1;
            iterations++;
        }
        throw new RaizNoEncontradaExcepcion(METHOD_NAME);
    }

    public void calcular() {
        try {
            RaizCalculada = encontrarRaiz(fx, derivada, parametroInicial, toleranciaError, numMaximaIteraciones);
            System.out.println("Funcion: " + functionString + "\n Raiz Calculada: " + RaizCalculada
                    + "\n Raiz Estimada: " + raizEsperada);
            System.out.println(resultadoCoincide("La raiz encontrada no concide con la esperada", raizEsperada, RaizCalculada, toleranciaError));
            JOptionPane.showMessageDialog(null, "Funcion: " + functionString + "\n Raiz Calculada: " + RaizCalculada
                    + "\n Raiz Estimada: " + raizEsperada+"\n"+resultadoCoincide("La raiz encontrada no concide con la esperada", raizEsperada, RaizCalculada, toleranciaError));

        } catch (RaizNoEncontradaExcepcion e) {
            if (!functionString.equalsIgnoreCase("La funcion ha fallado")) {
                e.printStackTrace();
                System.out.println("Exepcion de raiz no econtrada lanzada");
            } else {
                System.out.println("OK: exepcion de raiz no econtrada sera lanzada");
            }
        }
    }

    private String resultadoCoincide(String string, double expectedRoot2, double calculateRoot, double d) {
        double Error = Math.abs((expectedRoot2 - calculateRoot));
        if (Error > d) {
           return string + "\nraiz esperada: " + expectedRoot2 + "\nRaiz calculada:" + calculateRoot;
        }
        return "";
    }

}