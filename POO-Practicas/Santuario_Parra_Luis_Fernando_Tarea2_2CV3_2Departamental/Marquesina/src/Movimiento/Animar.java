package Movimiento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.applet.*;
import javax.swing.ImageIcon;
/**
 *
 * @author LuisFernando
 */
public class Animar extends Applet implements Runnable {
    Thread anima;
    private int radio=10;       //radio del monitor
    private int x, y;           //posición del centro de la pelota
    private int dx = 1;         //desplazamientos
    private int dy = 1;
    private int anchoApplet;
    private int altoApplet;
    private int retardo=2;
    private Image     img1;
    private ImageIcon icono;
    private ImageIcon imagen;
    private Image     img2;
    private ImageIcon icono2;
    private ImageIcon imagen2;
//Doble buffer
    
    private Graphics gBuffer;

    @Override
  public void init () {
    setBackground(Color.white);
//dimensiones del applet
    anchoApplet=600;
    altoApplet=400;
//posición inicial de partida
    x=anchoApplet/4;
    y=altoApplet/2;
    imagen = new ImageIcon("C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\Marquesina\\src\\Movimiento\\monitor.jpg");
    imagen2 = new ImageIcon("C:\\Users\\LuisFernando\\Documents\\Programacion Orientada a Objetos\\Marquesina\\src\\Movimiento\\pelican.jpg");
  }

    @Override
  public void start(){
     if(anima ==null){
        anima=new Thread(this);
        anima.start();
     }
  }

    @Override
  public void stop(){
     if(anima!=null){
        anima.stop();
        anima=null;
     }
  }

    @Override
  public void run() {
    long t=System.currentTimeMillis();
    while (true) {
        mover();
        try{
            t+=retardo;
            Thread.sleep(Math.max(0, t-System.currentTimeMillis()));
        }catch(InterruptedException ex){
            break;
        }
    }
  }
  void mover() {
    x += dx;
    y += dy;
    if (x >= (anchoApplet-radio) || x <= radio) dx*= -1;
    if (y >= (altoApplet-radio) || y <= radio) dy*= -1;
    repaint();      //llama a update
  }

    @Override
  public void update(Graphics g){
      icono = new ImageIcon(imagen.getImage());
      img1 = icono.getImage();
      icono2 = new ImageIcon(imagen2.getImage());
      img2 = icono2.getImage();
       if(gBuffer==null){
          img1=createImage(anchoApplet, altoApplet);
          
          gBuffer=img1.getGraphics();
          
     }
     gBuffer.setColor(Color.WHITE);
     gBuffer.fillRect(0,0, anchoApplet, altoApplet);

//transfiere la imagen al contexto gráfico del applet
     g.drawImage(img1, x-30, y+50, null);
     g.drawImage(img2, x-radio, y-radio, null);
 }

    @Override
  public void paint (Graphics g) {
//se llama la primera vez que aparece el applet
  }
}
