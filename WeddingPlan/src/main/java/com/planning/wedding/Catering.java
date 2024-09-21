package com.planning.wedding;

public class Catering {

    private String nombreCatering;
    private String direccion;
    private boolean vajillaIncluida;
    private boolean garzoniersIncluidos;
    private int cantidad;
    private double precioUnidad;

    public Catering(String nombreCatering, String direccion, boolean vajillaIncluida, boolean garzoniersIncluidos, int cantidad, double precioUnidad) {
        this.nombreCatering = nombreCatering;
        this.direccion = direccion;
        this.vajillaIncluida = vajillaIncluida;
        this.garzoniersIncluidos = garzoniersIncluidos;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public String getNombreCatering() {
        return nombreCatering;
    }

    public void setNombreCatering(String nombreCatering) {
        this.nombreCatering = nombreCatering;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isVajillaIncluida() {
        return vajillaIncluida;
    }

    public void setVajillaIncluida(boolean vajillaIncluida) {
        this.vajillaIncluida = vajillaIncluida;
    }

    public boolean isGarzoniersIncluidos() {
        return garzoniersIncluidos;
    }

    public void setGarzoniersIncluidos(boolean garzoniersIncluidos) {
        this.garzoniersIncluidos = garzoniersIncluidos;
    }

    public double precioTotal() {
        return cantidad * precioUnidad;
    }

    @Override
    public String toString() {
        return "Catering{" +
                "nombreCatering='" + nombreCatering + '\'' +
                ", direccion='" + direccion + '\'' +
                ", vajillaIncluida=" + vajillaIncluida +
                ", garzoniersIncluidos=" + garzoniersIncluidos +
                '}';
    }
}
