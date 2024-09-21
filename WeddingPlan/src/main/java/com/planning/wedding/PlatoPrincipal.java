package com.planning.wedding;

public class PlatoPrincipal extends Catering{

    private final int idPlatoPrincipal;
    private int cantidadPlatoPrincipal;

    public PlatoPrincipal(String nombreCatering, String direccion, boolean vajillaIncluida, boolean garzoniersIncluidos, int cantidad, double precioUnidad) {
        super(nombreCatering, direccion, vajillaIncluida, garzoniersIncluidos, cantidad, precioUnidad);
        this.idPlatoPrincipal = cantidadPlatoPrincipal++;
    }

    @Override
    public String toString() {
        return "PlatoPrincipal{" +
                "idPlatoPrincipal=" + idPlatoPrincipal +
                ", cantidadPlatoPrincipal=" + cantidadPlatoPrincipal +
                '}';
    }
}
