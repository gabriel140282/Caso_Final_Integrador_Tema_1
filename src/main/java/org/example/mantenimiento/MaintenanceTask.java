package org.example.mantenimiento;

import java.time.LocalDate;

public class MaintenanceTask {
    private String descripcion;
    private LocalDate fechaProgramada;
    private String estado;

    public MaintenanceTask(String descripcion, LocalDate fechaProgramada) {
        this.descripcion = descripcion;
        this.fechaProgramada = fechaProgramada;
        this.estado = "Pendiente";
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFechaProgramada() {
        return fechaProgramada;
    }

    public String getEstado() {
        return estado;
    }

    public void actualizarEstado(String estado) {
        this.estado = estado;
        System.out.println("La tarea '" + descripcion + "' se actualizó a: " + estado);
    }
}

