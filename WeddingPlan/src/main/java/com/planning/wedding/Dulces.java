package com.planning.wedding;

public class Dulces extends Catering {

    private final int idDulces;
    private static int contadorDulces;
    private int cantidadDulces;
    private double precioUnidad;


    public Dulces(String nombreCatering, String direccion, boolean vajillaIncluida, boolean garzoniersIncluidos, int cantidadDulces, double precioUnidad) {
        super(nombreCatering, direccion, vajillaIncluida, garzoniersIncluidos, cantidadDulces, precioUnidad);
        this.idDulces = contadorDulces++;
        this.cantidadDulces = cantidadDulces;
        this.precioUnidad = precioUnidad;
    }

    public double precioTotalDulces() {
        return cantidadDulces * precioUnidad;
    }

    @Override
    public String toString() {
        return "Dulces{" +
                "idDulces=" + idDulces +
                ", cantidadDulces=" + cantidadDulces +
                ", precioUnidad=" + precioUnidad +
                '}';
    }
}
