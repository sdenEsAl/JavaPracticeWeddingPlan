package com.planning.wedding;

public class Contrato {

    private final int idContrato;
    private int idWeddingPlanner;
    private int idMes;
    private final Boda bodas[];
    private static int contadorContratos;
    private int contadorBodas;
    private static final int maxBodas = 5;

    public Contrato () {
        this.idContrato = ++contadorContratos;
        bodas = new Boda[maxBodas];
    }

    public void agregarBoda(Boda boda) {
        if (contadorBodas < maxBodas) {
            bodas[contadorBodas++] = boda;
        }
        else {
            System.out.println("Se llego al limite de contratos permitos. " + maxBodas);
        }
    }

    public void imprimirContrato() {
        System.out.println("Nro. de Contrato: " + idContrato);
        System.out.println("Detalle de la boda: ");
        for(int i=0; i < contadorBodas; i++) {
            System.out.println(bodas[i]);
        }
    }
}
