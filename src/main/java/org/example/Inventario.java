package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Recurso> recursos = new ArrayList<>();

    public void aniadir_recurso(Recurso recurso) {
        recursos.add(recurso);
        System.out.println("Recurso añadido: " + recurso.getNombre());
    }

    public void mostrar_inventario() {
        System.out.println("Inventario:");
        for (Recurso recurso : recursos) {
            System.out.println(recurso.getNombre() + ": " + recurso.getCantidad());
        }
    }

    public void actualizar_recurso(String nombre, int nuevaCantidad) {
        for (Recurso recurso : recursos) {
            if (recurso.getNombre().equals(nombre)) {
                recurso.setCantidad(nuevaCantidad);
                System.out.println("Recurso actualizado: " + nombre + " a " + nuevaCantidad);
                return;
            }
        }
        System.out.println("Recurso no encontrado: " + nombre);
    }
}


