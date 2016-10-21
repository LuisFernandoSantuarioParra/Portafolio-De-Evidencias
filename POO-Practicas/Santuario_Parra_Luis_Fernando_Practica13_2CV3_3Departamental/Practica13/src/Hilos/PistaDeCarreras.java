package Hilos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
/**
 *
 * @author LuisFernando
 */
public class PistaDeCarreras {
    private Escenario pista;
    private PersonajesNyan      caballo1;
    private PersonajesNyan      caballo2;
    private PersonajesNyan      caballo3;

    public PistaDeCarreras() throws FileNotFoundException, IOException{
        pista = new Escenario();
        caballo1 = new PersonajesNyan(pista.getLblcaballo1(), pista);
        caballo2 = new PersonajesNyan(pista.getLblcaballo2(), pista);
        caballo3 = new PersonajesNyan(pista.getLblcaballo3(), pista);
        pista.getBtnComenzar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!caballo1.isAlive() && !caballo2.isAlive() && !caballo3.isAlive()) {
                    pista.alinearCaballos();
                    caballo1 = new PersonajesNyan(pista.getLblcaballo1(), pista);
                    caballo2 = new PersonajesNyan(pista.getLblcaballo2(), pista);
                    caballo3 = new PersonajesNyan(pista.getLblcaballo3(), pista);
                    caballo1.setName("TubuNyan: ");
                    caballo2.setName("Fin,Jake adn Nyan: ");
                    caballo3.setName("AutoNyan: ");
                    synchronized (caballo1) {
                        caballo1.start();
                    }
                    synchronized (caballo2) {
                        caballo2.start();
                    }
                    synchronized (caballo3) {
                        caballo3.start();
                    }
                }
                if (pista.isBandera())
                    pista.setBandera(false);
            }
        });
        pista.setVisible(true);
    }
}
