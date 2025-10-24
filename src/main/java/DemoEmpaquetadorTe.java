import paquetes.Paquete;
import paquetes.PaquetePaquete;
import paquetes.PaqueteTeBlanco;
import paquetes.PaqueteTeVerde;

import java.util.List;

public class DemoEmpaquetadorTe {
    public static void main(String[] args) {
        System.out.println("Demo Empaquetador de Té...");

        // Envío 1: 2 cajas de Te Blanco y 1 caja de Te Verde
        PaquetePaquete e1 = new PaquetePaquete();
        for (int i = 0; i < 2; i++) {
            e1.anyadePaquete(new PaqueteTeBlanco());
        }
        e1.anyadePaquete(new PaqueteTeVerde());


        // Envío 2: 2 cajas de Te Blanco y 1 caja de Te Verde
        PaquetePaquete e2 = new PaquetePaquete();
        for (int i = 0; i < 2; i++) {
            e2.anyadePaquete(new PaqueteTeVerde());
        }
        e2.anyadePaquete(new PaqueteTeBlanco());

        // Envío final
        PaquetePaquete e = new PaquetePaquete();
        e.anyadePaquete(e1);
        e.anyadePaquete(e2);

        // Contenido final
        System.out.println("El envío a Asia contiene " + e.getCantidad() + " unidades de té");
    }
}

