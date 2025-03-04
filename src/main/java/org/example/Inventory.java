package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Resource> recursos;

    public void Inventario() {
        recursos = new ArrayList<>();
    }

    public void anadirRecurso(Resource recursos) {
        // Verifica si el recurso ya existe (según su nombre)
        boolean exists = false;
        for (Resource r : recursos) {
            if (r.getNombre().equals(recursos.getNombre())) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            recursos.add(recursos);
            System.out.println("Recurso '" + recursos.getNombre() + "' agregado al inventario.");
        } else {
            System.out.println("El recurso '" + recursos.getNombre() + "' ya existe en el inventario.");
        }
    }

    public void actualizarRecurso(String nombre, int cantidad) {
        boolean found = false;
        for (Resource resource : recursos) {
            if (resource.getNombre().equals(nombre)) {
                resource.setCantidad(cantidad);
                System.out.println("El recurso '" + nombre + "' se actualizó a " + cantidad + " unidades.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Recurso '" + nombre + "' no encontrado en el inventario.");
        }
    }

    public void mostrarInventario() {
        System.out.println("\nInventario de Recursos:");
        for (Resource resource : recursos) {
            System.out.println(resource.getNombre() + ": " + resource.getCantidad() + " unidades (Proveedor: " + resource.getProveedor() + ")");
        }
    }
}


