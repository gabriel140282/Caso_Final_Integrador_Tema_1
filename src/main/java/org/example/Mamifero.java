package org.example;

public class Mamifero extends Animal {
    public Mamifero(String nombre, String especies, Habitat habitat) {
        super(nombre, especies, habitat);
    }

    @Override
    public void monitorMamifero() {
        System.out.println(this.getNombre() + " (mamífero) está corriendo o jugando.");
    }
}

