package org.example;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceManager {
    private List<MaintenanceTask> tareas;

    public void gerenteMantenimiento() {
        tareas = new ArrayList<>();
    }

    public void programarTarea(MaintenanceTask tareas) {
        tareas.add(tareas);
        System.out.println("Tarea programada: " + tareas.getDescripcion() + " para el " + tareas.getFechaProgramada() + ".");
    }

    public void seguimientoTareas() {
        System.out.println("\nTareas de Mantenimiento:");
        for(MaintenanceTask tareas : tareas) {
            System.out.println("Tarea: " + tareas.getDescripcion() + ", Fecha: " + tareas.get() + ", Estado: " + tareas.getEstado());
        }
    }
}

