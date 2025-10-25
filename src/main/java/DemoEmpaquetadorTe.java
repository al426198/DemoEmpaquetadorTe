import notificador.NotificadorEmail;
import notificador.NotificadorTexto;
import paquetes.PaquetePaquete;
import paquetes.PaqueteTe;
import paquetes.PaqueteTeBlanco;
import paquetes.PaqueteTeVerde;

import java.util.Map;

public static void main(String[] args) {
    // Composite (ejercicio 3)
    System.out.println("Demo Empaquetador de Té...");

    // Envío 1: 2 cajas de Te Blanco y 1 caja de Te Verde
    Map<String, Integer> envio1 = Map.of("Te Blanco", 2, "Te Verde", 1);
    PaquetePaquete e1 = new PaquetePaquete();
    for (String k : envio1.keySet()) {
        for (int i = 0; i < envio1.get(k); i++) {
            PaqueteTe te = k.equals("Te Blanco") ? new PaqueteTeBlanco() : new PaqueteTeVerde();
            System.out.println("Añado una caja de " + te);
            e1.anyadePaquete(te);
        }
    }

    // Envío 2: 2 cajas de Te Verde y 1 caja de Te Blanco
    Map<String, Integer> envio2 = Map.of("Te Blanco", 1, "Te Verde", 2);
    PaquetePaquete e2 = new PaquetePaquete();
    for (String k : envio2.keySet()) {
        for (int i = 0; i < envio2.get(k); i++) {
            PaqueteTe te = k.equals("Te Blanco") ? new PaqueteTeBlanco() : new PaqueteTeVerde();
            System.out.println("Añado una caja de " + te);
            e2.anyadePaquete(te);
        }
    }

    // Envío final
    PaquetePaquete e = new PaquetePaquete();
    System.out.println("Añado una caja de " + e1);
    e.anyadePaquete(e1);
    System.out.println("Añado una caja de " + e2);
    e.anyadePaquete(e2);

    // Contenido final
    System.out.println(e1.mostrarContenido());
    System.out.println(e2.mostrarContenido());
    System.out.println(e.mostrarContenido());
    System.out.println("El envío a Asia contiene " + e.getCantidad() + " unidades de té\n");

    // Decorador (ejercicio 5)
    System.out.println("Sin decorar:\n" + e.mostrarContenido());       // Objeto base

    e = new NotificadorTexto(e);
    e = new NotificadorEmail(e);

    System.out.println("\nDecorado:\n" + e.mostrarContenido());       // Objeto decorado
}


