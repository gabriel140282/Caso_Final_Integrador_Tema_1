package org.example;

public class VirtualGuide {
    public void proveerTour(Visitor visitor) {
        System.out.println("Proporcionando un tour virtual a " + visitor.getNombre());
    }
}
