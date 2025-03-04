package org.example;

import java.util.List;

public class Visitor {
    private String nombre;
    private List<String> intereses;

    public Visitor(String nombre, List<String> intereses) {
        this.nombre = nombre;
        this.intereses = intereses;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getIntereses() {
        return intereses;
    }
}

