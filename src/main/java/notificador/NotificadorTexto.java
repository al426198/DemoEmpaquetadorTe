package notificador;

import paquetes.PaquetePaquete;

public class NotificadorTexto extends Notificador {
    public NotificadorTexto(PaquetePaquete paquete) {
        super(paquete);
    }

    @Override
    public String mostrarContenido() {
        return "Envío por texto del paquete.\n" + super.mostrarContenido();
    }
}
