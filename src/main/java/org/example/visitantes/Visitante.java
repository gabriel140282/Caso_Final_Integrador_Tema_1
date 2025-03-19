package org.example.visitantes;

import java.util.List;

public class Visitante {
    private String nombre;
    private List<String> intereses;

    public Visitante(String nombre, List<String> intereses) {
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

