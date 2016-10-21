package reloj;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GestorRelog {
    private MarcoReloj marcoR;
    private Thread     hiloRelog;
    private JToggleButton btnPlay;
    public GestorRelog() {
        marcoR = new MarcoReloj();
        hiloRelog = new Thread() {
            public void run() {
                while (true) {
                    marcoR.getReloj().repaint();
                }
            }
        };
        hiloRelog.start();
        marcoR.getSpinnerHoras().addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                marcoR.getReloj().setDifhora(calcularDifHoras((int) marcoR.getSpinnerHoras().getValue()));
            }
        });
        marcoR.getSpinnerMinutos().addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                marcoR.getReloj().setDifminutos(calcularDifmin((int) marcoR.getSpinnerMinutos().getValue()));
            }
        });
        marcoR.getSpinnerSegundos().addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                marcoR.getReloj().setDifsegundos((calcularDifSegundo((int) marcoR.getSpinnerSegundos().getValue())));
            }
        });
        marcoR.getBtnPlay().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (marcoR.getBtnPlay().isSelected()) {
                    hiloRelog.resume();
                    marcoR.getBtnPlay().setBackground(Color.GREEN);
                    marcoR.getBtnPlay().setText("Pause");
                } else {
                    hiloRelog.suspend();
                    marcoR.getBtnPlay().setBackground(Color.red);
                    marcoR.getBtnPlay().setText("Play");
                }
            }
        });
    }

    public int calcularDifHoras(int horadeseada) {
        Calendar calendario = Calendar.getInstance();
        int diferencial = calendario.get(Calendar.HOUR_OF_DAY) - horadeseada;
        return diferencial;
    }

    public int calcularDifmin(int minDeseado) {
        Calendar calendario = Calendar.getInstance();
        int diferencial = calendario.get(Calendar.MINUTE) - minDeseado;
        return diferencial;
    }

    public int calcularDifSegundo(int segDeseado) {
        Calendar calendario = Calendar.getInstance();
        int diferencial = calendario.get(Calendar.SECOND) - segDeseado;
        return diferencial;
    }
}
