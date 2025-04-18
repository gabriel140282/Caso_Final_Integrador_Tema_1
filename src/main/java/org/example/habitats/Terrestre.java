package org.example.habitats;

public class Terrestre extends Habitat {
    public Terrestre(String nombre, double temperatura, double humedad, String limpieza) {
        super(nombre, temperatura, humedad, limpieza);
    }

    public void monitorTerrestre() {
        System.out.println("\nMonitoreando hábitat terrestre: " + getNombre());
        System.out.println("Temperatura: " + getTemperatura() + "°C, Humedad: " + getHumedad() + "%, Limpieza: " + getLimpieza());
    }
}

