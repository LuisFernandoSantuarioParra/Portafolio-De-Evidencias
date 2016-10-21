package Hilos;

import javax.swing.JLabel;
import javax.swing.JTextPane;
/**
 *
 * @author LuisFernando
 */
public class PersonajesNyan extends Thread {
    private JLabel    lblCaballo;
    private int       puesto;
    private int       meta;
    private long      tiempoDeInicio;
    private long      tiempoFinal;
    private long      tiempoDeLLegada;
    private JTextPane txtResultados;

    public PersonajesNyan(JLabel lblcaballo, JTextPane txtresultados, int puesto, int meta) {
        this.lblCaballo = lblcaballo;
        this.puesto = puesto;
        this.meta = meta;
        this.txtResultados = txtresultados;
    }

    public PersonajesNyan(JLabel lblcaballo, Escenario gui) {
        this.lblCaballo = lblcaballo;
        this.puesto = gui.getPuesto();
        ;
        this.meta = gui.getMeta().x;
        this.txtResultados = gui.getTxtResultados();
    }

    @Override
    public void run() {
        int movimiento1;
        iniciarConometro();
        while (lblCaballo.getLocation().x < meta) {
            movimiento1 = (int) (Math.random() * 50 + 1);
            // movimiento1 = 1;//sincronizado
            try {
                sleep((int) (Math.random() * 150 + 1));
                // sleep(25);//sincronizado
            } catch (InterruptedException ex) {
                // no hacer nada
            }
            lblCaballo.setLocation(lblCaballo.getLocation().x + movimiento1, lblCaballo.getLocation().y);
        }
        stopConometro();
        String texto = txtResultados.getText() + this.getName() + " Tiempo de corrida: " + tiempoDeLLegada + " ms"
                + "\n";
        txtResultados.setText(texto);
        // hiloinicio hil=new hiloinicio(this.getName());
    }

    private void iniciarConometro() {
        tiempoDeInicio = System.currentTimeMillis();
    }

    private void stopConometro() {
        tiempoFinal = System.currentTimeMillis();
        tiempoDeLLegada = tiempoFinal - tiempoDeInicio;
    }

    public long getTiempoDeLLegada() {
        return tiempoDeLLegada;
    }
}
