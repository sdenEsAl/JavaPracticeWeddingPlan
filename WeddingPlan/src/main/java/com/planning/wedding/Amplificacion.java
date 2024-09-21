package com.planning.wedding;

public class Amplificacion {

    private int idAmplificacion;
    private String nombreAmplificacion;
    private double precio;
    private static int contadorAmplificaciones;
    private static final int maxCanciones = 500;

    private Amplificacion() {
        this.idAmplificacion = contadorAmplificaciones++;
    }

    public Amplificacion(String nombreAmplificacion, double precio) {
        this();
        this.nombreAmplificacion = nombreAmplificacion;
        this.precio = precio;
    }

    public String getNombreAmplificacion() {
        return this.nombreAmplificacion;
    }

    public void setNombreAmplificacion(String nombreAmplificacion) {
        this.nombreAmplificacion = nombreAmplificacion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Amplificacion{" +
                "idAmplificacion=" + idAmplificacion +
                ", nombreAmplificacion='" + nombreAmplificacion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
