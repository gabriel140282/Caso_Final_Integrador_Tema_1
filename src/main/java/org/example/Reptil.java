package org.example;

public class Reptil extends Animal {
    public Reptil(String nombre, String especies, Habitat habitat) {
        super(nombre, especies, habitat);
    }

    @Override
    public void monitorReptil() {
        System.out.println(getNombre() + " (reptil) está tomando el sol para regular su temperatura.");
    }
}

