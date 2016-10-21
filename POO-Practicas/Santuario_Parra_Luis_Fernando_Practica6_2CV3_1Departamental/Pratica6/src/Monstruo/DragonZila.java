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
public class DragonZila implements MonstruoPeligroso {

    private int dañoCausado;
    private int dañoSufrido;
    private boolean estado=false;
    public DragonZila (DragonZila  d){
    d.dañoCausado=dañoCausado;
    d.dañoSufrido=dañoSufrido;
    }
    public DragonZila(){
    dañoCausado=0;
    dañoSufrido=0;
    } 
    public DragonZila(int d, int ds){
    d= this.dañoCausado;
    ds=this.dañoSufrido;
    }
    @Override
    public void destruye() {
       dañoCausado=70;
    }
    public void incinerar (){
    dañoCausado=100;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
