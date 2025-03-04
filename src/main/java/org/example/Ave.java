package org.example;

public class Ave extends Animal {
    public Ave(String nombre, String especies, Habitat habitat) {
        super(nombre, especies, habitat);
    }

    @Override
    public void monitorAve() {
        System.out.println(this.getNombre() + " (ave) está volando o cantando.");
    }
}
