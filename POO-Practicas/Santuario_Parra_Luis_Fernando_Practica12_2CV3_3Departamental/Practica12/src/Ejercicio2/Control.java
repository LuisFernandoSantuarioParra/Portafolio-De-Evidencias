/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;



/**
 *
 * @author LuisFernando
 */
public class Control{
 public class Nombrar{
   private String nombre;
   
   public Nombrar(Nombrar n){
   n.nombre=nombre;
   }
   public Nombrar(){
   nombre="";
   }
   public Nombrar(String nombre){
   this.nombre=nombre;
   }
   
public String pasarNombre(){
return nombre;
}
public String obtenerNombre(){
return nombre;
}
public void destruirN(){
   nombre=null;
    System.gc();
   }

}
 public class Titulo{
   private String titulo;
   
   public Titulo(Titulo ns){
   ns.titulo=titulo;
   }
   public Titulo(){
   titulo="";
   }
   public Titulo(String titulo){
   this.titulo=titulo;
   }
   
public String pasarTitulo(){
return titulo;
}
public String obtenerTitulo(){
return titulo;
}
public void destruir(){
   titulo=null;
    System.gc();
   }
 }

public class Autor{
   private String autor;
   
   public Autor(Autor es){
   es.autor=autor;
   }
   public Autor(){
   autor="";
   }
   public Autor(String autor){
   this.autor=autor;
   }
   
public String pasarAutor(){
return autor;
}
public String obtenerAutor(){
return autor;
}
public void destruir(){
   autor=null;
    System.gc();
   }

}
public class Editorial{
   private String editorial;
   
   public Editorial(Editorial e){
   e.editorial=editorial;
   }
   public Editorial(){
   editorial="";
   }
   public Editorial(String editorial){
   this.editorial=editorial;
   }
   
public String pasarEditorial(){
return editorial;
}
public String obtenerEditorial(){
return editorial;
}
public void destruir(){
   editorial=null;
    System.gc();
   }

}

public class Clave{
   private double clave;
   
   public Clave(Clave cl){
   cl.clave=clave;
   }
   public Clave(){
   clave=0;
   }
   public Clave(double clave){
   this.clave=clave;
   }

        public double getClave() {
            return clave;
        }

        public void setClave(double Clave) {
            this.clave = Clave;
        }
   

public void destruir(){
   clave=0;
    System.gc();
   }

}
public class Dato{
   private String dato;
   
   public Dato(Dato d){
   d.dato=dato;
   }
   public Dato(){
   dato="";
   }
   public Dato(String dato){
   this.dato=dato;
   }
   
public String pasarDato(){
return dato;
}
public String obtenerDato(){
return dato;
}
public void destruir(){
   dato=null;
    System.gc();
   }

}

}


