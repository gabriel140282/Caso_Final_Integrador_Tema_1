package org.example;

public class Aviario extends Habitat {
    public Aviario(String nombre, double temperatura, double humedad, String limpieza) {
        super(nombre, temperatura, humedad, limpieza);
    }

    @Override
    public void monitor() {
        System.out.println("\nMonitoreando hábitat aviario: " + getNombre());
        System.out.println("Temperatura: " + getTemperatura() + "°C, Humedad: " + getHumedad() + "%, Limpieza: " + getLimpieza());
    }
}

