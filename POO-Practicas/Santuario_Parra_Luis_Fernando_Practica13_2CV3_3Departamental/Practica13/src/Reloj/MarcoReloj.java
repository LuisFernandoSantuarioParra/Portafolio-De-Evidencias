package reloj;

import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public class MarcoReloj extends JFrame {

    private JPanel contentPane;
    private Reloj  reloj;
    private JSpinner spinnerHoras;
    private JSpinner spinnerMinutos;
    private JLabel lblCambiarSegundos;
    private JSpinner spinnerSegundos;
    private JToggleButton btnPlay;

    public MarcoReloj() {
        try {
            setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al intentar cargar L&F");
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 757);
        contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        reloj = new Reloj();
        reloj.setBorder(null);
        reloj.setBackground(Color.CYAN);
        reloj.setBounds(5, 5, 765, 626);
        contentPane.add(reloj);
        //reloj.setDifsegundos(calcularDifSegundo(1));
        spinnerHoras = new JSpinner();
        spinnerHoras.setModel(new SpinnerNumberModel(0, 0, 12, 1));
        spinnerHoras.setBounds(120, 675, 54, 22);
        contentPane.add(spinnerHoras);
        
        JLabel lblCambiarHoras = new JLabel("Cambiar horas");
        lblCambiarHoras.setForeground(Color.WHITE);
        lblCambiarHoras.setBounds(17, 675, 91, 22);
        contentPane.add(lblCambiarHoras);
        
        JLabel lblCambiarMinutos = new JLabel("Cambiar minutos");
        lblCambiarMinutos.setForeground(Color.WHITE);
        lblCambiarMinutos.setBounds(186, 675, 108, 22);
        contentPane.add(lblCambiarMinutos);
        
        spinnerMinutos = new JSpinner();
        spinnerMinutos.setModel(new SpinnerNumberModel(0, 0, 59, 1));
        spinnerMinutos.setBounds(303, 675, 54, 22);
        contentPane.add(spinnerMinutos);
        
        lblCambiarSegundos = new JLabel("Cambiar segundos");
        lblCambiarSegundos.setForeground(Color.WHITE);
        lblCambiarSegundos.setBounds(369, 675, 108, 22);
        contentPane.add(lblCambiarSegundos);
        
        spinnerSegundos = new JSpinner();
        spinnerSegundos.setModel(new SpinnerNumberModel(0, 0, 59, 1));
        spinnerSegundos.setBounds(489, 675, 54, 22);
        contentPane.add(spinnerSegundos);
        
         btnPlay = new JToggleButton("Pause");
         btnPlay.setBackground(Color.GREEN);
         btnPlay.setBounds(613, 659, 137, 38);
         contentPane.add(btnPlay);
        this.setVisible(true);
    }
    public int calcularDifHoras(int horadeseada){
        Calendar calendario = Calendar.getInstance();
        int diferencial=calendario.get(Calendar.HOUR_OF_DAY)-horadeseada;
        return diferencial;
    }
    public int calcularDifmin(int minDeseado){
        Calendar calendario = Calendar.getInstance();
        int diferencial=calendario.get(Calendar.MINUTE)-minDeseado;
        return diferencial;
    }
    public int calcularDifSegundo(int segDeseado){
        Calendar calendario = Calendar.getInstance();
        int diferencial=calendario.get(Calendar.SECOND)-segDeseado;
        return diferencial;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

    public JSpinner getSpinnerHoras() {
        return spinnerHoras;
    }

    public void setSpinnerHoras(JSpinner spinnerHoras) {
        this.spinnerHoras = spinnerHoras;
    }
    public JSpinner getSpinnerMinutos() {
        return spinnerMinutos;
    }
    public void setSpinnerMinutos(JSpinner spinnerMinutos) {
        this.spinnerMinutos = spinnerMinutos;
    }
    public JSpinner getSpinnerSegundos() {
        return spinnerSegundos;
    }
    public void setSpinnerSegundos(JSpinner spinnerSegundos) {
        this.spinnerSegundos = spinnerSegundos;
    }
    public JToggleButton getBtnPlay() {
        return btnPlay;
    }
    public void setBtnPlay(JToggleButton btnPlay) {
        this.btnPlay = btnPlay;
    }
}
