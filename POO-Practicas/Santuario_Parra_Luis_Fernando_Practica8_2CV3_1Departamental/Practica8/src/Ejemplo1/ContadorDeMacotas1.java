package Ejemplo1;

import java.util.*;

public class ContadorDeMacotas1 {
    private String[]  tiposDeMascota;
    private ArrayList mascotas;
    private HashMap   MapaMascota;

    public ContadorDeMacotas1() {
        this.tiposDeMascota = new String[] { "Mascota", "Perro", "Pug", "Gato", "Roedor", "Cuyo", "Hamster" };
        this.mascotas = new ArrayList();
        this.MapaMascota = new HashMap();
    }

    public ContadorDeMacotas1(String[] tiposDeMascota) {
        this.tiposDeMascota = tiposDeMascota;
    }

    public ContadorDeMacotas1(ContadorDeMacotas1 pc) {
        this(pc.tiposDeMascota);
    }

    private void generarMacotas() throws Exception {
        try {
            Class[] petTypes = { Class.forName("Ejemplo1.Perro"), Class.forName("Ejemplo1.Pug"),
                    Class.forName("Ejemplo1.Gato"), Class.forName("Ejemplo1.Roedor"), Class.forName("Ejemplo1.Cuyo"),
                    Class.forName("Ejemplo1.Hamster"), };

            for (int i = 0; i < 15; i++) {
                mascotas.add(petTypes[(int) (Math.random() * petTypes.length)].newInstance());
            }
        } catch (InstantiationException e) {
            System.err.println("No se puede instanciar la mascota");
            throw e;
        } catch (IllegalAccessException e) {
            System.err.println("No se puede acceder a la clase");
            throw e;
        } catch (ClassNotFoundException e) {
            System.err.println("No se encontro la clase");
            throw e;
        }

    }

    private void generarMapaMascotas() {
        for (String tipo : tiposDeMascota) {
            MapaMascota.put(tipo, new Contador());
        }
    }

    private void imprimirResultado() {
        System.out.println("Mascotas generadas: ");
        for (Object m : mascotas) {
            System.out.println(m.getClass().toString().substring(m.getClass().toString().lastIndexOf(".") + 1));
        }
        for (String t : tiposDeMascota) {
            System.out.println("mascotas del tipo  " + t + " = " + ((Contador) MapaMascota.get(t)).i);
        }
    }

    // lansa exepciones ala consola:
    public void contarMascotas() throws Exception {
        generarMacotas();
        generarMapaMascotas();
        for (Object mascota : mascotas) {
            if (mascota instanceof Mascota)
                ((Contador) MapaMascota.get("Mascota")).i++;
            if (mascota instanceof Perro)
                ((Contador) MapaMascota.get("Perro")).i++;
            if (mascota instanceof Pug)
                ((Contador) MapaMascota.get("Pug")).i++;
            if (mascota instanceof Gato)
                ((Contador) MapaMascota.get("Gato")).i++;
            if (mascota instanceof Roedor)
                ((Contador) MapaMascota.get("Roedor")).i++;
            if (mascota instanceof Cuyo)
                ((Contador) MapaMascota.get("Cuyo")).i++;
            if (mascota instanceof Hamster)
                ((Contador) MapaMascota.get("Hamster")).i++;
        }
        imprimirResultado();
    }
}