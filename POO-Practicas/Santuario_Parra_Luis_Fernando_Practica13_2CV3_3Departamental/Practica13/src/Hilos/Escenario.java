package Hilos;

import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;

public class Escenario extends JFrame {

    private JPanel contentPane;

    /**
 *
 * @author LuisFernando
 */
    private Point        caball1     = new Point(12, 18);
    private Point        caball2     = new Point(12, 139);
    private Point        caball3     = new Point(12, 254);
    private Point        meta=new Point(894, 13);
    private int          puesto      = 0;
    private boolean      bandera     = true;
    private JButton      btnEmpezar;
    private JScrollPane  jScrollPane1;
    private JLabel       lblcaballo1;
    private JLabel       lblcaballo2;
    private JLabel       lblcaballo3 = new javax.swing.JLabel();
    private JLabel       lblmeta;
    private JTextPane    txtResultados;
    private JButton btnComenzar;

    public Escenario() {
        Color purpura=new Color(0,51,102);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1131, 599);
        contentPane = new JPanel();
        contentPane.setBackground(purpura);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        lblcaballo2 = new javax.swing.JLabel();
        lblcaballo1 = new javax.swing.JLabel();
        lblmeta = new javax.swing.JLabel();
        lblmeta.setLocation(meta);
        lblmeta.setSize(11, 401);
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setLocation(341, 426);
        jScrollPane1.setSize(414, 116);
        txtResultados = new javax.swing.JTextPane();
        txtResultados.setFont(new Font("Tahoma", Font.PLAIN, 20));
        txtResultados.setForeground(Color.WHITE);
        btnEmpezar = new javax.swing.JButton();
        lblcaballo3.setLocation(12, 254);
        //caballo 3
        lblcaballo3.setSize(143, 108);
        ImageIcon icCaballos=new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/nyan.gif")).getImage().getScaledInstance(lblcaballo3.getWidth(), lblcaballo3.getHeight(), Image.SCALE_DEFAULT));
        lblcaballo3.setIcon(icCaballos); // NOI18N
        lblcaballo3.setDoubleBuffered(true);
        getContentPane().add(lblcaballo3);
        //caballo 2
        lblcaballo2.setLocation(12, 139);
        lblcaballo2.setSize(143, 108);
        ImageIcon icCaballos2=new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/fin.gif")).getImage().getScaledInstance(lblcaballo3.getWidth(), lblcaballo3.getHeight(), Image.SCALE_DEFAULT));
        lblcaballo2.setIcon(icCaballos2); // NOI18N
        lblcaballo2.setDoubleBuffered(true);
        getContentPane().add(lblcaballo2);
        
        //caballo 1
        lblcaballo1.setLocation(12, 18);
        lblcaballo1.setSize(143, 108);
        ImageIcon icCaballos1=new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/tibu.gif")).getImage().getScaledInstance(lblcaballo3.getWidth(), lblcaballo3.getHeight(), Image.SCALE_DEFAULT));
        lblcaballo1.setIcon(icCaballos1); // NOI18N
        lblcaballo1.setDoubleBuffered(true);
        getContentPane().add(lblcaballo1);
        
        lblmeta.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/meta.png")).getImage().getScaledInstance(lblmeta.getWidth(), lblmeta.getHeight(), Image.SCALE_DEFAULT))); // NOI18N
        getContentPane().add(lblmeta);
        txtResultados.setBackground(Color.DARK_GRAY);
        txtResultados.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBackground(Color.DARK_GRAY);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportView(txtResultados);
        getContentPane().add(jScrollPane1);
        btnComenzar = new JButton("Comenzar");
        btnComenzar.setBackground(Color.RED);
        btnComenzar.setForeground(Color.WHITE);
        btnComenzar.setBounds(70, 452, 134, 45);
        contentPane.add(btnComenzar);
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public Point getMeta() {
        return meta;
    }

    public void setMeta(Point meta) {
        this.meta = meta;
    }

    public JTextPane getTxtResultados() {
        return txtResultados;
    }

    public void setTxtResultados(JTextPane txtResultados) {
        this.txtResultados = txtResultados;
    }

    public JLabel getLblcaballo1() {
        return lblcaballo1;
    }

    public void setLblcaballo1(JLabel lblcaballo1) {
        this.lblcaballo1 = lblcaballo1;
    }

    public JLabel getLblcaballo2() {
        return lblcaballo2;
    }

    public void setLblcaballo2(JLabel lblcaballo2) {
        this.lblcaballo2 = lblcaballo2;
    }

    public JLabel getLblcaballo3() {
        return lblcaballo3;
    }

    public void setLblcaballo3(JLabel lblcaballo3) {
        this.lblcaballo3 = lblcaballo3;
    }

    public JButton getBtnComenzar() {
        return btnComenzar;
    }

    public void setBtnComenzar(JButton btnComenzar) {
        this.btnComenzar = btnComenzar;
    }
    public void alinearCaballos(){
        txtResultados.setText("");
        puesto=0;
        lblcaballo1.setLocation(caball1);
        lblcaballo2.setLocation(caball2);
        lblcaballo3.setLocation(caball3);
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }
}
