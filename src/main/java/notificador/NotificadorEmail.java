package notificador;

import paquetes.PaquetePaquete;

public class NotificadorEmail extends Notificador {
    public NotificadorEmail(PaquetePaquete paquete) {
        super(paquete);
    }

    @Override
    public String mostrarContenido() {
        return "Envío por correo del paquete.\n" + super.mostrarContenido();
    }
}
