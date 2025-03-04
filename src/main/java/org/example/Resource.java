package org.example;

public class Resource {
    private String nombre;
    private int cantidad;
    private String proveedor;

    public Resource(String nombre, int cantidad, String proveedor) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProveedor() {
        return proveedor;
    }
}

