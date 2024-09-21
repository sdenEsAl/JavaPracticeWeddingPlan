package plan.wedding;

import com.planning.wedding.*;

public class WeddingPlan {
    public static void main(String[] args) {
        //paquete 1
        Salados salados1 = new Salados("Catering1", "Direccion1", true, true, 5, 250);
        Dulces dulces1 = new Dulces("Catering1", "Direccion1", true, true, 200, 5.50);
        PlatoPrincipal platoPrincipal1 = new PlatoPrincipal("Catering1", "Direccion1", true, true, 150, 150);
        Fotografo fotografo1 = new Fotografo("Andres", "Fernadez", 69457787, 9500, true);
        Amplificacion amplificacion1 = new Amplificacion("Amplificacion1", 1500);
        Local local1 = new Local("Local1", "Direccion1", 10000, true, false);

        //paquete 2
        Salados salados2 = new Salados("Catering2", "Direccion2", false, false, 8, 200);
        Dulces dulces2 = new Dulces("Catering2", "Direccion2", false, false, 150, 8);
        PlatoPrincipal platoPrincipal2 = new PlatoPrincipal("Catering2", "Direccion2", false, false, 100, 150);
        Fotografo fotografo2 = new Fotografo("Adriana", "Rojas", 69457785, 3500, false);
        Amplificacion amplificacion2 = new Amplificacion("Amplificacion2", 1500);
        Local local2 = new Local("Local2", "Direccion2", 15000, true, false);


        //boda 1
        Boda boda1 = new Boda("Rios", "10-10-2025", local1, dulces1, salados1, platoPrincipal1, fotografo1, amplificacion1);
        //boda 2
        Boda boda2 = new Boda("Zurita", "10-01-2026", local2, dulces2, salados1, platoPrincipal2, fotografo2, amplificacion2);


        //contrato1
        Contrato contrato1 = new Contrato();
        contrato1.agregarBoda(boda1);
        contrato1.imprimirContrato();

        System.out.println("");

        //contrato2
        Contrato contrato2 = new Contrato();
        contrato2.agregarBoda(boda2);
        contrato2.imprimirContrato();
    }
}
