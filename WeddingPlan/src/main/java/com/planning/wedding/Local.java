package com.planning.wedding;

public class Local {

    private int idLocal;
    private String nombre;
    private String direccion;
    private static final int maxCapacidadInvitados = 200;
    private double precio;
    private boolean decoracion;
    private boolean amplificacion;
    private static int contadorLocales;

    private Local() {
        this.idLocal = ++contadorLocales;
    }

    public Local(String nombre, String direccion, double precio, boolean decoracion, boolean amplificacion) {
        this();
        this.nombre = nombre;
        this.direccion = direccion;
        this.precio = precio;
        this.decoracion = decoracion;
        this.amplificacion = amplificacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDecoracion() {
        return this.decoracion;
    }

    public void setDecoracion(boolean decoracion) {
        this.decoracion = decoracion;
    }

    public boolean isAmplificacion() {
        return this.amplificacion;
    }

    public void setAmplificacion(boolean amplificacion) {
        this.amplificacion = amplificacion;
    }

    @Override
    public String toString() {
        return "Local{" +
                "idLocal=" + idLocal +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", precio=" + precio +
                ", decoracion=" + decoracion +
                ", amplificacion=" + amplificacion +
                '}';
    }
}
