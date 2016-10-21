package reloj;

import java.awt.EventQueue;

public class Probador {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GestorRelog();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
