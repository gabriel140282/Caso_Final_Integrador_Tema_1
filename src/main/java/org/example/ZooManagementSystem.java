package org.example;

import org.example.cuidado.Ave;
import org.example.cuidado.Mamifero;
import org.example.cuidado.Reptil;
import org.example.habitats.Acuatico;
import org.example.habitats.Aviario;
import org.example.habitats.Terrestre;
import org.example.inventario.Inventario;
import org.example.inventario.Recurso;
import org.example.mantenimiento.MaintenanceManager;
import org.example.mantenimiento.MaintenanceTask;
import org.example.seguridad.SecuritySystem;
import org.example.visitantes.VirtualGuide;
import org.example.visitantes.Visitante;

import java.time.LocalDate;
import java.util.Arrays;

public class ZooManagementSystem {
    public static void main(String[] args) {
        // Creación y monitoreo de hábitats
        Acuatico habitat1 = new Acuatico("Acuario Tropical", 26, 80, "Limpio", "Excelente");
        Terrestre habitat2 = new Terrestre("Sabana Africana", 30, 60, "Moderada");
        Aviario habitat3 = new Aviario("Nido de Aves", 22, 70, "Limpio");

        habitat1.monitorAcuatico();
        habitat2.monitorTerrestre();
        habitat3.monitorAviario();

        // Creación y cuidado de animales
        Mamifero animal1 = new Mamifero("Leo", "León", habitat2);
        Ave animal2 = new Ave("Polly", "Loro", habitat3);
        Reptil animal3 = new Reptil("Sly", "Serpiente", habitat2);

        animal1.alimentar();
        animal1.chequear_salud();
        animal1.revisar_comportamiento();

        animal2.alimentar();
        animal2.chequear_salud();
        animal2.revisar_comportamiento();

        animal3.alimentar();
        animal3.chequear_salud();
        animal3.revisar_comportamiento();

        // Interacción con visitantes y guía virtual
        Visitante visitante1 = new Visitante("Carlos", Arrays.asList("mamíferos", "reptiles"));
        VirtualGuide guide = new VirtualGuide();
        guide.proveerTour(visitante1);

        // Administración de recursos
        Inventario inventario = new Inventario();
        Recurso recurso1 = new Recurso("Carne", 100, "Proveedor A");
        Recurso recurso2 = new Recurso("Semillas", 200, "Proveedor B");
        inventario.aniadir_recurso(recurso1);
        inventario.aniadir_recurso(recurso2);
        inventario.mostrar_inventario();
        inventario.actualizar_recurso("Carne", 90);

        // Mantenimiento y seguridad
        MaintenanceManager maintenanceManager = new MaintenanceManager();
        MaintenanceTask tarea1 = new MaintenanceTask("Revisión de instalaciones acuáticas", LocalDate.parse("2025-03-10"));
        MaintenanceTask tarea2 = new MaintenanceTask("Mantenimiento de cámaras de seguridad", LocalDate.parse("2025-03-12"));
        maintenanceManager.programarTarea(tarea1);
        maintenanceManager.programarTarea(tarea2);
        maintenanceManager.seguimientoTareas();

        SecuritySystem security = new SecuritySystem();
        security.monitorAccess();
        security.recordEvents();
    }
}

