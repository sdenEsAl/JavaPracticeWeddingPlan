package com.planning.wedding;

public class Salados extends Catering {

    private final int idSalados;
    private static int contadorSalados;
    private int cantidadCategorias;
    private double precioCategoria;


    public Salados(String nombreCatering, String direccion, boolean vajillaIncluida, boolean garzoniersIncluidos, int cantidadCategorias, double precioCategoria) {
        super(nombreCatering, direccion, vajillaIncluida, garzoniersIncluidos, cantidadCategorias, precioCategoria);
        this.idSalados = contadorSalados++;
        this.cantidadCategorias = cantidadCategorias;
        this.precioCategoria = precioCategoria;
    }

    public double precioTotalSalados() {
        return cantidadCategorias * precioCategoria;
    }

    @Override
    public String toString() {
        return "Salados{" +
                "idSalados=" + idSalados +
                ", cantidadSalados=" + cantidadCategorias +
                ", precioCategoria=" + precioCategoria +
                '}';
    }
}
