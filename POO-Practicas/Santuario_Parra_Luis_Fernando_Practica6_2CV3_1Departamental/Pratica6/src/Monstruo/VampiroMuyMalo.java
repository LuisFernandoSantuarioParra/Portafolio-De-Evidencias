/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monstruo;

/**
 *
 * @author LuisFernando
 */
public class VampiroMuyMalo implements Vampiro {
     
    private int dañoCausado;
    private boolean matar=false;
    private boolean estado=false;
     public VampiroMuyMalo (VampiroMuyMalo  v){
    v.dañoCausado=dañoCausado;
    
    }
    public VampiroMuyMalo(){
    dañoCausado=0;
   
    } 
    public VampiroMuyMalo(int d, int ds){
    d= this.dañoCausado;
    
    }
    @Override
    public void beberSangre() {
    dañoCausado=70;
    }
    @Override
    public void matar() {
    matar=true;
    }

    @Override
    public void destruye() {
     dañoCausado= 30;
    }

    @Override
    public void amenaza() {
     estado=true;
    }

    public int getDañoCausado() {
        return dañoCausado;
    }

    public void setDañoCausado(int dañoCausado) {
        this.dañoCausado = dañoCausado;
    }

    public boolean isMatar() {
        return matar;
    }

    public void setMatar(boolean matar) {
        this.matar = matar;
    }

  

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
   
}
