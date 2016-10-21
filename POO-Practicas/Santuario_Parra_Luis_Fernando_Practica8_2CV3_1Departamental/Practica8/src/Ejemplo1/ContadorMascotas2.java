package Ejemplo1;

import java.util.*;



public class ContadorMascotas2 {
    private ArrayList mascotas;
    private Class[]   tiposDeAnimales;
    private HashMap   MapaMascotas;

    public ContadorMascotas2() {
        this.MapaMascotas = new HashMap();
        this.tiposDeAnimales = new Class[] { Mascota.class, Perro.class, Pug.class, Gato.class, Roedor.class,
                Cuyo.class, Hamster.class };
        this.mascotas = new ArrayList();
    }

    public ContadorMascotas2(Class[] petTyps) {
        this.MapaMascotas = new HashMap();
        this.tiposDeAnimales = petTyps;
        this.mascotas = new ArrayList();
    };

    public ContadorMascotas2(ContadorMascotas2 pc2) {
        this(pc2.tiposDeAnimales);
    }

    private void generarAnimales() throws Exception {
        try {
            int random = (int) (1 + Math.random() * 30);
            for (int i = 0; i < random; i++) {
                // Offset by one to eliminate Mascota.class:
                int rnd = 1 + (int) (Math.random() * (tiposDeAnimales.length - 1));
                mascotas.add(tiposDeAnimales[rnd].newInstance());
            }
        } catch (InstantiationException e) {
            System.err.println("Cannot instantiate");
            throw e;
        } catch (IllegalAccessException e) {
            System.err.println("Cannot access");
            throw e;
        }
    }

    private void generarMapaMascotas() {
        System.out.println("Tipos de animales");
        for (Class clase : tiposDeAnimales) {
            System.out.println(clase.toString().substring(clase.toString().lastIndexOf(".") + 1));
            MapaMascotas.put(clase.toString(), new Contador());
        }
    }

    private void imprimirResultados() {
        System.out.println("//////////////////////////////////");
        System.out.println("Animales generados: ");
        for (Object m : mascotas) {
            System.out.println(m.getClass().toString().substring(m.getClass().toString().lastIndexOf(".") + 1));
        }

        for (Object tipomascota : MapaMascotas.keySet()) {
            Contador total = (Contador) MapaMascotas.get(tipomascota);
            System.out.println(tipomascota.toString().substring(tipomascota.toString().lastIndexOf('.') + 1)
                    + " numero: " + total.i);
        }
    }

    public void procesar() throws Exception {
        generarAnimales();
        generarMapaMascotas();
        try {
            for (Object m : mascotas) {
                if (m instanceof Mascota)
                    ((Contador) MapaMascotas.get("class Ejemplo1.Mascota")).i++;
                if (m instanceof Perro)
                    ((Contador) MapaMascotas.get("class Ejemplo1.Perro")).i++;
                if (m instanceof Pug)
                    ((Contador) MapaMascotas.get("class Ejemplo1.Pug")).i++;
                if (m instanceof Gato)
                    ((Contador) MapaMascotas.get("class Ejemplo1.Gato")).i++;
                if (m instanceof Roedor)
                    ((Contador) MapaMascotas.get("class Ejemplo1.Roedor")).i++;
                if (m instanceof Cuyo)
                    ((Contador) MapaMascotas.get("class Ejemplo1.Cuyo")).i++;
                if (m instanceof Hamster)
                    ((Contador) MapaMascotas.get("class Ejemplo1.Hamster")).i++;
            }
            imprimirResultados();
        } catch (NullPointerException e) {
                throw new NullPointerException("se produjo un erro al contar");
        }finally{
            System.out.println("Programa ejecutado con o sin errores,Linea finally");
        }

    }
}