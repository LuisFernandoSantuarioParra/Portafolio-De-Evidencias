/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

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
 public class Nombres{
   private String nombres;
   
   public Nombres(Nombres ns){
   ns.nombres=nombres;
   }
   public Nombres(){
   nombres="";
   }
   public Nombres(String nombres){
   this.nombres=nombres;
   }
   
public String pasarNombres(){
return nombres;
}
public String obtenerNombres(){
return nombres;
}
public void destruir(){
   nombres=null;
    System.gc();
   }
 }

public class Especie{
   private String especie;
   
   public Especie(Especie es){
   es.especie=especie;
   }
   public Especie(){
   especie="";
   }
   public Especie(String especie){
   this.especie=especie;
   }
   
public String pasarEspecie(){
return especie;
}
public String obtenerEspecie(){
return especie;
}
public void destruir(){
   especie=null;
    System.gc();
   }

}
public class Familia{
   private String familia;
   
   public Familia(Familia f){
   f.familia=familia;
   }
   public Familia(){
   familia="";
   }
   public Familia(String familia){
   this.familia=familia;
   }
   
public String pasarFamilia(){
return familia;
}
public String obtenerFamilia(){
return familia;
}
public void destruir(){
   familia=null;
    System.gc();
   }

}
public class Infraclase{
   private String infraclase;
   
   public Infraclase(Infraclase es){
   es.infraclase=infraclase;
   }
   public Infraclase(){
   infraclase="";
   }
   public Infraclase(String infraclase){
   this.infraclase=infraclase;
   }
   
public String pasarInfraclase(){
return infraclase;
}
public String obtenerInfraclase(){
return infraclase;
}
public void destruir(){
   infraclase=null;
    System.gc();
   }

}
public class Clase{
   private String clase;
   
   public Clase(Clase es){
   es.clase=clase;
   }
   public Clase(){
   clase="";
   }
   public Clase(String clase){
   this.clase=clase;
   }
   
public String pasarClase(){
return clase;
}
public String obtenerClase(){
return clase;
}
public void destruir(){
   clase=null;
    System.gc();
   }

}
public class Orden{
   private String orden;
   
   public Orden(Orden es){
   es.orden=orden;
   }
   public Orden(){
   orden="";
   }
   public Orden(String orden){
   this.orden=orden;
   }
   
public String pasarOrden(){
return orden;
}
public String obtenerOrden(){
return orden;
}
public void destruir(){
   orden=null;
    System.gc();
   }

}
public class Clave{
   private String Clave;
   
   public Clave(Clave es){
   es.Clave=Clave;
   }
   public Clave(){
   Clave="";
   }
   public Clave(String Clave){
   this.Clave=Clave;
   }

        public String getClave() {
            return Clave;
        }

        public void setClave(String Clave) {
            this.Clave = Clave;
        }
   

public void destruir(){
   Clave=null;
    System.gc();
   }

}

}


