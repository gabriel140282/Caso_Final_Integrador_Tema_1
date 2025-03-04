package org.example;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceManager {
    private List<MaintenanceTask> tareas;

    public void gerenteMantenimiento() {
        tareas = new ArrayList<>();
    }

    public void programarTarea(MaintenanceTask tarea) {
        tareas.add(tarea);
        System.out.println("Tarea programada: " + tarea.getDescripcion() + " para el " + tarea.getFechaProgramada() + ".");
    }

    public void seguimientoTareas() {
        System.out.println("\nTareas de Mantenimiento:");
        for(MaintenanceTask tarea : tareas) {
            System.out.println("Tarea: " + tarea.getDescription() + ", Fecha: " + tarea.getScheduledDate() + ", Estado: " + tarea.getStatus());
        }
    }
}

