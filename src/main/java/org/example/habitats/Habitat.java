package org.example.habitats;

public class Habitat {
    private String nombre;
    private double temperatura;
    private double humedad;
    private String limpieza;

    public String getNombre() {
        return this.nombre;
    }

    public double getTemperatura() {
        return this.temperatura;
    }

    public double getHumedad() {
        return this.humedad;
    }

    public String getLimpieza() {
        return this.limpieza;
    }

    public Habitat(String nombre, double temperatura, double humedad, String limpieza) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

    public void actualizarCondiciones(double temperatura, double humedad, String limpieza) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
        System.out.println("Se actualizaron las condiciones de " + nombre + ".");
    }

    public void monitorHabitat() {
        System.out.println("\nHabitat: " + this.nombre);
        System.out.println("Temperatura: " + this.temperatura + "°C");
        System.out.println("Humedad: " + this.humedad + "%");
        System.out.println("Limpieza: " + this.limpieza);
    }
}
