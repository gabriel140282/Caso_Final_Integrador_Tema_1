package org.example.habitats;

public class Aviario extends Habitat {
    public Aviario(String nombre, double temperatura, double humedad, String limpieza) {
        super(nombre, temperatura, humedad, limpieza);
    }

    public void monitorAviario() {
        System.out.println("\nMonitoreando hábitat aviario: " + getNombre());
        System.out.println("Temperatura: " + getTemperatura() + "°C, Humedad: " + getHumedad() + "%, Limpieza: " + getLimpieza());
    }
}

