package com.planning.wedding;

import java.util.Date;

public class Boda {

    private int idBoda;
    private String nombre;
    private String fecha; //Date
    private Local local;
    private Dulces dulces;
    private Salados salados;
    private PlatoPrincipal platoPrincipal;
    //private Decoracion decoracion;
    private Fotografo fotografo;
    private Amplificacion amplificacion;
    private static int contadorBodas;

    private Boda() {
        this.idBoda = ++contadorBodas;
    }

    public Boda(String nombre, String fecha, Local local, Dulces dulces, Salados salados, PlatoPrincipal platoPrincipal, Fotografo Fotografo, Amplificacion Amplificacion) {
        this();
        this.nombre = nombre;
        this.fecha = fecha;
        this.local = local;
        this.dulces = dulces;
        this.salados = salados;
        this.platoPrincipal = platoPrincipal;
        //this.decoracion = decoracion;
        this.fotografo = fotografo;
        this.amplificacion = amplificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Dulces getDulces() {
        return this.dulces;
    }

    public void setDulces(Dulces dulces) {
        this.dulces = dulces;
    }

    public Salados getSalados() {
        return this.salados;
    }

    public void setSalados(Salados salados) {
        this.salados = salados;
    }

    public PlatoPrincipal getPlatoPrincipal() {
        return this.platoPrincipal;
    }

    public void setPlatoPrincipal(PlatoPrincipal platoPrincipal) {
        this.platoPrincipal = platoPrincipal;
    }

    public Fotografo getFotografo() {
        return this.fotografo;
    }

    public void setFotografo(Fotografo fotografo) {
        this.fotografo = fotografo;
    }

    public Amplificacion getAmplificacion() {
        return this.amplificacion;
    }

    public void setAmplificacion(Amplificacion amplificacion) {
        this.amplificacion = amplificacion;
    }

    @Override
    public String toString() {
        return "Boda{" +
                "idBoda=" + idBoda +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", local=" + local +
                ", dulces=" + dulces +
                ", salados=" + salados +
                ", platoPrincipal=" + platoPrincipal +
                ", fotografo=" + fotografo +
                ", amplificacion=" + amplificacion +
                '}';
    }
}
