package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
    private String nombre;
    private String especies;
    private Habitat habitat;
    private int salud;
    private LocalDateTime horaUltimaComida;

    public Animal(String nombre, String especies, Habitat habitat) {
        this.nombre = nombre;
        this.especies = especies;
        this.habitat = habitat;
        this.salud = 100;
    }

    public void alimentacion() {
        horaUltimaComida = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(nombre + " ha sido alimentado a las " + horaUltimaComida.format(formatter) + ".");
    }

    public void chequeoSalud() {
        System.out.println("La salud de " + nombre + " es " + salud + ".");
    }

    public void performBehavior(){
        System.out.println("El comportamiento de " + this.nombre + " es: ");
        System.out.println("La especie es " + this.especies);
        System.out.println("El habitat es " + this.habitat);
        System.out.println("La salud del animal es " + this.habitat + "°C");
    }
}

