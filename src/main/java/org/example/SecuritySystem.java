package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SecuritySystem {
    private List<String> eventos;

    public SecuritySystem() {
        eventos = new ArrayList<>();
    }

    public void monitorAccess() {
        String evento = "Acceso detectado a las " + LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        eventos.add(evento);
        System.out.println("\n" + evento);
    }

    public void recordEvents() {
        System.out.println("\nRegistro de eventos de seguridad:");
        for(String evento : eventos) {
            System.out.println(evento);
        }
    }
}

