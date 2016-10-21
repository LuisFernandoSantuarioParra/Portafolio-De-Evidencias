package MetodosNumericosHilos;
/**
 *
 * @author LuisFernando
 */
public class ProbadorDeNewton {
    private NewtonRamphson metodo;
    private Funcion        f1;
    // Derived Function 1
    private Funcion        derivedf1;
    private String         functionString;
    private double         RaizEsperada;
    private double         margenError;
    private int            IteracionesPermitidas;
    private double         paramInicial;
    private Funcion        f2;
    private Funcion        derivedf2;
    private String         functionString2;
    private double         RaizEsperada2;
    private double         margenError2;
    private int            IteracionesPermitidas2;
    private double         paramInicial2;
    private NewtonRamphson metodo2;

    public ProbadorDeNewton() {
        // funcion 1
        functionString = "cos(x) - x^3";
        f1 = new Funcion() {
            public double eval(double x) {
                return Math.cos(x) - Math.pow(x, 3);
            }
        };
        derivedf1 = new Funcion() {
            public double eval(double x) {
                return -1 * Math.sin(x) - 3 * Math.pow(x, 2);
            }
        };
        RaizEsperada = 0.5;
        margenError = 0.00001;
        IteracionesPermitidas = 6;
        paramInicial = 0.5;
        metodo = new NewtonRamphson();
        // funcion 2
        functionString2 = "sin(x) - x^3";
        f2 = new Funcion() {
            public double eval(double x) {
                return Math.sin(x) - Math.pow(x, 3);
            }
        };
        derivedf2 = new Funcion() {
            public double eval(double x) {
                return Math.cos(x) - 3 * Math.pow(x, 2);
            }
        };
        RaizEsperada2 = 0.9;
        margenError2 = 0.00001;
        IteracionesPermitidas2 = 6;
        paramInicial2 = 0.8;
        metodo2 = new NewtonRamphson();
    }

    public void run() {
        // funcion 1
        metodo.setFx(f1);
        metodo.setDerivada(derivedf1);
        metodo.setFunctionString(functionString);
        metodo.setRaizEsperada(RaizEsperada);
        metodo.setValorInicial(paramInicial);
        metodo.setmargenError(margenError);
        metodo.setIteracionesMaximas(IteracionesPermitidas);
        // funcion 2
        metodo2.setFx(f2);
        metodo2.setDerivada(derivedf2);
        metodo2.setFunctionString(functionString2);
        metodo2.setRaizEsperada(RaizEsperada2);
        metodo2.setValorInicial(paramInicial2);
        metodo2.setmargenError(margenError2);
        metodo2.setIteracionesMaximas(IteracionesPermitidas2);
        //iniciando metodos
        metodo.start();
        metodo2.start();
    }

}
