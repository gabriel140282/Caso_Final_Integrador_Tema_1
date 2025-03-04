package org.example;

public class VirtualGuide {
    public void proveerTour(Visitor visitor) {
        System.out.println("\nBienvenido " + visitor.getNombre() + ". Iniciando tour personalizado basado en tus intereses: " + String.join(", ", visitor.getInterests()));
        if(visitor.getIntereses().contains("mamíferos")) {
            System.out.println("Te recomendamos visitar la sección de mamíferos.");
        }
        if(visitor.getIntereses().contains("aves")) {
            System.out.println("Te recomendamos visitar la sección de aves.");
        }
        if(visitor.getIntereses().contains("reptiles")) {
            System.out.println("Te recomendamos visitar la sección de reptiles.");
        }
    }
}
