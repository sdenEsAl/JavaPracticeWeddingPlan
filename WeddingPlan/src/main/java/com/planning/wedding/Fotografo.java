package com.planning.wedding;

public class Fotografo {

    private int idFotografo;
    private String nombreFotografo;
    private String appellidoFotografo;
    private int telefonoFotografo;
    private double precio;
    private static final int maxFotografias = 400 ;
    private boolean video;
    private static int contadorFotografos;

    private Fotografo() {
        this.idFotografo = ++contadorFotografos;
    }

    public Fotografo(String nombreFotografo, String apellidoFotografo, int telefonoFotografo, double precio, boolean video) {
        this();
        this.nombreFotografo = nombreFotografo;
        this.appellidoFotografo = apellidoFotografo;
        this.telefonoFotografo = telefonoFotografo;
        this.precio = precio;
        this.video = video;
    }

    public String getNombreFotografo() {
        return this.nombreFotografo;
    }

    public void setNombreFotografo(String nombreFotografo) {
        this.nombreFotografo = nombreFotografo;
    }

    public String getAppellidoFotografo() {
        return this.appellidoFotografo;
    }

    public void setAppellidoFotografo(String appellidoFotografo) {
        this.appellidoFotografo = appellidoFotografo;
    }

    public int getTelefonoFotografo() {
        return this.telefonoFotografo;
    }

    public void setTelefonoFotografo(int telefonoFotografo) {
        this.telefonoFotografo = telefonoFotografo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isVideo() {
        return this.video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Fotografo{" +
                "idFotografo=" + idFotografo +
                ", nombreFotografo='" + nombreFotografo + '\'' +
                ", appellidoFotografo='" + appellidoFotografo + '\'' +
                ", telefonoFotografo=" + telefonoFotografo +
                ", precio=" + precio +
                ", video=" + video +
                '}';
    }
}
