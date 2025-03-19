package org.example;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceManager {
    private List<MaintenanceTask> tareas;

    public MaintenanceManager() {
        tareas = new ArrayList<>();
    }

    public void programarTarea(MaintenanceTask tarea) {
        tareas.add(tarea);
        System.out.println("Tarea programada: " + tarea.getDescripcion() + " para el " + tarea.getFechaProgramada() + ".");
    }

    public void seguimientoTareas() {
        System.out.println("\nTareas de Mantenimiento:");
        for (MaintenanceTask tarea : tareas) {
            System.out.println("Tarea: " + tarea.getDescripcion() + ", Fecha: " + tarea.getFechaProgramada() + ", Estado: " + tarea.getEstado());
        }
    }
}

