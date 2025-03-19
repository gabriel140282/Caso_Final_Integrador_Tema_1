package org.example;

public class Acuatico extends Habitat {
    private String calidadAgua;

    public Acuatico(String nombre, double temperatura, double humedad, String limpieza, String calidadAgua) {
        super(nombre, temperatura, humedad, limpieza);
        this.calidadAgua = calidadAgua;
    }

    public void monitorAcuatico() {
        System.out.println("\nMonitoreando hábitat acuático: " + this.getNombre());
        System.out.println("Temperatura: " + this.getTemperatura() + "°C, Humedad: " + this.getHumedad() + "%, Limpieza: " + this.getLimpieza());
        System.out.println("Calidad de agua: " + this.calidadAgua);
    }
}

