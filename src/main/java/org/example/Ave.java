package org.example;

public class Ave extends Animal {
    public Ave(String nombre, String especies, Habitat habitat) {
        super(nombre, especies, habitat);
    }

    public void alimentar() {
        System.out.println(getNombre() + " está siendo alimentado.");
    }

    public void chequear_salud() {
        System.out.println("Chequeando la salud de " + getNombre());
    }

    public void revisar_comportamiento() {
        System.out.println(getNombre() + " está mostrando su comportamiento natural.");
    }
}
