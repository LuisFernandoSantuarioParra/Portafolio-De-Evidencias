package Ejemplo1;

import java.util.*;

class Mascota {
}

class Perro extends Mascota {
}

class Pug extends Perro {
}

class Gato extends Mascota {
}

class Roedor extends Mascota {
}

class Cuyo extends Roedor {
}

class Hamster extends Roedor {
}

class Contador {
    public int i;
}

public class ContadorMascotas3 {
    private ArrayList Mascotas;
    private Class[]   tiposDeMascota;
    private HashMap   mapaMascotas;
    private Iterator  keys;

    public ContadorMascotas3() {
        mapaMascotas = new HashMap();
        tiposDeMascota = new Class[] { Mascota.class, Perro.class, Pug.class, Gato.class, Roedor.class, Cuyo.class,
                Hamster.class };
        Mascotas = new ArrayList();
    }

    public ContadorMascotas3(Class[] MascotaTyps) {
        tiposDeMascota = MascotaTyps;
        mapaMascotas = new HashMap();
        Mascotas = new ArrayList();
    };

    public ContadorMascotas3(ContadorMascotas3 pc3) {
        this(pc3.tiposDeMascota);
    }

    private void generarMascotas() throws Exception {
        try {
            for (int i = 0; i < 15; i++) {
                // Offset by one to eliminate Mascota.class:
                int rnd = 1 + (int) (Math.random() * (tiposDeMascota.length - 1));
                Mascotas.add(tiposDeMascota[rnd].newInstance());
            }
        } catch (InstantiationException e) {
            System.err.println("Error al intanciar objeto");
            throw e;
        } catch (IllegalAccessException e) {
            System.err.println("No se puede acceder al contructor");
            throw e;
        }
    }

    private void generarMapeador() {
        for (Class tipo : tiposDeMascota) {
            mapaMascotas.put(tipo.toString(), new Contador());
        }
    }

    public void Procesar() throws Exception {
        contar();
        System.out.println("////////Mascotas///////");//para cada mascota en mascotas imprime su nombre
        for (Object m : Mascotas) {
            System.out.println(m.getClass().toString().substring(m.getClass().toString().lastIndexOf('.') + 1));
        }
        System.out.println("////////Totales///////");
        for (Object numero : mapaMascotas.keySet()) {//para cada clave en mapaMascotas toma el numero y sumalo
            Contador total = (Contador) mapaMascotas.get(numero);
            System.out.println(numero.toString().substring(numero.toString().lastIndexOf('.') + 1) + " numero: " + total.i);
        }
    }

    private void contar() throws Exception {
        generarMascotas();
        generarMapeador();
        for (Object m : Mascotas) {//para cada mascota en mascotas
            for (Class t : tiposDeMascota) {
                if (t.isInstance(m)) {//compara de que tipo es y sumale unos
                    String key = t.toString();
                    ((Contador) mapaMascotas.get(key)).i++;
                }
            }
        }
    }
}